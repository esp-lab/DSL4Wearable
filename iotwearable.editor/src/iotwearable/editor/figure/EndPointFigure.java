package iotwearable.editor.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * Used to create EndPoint figure
 */
public class EndPointFigure extends StateComponentFigure{
	private Ellipse ellipse;
	public static Color endPointColor = new Color(null,000,000,000);
	
	public EndPointFigure() {
		ellipse = new Ellipse();
		setBackgroundColor(endPointColor);
		setOpaque(true);
		add(ellipse);
	}
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = (Rectangle)getBounds().getCopy();
		setConstraint(ellipse, new Rectangle(0,0,r.width,r.height));
	}
	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor() {
		return getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor() {
		return getConnectionAnchor();
	}
}
