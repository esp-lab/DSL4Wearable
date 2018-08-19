package iotwearable.editor.factory;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.StateFrame;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new StateFrame
 */
public class StateFrameFactory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createStateFrame();
	}

	@Override
	public Object getObjectType() {
		return StateFrame.class;
	}
}
