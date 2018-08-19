package iotwearable.validation;

public class NameValidator extends Validator{
	private String name;
	private static final String regex = "^([a-zA-Z]*)";
	public NameValidator(String name) {
		this.name = name;
	}
	@Override
	public boolean isValid() {
		if(name.isEmpty())
		{
			invalidMessage="Name of StateFrame mustn't be empty";
			return false;
		}
		if(!name.matches(regex))
		{
			invalidMessage="Name of StateFrame must be String";
			return false;
		}
		
		return true;
	}

}
