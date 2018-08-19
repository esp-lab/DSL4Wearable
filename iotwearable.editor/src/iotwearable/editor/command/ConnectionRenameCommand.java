package iotwearable.editor.command;

import iotwearable.model.iotw.Connection;

import org.eclipse.gef.commands.Command;

public class ConnectionRenameCommand extends Command{
	private String oldLabel;
	private String newLabel;
	private Connection connection;
	
	@Override
	public boolean canExecute() {
		return connection != null && newLabel != null;
	}
	
	@Override
	public void undo() {
		connection.setLabel(oldLabel);
	}
	
	@Override
	public void execute() {
		this.oldLabel = connection.getLabel();
		this.connection.setLabel(newLabel);
	}

	public void setNewLabel(String newLabel) {
		this.newLabel = newLabel;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
