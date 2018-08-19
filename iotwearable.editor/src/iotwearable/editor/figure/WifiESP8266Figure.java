package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

public class WifiESP8266Figure extends ConnectivityFigure {
	public WifiESP8266Figure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("wifiESP8266.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}