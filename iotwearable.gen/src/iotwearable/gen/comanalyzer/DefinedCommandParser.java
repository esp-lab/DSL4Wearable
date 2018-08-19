package iotwearable.gen.comanalyzer;

import iotwearable.gen.cce.device.CodeCreationEngineFactory;
import iotwearable.gen.cce.device.DeviceCodeCreationEngine;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.WifiESP8266;

import java.util.LinkedList;

/**
 * 
 * A class analyzes a command line.
 *
 */
public class DefinedCommandParser {
	private final String keywords = "Show|Display|button|pressed"
			+ "|Hidden|Blink|Beep|push|Delay|times|received|send";
	private LexicalAnalyzer lexer = new LexicalAnalyzer();
	public DefinedCommandParser() {
		lexer.tokenizer.add(keywords, TokenType.keyword);
		lexer.tokenizer.add("[0-9]+", TokenType.integer_literal);
		lexer.tokenizer.add("\\\".*\\\"", TokenType.string_literal);
		lexer.tokenizer.add("\\\'[a_zA_Z]\\\'", TokenType.character_literal);
		lexer.tokenizer.add("\\{|\\}", TokenType.separator);
		lexer.tokenizer.add("\\+|\\-|\\*|\\/|\\=", TokenType.operator);
	}

	public String parse(String command, Mainboard mainboard){
		addTokenIdIdentifier(mainboard);
		lexer.lex(command);
		if(!lexer.getTokens().isEmpty()){
			String syntax = createSyntax(lexer.getTokens());
			if(!syntax.isEmpty()){
				String result = "";
				DeviceCodeCreationEngine codeCreationEngine = null;
				Device device = null;
				String _id = "";
				_id = getIdIdentifier(lexer.getTokens());
				if(!_id.isEmpty()){
					device = getDevice(mainboard, _id);
				}
				else {
					if(syntax.equals("Show <String>")){
						for(Device _device: mainboard.getDevices()){
							if(_device instanceof I2CLCD){
								device = _device;
							}
						}
					}
					if(syntax.equals("<String> button pressed")){
						for(Device _device: mainboard.getDevices()){
							if(_device instanceof Keypad4x4){
								device = _device;
							}
						}
					}
					if(syntax.equals("<String> push")){
						for(Device _device: mainboard.getDevices()){
							if(_device instanceof Button){
								device = _device;
							}
						}
					}
					if(syntax.equals("Delay <integer>")){
						return "delay("+lexer.getTokens().get(1).instance+");";
					}
					if(syntax.equals("<String> received"))
					{
						for(Device _device: mainboard.getDevices()){
							if(_device instanceof WifiESP8266){
								device = _device;
							}
						}
					}
					if(syntax.equals("<String> send"))
					{
						for(Device _device: mainboard.getDevices()){
							if(_device instanceof WifiESP8266){
								device = _device;
							}
						}
					}
				}
			
			if(device != null){
				codeCreationEngine = CodeCreationEngineFactory.create(device);
				if(codeCreationEngine != null){
					result = codeCreationEngine.createFromCommand(syntax, lexer.getTokens());
					return result;
				}
			}
		}
	}
	return "";
}

private String getIdIdentifier(LinkedList<Token> tokens){
	for(Token token : tokens){
		if(token.type.equals(TokenType.id_identifier)){
			return token.instance;
		}
	}
	return "";
}
//Get device with id
private Device getDevice(Mainboard mainboard, String id){
	for(Device device : mainboard.getDevices()){
		if(device.getId().equals(id)){
			return device;
		}
	}
	return null;
}

/**
 * Create a syntax from a linkedlist {@linkplain Token}
 * 
 * @param tokens
 */
private String createSyntax(LinkedList<Token> tokens) {
	String syntax = "";
	Token token;
	if (!tokens.isEmpty()) {
		for (int i = 0; i < tokens.size(); i++) {
			token = tokens.get(i);
			if (token.type.equals(TokenType.id_identifier)) {
				syntax += ' ' + "<id>";
			} else if (token.type.equals(TokenType.keyword)) {
				syntax += ' ' + token.instance;
			} else if (token.type.equals(TokenType.separator)) {
				syntax += token.instance;
			}
			else if( token.type.equals(TokenType.operator)){
				syntax += ' ' + token.instance;
			}
			else {
				if (i >= 1) {
					if (tokens.get(i - 1).type.equals(TokenType.keyword)) {
						syntax += ' ';
					}
				}
				if (token.type.equals(TokenType.integer_literal)) {
					syntax += "<integer>";
				} else if (token.type.equals(TokenType.string_literal)) {
					syntax += "<String>";
				}
			}
		}
	}
	return syntax.trim();
}
private void addTokenIdIdentifier(Mainboard mainboard){
	String idIdentifiers = "";
	for(Device device : mainboard.getDevices()){
		idIdentifiers += "|" + device.getId();
	}
	idIdentifiers = idIdentifiers.substring(1);
	lexer.setIdIdentifiers(idIdentifiers);
}
public LexicalAnalyzer getLexer() {
	return lexer;
}
}