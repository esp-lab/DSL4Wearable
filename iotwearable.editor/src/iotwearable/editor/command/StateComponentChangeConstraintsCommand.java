package iotwearable.editor.command;


import iotwearable.model.iotw.StateComponent;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
/**
 * Command used to change constraints of State.
 */
public class StateComponentChangeConstraintsCommand extends Command{
	private Rectangle oldConstraints;
	private Rectangle newConstraints;
	private StateComponent component;
	
	@Override
	public void undo() {
		component.setConstraints(oldConstraints);
	}
	
	@Override
	public void execute() {
		component.setConstraints(newConstraints);
	}
	
	@Override
	public boolean canExecute() {
		return component != null && newConstraints != null;
	}
	
	public void setNewConstraints(Rectangle newConstraints) {
		this.newConstraints = newConstraints;
	}
	public void setComponent(StateComponent component) {
		this.component = component;
	}
}
