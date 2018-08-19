package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;
/**
 * Used to create Button figure
 */
public class ButtonFigure extends InputDeviceFigure{
	public ButtonFigure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("button.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
