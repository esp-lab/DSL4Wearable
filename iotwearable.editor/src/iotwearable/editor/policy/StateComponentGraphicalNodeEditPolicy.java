package iotwearable.editor.policy;

import iotwearable.editor.command.ConnectionCreateCommand;
import iotwearable.model.iotw.Component;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

public class StateComponentGraphicalNodeEditPolicy extends
		GraphicalNodeEditPolicy {

	//Connect second Component
	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		ConnectionCreateCommand command = (ConnectionCreateCommand) request
				.getStartCommand();
		command.setTarget((Component) getHost().getModel());
		return command;
	}

	//Connect first Component
	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		ConnectionCreateCommand command = new ConnectionCreateCommand();
		command.setSource((Component) getHost().getModel());
		command.setConnection((Connection) request.getNewObject());
		command.setStateSchema((StateSchema)getHost().getParent().getModel());
		request.setStartCommand(command);
		return command;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
