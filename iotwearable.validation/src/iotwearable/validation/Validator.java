package iotwearable.validation;

public abstract class Validator {
	String invalidMessage = "";
	
	public String getInvalidMessage() {
		return invalidMessage;
	}
	
	abstract public boolean isValid();
}