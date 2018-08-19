package iotwearable.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Used to create Decision figure
 */
public class DecisionFigure extends StateComponentFigure{
	public DecisionFigure() {
		super();
		setLayoutManager(new StackLayout());
	}
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = getBounds().getCopy();
		PointList points = new PointList();
		points.removeAllPoints();
		points.addPoint(r.getTop());
		points.addPoint(r.getRight());
		points.addPoint(r.getBottom());
		points.addPoint(r.getLeft());
		graphics.fillPolygon(points);
		graphics.drawPolygon(points);
	}
	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
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
