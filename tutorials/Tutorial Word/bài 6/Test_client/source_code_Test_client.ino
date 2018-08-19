/*
Source code for
*/
#include <SoftwareSerial.h>
/*
Each state in the application corresponds to one the integer.
Numbered starting at 0
stateCurrent is a variable that stores the current state of the application.
start: 0
SendRequest: 1
ReceiveResponse: 2
*/
int currentState = 0;
int nextState = -1;
/*--------------------Define--------------------*/
/*Define Wifi ESP8266 - wifi */
#define TIMEOUT			3000
#define RX 2 // pin TX of ESP8266 connect to pin 2 of Arduino
#define TX 3 //pin RX of ESP8266 connect to pin 3 of Arduino
SoftwareSerial wifi(RX,TX);
/*--------------------END Define--------------------*/
/*--------------------Prototype--------------------*/
//Read response from esp. Arduino is a receiver
String readResponse();
//Arduino send command to the esp
String sendCommand(String command);
//Close connection with a link id
void closeConnect();
void sendResponse(String content);
void HandleRequest(String res);
void statestart();
void stateSendRequest();
void stateReceiveResponse();
/*--------------------END Prototype--------------------*/
void setup()
{
	Serial.begin(9600); //Change baud rate according to your ESP
	wifi.begin(115200);
	Serial.println(sendCommand("AT+RST"));
	Serial.println(sendCommand("AT+CWMODE=1"));
	Serial.println(sendCommand("AT+CWJAP=\"ESPLAP\",\"1234567890\""));
	Serial.println(sendCommand("AT+CIFSR"));
	if(currentState == 0){
		statestart();
	}
}
void loop()
{
	//Listening the request from server
	String res = readResponse();
	if(res != ""){
		HandleRequest(res);
	}
	delay(300);
	switch(currentState){
		case 0:
		//Event: "get" send
		//send to client response
		sendResponse("get");
		stateSendRequest();
		//<case0>
		break;
		case 1:
		//<case1>
		break;
		case 2:
		//<case2>
		break;
		default:
		break;
	}
}
/*--------------------Implement--------------------*/
String readResponse()
{
	String res = "";
	long timeout = millis() + TIMEOUT;
	while (millis() < timeout)
	{
		if (wifi.available())
		{
			char ch = wifi.read();
			res += ch;
		}
	}
	return res;
}
//Send command to esp.
String sendCommand(String command)
{
	wifi.println(command);
	return readResponse();
}
//Close connection with a link id
void closeConnect()
{
	Serial.println(sendCommand("AT+CIPCLOSE=5"));
}
void sendResponse(String content)
{
	closeConnect();
	Serial.println(sendCommand("AT+CIPSTART=\"TCP\",\"192.168.4.22\",80"));
	String cmd = "AT+CIPSEND=";
	cmd += content.length();
	Serial.println(sendCommand(cmd));
	Serial.println(sendCommand(content));
}
void HandleRequest(String res){
	if(res.indexOf("+IPD") >= 0)
	{
		//Event: "Server gui lai get" received
		if(res.indexOf("Server gui lai get") != -1)
		{
			stateReceiveResponse();
		}
		//<requestWifi>
	}
	delay(300);
}
void statestart(){
	currentState = 0;
	delay(200);
}
void stateSendRequest(){
	currentState = 1;
	delay(200);
}
void stateReceiveResponse(){
	currentState = 2;
	delay(200);
}
/*--------------------END Implement--------------------*/