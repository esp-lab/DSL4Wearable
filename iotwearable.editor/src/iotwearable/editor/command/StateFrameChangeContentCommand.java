package iotwearable.editor.command;

import iotwearable.model.iotw.StateFrame;

import org.eclipse.gef.commands.Command;
/**
 * Command used to change content of a StateFrame.
 */
public class StateFrameChangeContentCommand extends Command{
	private String oldContent;
	private String newContent;
	private StateFrame stateFrame;
	
	@Override
	public boolean canExecute() {
		return stateFrame != null && newContent != null;
	}
	
	@Override
	public void undo() {
		stateFrame.setContent(oldContent);
	}
	@Override
	public void execute() {
		this.oldContent = stateFrame.getContent();
		this.stateFrame.setContent(newContent);
	}

	public void setNewContent(String newContent) {
		this.newContent = newContent;
	}

	public void setStateFrame(StateFrame stateFrame) {
		this.stateFrame = stateFrame;
	}
}
