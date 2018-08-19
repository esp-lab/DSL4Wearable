package iotwearable.editor.factory;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.StartPoint;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new StartPoint
 */
public class StartPointFactory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createStartPoint();
	}

	@Override
	public Object getObjectType() {
		return StartPoint.class;
	}

}
