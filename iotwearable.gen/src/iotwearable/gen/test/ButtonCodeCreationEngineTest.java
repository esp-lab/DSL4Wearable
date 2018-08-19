package iotwearable.gen.test;



import static org.junit.Assert.assertEquals;
import iotwearable.gen.cce.device.PushButtonCodeCreationEngine;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.Pin.TypePin;

import org.junit.Test;

public class ButtonCodeCreationEngineTest extends DeviceCodeCreationEngineTest{
	Button button = IotwFactory.eINSTANCE.createButton();
	Pin pin1;
	PushButtonCodeCreationEngine codeCreationEngine;
	
	public ButtonCodeCreationEngineTest(){
		button.setId("button");
		pin1 = new Pin("1", TypePin.IO);
	}
	@Test
	public void createCode_True() {
		pin1.setIdConnect("2<->1");
		button.modifyPin(pin1);
		addDevice(button);
		codeCreationEngine = new PushButtonCodeCreationEngine(button);
		String expected ="/*Define Button  output*/\n"
				+ "const int button = 2;";
		String actual = codeCreationEngine.createDefine();
		assertEquals(expected, actual);
	}
}
