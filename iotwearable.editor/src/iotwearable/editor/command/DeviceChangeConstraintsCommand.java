package iotwearable.editor.command;

import iotwearable.model.iotw.Device;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
/**
 * Command used to change constraints of Device.
 */
public class DeviceChangeConstraintsCommand extends Command{
	private Rectangle oldConstraints;
	private Rectangle newConstraints;
	private Device device;
	
	@Override
	public void undo() {
		device.setConstraints(oldConstraints);
	}
	
	@Override
	public void execute() {
		device.setConstraints(newConstraints);
	}
	
	@Override
	public boolean canExecute() {
		return device != null && newConstraints != null
				&& newConstraints.height == oldConstraints.height
				&& newConstraints.width == oldConstraints.width;
	}
	
	public void setNewConstraints(Rectangle newConstraints) {
		this.newConstraints = newConstraints;
	}
	
	public void setDevice(Device device) {
		this.device = device;
		this.oldConstraints = device.getConstraints();
	}
}
