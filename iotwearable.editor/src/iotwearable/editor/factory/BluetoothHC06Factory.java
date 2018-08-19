package iotwearable.editor.factory;

import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.IotwFactory;

import org.eclipse.gef.requests.CreationFactory;

public class BluetoothHC06Factory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createBluetoothHC06();
	}

	@Override
	public Object getObjectType() {
		return BluetoothHC06.class;
	}

}
