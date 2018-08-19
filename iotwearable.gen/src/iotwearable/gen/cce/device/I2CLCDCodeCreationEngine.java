package iotwearable.gen.cce.device;

import iotwearable.gen.comanalyzer.Token;

import java.util.LinkedList;

public abstract class I2CLCDCodeCreationEngine extends DeviceCodeCreationEngine{
	@Override
	public String createInclude() {
		return "#include <"+DeviceLibrary.LiquidCrystal_I2C+".h>";
	}
	@Override
	public String createDefine() {
		String content = "/*Define LiquidCrystal_I2C - <id> */\n"
				+ "LiquidCrystal_I2C <id>(0x27, <width>, <height>);" ;
		return content;
	}
	@Override
	public String createInitSetup() {
		return "<id>.init();"
				+ "\n<id>.begin(<cols>, <rows>);\n"
				+ "<id>.backlight();";
	}

	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String code = "";
		if(syntax.equals("Show <String>")){
			code = "<id>.clear();"
					+ "<plitstext>";
		}
		if(syntax.equals("Blink <id>")){
			code = "<id>.blink();";
		}
		return code;
	}
}