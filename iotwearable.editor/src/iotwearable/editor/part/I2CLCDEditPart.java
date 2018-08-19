package iotwearable.editor.part;

import iotwearable.editor.figure.I2CLCDFigure;

import org.eclipse.draw2d.IFigure;

public class I2CLCDEditPart extends IODeviceEditPart{

	@Override
	protected IFigure createFigure() {
		return new I2CLCDFigure();
	}
}
