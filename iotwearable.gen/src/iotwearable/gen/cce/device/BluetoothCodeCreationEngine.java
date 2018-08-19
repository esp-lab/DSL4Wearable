package iotwearable.gen.cce.device;

public abstract class BluetoothCodeCreationEngine extends DeviceCodeCreationEngine{
	@Override
	public String createInclude() {
		return "#include <"+DeviceLibrary.SoftwareSerial+".h>";
	}
	
	@Override
	public String createDefine() {
		String content = "/*Define <type>*/\n"
		+ "SoftwareSerial <id>(<pinRX>, <pinTX>);\n";
		return content;
	}
}