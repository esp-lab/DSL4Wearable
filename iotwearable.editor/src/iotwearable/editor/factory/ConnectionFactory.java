package iotwearable.editor.factory;

import iotwearable.model.iotw.Connection;
import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new Connection
 */
public abstract class ConnectionFactory implements CreationFactory{
	@Override
	public Object getObjectType() {
		return Connection.class;
	}
}
