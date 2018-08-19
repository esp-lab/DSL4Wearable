package iotwearable.editor.command;

import java.util.ArrayList;
import java.util.List;

import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;

import org.eclipse.gef.commands.Command;

/**
 * Command used to delete IOControl.
 */
public class DeviceDeleteCommand extends Command {
	private Device device;
	private Mainboard mainboard;
	private List<Pin> pinConnectOfMainboard;

	@Override
	public void undo() {
		for(Pin pin : pinConnectOfMainboard){
			Pin _pin = new Pin(pin.getName(), pin.getType());
			_pin.setIdConnect(pin.getIdConnect());
			mainboard.modifyPin(_pin);
		}
		mainboard.addDevice(device);
	}

	@Override
	public void execute() {
		pinConnectOfMainboard = new ArrayList<Pin>();
		for(Pin pin : device.getPinConnecteds()){
			for(Pin _pin : mainboard.getPinConnecteds()){
				if(pin.getIdConnect().equals(_pin.getIdConnect())){
					Pin newPin = new Pin(_pin.getName(), _pin.getType());
					newPin.setIdConnect(_pin.getIdConnect());
					pinConnectOfMainboard.add(newPin);
					break;
				}
			}
		}
		mainboard.removeDevice(device);
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
}
