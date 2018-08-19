package iotwearable.gen.test;

import static org.junit.Assert.*;

import org.junit.Test;

import iotwearable.gen.cce.device.BluetoothHC06CodeCreationEngine;
import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.Pin.TypePin;



public class BluetoothHC06CodeCreationEngineTest extends DeviceCodeCreationEngineTest{
	BluetoothHC06 bluetoothHC06 = IotwFactory.eINSTANCE.createBluetoothHC06();
	Pin pinTXD;
	Pin pinRXD;
	BluetoothHC06CodeCreationEngine codeCreationEngine;
	public BluetoothHC06CodeCreationEngineTest() {
		bluetoothHC06.setId("bluetooth");
		pinTXD = new Pin("TXD", TypePin.IO);
		pinRXD = new Pin("RXD",TypePin.IO);
	}
	@Test
	public void createCode_True() {
		pinRXD.setIdConnect("2<->RXD");
		pinTXD.setIdConnect("3<->TXD");
		bluetoothHC06.modifyPin(pinRXD);
		bluetoothHC06.modifyPin(pinTXD);
		addDevice(bluetoothHC06);
		codeCreationEngine = new BluetoothHC06CodeCreationEngine(bluetoothHC06);
		String expected ="#include <SoftwareSerial.h>"
				+ "\n"
				+"/*Define Bluetooth HC06*/\n"
				+ "SoftwareSerial bluetooth(2, 3);\n";
		String actual = codeCreationEngine.createInclude() +"\n" 
				+ codeCreationEngine.createDefine();
		assertEquals(expected, actual);
	}
}
