package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import iotwearable.gen.cce.device.Keypad4x4CodeCreationEngine;
import iotwearable.gen.comanalyzer.Token;
import iotwearable.gen.comanalyzer.TokenType;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.Pin.TypePin;

import org.junit.Test;

public class Keypad4x4CodeCreationEngineTest extends
		DeviceCodeCreationEngineTest {
	Keypad4x4 keypad4x4 = IotwFactory.eINSTANCE.createKeypad4x4();
	Pin pinR1;
	Pin pinR2;
	Pin pinR3;
	Pin pinR4;
	Pin pinC1;
	Pin pinC2;
	Pin pinC3;
	Pin pinC4;
	Keypad4x4CodeCreationEngine codeCreationEngine;

	public Keypad4x4CodeCreationEngineTest() {
		keypad4x4.setId("keypad");
		pinR1 = new Pin("R1", TypePin.IO);
		pinR1.setIdConnect("2<->R1");
		pinR2 = new Pin("R2", TypePin.IO);
		pinR2.setIdConnect("3<->R2");
		pinR3 = new Pin("R3", TypePin.IO);
		pinR3.setIdConnect("4<->R3");
		pinR4 = new Pin("R4", TypePin.IO);
		pinR4.setIdConnect("5<->R4");
		pinC1 = new Pin("C1", TypePin.IO);
		pinC1.setIdConnect("6<->C1");
		pinC2 = new Pin("C2", TypePin.IO);
		pinC2.setIdConnect("7<->C2");
		pinC3 = new Pin("C3", TypePin.IO);
		pinC3.setIdConnect("8<->C3");
		pinC4 = new Pin("C4", TypePin.IO);
		pinC4.setIdConnect("9<->C4");
		keypad4x4.modifyPin(pinR1);
		keypad4x4.modifyPin(pinR2);
		keypad4x4.modifyPin(pinR3);
		keypad4x4.modifyPin(pinR4);
		keypad4x4.modifyPin(pinC1);
		keypad4x4.modifyPin(pinC2);
		keypad4x4.modifyPin(pinC3);
		keypad4x4.modifyPin(pinC4);
		keypad4x4.setNameButton1("Order");
		keypad4x4.setNameButton2("Cancel");
		addDevice(keypad4x4);
		codeCreationEngine = new Keypad4x4CodeCreationEngine(keypad4x4);
	}

	@Test
	public void createCode() {
		String expected = "#include <Keypad.h>"
				+ "\n"
				+ "/*Define kepad4x4 - keypad\n"
				+ "Button 1 : Order"
				+ "\nButton 2 : Cancel"
				+ "\n*/\n"
				+ "char keypad_keys[4][4] ="
				+ "{{'1','2','3','A'},"
				+ "{'4','5','6','B'},"
				+ "{'7','8','9','C'},"
				+ "{'*','0','#','D'}};\n"
				+ "byte keypad_rowPins[4] = {2,3,4,5};\n"
				+ "byte keypad_columnPins[4] = {6,7,8,9};\n"
				+ "Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);"
				+ "\n" + "void loop(){\n"
				+ "char keypadClientKey = keypad.getKey();"
				+ "\n}";
		String actual = codeCreationEngine.createInclude()+"\n"
				+ codeCreationEngine.createDefine()
				+ "\n" + "void loop(){\n"
				+ codeCreationEngine.createInitLoop()
				+ "\n}";
				assertEquals(expected, actual);
	}

	@Test
	public void createCode_String_button_pressed_Command() {
		String syntax = "<String> button pressed";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.string_literal, "Order"));
		tokens.add(new Token(TokenType.keyword, "button"));
		tokens.add(new Token(TokenType.keyword, "pressed"));
		String expected = "if(keypadClientKey == '1'){\n<content>\n}";
		assertEquals(expected,
				codeCreationEngine.createFromCommand(syntax, tokens));
	}
}