package iotwearable.editor.policy;

import iotwearable.editor.command.ConnectionCreateBendpointCommand;
import iotwearable.editor.command.ConnectionDeleteBendpointCommand;
import iotwearable.editor.command.MoveBendpointCommand;
import iotwearable.model.iotw.Connection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

/**
* Policy used by the FlowControl to manage link bendpoints. 
*/
public class ConnectionBendpointEditPolicy extends BendpointEditPolicy{

	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
	ConnectionCreateBendpointCommand command = new ConnectionCreateBendpointCommand();
		Point p = request.getLocation();
		command.setConnection((Connection) request.getSource().getModel());
		command.setLocation(p);
		command.setIndex(request.getIndex());
		return command;
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		ConnectionDeleteBendpointCommand command  = new ConnectionDeleteBendpointCommand();
		command.setConnection((Connection)request.getSource().getModel());
		command.setIndex(request.getIndex());
		return command;
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		MoveBendpointCommand command = new MoveBendpointCommand();
		Point p = request.getLocation();
		command.setConnection((Connection) request.getSource().getModel());
		command.setNewLocation(p);
		command.setIndex(request.getIndex());
		return command;
	}
}
