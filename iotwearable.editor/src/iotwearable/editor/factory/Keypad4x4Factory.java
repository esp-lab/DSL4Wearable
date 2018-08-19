package iotwearable.editor.factory;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Keypad4x4;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new Keypad4x4
 */
public class Keypad4x4Factory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createKeypad4x4();
	}

	@Override
	public Object getObjectType() {
		return Keypad4x4.class;
	}
}
