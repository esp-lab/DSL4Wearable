package iotwearable.editor.part;

import iotwearable.editor.figure.IODeviceFigure;
import iotwearable.editor.policy.DevicePolicy;
import iotwearable.editor.policy.MainboardXYLayoutEditorPolicy;
import iotwearable.model.iotw.IODevice;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;

public abstract class IODeviceEditPart extends ComponentEditPart{
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new MainboardXYLayoutEditorPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new DevicePolicy());
	}

	@Override
	protected void refreshVisuals() {
		IODeviceFigure figure = (IODeviceFigure) getFigure();
		IODevice model = (IODevice) getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}
}