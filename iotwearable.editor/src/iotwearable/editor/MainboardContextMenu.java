package iotwearable.editor;
import iotwearable.editor.action.MainboardContextMenuAction;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;
public class MainboardContextMenu extends ContextMenuProvider {
	private ActionRegistry actionRegistry;
	private boolean display;
	private IWorkbenchPart part;
	public MainboardContextMenu(IWorkbenchPart part, EditPartViewer viewer, final ActionRegistry actionRegistry) {
		super(viewer);
		display = true;
		setActionRegistry(actionRegistry);
		this.part = part;
	}

	private void setActionRegistry(final ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}
	@Override
	public void buildContextMenu(IMenuManager menu) {
		MainboardEditor editor = (MainboardEditor) part;
		if(editor.getGraphicalViewer().getSelectedEditParts().size() == 1) {
			display = false;
		}
		else if(editor.getGraphicalViewer().getSelectedEditParts().size() == 0) 
		{
			display = true;
		}
		GEFActionConstants.addStandardActionGroups(menu);
		IAction action;
		action = getActionRegistry().getAction(MainboardContextMenuAction.ID_AddLED);
		if(action.isEnabled() && display)
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(MainboardContextMenuAction.ID_AddKeypad4x4);
		if(action.isEnabled()&& display)
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(MainboardContextMenuAction.ID_AddI2CLCD);
		if(action.isEnabled()&& display)
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(MainboardContextMenuAction.ID_AddBuzzer);
		if(action.isEnabled()&& display)
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(MainboardContextMenuAction.ID_AddBluetoothHC06);
		if(action.isEnabled()&& display)
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(MainboardContextMenuAction.ID_AddWifiESP8266);
		if(action.isEnabled()&& display)
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		action = getActionRegistry().getAction(ActionFactory.SAVE.getId());
		if( display)
			menu.appendToGroup(GEFActionConstants.GROUP_SAVE, action);
		action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_REST, action);
		action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		if( display)
			menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);

		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		if(display)
			menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
	}



	private ActionRegistry getActionRegistry() {
		return actionRegistry;
	}
}