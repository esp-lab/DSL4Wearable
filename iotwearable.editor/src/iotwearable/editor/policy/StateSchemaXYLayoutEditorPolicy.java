package iotwearable.editor.policy;

import iotwearable.editor.command.StateComponentChangeConstraintsCommand;
import iotwearable.editor.command.StateComponentCreateCommand;
import iotwearable.model.iotw.EndPoint;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

public class StateSchemaXYLayoutEditorPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command createChangeConstraintCommand(
			ChangeBoundsRequest request, EditPart child, Object constraint) {
		StateComponentChangeConstraintsCommand command = new StateComponentChangeConstraintsCommand();
		command.setNewConstraints((Rectangle) constraint);
		command.setComponent((StateComponent) child.getModel());
		return command;
	}

	private static final Dimension DEFAULT_DIMENSION_FRAME = new Dimension(200,100);
	private static final Dimension DEFAULT_DIMENSION_CIRCLE = new Dimension(30,30);

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command command = null;
		Dimension _constraints = new Dimension();
		boolean flag = false;

		if (request.getNewObjectType().equals(StateFrame.class)) {
			_constraints = DEFAULT_DIMENSION_FRAME;
			flag = true;
		} else if (request.getNewObjectType().equals(EndPoint.class)) {
			_constraints = DEFAULT_DIMENSION_CIRCLE;
			flag = true;
		}
		else if(request.getNewObjectType().equals(StartPoint.class)){
			_constraints = DEFAULT_DIMENSION_CIRCLE;
			flag = true;
		}
		if (flag) {
			flag = false;
			StateComponentCreateCommand createCommand = new StateComponentCreateCommand();
			Point clickLocation = request.getLocation();
			((GraphicalEditPart) getHost()).getFigure().translateFromParent(
					clickLocation);
			createCommand.setComponent((StateComponent) (request.getNewObject()));
			createCommand.setConstraints(new Rectangle(clickLocation,
					_constraints));
			try{
			createCommand.setSchema((StateSchema)getHost().getModel());
			}catch(ClassCastException c){
				
			}
			command = createCommand;
		}
		return command;
	}
}
