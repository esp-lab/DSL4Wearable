package iotwearable.gen.comanalyzer;





/**
 * A token that is produced by Tokenizer and fed into Parser.parse.
 * 
 * A token consists of a token type, a instance.
 * 
 */
public class Token {
	public  TokenType type;
	public  String instance;

	
	public Token(TokenType type, String instance) {
		this.type = type;
		this.instance = instance;
	}
	@Override
	public String toString() {
		return this.type + "\t" + this.instance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((instance == null) ? 0 : instance.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Token other = (Token) obj;
		if (instance == null) {
			if (other.instance != null)
				return false;
		} else if (!instance.equals(other.instance))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
}
