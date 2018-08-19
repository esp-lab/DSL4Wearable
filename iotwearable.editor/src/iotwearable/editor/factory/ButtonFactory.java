package iotwearable.editor.factory;

import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.IotwFactory;

import org.eclipse.gef.requests.CreationFactory;

public class ButtonFactory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createButton();
	}

	@Override
	public Object getObjectType() {
		return Button.class;
	}
}
