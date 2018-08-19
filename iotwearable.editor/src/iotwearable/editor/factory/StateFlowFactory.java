package iotwearable.editor.factory;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.ConnectionKind;
import iotwearable.model.iotw.IotwFactory;

/**
 * Used to create new StateFlow
 */
public class StateFlowFactory extends ConnectionFactory{

	@Override
	public Object getNewObject() {
		Connection connection = IotwFactory.eINSTANCE.createConnection();
		connection.setKind(ConnectionKind.STATE_FLOW);
		return connection;
	}
}
