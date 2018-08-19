package iotwearable.gen.cce.device;

import iotwearable.gen.comanalyzer.Token;

import java.util.LinkedList;

public abstract class KeypadCodeCreationEngine extends DeviceCodeCreationEngine{

	@Override
	public String createInclude() {
		return "#include <"+DeviceLibrary.Keypad+".h>";
	}
	@Override
	public String createDefine() {
		String content = "/*Define kepad4x4 - <id>\n"
				+ "<descriptionKey>"
				+ "*/\n";
		content += "char <id>_keys[<row>][<col>] ={<keys>};\n";
		content += "byte <id>_rowPins[<row>] = {<rowPins>};\n"
			+ "byte <id>_columnPins[<col>] = {<columnPins>};\n";
		content += "Keypad <id> = Keypad(makeKeymap(<id>_keys), <id>_rowPins, <id>_columnPins, <row>, <col>);";
		return content;
	}
	@Override
	public String createInitLoop() {
		return "char <id>ClientKey = <id>.getKey();";
	}
	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String code = "";
		if (syntax.equals("<String> button pressed")) {
			code = "if(<id>ClientKey == <key>){\n"
					+ "<content>"
					+ "\n}";
		}
		return code;
	}
}