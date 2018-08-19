package iotwearable.editor.command;

import iotwearable.model.iotw.Connection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

/**
 * Command used to create a new bendpoint in a connection. This class is
 * declared final since it has a very specific functionality.
 */
public class ConnectionCreateBendpointCommand extends Command {
	private int index;
	private Point location;
	private Connection connection;

	@Override
	public void execute() {
		connection.getBendpoints().add(index, location);
	}

	@Override
	public void undo() {
		connection.getBendpoints().remove(index);
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}