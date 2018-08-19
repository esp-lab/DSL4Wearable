package iotwearable.editor.factory;

import iotwearable.model.iotw.Decision;
import iotwearable.model.iotw.IotwFactory;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new Decision
 */
public class DecisionFactory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createDecision();
	}

	@Override
	public Object getObjectType() {
		return Decision.class;
	}
}
