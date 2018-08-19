package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

/**
 * Used to create Buzzer figure
 */
public class BuzzerFigure extends OutputDeviceFigure{
	public BuzzerFigure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("buzzer.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
