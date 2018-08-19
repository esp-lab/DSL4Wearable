package iotwearable.editor.keyhandler;

import iotwearable.editor.command.DeviceChangeConstraintsCommand;
import iotwearable.model.iotw.Device;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;

public class DevicelMove extends MoveKeyHandler{

	@Override
	public void keyPressed(KeyEvent e, EditPart editPart,
			CommandStack commandStack) {
		if(e == null && editPart == null)
			return;
		switch (e.keyCode) {
		case SWT.ARROW_RIGHT:
			if(editPart.getModel() instanceof Device){
				Device device = (Device)editPart.getModel();
				Rectangle rectangle =  new Rectangle(device.getConstraints().x + 1,
						device.getConstraints().y, device.getConstraints().width,
						device.getConstraints().height);
				DeviceChangeConstraintsCommand command = new DeviceChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setDevice(device);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_LEFT:
			if(editPart.getModel() instanceof Device){
				Device device = (Device)editPart.getModel();
				Rectangle rectangle =  new Rectangle(device.getConstraints().x - 1,
						device.getConstraints().y, device.getConstraints().width,
						device.getConstraints().height);
				DeviceChangeConstraintsCommand command = new DeviceChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setDevice(device);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_UP:
			if(editPart.getModel() instanceof Device){
				Device device = (Device)editPart.getModel();
				Rectangle rectangle =  new Rectangle(device.getConstraints().x,
						device.getConstraints().y-1, device.getConstraints().width,
						device.getConstraints().height);
				DeviceChangeConstraintsCommand command = new DeviceChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setDevice(device);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_DOWN:
			if(editPart.getModel() instanceof Device){
				Device device = (Device)editPart.getModel();
				Rectangle rectangle =  new Rectangle(device.getConstraints().x,
						device.getConstraints().y+1, device.getConstraints().width,
						device.getConstraints().height);
				DeviceChangeConstraintsCommand command = new DeviceChangeConstraintsCommand();
				command.setNewConstraints(rectangle);
				command.setDevice(device);
				commandStack.execute(command);
			}
			break;
		default:
			break;
		}
	}
}
