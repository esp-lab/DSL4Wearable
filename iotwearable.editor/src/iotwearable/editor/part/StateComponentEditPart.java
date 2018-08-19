package iotwearable.editor.part;

import java.util.List;

import iotwearable.editor.figure.StateComponentFigure;
import iotwearable.editor.policy.StateComponentGraphicalNodeEditPolicy;
import iotwearable.editor.policy.StateComponentPolicy;
import iotwearable.editor.policy.StateSchemaXYLayoutEditorPolicy;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StateComponent;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;

public abstract class StateComponentEditPart extends ComponentEditPart implements NodeEditPart{
	 
	public StateComponentEditPart() {
		super();
	}
	
	@Override
	    protected List<Connection> getModelSourceConnections() {
		 StateComponent model = (StateComponent)getModel();
	    	return model.getOutgoings();
	    }

	    @Override
	    protected List<Connection> getModelTargetConnections() {
	    	StateComponent model = (StateComponent)getModel();
	    	return model.getIncomings();
	    }
	    /**
	     * Install edit policies that can be applied to {@link OPMNodeEditPart} instances.
	     */
	    @Override
		protected void createEditPolicies() {
			installEditPolicy(EditPolicy.COMPONENT_ROLE, new StateComponentPolicy());
	        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new StateComponentGraphicalNodeEditPolicy());
	        installEditPolicy(EditPolicy.LAYOUT_ROLE, new StateSchemaXYLayoutEditorPolicy());
		}
	    
	    @Override
		protected void refreshVisuals() {
			StateComponentFigure figure = (StateComponentFigure) getFigure();
			StateComponent model = (StateComponent) getModel();
			GraphicalEditPart parent = (GraphicalEditPart) getParent();
			parent.setLayoutConstraint(this, figure, model.getConstraints());
		}
	    
	    @Override
	    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
	    	return ((StateComponentFigure)getFigure()).getSourceConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
	    	return ((StateComponentFigure)getFigure()).getTargetConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	    	return ((StateComponentFigure)getFigure()).getSourceConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	    	return ((StateComponentFigure)getFigure()).getTargetConnectionAnchor();
	    }
}
