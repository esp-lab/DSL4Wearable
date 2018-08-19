package iotwearable.editor.part;

import iotwearable.editor.figure.BuzzerFigure;

import org.eclipse.draw2d.IFigure;

public class BuzzerEditPart extends IODeviceEditPart {

	@Override
	protected IFigure createFigure() {
		return new BuzzerFigure();
	}
}
