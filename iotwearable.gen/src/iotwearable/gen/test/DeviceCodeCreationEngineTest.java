package iotwearable.gen.test;

import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.Pin.TypePin;
import iotwearable.model.iotw.StateSchema;

public abstract class DeviceCodeCreationEngineTest{
	Mainboard mainboard;
	StateSchema schema;
	public DeviceCodeCreationEngineTest() 
	{
		mainboard = IotwFactory.eINSTANCE.createArduinoUNOR3();
		schema = IotwFactory.eINSTANCE.createStateSchema();
	}
	
	void addDevice(Device device){
		if(device != null){
			for(Pin pin : device.getPinConnecteds()){
				Pin _pin = new Pin(pin.getIdConnect().split("<->")[0]
						, TypePin.IO);
				_pin.setIdConnect(pin.getIdConnect());
				mainboard.modifyPin(_pin);
				mainboard.addDevice(device);
			}
		}
	}
	Device getDevice(Class<?> object){
		for(Device device : mainboard.getDevices()){
			if(object.isInstance(device)){
				return device;
			}
		}
		return null;
	}
}