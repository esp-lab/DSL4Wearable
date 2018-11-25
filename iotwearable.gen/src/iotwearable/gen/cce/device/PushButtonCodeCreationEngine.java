package iotwearable.gen.cce.device;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.Button;

import java.util.LinkedList;

public class PushButtonCodeCreationEngine extends DeviceCodeCreationEngine{
	private Button button;

	public PushButtonCodeCreationEngine(Button button) {
		super();
		this.button = button;
	}

	@Override
	public String createInclude() {
		return "";
	}

	@Override
	public String createDefine() {
		StringBuilder content = new StringBuilder();
		 content.append("// Define "+button.getName()+"  output\n");
		 content.append("const int " + button.getId()+" = "+button.getMainboard().findPin(button.getPinConnecteds().get(0)).getName()+";");
		return content.toString();
	}

	@Override
	public String createInitSetup() {
	return	"pinMode("+button.getId()+", INPUT);";
	}

	@Override
	public String createInitLoop() {
		return "";
	}

	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String code = "";
		if (syntax.equals("<id> push")) {
			code = "if(digitalRead("+button.getId()+") == HIGH){\n"
					+ "<content>"
					+ "\n}";
		}
		return code;
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