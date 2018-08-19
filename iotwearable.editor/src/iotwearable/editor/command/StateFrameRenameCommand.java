package iotwearable.editor.command;

import iotwearable.model.iotw.StateFrame;

import org.eclipse.gef.commands.Command;
/**
 * Command used to rename a StateFrame
 */
public class StateFrameRenameCommand extends Command{
	private String oldName;
	private String newName;
	private StateFrame stateFrame;
	
	@Override
	public boolean canExecute() {
		return stateFrame != null && newName != null;
	}
	
	@Override
	public void undo() {
		stateFrame.setName(oldName);
	}
	
	@Override
	public void execute() {
		this.oldName = stateFrame.getName();
		this.stateFrame.setName(newName);
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public void setStateFrame(StateFrame stateFrame) {
		this.stateFrame = stateFrame;
	}
}
