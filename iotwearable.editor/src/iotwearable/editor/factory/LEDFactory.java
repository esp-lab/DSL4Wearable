package iotwearable.editor.factory;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.LED;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new LED
 */
public class LEDFactory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createLED();
	}

	@Override
	public Object getObjectType() {
		return LED.class;
	}
}
