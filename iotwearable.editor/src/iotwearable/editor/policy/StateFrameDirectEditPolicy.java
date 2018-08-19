package iotwearable.editor.policy;

import iotwearable.editor.command.StateFrameChangeContentCommand;
import iotwearable.editor.command.StateFrameRenameCommand;
import iotwearable.editor.figure.StateFrameFigure;
import iotwearable.editor.part.StateFrameEditPart;
import iotwearable.model.iotw.StateFrame;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

public class StateFrameDirectEditPolicy extends DirectEditPolicy{

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		String type = ((StateFrameEditPart)getHost()).getPropertiesDirect();
		StateFrame stateFrame = (StateFrame)getHost().getModel();
		if(type.equals("name")){
			StateFrameRenameCommand command = new StateFrameRenameCommand();
			command.setStateFrame(stateFrame);
			command.setNewName(value);
			return command;
		}
		else if(type.equals("content")){
			StateFrameChangeContentCommand command = new StateFrameChangeContentCommand();
			command.setStateFrame(stateFrame);
			command.setNewContent(value);
			return command;
		}
		return null;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		String type = ((StateFrameEditPart)getHost()).getPropertiesDirect();
		if(type.equals("name")){
			((StateFrameFigure)getHostFigure()).getName().setText(value);
		}
		else if(type.equals("content")){
			((StateFrameFigure)getHostFigure()).getContent().setText(value);
		}
	}

}
