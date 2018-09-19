package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.WifiESP8266;

public class WifiESP8266V1CodeCreationEngine extends WifiCodeCreationEngine {
	private WifiESP8266 wifiESP8266;

	public WifiESP8266V1CodeCreationEngine(WifiESP8266 wifiESP8266) {
		this.wifiESP8266= wifiESP8266;
	}
	@Override
	public String createInclude() {
		return "#include <SoftwareSerial.h>";
	}
	@Override
	public String createInitSetup() {
		String result = super.createInitSetup();
		result = result.replaceAll("<<baud>>", wifiESP8266.getBaud().getValue()+"")
				.replaceAll("<<esp8266>>", wifiESP8266.getId());
		result += initESP8266();

		return result;
	}
	@Override
	public String createDefine() {
		String content = super.createDefine();
		content = content.replaceAll("<<id>>", wifiESP8266.getId())
				.replaceAll("<type>", wifiESP8266.getName())
				.replaceAll("<<TX>>", getPinMainboard(wifiESP8266.getPinRX().getIdConnect()))
				.replaceAll("<<RX>>", getPinMainboard(wifiESP8266.getPinTX().getIdConnect()));
		return content;
	}

	@Override
	public String createInitLoop() {
		return   "\n//Listening the request from server"
				+ " \n String res = readResponse();"
				+ "	\n	  if(res != \"\"){"
				+ "	\n	   HandleRequest(res);"
				+ " \n}"
				+ "\ndelay(300);";
	}
	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		if(syntax.equals("<String> received"))
		{
			return 	"if(res.indexOf("+tokens.get(0).instance+") != -1)"
					+ "\n{"
					+ "\n<content>"
					+ "\n} ";
		}
		else if(syntax.equals("<String> send"))
		{
			return "\n //send to client response"
					+ "\n sendResponse("+tokens.get(0).instance+");"
					+ "\n<content>";
		}
		return "";

	}

	@Override
	public String createMethodImpl() {
		String result ="";
		result+= readResponse()
				+ "\n" + sendCommand()
				+"\n" + closeConnect();
		if(cWMode() == 1)
			result	+="\n" + sendResponseClient();
		else 
			result += "\n" + sendResponseServer();
		result	+="\n" + HandleRequest();
		return result;
	}
	private int cWMode()
	{
		if(wifiESP8266.getMode().getName().equals("Station"))
			return 1;
		else if(wifiESP8266.getMode().getName().equals("Access_Point"))
			return 2;
		else return 3;
	}
	private String initESP8266()
	{
		String result ="\nSerial.println(sendCommand(\"AT+RST\"));"
				+ "\n Serial.println(sendCommand(\"AT+CWMODE="+cWMode()+"\"));";
		result += initClient();
		result+= initServer();
		return result;
	}
	private String initClient() {

		String result="";
		if(wifiESP8266.getSSID_AccessPoint()!="" && wifiESP8266.getSSID_AccessPoint() != null &&
				wifiESP8266.getPassword_AccessPoint()!="" && wifiESP8266.getPassword_AccessPoint()!= null)
		{

			result +="\n  Serial.println(sendCommand(\"AT+CWJAP=\\\""+wifiESP8266.getSSID_AccessPoint()+"\\\",\\\""+wifiESP8266.getPassword_AccessPoint()+"\\\"\"));";
		}
		result += "\nSerial.println(sendCommand(\"AT+CIFSR\"));";

		return result;
	}
	private String initServer()
	{
		if(cWMode() >=2)
		{
			String result="";
			if(wifiESP8266.getSSID_ST()!="" && wifiESP8266.getSSID_ST()!= null &&
					wifiESP8266.getPassword_ST()!="" && wifiESP8266.getPassword_ST()!= null)
				result+= "\nSerial.println(sendCommand(\"AT+CWSAP=\\\""+wifiESP8266.getSSID_ST()+"\\\",\\\""+wifiESP8266.getPassword_ST()+"\\\",5,3\"));";
			result+="\nSerial.println(sendCommand(\"AT+CIPAP=\\\""+ wifiESP8266.getIP()+"\\\",\\\""+wifiESP8266.getIP()+"\\\",\\\"255.255.255.0\\\"\"));" //LOCAL_ID, GATEWAY, SUBNET"
					+ "\n Serial.println(sendCommand(\"AT+CIPMUX="+wifiESP8266.getConnectedChannel().getValue()+"\"));"
					+ "\n Serial.println(sendCommand(\"AT+CIPSERVER=1,"+wifiESP8266.getPort()+"\"));  "
					+"\n Serial.println(sendCommand(\"AT+CIFSR\"));  ";
			result += "\nSerial.println(\"Server is ready.\");";
			return result;
		}
		return "";
	}

	private String readResponse()
	{
		return "String readResponse()"
				+ "\n{"
				+ "\nString res = \"\";"
				+ "\nlong timeout = millis() + TIMEOUT;"
				+ "\nwhile (millis() < timeout)"
				+ "\n{"
				+ "\nif ("+wifiESP8266.getId()+".available())"
				+ "\n{"
				+ "\nchar ch = "+wifiESP8266.getId()+".read();"
				+ "\nres += ch;"
				+ "\n}"
				+ "\n}"
				+ "\n	return res;"
				+ "\n}";
	}
	private String sendCommand() {
		return "//Send command to esp."
				+ "\nString sendCommand(String command)"
				+ "\n{"
				+ "\n"+wifiESP8266.getId()+".println(command);"
				+ "\nreturn readResponse();"
				+ "\n}";
	}
	private String closeConnect() {
		return "//Close connection with a link id"
				+ "\nvoid closeConnect()"
				+ "\n{"
				+"\nSerial.println(sendCommand(\"AT+CIPCLOSE=5\"));"
				+ "\n}";
	}

	private String HandleRequest() {
		String result ="";
		if(cWMode() >=2)
			result+= "void HandleRequest(String res){"
					+ "\nif (res.indexOf(\"GET / HTTP/1.1\") >= 0)"
					+ "\n	{"
					+ "\nString content = \"Welcome to ESP-LAB\";"
					+ "\nString cmd = \"AT+CIPSEND=0,\";"
					+ "\ncmd += content.length();"
					+ "\nSerial.println(sendCommand(cmd));"
					+ "\nSerial.println(sendCommand(content));"
					+ "\ncloseConnect();"
					+ "\n}"
					+ "\nelse if (res.indexOf(\"CONNECT\") >= 0)"
					+ "\n{"
					+ "\nSerial.println(\"receive....\");"
					+ "\n}"
					+ "\nelse if (res.indexOf(\"+IPD\") >= 0)"
					+ "\n{"
					+ "\n//<requestWifi>"

					+ "\n}"
					+ "\ndelay(300); "
					+ "\n}";
		else 
			result+=  "void HandleRequest(String res){"
					+ "\nif(res.indexOf(\"+IPD\") >= 0)"
					+ "\n{"
					+ "\n//<requestWifi>"
					+ "\n}"
					+ "\ndelay(300);"
					+ "\n} ";
		return result;

	}
	private String sendResponseClient()
	{
		String result ="void sendResponse(String content)"
				+ "\n{";
		result	+= "\ncloseConnect();"
				+ "\nSerial.println(sendCommand(\"AT+CIPSTART=\\\""+getProtocol() +"\\\",\\\""+wifiESP8266.getIP()+"\\\","+wifiESP8266.getPort()+"\"));"
				+"\nString cmd = \"AT+CIPSEND=\";"
				+ "\ncmd += content.length();"
				+ "\nSerial.println(sendCommand(cmd));"
				+ "\nSerial.println(sendCommand(content));"
				+"\n}";
		return result;
	}
	private String sendResponseServer()
	{
		String result ="void sendResponse(String content)"
				+ "\n{"
				+	"\nString cmd = \"AT+CIPSEND=0,\";"
				+ "\ncmd += content.length();"
				+ "\nSerial.println(sendCommand(cmd));"
				+ "\nSerial.println(sendCommand(content));"
				+ "\n  closeConnect();"
				+"\n}";
		return result;
	}
	private String getProtocol() {
		if(wifiESP8266.getProtocol().getName().equals("TCP"))
			return "TCP";
		return "UDP";
	}
	private String getPinMainboard(String idConnect) {
		for(Pin pin : wifiESP8266.getMainboard().getPinConnecteds())
		{
			if(pin.getIdConnect().equals(idConnect))
				return pin.getName();
		}
		return "";
	}
}
