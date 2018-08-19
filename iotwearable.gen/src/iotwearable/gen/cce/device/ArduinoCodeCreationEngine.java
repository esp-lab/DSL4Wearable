package iotwearable.gen.cce.device;

import iotwearable.gen.comanalyzer.Token;

import java.util.LinkedList;

public  class ArduinoCodeCreationEngine extends DeviceCodeCreationEngine{

	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		if(syntax.equals("Delay <integer>"))
		{
			return "delay("+tokens.get(1)+");";
		}
		return "";
	}

	@Override
	public String createInclude() {
		return "";
	}

	@Override
	public String createDefine() {
		return "";
	}

	@Override
	public String createInitSetup() {
		return "";
	}

	@Override
	public String createInitLoop() {
		return "";
	}

	@Override
	public String createPrototype() {
		return "";
	}

	@Override
	public String createMethodImpl() {
		return "";
	}

}
