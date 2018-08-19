package iotwearable.editor.factory;

import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.IotwFactory;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new I2CLCD2040
 */
public class I2CLCDFactory implements CreationFactory{
	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createI2CLCD();
	}

	@Override
	public Object getObjectType() {
		return I2CLCD.class;
	}
}
