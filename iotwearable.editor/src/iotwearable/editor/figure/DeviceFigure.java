package iotwearable.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
public abstract class DeviceFigure extends Figure{
	protected ImageFigure figure;
	protected Image image;
	
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = getBounds().getCopy();
		setConstraint(figure, new Rectangle(0, 0, r.width, r.height));
	}
}