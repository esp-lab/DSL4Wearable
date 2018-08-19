package iotwearable.editor.action;


import iotwearable.editor.MainboardEditor;

import org.eclipse.gef.Request;
import org.eclipse.gef.tools.ConnectionCreationTool;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;


public class ShowPropertiesViewContextMenuAction extends WorkbenchPartAction {

	public static final String ID = "ShowPropertiesView";
	public static final String REQUEST = "ShowPropertiesView";
	public static final boolean EnableBuzzer = true;
	private final Request request;
	private ConnectionCreationTool tool;
	public ShowPropertiesViewContextMenuAction(IWorkbenchPart part) {
		super(part);
		request = new Request(REQUEST);
		setId(ID);
		setText("Show properties view");
		tool = new ConnectionCreationTool();
		tool.setUnloadWhenFinished(true);
	}
	public Request getRequest() {
		return request;
	}

	@SuppressWarnings("unused")
	@Override
	public void run() {
		MainboardEditor editor = (MainboardEditor) getWorkbenchPart();
	
	}
	@Override
	protected boolean calculateEnabled() {
		return true;
	}
}