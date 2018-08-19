package iotwearable.validation;

import java.util.ArrayList;

import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.Mainboard;

public class KeypadValidator extends Validator {
	private String name;
	private static final String regex = "^(\\d*)";
	private Mainboard mainboard;
	public KeypadValidator(String name, Mainboard mainboard) {
		this.name = name;
		this.mainboard = mainboard;
	}
	@Override
	public boolean isValid() {
		if(name.isEmpty())
		{
			return true;
		}
		else if(name.matches(regex))
		{
			invalidMessage="Name button must be a string";
			return false;
		}
		else if(!checkDuplicate())
		{
			return false;
		}
		else if(!checkSpace())
		{
			invalidMessage="Name button can't contains space character";
			return false;
		}
		return true;
	}
	public boolean checkDuplicate()
	{
		ArrayList<String> list = new ArrayList<String>();
		for(Device device: mainboard.getDevices())
		{
			if(device instanceof Keypad4x4)
			{
				Keypad4x4 keypad4x4 = (Keypad4x4)device;
				if(!keypad4x4.getNameButton0().isEmpty())
					list.add(keypad4x4.getNameButton0());
				if(!keypad4x4.getNameButton1().isEmpty())
					list.add(keypad4x4.getNameButton1());
				if(!keypad4x4.getNameButton2().isEmpty())
					list.add(keypad4x4.getNameButton2());
				if(!keypad4x4.getNameButton3().isEmpty())
					list.add(keypad4x4.getNameButton3());
				if(!keypad4x4.getNameButton4().isEmpty())
					list.add(keypad4x4.getNameButton4());
				if(!keypad4x4.getNameButton5().isEmpty())
					list.add(keypad4x4.getNameButton5());
				if(!keypad4x4.getNameButton6().isEmpty())
					list.add(keypad4x4.getNameButton6());
				if(!keypad4x4.getNameButton7().isEmpty())
					list.add(keypad4x4.getNameButton7());
				if(!keypad4x4.getNameButton8().isEmpty())
					list.add(keypad4x4.getNameButton8());
				if(!keypad4x4.getNameButton9().isEmpty())
					list.add(keypad4x4.getNameButton9());
				if(!keypad4x4.getNameButtonA().isEmpty())
					list.add(keypad4x4.getNameButtonA());
				if(!keypad4x4.getNameButtonAsterisk().isEmpty())
					list.add(keypad4x4.getNameButtonAsterisk());
				if(!keypad4x4.getNameButtonB().isEmpty())
					list.add(keypad4x4.getNameButtonB());
				if(!keypad4x4.getNameButtonC().isEmpty())
					list.add(keypad4x4.getNameButtonC());
				if(!keypad4x4.getNameButtonD().isEmpty())
					list.add(keypad4x4.getNameButtonD());
				if(!keypad4x4.getNameButtonHash().isEmpty())
					list.add(keypad4x4.getNameButtonHash());
				break;
			}
		}
		if(list.contains(name))
		{
			invalidMessage=name + " has been used";
			return false;
		}
		return true;
	}
	private boolean checkSpace()
	{
		if(name.contains(" "))
			return false;
		return true;
	}
}
