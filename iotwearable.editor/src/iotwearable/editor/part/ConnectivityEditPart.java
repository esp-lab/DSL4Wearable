package iotwearable.editor.part;

import iotwearable.editor.figure.ConnectivityFigure;
import iotwearable.editor.policy.DevicePolicy;
import iotwearable.editor.policy.MainboardXYLayoutEditorPolicy;
import iotwearable.model.iotw.Connectivity;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;

public abstract class ConnectivityEditPart extends ComponentEditPart{
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new MainboardXYLayoutEditorPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new DevicePolicy());
	}
	@Override
	protected void refreshVisuals() {
		ConnectivityFigure figure = (ConnectivityFigure) getFigure();
		Connectivity model = (Connectivity) getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}
}