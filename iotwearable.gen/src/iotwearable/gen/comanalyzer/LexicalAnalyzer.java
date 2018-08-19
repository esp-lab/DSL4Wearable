package iotwearable.gen.comanalyzer;

import iotwearable.gen.utilities.GenRuntimeException;

import java.util.LinkedList;
/**
 * 
 * A class to read a head string, using the tokenizer class to separate it. The result used in the parser.
 * Can add id_idIdentifier before lexer. Example: keypad|buzzer. Use setIdIdentifiers
 *
 */
public class LexicalAnalyzer {
	Tokenizer tokenizer;
	
	public LexicalAnalyzer() {
		tokenizer = new Tokenizer();
	}
	
	public void lex(String s) {
		s = s.trim();
		try {
			tokenizer.tokenize(s);
		} catch (GenRuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Gets the token
	 * 
	 * @return {@linkplain List}<{@linkplain Token}>
	 */
	public LinkedList<Token> getTokens() {
		return tokenizer.getTokens();
	}
	public void setIdIdentifiers(String idIdentifiers) {
		if(idIdentifiers != null)
			if(!idIdentifiers.isEmpty())
				tokenizer.add(idIdentifiers, TokenType.id_identifier);
	}
}
