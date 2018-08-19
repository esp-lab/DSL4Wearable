package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

/**
 * Used to create LED figure
 */
public class LEDFigure extends OutputDeviceFigure{
	public LEDFigure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("led.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}