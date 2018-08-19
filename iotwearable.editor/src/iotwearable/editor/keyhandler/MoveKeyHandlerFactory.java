package iotwearable.editor.keyhandler;

import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.StateComponent;


/**
 * 
 * Class factory for {@link MoveKeyHandler}
 *
 */
public class MoveKeyHandlerFactory {
	/**
	 * 
	 * @param o : 
	 * 		{@link DevicelMove},
	 * 		{@link StateComponent},
	 * @return a instance {@link MoveKeyHander}
	 */
	public static MoveKeyHandler create(Object o){
		MoveKeyHandler keyHandler = null;
		if(o instanceof Device){
			keyHandler = new DevicelMove();
		}
		else if(o instanceof StateComponent){
			keyHandler = new StateComponentMove();
		}
		return keyHandler;
	}
}