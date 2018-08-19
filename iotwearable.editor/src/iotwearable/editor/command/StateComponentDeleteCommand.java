package iotwearable.editor.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.commands.Command;
/**
 * Command used to delete StateComponent
 */
public class StateComponentDeleteCommand extends Command{
	private StateComponent component;
	private StateSchema stateSchema;
	private List<Connection> conns;
	private Map<Connection, StateComponent> connSources;
	private Map<Connection, StateComponent> connTargets;
	
	@Override
	public void undo() {
		stateSchema.getComponents().add(component);
		reconnect();
	}
	
	@Override
	public void execute() {
		removeConnections();
		stateSchema.getComponents().remove(component);
	}
	
	  private void removeConnections() {
	    conns = new ArrayList<Connection>();
	    connSources = new HashMap<Connection, StateComponent>();
	    connTargets = new HashMap<Connection, StateComponent>();
	    conns.addAll(component.getIncomings());
	    conns.addAll(component.getOutgoings());
	    for (Connection conn : conns) {
	      connSources.put(conn, (StateComponent)conn.getSource());
	      connTargets.put(conn, (StateComponent)conn.getTarget());
	      StateComponent source = (StateComponent)conn.getSource();
	      StateComponent target = (StateComponent)conn.getTarget();
	      if(source != null){
	    	  source.getOutgoings().remove(conn);
			}
			if(target != null){
				target.getIncomings().remove(conn);
			}
	      stateSchema.getConnnections().remove(conn);
	    }
	  }

	  private void reconnect() {
	    for (Connection conn : conns) {
	    	connSources.get(conn).getOutgoings().add(conn);
	    	connTargets.get(conn).getIncomings().add(conn);
	    	stateSchema.getConnnections().add(conn);
	    }
	  }
	
	@Override
	public boolean canExecute() {
		return stateSchema != null && component != null;
	}
	
	public void setComponent(StateComponent component) {
		this.component = component;
	}
	public void setStateSchema(StateSchema stateSchema) {
		this.stateSchema = stateSchema;
	}
}