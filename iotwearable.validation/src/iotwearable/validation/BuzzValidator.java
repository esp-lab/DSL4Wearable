package iotwearable.validation;

public class BuzzValidator extends Validator {

	private int value;
	public BuzzValidator(String value) {
		this.value = Integer.parseInt(value);

	}
	@Override
	public boolean isValid() {
		
		return true;
	}
	public boolean checkTime()
	{
		if(value<= 0)
		{
			invalidMessage="Time must be greater than 0";
			return false;
		}
		return true;
	}
	public boolean checkTone()
	{
		if(value< 0  || value > 230)
		{
			invalidMessage="Tone is between 0 and 230";
			return false;
		}
		return true;
	}
}
