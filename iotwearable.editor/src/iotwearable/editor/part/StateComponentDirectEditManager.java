package iotwearable.editor.part;

import iotwearable.editor.figure.SmartLabelFigure;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;

public class StateComponentDirectEditManager extends DirectEditManager {
	SmartLabelFigure textFigure;

	@SuppressWarnings("rawtypes")
	public StateComponentDirectEditManager(GraphicalEditPart source, Class editorType,
			CellEditorLocator locator, SmartLabelFigure label) {
		super(source, editorType, locator);
		this.textFigure = label;

	}

	@Override
	protected void initCellEditor() {
		String initialLabelText = textFigure.getText();
		getCellEditor().setValue(initialLabelText);
	}

}
