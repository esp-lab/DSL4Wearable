package iotwearable.gen.comanalyzer;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A class for reading an input string and separating it into tokens that can be
 * used into Parser.
 * 
 * The user can add regular expressions that will be matched against the front
 * of the string. Regular expressions should not contain beginning-of-string or
 * end-of-string anchors or any capturing groups as these will be added by the
 * tokenizer itslef. <br/>
 * Example:</br> - Expected: ^(@this is regex) <br>
 * - Write: @this is regex
 */
public class Tokenizer {
	/*Each token type corresponds to one entry in the list */
	private LinkedList<TokenInfo> tokenInfos;
	/* The list of tokens produced when tokenizing the input */
	private LinkedList<Token> tokens;

	public Tokenizer() {
		super();
		tokenInfos = new LinkedList<TokenInfo>();
		tokens = new LinkedList<Token>();
	}

	public void add(String regex, TokenType token) {
		tokenInfos
		.add(new TokenInfo(Pattern.compile("^(" + regex + ")"), token));
	}
	/**
	 * Tokenize an input string.
	 * 
	 * @param str 
	 * 		: string needs to be separated.
	 */
	public void tokenize(String str) {
		String s = str.trim();
		tokens.clear();
		while (!s.equals("")) {
			boolean match = false;
			for (TokenInfo info : tokenInfos) {
				Matcher m = info.regex.matcher(s);
				if(info.type.equals(TokenType.id_identifier)){
					String _id = "";
					try{
						_id = s.split(" ")[0];
					}
					catch(Exception e){
					}

					if(!_id.isEmpty()){
						if(isExistID(info.regex.toString(), _id)){
							if (m.find()) {
								match = true;
								String tok = m.group().trim();
								s = m.replaceFirst("").trim();
								tokens.add(new Token(info.type, tok));
								break;
							}
						}	
					}

				}
				else if (m.find()) {
					match = true;
					String tok = m.group().trim();
					s = m.replaceFirst("").trim();
					tokens.add(new Token(info.type, tok));
					break;
				}
			}
			if (!match){
				break;
				//				throw new GenRuntimeException("Unexpected character in input: " + s);
			}
		}
	}

	private boolean isExistID(String  strID, String ID) {
		return strID.replace("^(", "").replace(")", "").indexOf(ID) >= 0;
	}
	public LinkedList<Token> getTokens() {
		return tokens;
	}

	/**
	 * Internal class holding the information about a token type.
	 */
	private class TokenInfo {
		public final Pattern regex;
		public final TokenType type;

		public TokenInfo(Pattern regex, TokenType type) {
			super();
			this.regex = regex;
			this.type = type;
		}
	}
}
