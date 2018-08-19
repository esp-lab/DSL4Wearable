package iotwearable.editor.policy;

import iotwearable.editor.command.DeviceChangeConstraintsCommand;
import iotwearable.editor.command.DeviceCreateCommand;
import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.WifiESP8266;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

public class MainboardXYLayoutEditorPolicy extends XYLayoutEditPolicy{

	private static Dimension DEFAULT_DIMENSION;

	@Override
	protected Command createChangeConstraintCommand(
			ChangeBoundsRequest request, EditPart child, Object constraint) {
		DeviceChangeConstraintsCommand command = null;
		if(child.getModel() instanceof Device)
		{
			command = new DeviceChangeConstraintsCommand();
			command.setDevice((Device) child.getModel());
			command.setNewConstraints((Rectangle) constraint);
		}
		return command;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command command = null;
		boolean isAllowed = false;
		if (request.getNewObjectType().equals(Keypad4x4.class)){
			DEFAULT_DIMENSION = new Dimension(100, 100);
			isAllowed = true;
		}
		else if(request.getNewObjectType().equals(Buzzer.class)){
			DEFAULT_DIMENSION = new Dimension(80, 80);
			isAllowed = true;
		}
		else if(request.getNewObjectType().equals(LED.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isAllowed = true;
		}
		else if(request.getNewObjectType().equals(I2CLCD.class)){
			DEFAULT_DIMENSION = new Dimension(197, 98);
			isAllowed = true;
		}
		else if(request.getNewObjectType().equals(Button.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isAllowed = true;
		}
		else if(request.getNewObjectType().equals(BluetoothHC06.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isAllowed = true;
		}
		else if(request.getNewObjectType().equals(WifiESP8266.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isAllowed = true;
		}
		 if(isAllowed){
			DeviceCreateCommand createCommand = new DeviceCreateCommand();
			Point clickLocation = request.getLocation();
			((GraphicalEditPart) getHost()).getFigure().translateFromParent(clickLocation);
			createCommand.setDevice((Device) (request.getNewObject()));
			createCommand.setConstraints(new Rectangle(clickLocation, DEFAULT_DIMENSION));
			try {
				createCommand.setMainboard((Mainboard) getHost().getModel());
			} catch (ClassCastException c) {
			}
			command = createCommand;
		}
		return command;
	}
}
