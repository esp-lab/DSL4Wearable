package iotwearable.editor.policy;

import iotwearable.editor.command.DeviceDeleteCommand;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.Mainboard;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class DevicePolicy extends ComponentEditPolicy{
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		DeviceDeleteCommand command = new DeviceDeleteCommand();
		command.setDevice((Device) getHost().getModel());
		command.setMainboard((Mainboard)getHost().getParent().getModel());
		return command;
	}
}
