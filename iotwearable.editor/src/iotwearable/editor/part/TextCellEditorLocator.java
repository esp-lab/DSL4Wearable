package iotwearable.editor.part;

import iotwearable.editor.figure.SmartLabelFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;

public class TextCellEditorLocator implements CellEditorLocator{
	private IFigure label;
	private PolylineConnection connection;
	public TextCellEditorLocator(IFigure textFlow, PolylineConnection connection) {
		this.label = textFlow;
		this.connection = connection;
	}
	@Override
	public void relocate(CellEditor celleditor) {
		Text text = (Text) celleditor.getControl();
		Point pref;
		if(connection != null && ((SmartLabelFigure) label).getText().isEmpty())
			pref = text.computeSize(label.getSize().width +60, label.getSize().height);
		else
			pref = text.computeSize(label.getSize().width, label.getSize().height);
		Rectangle rect = label.getBounds().getCopy();
		label.translateToAbsolute(rect);
		text.setBounds(rect.x - 1, rect.y - 1, pref.x + 1, pref.y + 1); 
	}
}
