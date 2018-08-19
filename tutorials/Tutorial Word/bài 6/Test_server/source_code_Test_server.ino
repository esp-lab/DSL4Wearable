/*
Source code for
*/
#include <SoftwareSerial.h>
/*
Each state in the application corresponds to one the integer.
Numbered starting at 0
stateCurrent is a variable that stores the current state of the application.
Start: 0
GetReceived: 1
SendResponse: 2
*/
int currentState = 0;
int nextState = -1;
/*--------------------Define--------------------*/
/*Define Wifi ESP8266 - esp */
#define TIMEOUT			3000
#define RX 2 // pin TX of ESP8266 connect to pin 2 of Arduino
#define TX 3 //pin RX of ESP8266 connect to pin 3 of Arduino
SoftwareSerial esp(RX,TX);
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
void stateStart();
void stateGetReceived();
void stateSendResponse();
/*--------------------END Prototype--------------------*/
void setup()
{
	Serial.begin(9600); //Change baud rate according to your ESP
	esp.begin(9600);
	Serial.println(sendCommand("AT+RST"));
	Serial.println(sendCommand("AT+CWMODE=2"));
	Serial.println(sendCommand("AT+CIFSR"));
	Serial.println(sendCommand("AT+CWSAP=\"ESPLAP\",\"1234567890\",5,3"));
	Serial.println(sendCommand("AT+CIPAP=\"192.168.4.22\",\"192.168.4.22\",\"255.255.255.0\""));
	Serial.println(sendCommand("AT+CIPMUX=1"));
	Serial.println(sendCommand("AT+CIPSERVER=1,80"));
	Serial.println(sendCommand("AT+CIFSR"));
	Serial.println("Server is ready.");
	if(currentState == 0){
		stateStart();
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
		//<case0>
		break;
		case 1:
		//Event: "Server gui lai get" send
		//send to client response
		sendResponse("Server gui lai get");
		stateSendResponse();
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
		if (esp.available())
		{
			char ch = esp.read();
			res += ch;
		}
	}
	return res;
}
//Send command to esp.
String sendCommand(String command)
{
	esp.println(command);
	return readResponse();
}
//Close connection with a link id
void closeConnect()
{
	Serial.println(sendCommand("AT+CIPCLOSE=5"));
}
void sendResponse(String content)
{
	String cmd = "AT+CIPSEND=0,";
	cmd += content.length();
	Serial.println(sendCommand(cmd));
	Serial.println(sendCommand(content));
	closeConnect();
}
void HandleRequest(String res){
	if (res.indexOf("GET / HTTP/1.1") >= 0)
	{
		String content = "Well come to ESP LAP";
		String cmd = "AT+CIPSEND=0,";
		cmd += content.length();
		Serial.println(sendCommand(cmd));
		Serial.println(sendCommand(content));
		closeConnect();
	}
	else if (res.indexOf("CONNECT") >= 0)
	{
		Serial.println("receive....");
	}
	else if (res.indexOf("+IPD") >= 0)
	{
		//Event: "get" received
		if(res.indexOf("get") != -1)
		{
			stateGetReceived();
		}
		//<requestWifi>
	}
	delay(300);
}
void stateStart(){
	currentState = 0;
	delay(200);
}
void stateGetReceived(){
	currentState = 1;
	delay(200);
}
void stateSendResponse(){
	currentState = 2;
	delay(200);
}
/*--------------------END Implement--------------------*/