package iotwearable.editor.command;

import iotwearable.model.iotw.Component;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.commands.Command;
/**
 * Command used to delete connection.
 */
public class ConnectionDeleteCommand extends Command{
	private Connection connection;
	private StateSchema schema;
	private Component source;
	private Component target;
	
	@Override
	public void undo() {
		((StateComponent)source).getOutgoings().add(connection);
		((StateComponent)target).getIncomings().add(connection);
		schema.getConnnections().add(connection);
	}
	
	@Override
	public void execute() {
		source = connection.getSource();
		target = connection.getTarget();
		schema = connection.getStateSchema();
		if(source != null){
			((StateComponent)source).getOutgoings().remove(connection);
		}
		if(target != null){
			((StateComponent)target).getIncomings().remove(connection);
		}
		schema.getConnnections().remove(connection);
	}
	
	@Override
	public boolean canExecute() {
		return connection != null;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
