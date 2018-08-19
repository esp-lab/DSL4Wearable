package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

public class BluetoothHC06Figure extends ConnectivityFigure{
	public BluetoothHC06Figure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("BluetoothHC06.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
