package iotwearable.editor.part;

import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.Decision;
import iotwearable.model.iotw.EndPoint;
import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;
import iotwearable.model.iotw.WifiESP8266;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class IoTWEditPartFactory implements EditPartFactory{
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		if (model instanceof Mainboard) {
			part = new MainboardEditPart();
		} 
		//area of input control
		else if (model instanceof Keypad4x4) {
			part = new Keypad4x4EditPart();
		}
		else if(model instanceof Button){
			part = new ButtonEditPart();
		}
		//area of output controls
		else if(model instanceof LED){
			part = new LEDEditPart();
		}
		else if (model instanceof Buzzer) {
			part = new BuzzerEditPart();
		}
		else if (model instanceof I2CLCD) {
			part = new I2CLCDEditPart();
		}
		// area of connectivity control
		else if(model instanceof BluetoothHC06){
			part = new BluetoothHC06EditPart();
		}
		else if(model instanceof WifiESP8266){
			part = new WifiESP8266EditPart();
		}
		//area of state machine
		else if(model instanceof StateSchema){
			part = new StateSchemaEditPart();
		}
		else if(model instanceof StateFrame){
			part = new StateFrameEditPart();
		}
		else if(model instanceof Connection){
			part = new ConnectionEditPart();
		}
		else if(model instanceof Decision){
			part = new DecisionEditPart();
		}
		else if(model instanceof StartPoint){
			part = new StartPointEditPart();
		}
		else if(model instanceof EndPoint){
			part = new EndPointEditPart();
		}
	
		if (part != null) {
			part.setModel(model);
		}
		return part;
	}
}