package iotwearable.editor.policy;

import iotwearable.editor.command.ConnectionRenameCommand;
import iotwearable.model.iotw.Connection;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

public class ConnectionDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		Connection connection = (Connection)getHost().getModel();
		ConnectionRenameCommand command = new ConnectionRenameCommand();
		command.setConnection(connection);
		command.setNewLabel(value);
		return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		Connection connection = (Connection)getHost().getModel();
		connection.setLabel(value);
		}

}
