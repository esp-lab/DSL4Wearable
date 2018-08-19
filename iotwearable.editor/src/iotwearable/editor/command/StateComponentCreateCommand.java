package iotwearable.editor.command;

import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
/**
 * Command used to create new Component
 */
public class StateComponentCreateCommand extends Command{
	private StateComponent component;
	private StateSchema schema;
	private Rectangle constraints;
	
	@Override
	public boolean canExecute() {
		return component != null && schema != null && constraints != null;
	}
	@Override
	public void execute() {
		component.setConstraints(constraints);
		schema.getComponents().add(component);
	}
	@Override
	public void undo() {
		schema.getComponents().remove(component);
	}
	public void setComponent(StateComponent component) {
		this.component = component;
	}
	public void setSchema(StateSchema schema) {
		this.schema = schema;
	}
	public void setConstraints(Rectangle constraints) {
		this.constraints = constraints;
	}
}
