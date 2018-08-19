package iotwearable.editor.factory;

import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.IotwFactory;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new Buzzer
 */
public class BuzzerFactory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createBuzzer();
	}

	@Override
	public Object getObjectType() {
		return Buzzer.class;
	}
}
