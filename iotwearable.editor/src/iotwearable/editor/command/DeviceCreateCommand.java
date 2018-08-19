package iotwearable.editor.command;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import iotwearable.editor.utilities.MessageContent;
import iotwearable.editor.window.MessageWindow;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;
import iotwearable.utilities.FileUtils;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Command used to create new device.
 */
public class DeviceCreateCommand extends Command {
	private Device device;
	private Mainboard mainboard;
	private Rectangle constraints;

	@Override
	public boolean canExecute() {
		return device != null && mainboard != null && constraints != null;
	}

	@Override
	public void execute() {
		String id = getID(device, mainboard);
		device.setId(id);
		if(!id.isEmpty()){
			if(connectDevice()){
				device.setConstraints(constraints);
				mainboard.addDevice(device);
			}
			else{
				for(Pin pinDevice : device.getPinConnecteds()){
					for(Pin pinMainboard : mainboard.getPinConnecteds()){
						if(pinDevice.getIdConnect().equals(pinMainboard.getIdConnect())){
							pinMainboard.setIdConnect("");
							mainboard.modifyPin(pinMainboard);
						}
					}
				}
			}
		}
	}

	// Get the pins can be used for device from file pinMap.xml
	private boolean connectDevice() {
		try {
			// Read file pinMap.xml
			File inputFile = new File(FileUtils.getFilePath(this.getClass(), "pinMap.xml"));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("Device");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// Take the element corresponding to the Device
					if (eElement.getAttribute("name").equals(
							device.getClass().getSimpleName()
									.replaceAll("Impl", ""))) {
						NodeList pinList = eElement.getElementsByTagName("pin");
						// Count the pin number must be connected to the Device.
						int numPin = 0;
						for (int i = 0; i < pinList.getLength(); i++) {
							Node pinNode = pinList.item(i);
							if (pinNode.getNodeType() == Node.ELEMENT_NODE) {
								Element element = (Element) pinNode;
								String pinConnect = element
										.getAttribute("name");
								// Get the pin list of the mainboard can connect
								String values[] = element.getAttribute("value")
										.split(",");
								boolean found = false;
								// Found and connect
								for (int j = 0; j < values.length; j++) {
									for (Pin _pin : mainboard.getPins()) {
										if (_pin.getIdConnect().isEmpty()) {
											if (_pin.getName().equals(values[j])) {
												for (Pin _pinCon : device.getPins()) {
													if (_pinCon.getName().equals(pinConnect)) {
														Pin pinRight = new Pin(_pinCon.getName(), _pinCon.getType());
														pinRight.setIdConnect(_pin.getName() + "<->" + _pinCon.getName());
														Pin pinLeft = new Pin(_pin.getName(), _pin.getType());
														pinLeft.setIdConnect(pinRight.getIdConnect());
														device.modifyPin(pinRight);
														mainboard.modifyPin(pinLeft);
														found = true;
														numPin++;
														break;
													}
												}
											}
										}
										if (found) {
											break;
										}
									}
									if (found) {
										break;
									}
								}
							}
						}
						if (pinList.getLength() != numPin) {
							MessageWindow.show("Connect to mainboard", MessageContent.NoPinSuitable);
							return false;
						}
						return true;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void undo() {
		mainboard.removeDevice(device);
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
	public void setConstraints(Rectangle constraints) {
		this.constraints = constraints;
	}
// Return a id for device
private String getID(Device device, Mainboard mainboard) {
			if (mainboard == null)
				return "";
			String id = "control_0";
			String ids = "";

			try {
				for (Device _device : mainboard.getDevices()) {
					ids += "|" + _device.getId();
				}
			} catch (Exception e) {
			}
			int i = 0;
			while (ids.contains(id)) {
				i++;
				id = "control_" + i;
			}
			return id;
		}
}
