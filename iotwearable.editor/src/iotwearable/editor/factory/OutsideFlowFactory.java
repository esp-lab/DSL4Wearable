package iotwearable.editor.factory;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.ConnectionKind;
import iotwearable.model.iotw.IotwFactory;

public class OutsideFlowFactory extends ConnectionFactory{
	@Override
	public Object getNewObject() {
		Connection connection = IotwFactory.eINSTANCE.createConnection();
		connection.setKind(ConnectionKind.OUTSIDE_FLOW);
		return connection;
	}
}
