package iotwearable.editor.figure;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

/**
 * Used to create Keypad figure
 */
public class Keypad4x4Figure extends InputDeviceFigure{
	public Keypad4x4Figure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("keypad4x4.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
