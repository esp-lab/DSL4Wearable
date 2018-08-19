package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;
/**
 * Used to create 2CLCD1602 figure
 */
public class I2CLCDFigure extends OutputDeviceFigure{
	public I2CLCDFigure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("i2cLCD1_ESP_LAB.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
