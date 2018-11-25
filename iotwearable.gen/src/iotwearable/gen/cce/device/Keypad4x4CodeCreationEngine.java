package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.Keypad4x4;

public class Keypad4x4CodeCreationEngine extends KeypadCodeCreationEngine {
	private Keypad4x4 keypad;

	public Keypad4x4CodeCreationEngine(Keypad4x4 keypad) {
		this.keypad = keypad;
	}

	@Override
	public String createDefine() {
		String content = super.createDefine();
		content = content.replaceAll("<id>", keypad.getId());
		String desKey = descriptionKey();
		if(!desKey.isEmpty()){
			content = content.replaceAll("<descriptionKey>", desKey);
		}
		else{
			content = content.replaceAll("<descriptionKey>", "");
		}
		String pin1 = keypad.getMainboard().findPin(keypad.getPin1()).getName();
		String pin2 = keypad.getMainboard().findPin(keypad.getPin2()).getName();
		String pin3 = keypad.getMainboard().findPin(keypad.getPin3()).getName();
		String pin4 = keypad.getMainboard().findPin(keypad.getPin4()).getName();
		String pin5 = keypad.getMainboard().findPin(keypad.getPin5()).getName();
		String pin6 = keypad.getMainboard().findPin(keypad.getPin6()).getName();
		String pin7 = keypad.getMainboard().findPin(keypad.getPin7()).getName();
		String pin8 = keypad.getMainboard().findPin(keypad.getPin8()).getName();
		content = content.replaceAll("<row>", keypad.getRows()+"");
		content = content.replaceAll("<col>", keypad.getCols()+"");
		content = content.replaceAll("<keys>", keypad.getKeys());
		content = content.replaceAll("<rowPins>", pin1 + "," + pin2 + "," + pin3 + "," + pin4);
		content = content.replaceAll("<columnPins>", pin5 + "," + pin6 + "," + pin7 + "," + pin8);
		return content;
	}
	@Override
	public String createInitSetup() {
		return "";
	}
	@Override
	public String createInitLoop() {
		return super.createInitLoop()
				.replaceAll("<id>", keypad.getId());
	}
	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String content = super.createFromCommand(syntax, tokens);
		if(content.contains("<id>")){
			content = content.replaceAll("<id>", keypad.getId());
		}
		content = content.replace("<key>","\'"+ keypad.getButton(tokens.get(0).instance.replaceAll("\"", ""))+"\'");
		return content;
	}
	
	public String descriptionKey(){
		StringBuilder desKey = new StringBuilder();
		if(!keypad.getNameButton0().isEmpty()){
			desKey.append("Button 0 : " + keypad.getNameButton0()+"\n");
		}
		if(!keypad.getNameButton1().isEmpty()){
			desKey.append("Button 1 : " + keypad.getNameButton1()+"\n");
		}
		if(!keypad.getNameButton2().isEmpty()){
			desKey.append("Button 2 : " + keypad.getNameButton2()+"\n");
		}
		if(!keypad.getNameButton3().isEmpty()){
			desKey.append("Button 3 : " + keypad.getNameButton3()+"\n");
		}
		if(!keypad.getNameButton4().isEmpty()){
			desKey.append("Button 4 : " + keypad.getNameButton4()+"\n");
		}
		if(!keypad.getNameButton5().isEmpty()){
			desKey.append("Button 5 : " + keypad.getNameButton5()+"\n");
		}
		if(!keypad.getNameButton6().isEmpty()){
			desKey.append("Button 6 : " + keypad.getNameButton6()+"\n");
		}
		if(!keypad.getNameButton7().isEmpty()){
			desKey.append("Button 7 : " + keypad.getNameButton7()+"\n");
		}
		if(!keypad.getNameButton8().isEmpty()){
			desKey.append("Button 8 : " + keypad.getNameButton8()+"\n");
		}
		if(!keypad.getNameButton9().isEmpty()){
			desKey.append("Button 9 : " + keypad.getNameButton9()+"\n");
		}
		if(!keypad.getNameButtonA().isEmpty()){
			desKey.append("Button A : " + keypad.getNameButtonA()+"\n");
		}
		if(!keypad.getNameButtonB().isEmpty()){
			desKey.append("Button B : " + keypad.getNameButtonB()+"\n");
		}
		if(!keypad.getNameButtonC().isEmpty()){
			desKey.append("Button C : " + keypad.getNameButtonC()+"\n");
		}
		if(!keypad.getNameButtonD().isEmpty()){
			desKey.append("Button D : " + keypad.getNameButtonD()+"\n");
		}
		if(!keypad.getNameButtonAsterisk().isEmpty()){
			desKey.append("Button * : " + keypad.getNameButtonAsterisk()+"\n");
		}
		if(!keypad.getNameButtonHash().isEmpty()){
			desKey.append("Button # : " + keypad.getNameButtonHash()+"\n");
		}
		return desKey.toString();
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