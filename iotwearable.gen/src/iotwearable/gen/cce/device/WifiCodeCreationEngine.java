package iotwearable.gen.cce.device;

public abstract class WifiCodeCreationEngine extends DeviceCodeCreationEngine{

	@Override
	public String createPrototype() {
		return  "//Read response from esp. Arduino is a receiver"
				+ "\nString readResponse();"
				+ "\n//Arduino send command to the esp"
				+ "\nString sendCommand(String command);"
				+ "\n//Close connection with a link id"
				+ "\nvoid closeConnect();"
				+ "\n void sendResponse(String content);"
				+ "\nvoid HandleRequest(String res);";
	}
	@Override
	public String createInclude() {
		return "";
	}
	@Override
	public String createInitSetup() {
		return  "\nSerial.begin(9600); //Change baud rate according to your ESP"
				+ "\n<<esp8266>>.begin(<<baud>>);";
	}
	@Override
	public String createDefine() {
		String content = "/*Define <type> - <<id>> */\n";
		content +="\n#define TIMEOUT 3000"
				+ "\n#define RX <<RX>> // pin TX of ESP8266 connect to pin <<RX>> of Arduino"
				+ "\n#define TX <<TX>> //pin RX of ESP8266 connect to pin <<TX>> of Arduino"
				+ "\nSoftwareSerial <<id>>(RX,TX); ";

		return content;
	}
}