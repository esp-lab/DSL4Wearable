package iotwearable.gen.cce.device;

import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.Component;
import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.WifiESP8266;

public class CodeCreationEngineFactory{
	public static DeviceCodeCreationEngine create(Component component){
		DeviceCodeCreationEngine codeCreationEngine = null;
		//area output
		if(component instanceof LED){
			codeCreationEngine =  new LEDSingleCodeCreationEngine((LED)component);
		}
		else if(component instanceof I2CLCD){
			codeCreationEngine = new I2CLCDCodeCreationEngineImpl((I2CLCD)component);
		}
		else if(component instanceof Buzzer){
			codeCreationEngine = new BuzzerCodeCreationEngine((Buzzer)component);
		}
		//area input
		else if(component instanceof Keypad4x4){
			codeCreationEngine = new Keypad4x4CodeCreationEngine((Keypad4x4)component);
		}
		else if(component instanceof Button)
		{
			codeCreationEngine = new PushButtonCodeCreationEngine((Button) component);
		}
		// area connectivity
		else if(component instanceof BluetoothHC06)
		{
			codeCreationEngine = new BluetoothHC06CodeCreationEngine((BluetoothHC06) component);
		}
		else if( component instanceof WifiESP8266)
		{
			codeCreationEngine = new  WifiESP8266V1CodeCreationEngine((WifiESP8266) component);
		}
		//area microControl
		else if(component instanceof ArduinoUNOR3)
		{
			codeCreationEngine = new  ArduinoCodeCreationEngine();
		}
		return codeCreationEngine;
	}
}
