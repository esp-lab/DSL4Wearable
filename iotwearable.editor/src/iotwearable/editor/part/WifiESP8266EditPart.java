package iotwearable.editor.part;

import iotwearable.editor.figure.WifiESP8266Figure;

import org.eclipse.draw2d.IFigure;

public class WifiESP8266EditPart extends ConnectivityEditPart{

	@Override
	protected IFigure createFigure() {
		return new WifiESP8266Figure();
	}
}