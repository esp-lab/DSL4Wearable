package iotwearable.editor.command;

import iotwearable.model.iotw.Component;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;
import iotwearable.validation.StateComponentConnectionValidator;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

/**
 * Command used to create a new connection.
 */
public class ConnectionCreateCommand extends Command {
	private Component source;
	private Component target;
	private Connection connection;
	private StateSchema schema;
	private int alpha = 5;
	Point pointSourceAnchor = new Point();
	Point pointTargetAnchor = new Point();

	@Override
	public void undo() {
		((StateComponent) source).getOutgoings().remove(connection);
		connection.setSource(null);
		((StateComponent) target).getIncomings().remove(connection);
		connection.setTarget(null);
		connection.setStateSchema(null);
	}

	@Override
	public void execute() {
		connection.setSource(source);
		((StateComponent) source).getOutgoings().add(connection);
		connection.setTarget(target);
		((StateComponent) target).getIncomings().add(connection);
		connection.setStateSchema(schema);
		// Object connect to itself
		if (connection.getSource().equals(connection.getTarget())) {
			Rectangle r = ((StateComponent) source).getConstraints();
			Point p1 = new Point(r.x + r.width + 10, r.y + r.height / 3);
			Point p2 = new Point(r.x + r.width + 10, r.y + r.height / 2);
			connection.getBendpoints().add(p1);
			connection.getBendpoints().add(p2);
		} else {
			distributeLocation();
		}

	}

	private void distributeLocation() {
		Component _source = connection.getSource();
		if (_source == null)
			return;
		if (_source instanceof StateFrame) {
			StateFrame stateFrame = (StateFrame) _source;
			boolean flag = true;
			while (flag) {
				flag = false;
				for (Connection _conn : stateFrame.getOutgoings()) {
					if (_conn.getTarget() == connection.getTarget() && _conn != connection) {
						if (_conn.getBendpoints().size() == 0
								&& connection.getBendpoints().size() == 0) {
							flag = true;
							Point newPoint = new Point(
									(pointSourceAnchor.x + pointTargetAnchor.x)
											/ 2 + alpha,
									(pointSourceAnchor.y + pointTargetAnchor.y)
											/ 2 + alpha);
							connection.getBendpoints().add(newPoint);
						} else {
							for (Point _p : _conn.getBendpoints()) {
								for (Point p : connection.getBendpoints()) {
									if (_p.equals(p.x, p.y)) {
										flag = true;
										connection.getBendpoints().get(connection.getBendpoints().indexOf(p))
										.setLocation(_p.x + alpha, _p.y + alpha);
									}
								}
							}
						}
					}
				}

				for (Connection _conn : stateFrame.getIncomings()) {
					if (_conn.getSource() == connection.getTarget()) {
						if (_conn.getBendpoints().size() == 0
								&& connection.getBendpoints().size() == 0) {
							flag = true;
							Point newPoint = new Point(
									(pointSourceAnchor.x + pointTargetAnchor.x)
											/ 2 + alpha,
									(pointSourceAnchor.y + pointTargetAnchor.y)
											/ 2 + alpha);
							connection.getBendpoints().add(newPoint);
						} else {
							for (Point _p : _conn.getBendpoints()) {
								for (Point p : connection.getBendpoints()) {
									if (_p.equals(p.x, p.y)) {
										flag = true;
										connection.getBendpoints().get(connection.getBendpoints().indexOf(p))
										.setLocation(_p.x + alpha, _p.y + alpha);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public boolean canExecute() {
		StateComponentConnectionValidator validator = new StateComponentConnectionValidator(
				source, target);
		return source != null && target != null && connection != null
				&& schema != null && validator.isValid();
	}

	public void setSource(Component source) {
		this.source = source;
	}

	public void setTarget(Component target) {
		this.target = target;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setStateSchema(StateSchema stateSchema) {
		this.schema = stateSchema;
	}

	public void setPointSourceAnchor(Point p) {
		this.pointSourceAnchor = p;
	}

	public void setPointTargetAnchor(Point p) {
		this.pointTargetAnchor = p;
	}
}
