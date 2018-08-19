package iotwearable.editor.part;

import java.util.ArrayList;
import java.util.List;

import iotwearable.editor.figure.FigureConstants;
import iotwearable.editor.figure.MultiLineTextCellEditor;
import iotwearable.editor.figure.SmartLabelFigure;
import iotwearable.editor.policy.ConnectionBendpointEditPolicy;
import iotwearable.editor.policy.ConnectionDeleteEditPolicy;
import iotwearable.editor.policy.ConnectionDirectEditPolicy;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.ConnectionKind;
import iotwearable.model.iotw.RouterKind;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

public class ConnectionEditPart extends AbstractConnectionEditPart {
	private ConnectionAdapter adapter;
	protected SmartLabelFigure label;
	private PolylineConnection conn;
	public ConnectionEditPart() {
		super();
		conn  = new PolylineConnection();
		adapter = new ConnectionAdapter();
	}
	
	public SmartLabelFigure getLabel() {
		return label;
	}

	public void setLabel(SmartLabelFigure label) {
		this.label = label;
	}

	public PolylineConnection getConn() {
		return conn;
	}

	public void setConn(PolylineConnection conn) {
		this.conn = conn;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new ConnectionDirectEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new ConnectionDeleteEditPolicy());
		if(((Connection)getModel()).getRouterKind() == RouterKind.BENDPOINT) {
			installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ConnectionBendpointEditPolicy());
		}
	}
	@Override
	public PolylineConnection createFigure() {
		MidpointLocator labelLocator = new MidpointLocator(conn, 0);
		Connection connection = (Connection) getModel();
		label = new SmartLabelFigure(FigureConstants.TEXT_WIDTH_TO_HEIGHT_RATIO);

		label.setOpaque(true);
		conn.add(label, labelLocator);
		switch (connection.getRouterKind()) {
		case BENDPOINT:
			conn.setConnectionRouter(new BendpointConnectionRouter());
			break;
		case MANHATTAN:
			conn.setConnectionRouter(new ManhattanConnectionRouter());
			break;
		}
		decorateConnection(conn, connection.getKind());
		return conn;
	}
	
	@Override
	protected void refreshVisuals() {
		Connection flowControl = (Connection) getModel();
		label.setText(flowControl.getLabel());
		switch (flowControl.getRouterKind()) {
		case BENDPOINT:
			org.eclipse.draw2d.Connection connectionFigure = getConnectionFigure();
			List<Point> modelConstraint = ((Connection) getModel())
					.getBendpoints();
			List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
			for (Point p : modelConstraint) {
				figureConstraint.add(new AbsoluteBendpoint(p));
			}
			connectionFigure.setRoutingConstraint(figureConstraint);
			label.setText(flowControl.getLabel());
			break;
		case MANHATTAN:
			break;
		}
	}
	@Override
	public void performRequest(Request req) {
		if (req.getType().equals(RequestConstants.REQ_DIRECT_EDIT)) {
			if (req instanceof DirectEditRequest) {
				if(isAreaLabel(label.getLocation())){
					StateComponentDirectEditManager manager = new StateComponentDirectEditManager(this,
							MultiLineTextCellEditor.class, new TextCellEditorLocator(label, conn), label);
					manager.show();
				}

			}
		}
	}

	public boolean isAreaLabel(Point location){
		Point beginPoint = this.label.getBounds().getLocation();
		int maxX = beginPoint.x + this.label.getSize().width;
		int maxY = beginPoint.y + this.label.getSize().height;
		return location.x <= maxX && location.y <= maxY
				&& location.x >= beginPoint.x 
				&& location.y >= beginPoint.y;
	}
	/**
	 * Decorate a connection depending on its kind.
	 * 
	 * @param connection
	 *            the PolylineConnection to decorate.
	 * @param kind
	 *            the ConnecitonKind of the model entity.
	 */
	private void decorateConnection(PolylineConnection connection,
			ConnectionKind kind) {
		switch (kind) {
		case STATE_FLOW:
			connection.setTargetDecoration(new PolylineDecoration());
			break;
		case OUTSIDE_FLOW:
			connection.setLineDash(new float[] {4});
			connection.setTargetDecoration(new PolylineDecoration());
			break;
		default:
			throw new IllegalArgumentException("No case for kind " + kind);
		}
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((Connection) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((Connection) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	/**
	 * Observer for changes in an Connection. Refreshes the ConnectionEditPart}
	 * visuals on every change to the model.
	 * 
	 * @reference vainolo
	 */
	public class ConnectionAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			getLabel();
			refreshVisuals();
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Notifier getTarget() {
			return (Connection) getModel();
		}

		/**
		 * Does nothing.
		 */
		@Override
		public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Connection.class);
		}
	}
	public class CompartmentFigureBorder extends AbstractBorder {
		public Insets getInsets(IFigure figure) {
			return new Insets(1,0,0,0);
		}
		public void paint(IFigure figure, Graphics graphics, Insets insets) {
			graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(),
					tempRect.getTopRight());
		}
	}
}
