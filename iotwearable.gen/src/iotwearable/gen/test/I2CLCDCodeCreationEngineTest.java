package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

import iotwearable.gen.cce.device.I2CLCDCodeCreationEngineImpl;
import iotwearable.gen.comanalyzer.Token;
import iotwearable.gen.comanalyzer.TokenType;
import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.Pin.TypePin;

public class I2CLCDCodeCreationEngineTest extends DeviceCodeCreationEngineTest{
	I2CLCD i2clcd = IotwFactory.eINSTANCE.createI2CLCD();
	Pin pinSDA;
	Pin pinSCL;
	I2CLCDCodeCreationEngineImpl codeCreationEngine;
	
	public I2CLCDCodeCreationEngineTest() {
		i2clcd.setId("lcd");
		pinSDA = new Pin("SDA", TypePin.IO);
		pinSDA.setIdConnect("A4<->SDA");
		pinSCL = new Pin("SCL", TypePin.IO);
		pinSCL.setIdConnect("A5<->SCL");
		i2clcd.modifyPin(pinSDA);
		i2clcd.modifyPin(pinSCL);
		addDevice(i2clcd);
		codeCreationEngine = new I2CLCDCodeCreationEngineImpl(i2clcd);
	}
		
	@Test
	public void createCode_True() {
		String expected = "#include <LiquidCrystal_I2C.h>"
				+ "\n"
				+"/*Define LiquidCrystal_I2C - lcd */\n"
				+ "LiquidCrystal_I2C lcd(0x3F, 20, 4);"
				+ "\n"
				+"void setup(){\n"
				+ "lcd.begin(20, 4);\n"
				+"lcd.backlight();"
				+ "\n}";
		String actual = codeCreationEngine.createInclude()+"\n"
				+ codeCreationEngine.createDefine()
				+ "\n"
				+"void setup(){\n"
				+ codeCreationEngine.createInitSetup()
				+ "\n}";;
		assertEquals(expected, actual);
	}
	@Test
	public void createCode_Blink_ID_Command(){
		String syntax = "Blink <id>";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Blink"));
		tokens.add(new Token(TokenType.id_identifier, "lcd"));
		String expected = "lcd.blink();";
		assertEquals(expected, codeCreationEngine.createFromCommand(syntax, tokens));
	}
	@Test
	public void createCode_Show_String_Command(){
		String syntax = "Show <String>";
		LinkedList<Token> tokens = new LinkedList<Token>();
		tokens.add(new Token(TokenType.keyword, "Show"));
		tokens.add(new Token(TokenType.string_literal,"\"Hello word\""));
		String expected = "lcd.print(\"Hello word\");";
		assertEquals(expected, codeCreationEngine.createFromCommand(syntax, tokens));
	}
}
