package iotwearable.editor.figure;

import org.eclipse.draw2d.XYLayout;
/**
 *Abstract class for all input - output control figure  
 */
public abstract class IODeviceFigure extends  DeviceFigure {
	public IODeviceFigure() {
		setLayoutManager(new XYLayout());
	}
}