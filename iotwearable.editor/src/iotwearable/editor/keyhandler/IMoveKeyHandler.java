package iotwearable.editor.keyhandler;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.events.KeyEvent;

public interface IMoveKeyHandler {
	/**
	 * Receive a key is pressed on the keyboard and the {@link EditPart} of the object will be handled
	 * and the command stack to execute the command.
	 * @param e  an event containing information about the key press
	 * @param editPart {@link EditPart}
	 * @param commandStack {@link CommandStack}
	 */
	void keyPressed(KeyEvent e, EditPart editPart, CommandStack commandStack);
}
