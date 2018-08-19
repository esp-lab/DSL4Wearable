package iotwearable.editor.command;

import iotwearable.model.iotw.Connection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
/**
 * Command used to deleted bendpoint in connection.
 */
public class ConnectionDeleteBendpointCommand extends Command{
	private Connection connection;
	private int index;
	private Point location;
	
	@Override
	public void undo() {
		connection.getBendpoints().add(index, location);
	}
	
	@Override
	public void execute() {
		location  = connection.getBendpoints().get(index);
		connection.getBendpoints().remove(index);
	}
	
	@Override
	public boolean canExecute() {
		return connection != null && (connection.getBendpoints().size() > index);
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
