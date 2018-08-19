package iotwearable.editor.part;

import java.util.ArrayList;
import java.util.List;

import iotwearable.editor.policy.MainboardXYLayoutEditorPolicy;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.Mainboard;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class MainboardEditPart extends AbstractGraphicalEditPart{
	
	private MainboardAdapter adapter;

	public MainboardEditPart() {
		super();
		adapter = new MainboardAdapter();
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new MainboardXYLayoutEditorPolicy());
	}

	@Override
	protected List<Device> getModelChildren() {
		Mainboard ioWearable = (Mainboard) getModel();
		List<Device> devices = new ArrayList<Device>();
		for(Device device: ioWearable.getDevices())
		{
			devices.add(device);
		}
		return devices;
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((Mainboard) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((Mainboard) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	// adapter
	public class MainboardAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshChildren();
		}

		@Override
		public Notifier getTarget() {
			return (Mainboard) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Mainboard.class);
		}
	}
}