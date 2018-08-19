package iotwearable.gen.cce.device;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.BluetoothHC06;

import java.util.LinkedList;

public class BluetoothHC06CodeCreationEngine extends BluetoothCodeCreationEngine {
	private BluetoothHC06 bluetoothHC06;

	public BluetoothHC06CodeCreationEngine(BluetoothHC06 bluetoothHC06) {
		super();
		this.bluetoothHC06 = bluetoothHC06;
	}
	@Override
	public String createDefine() {
		String content = super.createDefine()
		.replaceAll("<pinTX>", bluetoothHC06.getMainboard().findPin(bluetoothHC06.getPinTXD()).getName())
		.replaceAll("<pinRX>", bluetoothHC06.getMainboard().findPin(bluetoothHC06.getPinRXD()).getName())
		.replaceAll("<id>", bluetoothHC06.getId())
		.replaceAll("<type>", bluetoothHC06.getName());
		return content;
	}

	@Override
	public String createInitSetup() {
		return "";
	}
	@Override
	public String createInitLoop() {
		return "";
	}
	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		return "";
	}
	@Override
	public String createPrototype() {
		return "";
	}
	@Override
	public String createMethodImpl() {
		return "";
	}
}
