package iotwearable.editor.part;

import iotwearable.model.iotw.Component;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public abstract class ComponentEditPart extends AbstractGraphicalEditPart{

	protected IoTWComponentAdapter adapter;

	public ComponentEditPart() {
		super();
		adapter = new IoTWComponentAdapter();
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((Component) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((Component) getModel()).eAdapters().remove(adapter);
		}

		super.deactivate();
	}

	// adapter
	public class IoTWComponentAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refresh();
		}

		@Override
		public Notifier getTarget() {
			return (Component) getModel();
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Component.class);
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub
		}
	}
}