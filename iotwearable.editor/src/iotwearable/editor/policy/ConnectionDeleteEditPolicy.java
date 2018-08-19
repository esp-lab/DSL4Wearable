package iotwearable.editor.policy;

import iotwearable.editor.command.ConnectionDeleteCommand;
import iotwearable.model.iotw.Connection;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class ConnectionDeleteEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		ConnectionDeleteCommand command = new ConnectionDeleteCommand();
		command.setConnection((Connection) getHost().getModel());
		return command;
	}
}
