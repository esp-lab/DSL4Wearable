package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.Buzzer;
/**
 * 
 * Class generate code for Buzzer device.
 *
 */
public class BuzzerCodeCreationEngine extends DeviceCodeCreationEngine{
	private Buzzer buzzer;
	
	public BuzzerCodeCreationEngine(Buzzer buzzer) {
		super();
		this.buzzer = buzzer;
	}

	@Override
	public String createInclude() {
		return "";
	}

	@Override
	public String createDefine() {
		String content = "// Define "+buzzer.getName()+" output\n"
		+ "#define " + buzzer.getId()+"  "+buzzer.getMainboard().findPin(buzzer.getPinConnecteds().get(0)).getName();
		return content;
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
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String code = "";
		if(syntax.equals("Beep <id>")){
			code = "analogWrite("+buzzer.getId()+", "+buzzer.getTone()+");   // turn the Buzzer on\n"
					+ "delay("+buzzer.getTime()+");                  // wait for "+ buzzer.getTime()+" milisecond\n"
					+ "analogWrite("+buzzer.getId()+", -1);// turn the Buzzer off\n";
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