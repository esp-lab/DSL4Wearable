package iotwearable.editor.keyhandler;

import iotwearable.editor.command.StateComponentChangeConstraintsCommand;
import iotwearable.model.iotw.StateComponent;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;

public class StateComponentMove extends MoveKeyHandler{

	@Override
	public void keyPressed(KeyEvent e, EditPart editPart, CommandStack commandStack) {
		if(e == null && editPart == null)
			return;
		switch (e.keyCode) {
		case SWT.ARROW_RIGHT:
			if(editPart.getModel() instanceof StateComponent){
				StateComponent component = (StateComponent)editPart.getModel();
				Rectangle rectangle =  new Rectangle(component.getConstraints().x + 1,
						component.getConstraints().y, component.getConstraints().width,
						component.getConstraints().height);
				StateComponentChangeConstraintsCommand command = new StateComponentChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setComponent(component);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_LEFT:
			if(editPart.getModel() instanceof StateComponent){
				StateComponent component = (StateComponent)editPart.getModel();
				Rectangle rectangle =  new Rectangle(component.getConstraints().x - 1,
						component.getConstraints().y, component.getConstraints().width,
						component.getConstraints().height);
				StateComponentChangeConstraintsCommand command = new StateComponentChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setComponent(component);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_UP:
			if(editPart.getModel() instanceof StateComponent){
				StateComponent component = (StateComponent)editPart.getModel();
				Rectangle rectangle =  new Rectangle(component.getConstraints().x,
						component.getConstraints().y-1, component.getConstraints().width,
						component.getConstraints().height);
				StateComponentChangeConstraintsCommand command = new StateComponentChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setComponent(component);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_DOWN:
			if(editPart.getModel() instanceof StateComponent){
				StateComponent component = (StateComponent)editPart.getModel();
				Rectangle rectangle =  new Rectangle(component.getConstraints().x,
						component.getConstraints().y+1, component.getConstraints().width,
						component.getConstraints().height);
				StateComponentChangeConstraintsCommand command = new StateComponentChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setComponent(component);
				commandStack.execute(command);
			}
			break;
		default:
			break;
		}
	}
}
