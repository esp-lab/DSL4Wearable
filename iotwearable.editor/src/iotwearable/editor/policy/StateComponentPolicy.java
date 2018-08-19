package iotwearable.editor.policy;

import iotwearable.editor.command.StateComponentDeleteCommand;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class StateComponentPolicy extends ComponentEditPolicy{
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		StateComponentDeleteCommand command = new StateComponentDeleteCommand();
		command.setComponent((StateComponent)getHost().getModel());
		command.setStateSchema((StateSchema)getHost().getParent().getModel());
		return command;
	}
}
