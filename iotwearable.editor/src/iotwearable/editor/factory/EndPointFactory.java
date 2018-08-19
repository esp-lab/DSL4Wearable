package iotwearable.editor.factory;

import iotwearable.model.iotw.EndPoint;
import iotwearable.model.iotw.IotwFactory;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new EndPoint
 */
public class EndPointFactory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createEndPoint();
	}

	@Override
	public Object getObjectType() {
		return EndPoint.class;
	}
}
