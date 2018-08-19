package iotwearable.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WifiValidator extends Validator{
	private String value;
	private Pattern pattern;
	private Matcher matcher;

	private static final String IPADDRESS_PATTERN = 
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	private static final String PORT ="^(\\d{4})"; 
	public WifiValidator(String value) {
		this.value = value;
		pattern = Pattern.compile(IPADDRESS_PATTERN);
	}
	@Override
	public boolean isValid() {
		if(!checkHost())
			return false;
		if(!checkPort())
			return false;
		return true;
	}
	
	public boolean checkHost()
	{
		if(value.isEmpty())
		{
			invalidMessage="Host can't be empty";
			return false;
		}
		matcher = pattern.matcher(value);
		if(!matcher.matches()){
			invalidMessage="Invalid host format";
			return false;
		}
		return true;
	}
	public boolean checkPort()
	{
		if(value.isEmpty())
		{
			invalidMessage="Port mustn't be empty";
			return false;
		}
		if(!value.matches(PORT))
		{
			invalidMessage ="Port must have 4 digits and is number more than 0";
			return false;
		}
		return true;
	}

}
