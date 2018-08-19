package iotwearable.editor.factory;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.WifiESP8266;

import org.eclipse.gef.requests.CreationFactory;

public class WifiESP8266Factory implements CreationFactory{

	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createWifiESP8266();
	}

	@Override
	public Object getObjectType() {
		return WifiESP8266.class;
	}

}
