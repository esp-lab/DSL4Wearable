package iotwearable.gen.cce.device;

import iotwearable.model.iotw.LED;

public class LEDSingleCodeCreationEngine extends LEDCodeCreationEngine{
	LED led;
	
	public LEDSingleCodeCreationEngine(LED led) {
		this.led = led;
	}

	@Override
	public String createInclude() {
		return "";
	}

	@Override
	public String createInitLoop() {
		return "";
	}
	@Override
	public String createDefine() {
		return super.createDefine()
				.replaceAll("<id>", led.getId())
				.replaceAll("<pin>", led.getMainboard()
						.findPin(led.getPinConnecteds().get(0))
						.getName());
	}
	@Override
	public String createInitSetup() {
		return super.createInitSetup()
				.replaceAll("<id>", led.getId());
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