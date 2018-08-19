package iotwearable.editor.keyhandler;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.events.KeyEvent;

/**
 * 
 * Class listener move key
 *
 */
public class MoveKeyListener{

	public void setListen(KeyEvent e, EditPart editPart,
			CommandStack commandStack) {
		MoveKeyHandler keyHandler = MoveKeyHandlerFactory.create(editPart.getModel());
		if(keyHandler != null){
			keyHandler.keyPressed(e, editPart, commandStack);
		}
	}
}
