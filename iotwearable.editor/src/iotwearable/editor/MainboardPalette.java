package iotwearable.editor;


import iotwearable.editor.factory.BluetoothHC06Factory;
import iotwearable.editor.factory.ButtonFactory;
import iotwearable.editor.factory.BuzzerFactory;
import iotwearable.editor.factory.I2CLCDFactory;
import iotwearable.editor.factory.Keypad4x4Factory;
import iotwearable.editor.factory.LEDFactory;
import iotwearable.editor.factory.WifiESP8266Factory;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;


public class MainboardPalette extends PaletteRoot {
	private PaletteDrawer pdInput;
	private PaletteDrawer pdOutput;
	private PaletteDrawer pdConnecttivity;
	private PaletteDrawer defaultTool;

	public MainboardPalette() {
		defaultTool = new PaletteDrawer("");
		ToolEntry toolSelect = new PanningSelectionToolEntry();
		defaultTool.add(toolSelect);
		add(defaultTool);
		setDefaultEntry(toolSelect);
		
		pdInput = new PaletteDrawer("Input Devices");
		add(pdInput);
		addEntryInput();

		pdOutput = new PaletteDrawer("Output Devices");
		add(pdOutput);
		addEntryOutput();
		
		pdConnecttivity = new PaletteDrawer("Connectivity Devices");
		add(pdConnecttivity);
		addEntryConnectivity();
		
	}

	// area input control
	private void addEntryInput() {
		CreationToolEntry _keypad4x4 = new CombinedTemplateCreationEntry("Keypad 4x4", "Keypad 4x4",
				new Keypad4x4Factory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/keypad4x4.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/keypad4x4.png"));
	
		CreationToolEntry _button = new CombinedTemplateCreationEntry("Button", "Button",
				new ButtonFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/button.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/button.png"));
		
		pdInput.add(_keypad4x4);
		pdInput.add(_button);
	}

	// area output control
	private void addEntryOutput() {
		
		CreationToolEntry _led = new CombinedTemplateCreationEntry("LED", "LED",
				new LEDFactory(), 
				ImageDescriptor.createFromFile(this.getClass(),"icons/led.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/led.png"));
		CreationToolEntry _buzzer = new CombinedTemplateCreationEntry("Buzzer", "Buzzer",
				new BuzzerFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/buzzer.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/buzzer.png"));
		
		CreationToolEntry _i2cLCD = new CombinedTemplateCreationEntry("I2C LCD", "I2C LCD",
				new I2CLCDFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/i2cLCD1_ESP_LAB.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/i2cLCD1_ESP_LAB.png"));
		
		pdOutput.add(_led);
		pdOutput.add(_buzzer);
		pdOutput.add(_i2cLCD);
	}
	// area Connectivity control
	
	private void addEntryConnectivity(){
		CreationToolEntry _BluetoothHC06 = new CombinedTemplateCreationEntry("Bluetooth HC06", "Bluetooth HC06",
				new BluetoothHC06Factory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/BluetoothHC06.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/BluetoothHC06.png"));
		CreationToolEntry _WifiESP8266 = new CombinedTemplateCreationEntry("Wifi ESP8266", "Wifi ESP8266",
				new WifiESP8266Factory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/wifiESP8266.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/wifiESP8266.png"));
		
		pdConnecttivity.add(_BluetoothHC06);
		pdConnecttivity.add(_WifiESP8266);
	}
}