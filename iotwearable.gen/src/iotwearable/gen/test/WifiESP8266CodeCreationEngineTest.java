package iotwearable.gen.test;

import static org.junit.Assert.*;

import org.junit.Test;

import iotwearable.gen.cce.device.WifiESP8266V1CodeCreationEngine;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.WifiESP8266;
import iotwearable.model.iotw.Pin.TypePin;

public class WifiESP8266CodeCreationEngineTest extends DeviceCodeCreationEngineTest{
	WifiESP8266 esp8266 = IotwFactory.eINSTANCE.createWifiESP8266();
	Pin tx;
	Pin rx;
	WifiESP8266V1CodeCreationEngine codeCreationEngine;
	
	public WifiESP8266CodeCreationEngineTest() {
		esp8266.setId("wifi");
		tx = new Pin("TX", TypePin.IO);
		rx = new Pin("RX", TypePin.IO);
		tx.setIdConnect("2<->TX");
		rx.setIdConnect("3<->RX");
		esp8266.modifyPin(tx);
		esp8266.modifyPin(rx);
		addDevice(esp8266);
		codeCreationEngine = new WifiESP8266V1CodeCreationEngine(esp8266);
	}
	
	@Test
	public void createCode_True() {
		String expected = "#include <SoftwareSerial.h>"
				+ "\n"
				+"/*Define Wifi ESP8266 - wifi */\n"
				+"SoftwareSerial wifi(3, 2);\n"
				+ "boolean wifi_Ret = true;"
				+ "\n"
				+"bool waitforACK(char ackstring[], int timeout);\n"
				+"void sendToWifi(String request);\n"
				+ "void setup(){\n"
				+ "Serial.begin(9600);\n"
				+"wifi.begin(9600); // Change baud rate according to your ESP\n"
				+ "wifi.println(\"AT+CWMODE=3\");\n"
				+ "delay(10);\n"
				+ "wifi.println(\"AT+RST\");\n"
				+ "if(!waitforACK(\"OK\", 10000)) {\n"
				+"Serial.println(\"Cannot reset\");\n"
				+ "}\n"
				+ "else  {\n"
				+ "Serial.println(\"Reset OK\");\n"
				+ "}\n"
				+ "wifi.println(\"AT+CWJAP=\\\"IotWearable\\\",\\\"IotWearable\\\"\");\n"
				+ "if(!waitforACK(\"OK\", 10000)){\n"
				+ "Serial.println(\"Cannot connect to AP\");\n"
				+ "}\n"
				+ "else{\n"
				+ "Serial.println(\"Connect to AP\");\n"
				+ "}\n"
				+ "wifi.println(\"AT+CIPSTART=\\\"TCP\\\",\\\"192.168.200.46\\\",3484\");\n"
				+ "wifi_Ret = waitforACK(\"Linked\", 5000);\n"
				+ "if(!wifi_Ret){\n"
				+ "Serial.println(\"Cannot connect to Server\");\n"
				+ "}\n"
				+ "else{\n"
				+ "Serial.println(\"Linked to Server\");\n"
				+ "}\n"
				+ "\n}"
				+  "\nbool waitforACK(char ackstring[], int timeout){\n"
				+"unsigned long start = millis();while(millis() < start+timeout) {\n"
				+"if(wifi.available()){\n"
				+"if(wifi.find(ackstring))\n"
				+"return true;\n"
				+"\n"
				+"}\n"
				+"\n"
				+"}\n"
				+"return false;\n"
				+"}\n"
				+"//Send to wifi\n"
				+"void sendToWifi(char* request){\n"
				+"int leg = strlen(request);\n"
				+"wifi.println(\"AT+CIPSEND=0,\"+leg);\n"
				+"if(!waitforACK(\">\", 5000))\n"
				+"{\n"
				 +"Serial.println(\"Cannot setup sending data\");\n"
				+"}\n"
				+"else{\n"
				 +"Serial.println(\"Sending data\");\n"
				+"wifi.println(request);\n"
				+"}\n"
				+"if(!waitforACK(\"SEND OK\", 5000)){\n"
				 +"Serial.println(\"SEND DATA FAILED\");\n"
				+"}\n"
				 +"else{\n"
				 +"Serial.println(\"Sending data OK\");\n"
				+"}\n"
				+"\n"
				+"}\n";
				
		String actual = codeCreationEngine.createInclude()+"\n"
				+ codeCreationEngine.createDefine()+"\n"
				+ codeCreationEngine.createPrototype()
				+ "\n"
				+ "void setup(){\n"
				+ codeCreationEngine.createInitSetup()
				+ "\n}\n"
				+codeCreationEngine.createMethodImpl();
		assertEquals(expected, actual);
	}
}
