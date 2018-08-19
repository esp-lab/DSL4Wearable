/*
  Source code for
*/
#include <SoftwareSerial.h>
/*
  Each state in the application corresponds to one the integer.
  Numbered starting at 0
  stateCurrent is a variable that stores the current state of the application.
  Start: 0
  Show: 1
*/
int currentState = 0;
int nextState = -1;
/*--------------------Define--------------------*/
/*Define Wifi ESP8266 - wifi */
#define CMD_SEND_BEGIN  "AT+CIPSEND=0"
#define CMD_SEND_END    "AT+CIPCLOSE=0"
#define CHAR_CR     0x0D
#define CHAR_LF     0x0A
#define STRING_EMPTY  ""
#define DELAY_SEED  1000
#define DELAY_1X    (1*DELAY_SEED)
#define DELAY_2X    (2*DELAY_SEED)
#define DELAY_3X    (3*DELAY_SEED)
#define DELAY_4X    (4*DELAY_SEED)
#define DELAY_5X    (5*DELAY_SEED)
bool hasRequest = false;
#define RX 1 // pin RX of ESP8266 connect to pin 1 of Arduino
#define TX 0 //pin TX of ESP8266 connect to pin 0 of Arduino
SoftwareSerial wifi(RX, TX);
/*Define LED - ledyellow output*/
const int led = 2;
/*--------------------END Define--------------------*/
/*--------------------Prototype--------------------*/
void stateStart();
void stateShow();
/*--------------------END Prototype--------------------*/
void setup()
{
  delay(DELAY_5X);
  Serial.begin(9600); //Change baud rate according to your ESP
  wifi.begin(9600);
  deliverMessage("AT+RST", DELAY_2X);
  deliverMessage("AT+CWMODE=2", DELAY_3X);
  deliverMessage("AT+CWSAP=\"ESP_LAP\",\"IotWearable\",1,4", DELAY_3X);
  deliverMessage("AT+CIPMUX=1", DELAY_1X);
  deliverMessage(String("AT+CIPSERVER=1,") + 80, DELAY_1X);
  pinMode(led, OUTPUT);
  if (currentState == 0) {
    stateStart();
  }
}
void loop()
{
  // listen request from client
  while (wifi.available())
  {
    bufferingRequest(wifi.read());
    String htmlResponse = "<!doctype html>"
                          "<html>"
                          "<head>"
                          "<title> ESP8266 DEMO</title>"
                          "</head>"
                          "<body>"
                          "<h1>ESP_LAP ESP8266 DEMO</h1>"
                          "<form action='' method='GET'>"
                          "<input type='radio' name='LED'  value='turnOn' /> LED ON<br/>"
                          "<input type='radio' name='LED'  value='turnOff' /> LED OFF<br/>"
                          "<input type='submit' value='Submit' />"
                          "</form>"
                          "</body>"
                          "</html>";
    sendResponse(htmlResponse);
  }
  switch (currentState) {
    case 0:
      //<case0>
      break;
    case 1:
      //<case1>
      break;
    default:
      break;
  }
}
/*--------------------Implement--------------------*/
void bufferingRequest(char c)
{
  static String bufferData = STRING_EMPTY;
  switch (c)
  {
    case CHAR_CR:
      break;
    case CHAR_LF:
      {
        procedure(bufferData);
        bufferData = STRING_EMPTY;
      }
      break;
    default:
      bufferData += c;
  }
}
void deliverMessage(const String& msg, int timeouts)
{
  wifi.println(msg);
  unsigned long start = millis();
  String response = "";
  while (millis() < start + timeouts) {
    while (wifi.available())
    {
      // The wifi has data so display its output to the serial window
      char c = wifi.read(); // read the next character.
      response += c;
    }
    Serial.print(response);
  }
}
void procedure(const String& command)
{
  hasRequest = command.startsWith("+IPD,");
  //Event: "turnOn" received
  if (command.indexOf("turnOn") != -1)
  {
    stateShow();
  }
  //Event: "turnOff" received
  if (command.indexOf("turnOff") != -1)
  {
    stateStart();
  }
  //<requestWifi>
}
void sendResponse(String Response)
{
  deliverMessage("AT+CIPMODE=0", DELAY_1X);
  String beginSendCmd = String(CMD_SEND_BEGIN) + "," + Response.length();
  deliverMessage(beginSendCmd, DELAY_1X);
  deliverMessage(Response, DELAY_1X);
  deliverMessage(CMD_SEND_END, DELAY_1X);
  hasRequest = false;
}
void stateStart() {
  digitalWrite(led, LOW);
  currentState = 0;
  delay(200);
}
void stateShow() {
  digitalWrite(led, HIGH);
  currentState = 1;
  delay(200);
}
/*--------------------END Implement--------------------*/
