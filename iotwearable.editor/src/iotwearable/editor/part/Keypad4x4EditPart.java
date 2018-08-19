package iotwearable.editor.part;

import iotwearable.editor.figure.Keypad4x4Figure;

import org.eclipse.draw2d.IFigure;

public class Keypad4x4EditPart extends IODeviceEditPart{

	@Override
	protected IFigure createFigure() {
		return new Keypad4x4Figure();
	}
}