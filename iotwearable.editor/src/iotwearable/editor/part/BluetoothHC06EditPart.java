package iotwearable.editor.part;

import iotwearable.editor.figure.BluetoothHC06Figure;

import org.eclipse.draw2d.IFigure;

public class BluetoothHC06EditPart extends ConnectivityEditPart{

	@Override
	protected IFigure createFigure() {
		return new BluetoothHC06Figure();
	}
}