package iotwearable.editor.command;

import iotwearable.model.iotw.Connection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

/**
 * Move a connection bendpoint. This class is declared final since it has a
 * very specific functionality.
 */
public class MoveBendpointCommand extends Command {
	private Point oldLocation;
	private Point newLocation;
	private int index;
	private Connection connection;

	public void execute() {
		if (oldLocation == null) {
			oldLocation = connection.getBendpoints().get(index);
		}
		connection.getBendpoints().set(index, newLocation);
	}

	@Override
	public void undo() {
		connection.getBendpoints().set(index, oldLocation);
	}

	public void setNewLocation(Point newLocation) {
		this.newLocation = newLocation;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
