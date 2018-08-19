package iotwearable.editor.part;

import iotwearable.editor.figure.StartPointFigure;

import org.eclipse.draw2d.IFigure;

public class StartPointEditPart extends StateComponentEditPart{

	@Override
	protected IFigure createFigure() {
		return new StartPointFigure();
	}
}
