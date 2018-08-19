package iotwearable.gen.test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import iotwearable.gen.cce.device.LEDCodeCreationEngine;
import iotwearable.gen.cce.device.LEDSingleCodeCreationEngine;
import iotwearable.gen.comanalyzer.Token;
import iotwearable.gen.comanalyzer.TokenType;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.Pin.TypePin;

import org.junit.Test;

public class LEDSingleCodeCreationEngineTest extends DeviceCodeCreationEngineTest{
	LED led = IotwFactory.eINSTANCE.createLED();
	Pin pin1;
	LEDCodeCreationEngine codeCreationEngine;
	
	public LEDSingleCodeCreationEngineTest() {
		led.setId("led");
		pin1 = new Pin("1", TypePin.Passive);
		pin1.setIdConnect("2<->1");
		led.modifyPin(pin1);
		addDevice(led);
		codeCreationEngine = new LEDSingleCodeCreationEngine(led);
	}
	
	
	@Test
	public void ceateCode_True() {
		String expected = "/*Define LED - led output*/\n"
				+"const int led = 2;"
				+ "\n"
				+ "void setup(){\n"
				+ "pinMode(led, OUTPUT);"
				+ "\n}";
		String actual = codeCreationEngine.createDefine()+"\n"
				+ "void setup(){\n"
				+ codeCreationEngine.createInitSetup()
				+ "\n}";
		assertEquals(expected,actual);
	}
	@Test
	public void createCode_Blink_ID_Command(){
		String expected = "digitalWrite(ledGreen, HIGH);"
				+ "\ndelay(1000);"
				+ "\ndigitalWrite(ledGreen, LOW);"
				+ "\ndelay(1000);";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Blink"));
		tokens.add(new Token(TokenType.id_identifier, "ledGreen"));
		assertEquals(expected, codeCreationEngine.createFromCommand("Blink <id>", tokens));
	}
	@Test
	public void createCode_Hidden_ID_Command(){
		String expected = "digitalWrite(ledGreen, LOW);";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Hidden"));
		tokens.add(new Token(TokenType.id_identifier, "ledGreen"));
		assertEquals(expected, codeCreationEngine.createFromCommand("Hidden <id>", tokens));
	}
	@Test
	public void createCode_Display_ID_Command(){
		String expected = "digitalWrite(ledGreen, HIGH);";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Display"));
		tokens.add(new Token(TokenType.id_identifier, "ledGreen"));
		assertEquals(expected, codeCreationEngine.createFromCommand("Display <id>", tokens));
	}
}