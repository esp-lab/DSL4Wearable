package iotwearable.validation;


public class IDValidator extends Validator {
	private static final String regex = "^([a-zA-Z$_][a-zA-Z0-9$_]*)";
	String id;
	Object o;
	public IDValidator(String id, Object o) {
		this.id = id;
		this.o = o;
	}

	@Override
	public boolean isValid() {
		if (id == null) {
			invalidMessage = "Error: ID is null.";
			return false;
		}
		if (id.isEmpty()) {
			invalidMessage = "Error: ID is empty.";
			return false;
		}

		if (!id.matches(regex)) {
			invalidMessage = "Error: The id invalid."
					+ "\n Note: ID only include letters, '_', positive integers"
					+ " and start with _ or letters.";
			return false;
		}
		return true;
	}
	
}