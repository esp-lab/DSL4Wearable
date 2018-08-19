package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

import iotwearable.gen.cce.device.BuzzerCodeCreationEngine;
import iotwearable.gen.comanalyzer.Token;
import iotwearable.gen.comanalyzer.TokenType;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.Pin.TypePin;

public class BuzzerCodeCreationEngineTest extends DeviceCodeCreationEngineTest{
	Buzzer buzzer = IotwFactory.eINSTANCE.createBuzzer();
	Pin pin1;
	BuzzerCodeCreationEngine codeCreationEngine;
	
	public BuzzerCodeCreationEngineTest() {
		buzzer.setId("buzzer");
		pin1 = new Pin("1", TypePin.Passive);
		pin1.setIdConnect("2<->1");
		buzzer.modifyPin(pin1);
		addDevice(buzzer);
		codeCreationEngine = new BuzzerCodeCreationEngine(buzzer);
	}

	@Test
	public void createCode_True() {
		String expected = "/*Define Buzzer output*/\n"
				+ "const int buzzer = 2;"
				+ "\n"
				+ "void setup(){\n"
				+ "pinMode(buzzer, OUTPUT);"
				+ "\n}";
		String actual = codeCreationEngine.createDefine() + "\n"
				+ "void setup(){\n"
				+  codeCreationEngine.createInitSetup()
				+ "\n}";
		assertEquals(expected, actual);
	}

	@Test
	public void createCode_Beep_Command_True(){
		String syntax = "Beep <id>";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Beep"));
		tokens.add(new Token(TokenType.id_identifier, "buzzer"));
		String expected = "analogWrite(buzzer, 20);"
				+ "\ndelay(50);"
				+ "\nanalogWrite(buzzer, 0);"
				+ "\ndelay(50);";
		assertEquals(expected, codeCreationEngine.createFromCommand(syntax, tokens));
	}
	@Test
	public void createCode_Not_Is_Command() {
		String syntax = "Not command";
		LinkedList<Token> tokens = new LinkedList<Token>();
		String expected = "";
		assertEquals(expected, codeCreationEngine.createFromCommand(syntax, tokens));
	}
}
