package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;

public abstract class LEDCodeCreationEngine extends DeviceCodeCreationEngine{

	@Override
	public String createDefine() {
		String content = "/*Define LED - <id> output*/\n";
		content += "const int <id> = <pin>;";
		return content;
	}
	@Override
	public String createInitSetup() {
		return "pinMode(<id>, OUTPUT);";
	}
	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String code = "";
		if(syntax.equals("Display <id>")){
			code = "digitalWrite("+tokens.get(1).instance+", HIGH);";
		}
		else if(syntax.equals("Hidden <id>")){
			code = "digitalWrite("+tokens.get(1).instance+", LOW);";
		}
		else if(syntax.equals("Blink <id>")){
			code =  "digitalWrite("+tokens.get(1).instance+", HIGH);"
					+ "\ndelay(1000);"
					+ "\ndigitalWrite("+tokens.get(1).instance+", LOW);"
					+ "\ndelay(1000);";
					
		}
		else if(syntax.equals("Blink <id><integer> times"))
		{
			code = "for(int i=0;i< "+tokens.get(2).instance+";i++){"
					+ "\ndigitalWrite("+tokens.get(1).instance+", HIGH);"
					+ "\ndelay(1000);"
					+ "\ndigitalWrite("+tokens.get(1).instance+", LOW);"
					+ "\ndelay(1000);"
					+ "\n}";
		}
		return code;
	}
}