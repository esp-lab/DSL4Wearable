package iotwearable.editor.part;

import iotwearable.editor.figure.LEDFigure;

import org.eclipse.draw2d.IFigure;

public class LEDEditPart extends IODeviceEditPart{

	@Override
	protected IFigure createFigure() {
		return new LEDFigure();
	}
}
