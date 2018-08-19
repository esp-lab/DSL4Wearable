/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.*;
import iotwearable.model.iotw.Pin.TypePin;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotwFactoryImpl extends EFactoryImpl implements IotwFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IotwFactory init() {
		try {
			IotwFactory theIotwFactory = (IotwFactory)EPackage.Registry.INSTANCE.getEFactory(IotwPackage.eNS_URI);
			if (theIotwFactory != null) {
				return theIotwFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IotwFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IotwPackage.CONNECTION: return createConnection();
			case IotwPackage.STATE_SCHEMA: return createStateSchema();
			case IotwPackage.ARDUINO_UNOR3: return createArduinoUNOR3();
			case IotwPackage.KEYPAD4X4: return createKeypad4x4();
			case IotwPackage.BUTTON: return createButton();
			case IotwPackage.LED: return createLED();
			case IotwPackage.I2CLCD: return createI2CLCD();
			case IotwPackage.BUZZER: return createBuzzer();
			case IotwPackage.BLUETOOTH_HC06: return createBluetoothHC06();
			case IotwPackage.WIFI_ESP8266: return createWifiESP8266();
			case IotwPackage.STATE_FRAME: return createStateFrame();
			case IotwPackage.DECISION: return createDecision();
			case IotwPackage.START_POINT: return createStartPoint();
			case IotwPackage.END_POINT: return createEndPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IotwPackage.CONNECTION_KIND:
				return createConnectionKindFromString(eDataType, initialValue);
			case IotwPackage.ROUTER_KIND:
				return createRouterKindFromString(eDataType, initialValue);
			case IotwPackage.WIFI_MODE:
				return createWifiModeFromString(eDataType, initialValue);
			case IotwPackage.WIFI_ID_CONNECTION:
				return createWifiIDConnectionFromString(eDataType, initialValue);
			case IotwPackage.LIST_BAUD:
				return createListBaudFromString(eDataType, initialValue);
			case IotwPackage.LIST_CONNECTION_CHANNEL:
				return createListConnectionChannelFromString(eDataType, initialValue);
			case IotwPackage.LIST_PROTOCOL:
				return createListProtocolFromString(eDataType, initialValue);
			case IotwPackage.I2CLCD_TYPE:
				return createI2CLCDTypeFromString(eDataType, initialValue);
			case IotwPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case IotwPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case IotwPackage.PIN:
				return createPinFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IotwPackage.CONNECTION_KIND:
				return convertConnectionKindToString(eDataType, instanceValue);
			case IotwPackage.ROUTER_KIND:
				return convertRouterKindToString(eDataType, instanceValue);
			case IotwPackage.WIFI_MODE:
				return convertWifiModeToString(eDataType, instanceValue);
			case IotwPackage.WIFI_ID_CONNECTION:
				return convertWifiIDConnectionToString(eDataType, instanceValue);
			case IotwPackage.LIST_BAUD:
				return convertListBaudToString(eDataType, instanceValue);
			case IotwPackage.LIST_CONNECTION_CHANNEL:
				return convertListConnectionChannelToString(eDataType, instanceValue);
			case IotwPackage.LIST_PROTOCOL:
				return convertListProtocolToString(eDataType, instanceValue);
			case IotwPackage.I2CLCD_TYPE:
				return convertI2CLCDTypeToString(eDataType, instanceValue);
			case IotwPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case IotwPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case IotwPackage.PIN:
				return convertPinToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoUNOR3 createArduinoUNOR3() {
		ArduinoUNOR3Impl arduinoUNOR3 = new ArduinoUNOR3Impl();
		return arduinoUNOR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keypad4x4 createKeypad4x4() {
		Keypad4x4Impl keypad4x4 = new Keypad4x4Impl();
		return keypad4x4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSchema createStateSchema() {
		StateSchemaImpl stateSchema = new StateSchemaImpl();
		return stateSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CLCD createI2CLCD() {
		I2CLCDImpl i2CLCD = new I2CLCDImpl();
		return i2CLCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFrame createStateFrame() {
		StateFrameImpl stateFrame = new StateFrameImpl();
		return stateFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartPoint createStartPoint() {
		StartPointImpl startPoint = new StartPointImpl();
		return startPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPoint createEndPoint() {
		EndPointImpl endPoint = new EndPointImpl();
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothHC06 createBluetoothHC06() {
		BluetoothHC06Impl bluetoothHC06 = new BluetoothHC06Impl();
		return bluetoothHC06;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiESP8266 createWifiESP8266() {
		WifiESP8266Impl wifiESP8266 = new WifiESP8266Impl();
		return wifiESP8266;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionKind createConnectionKindFromString(EDataType eDataType, String initialValue) {
		ConnectionKind result = ConnectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterKind createRouterKindFromString(EDataType eDataType, String initialValue) {
		RouterKind result = RouterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiMode createWifiModeFromString(EDataType eDataType, String initialValue) {
		WifiMode result = WifiMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWifiModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiIDConnection createWifiIDConnectionFromString(EDataType eDataType, String initialValue) {
		WifiIDConnection result = WifiIDConnection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWifiIDConnectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListBaud createListBaudFromString(EDataType eDataType, String initialValue) {
		ListBaud result = ListBaud.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListBaudToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListConnectionChannel createListConnectionChannelFromString(EDataType eDataType, String initialValue) {
		ListConnectionChannel result = ListConnectionChannel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListConnectionChannelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListProtocol createListProtocolFromString(EDataType eDataType, String initialValue) {
		ListProtocol result = ListProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CLCDType createI2CLCDTypeFromString(EDataType eDataType, String initialValue) {
		I2CLCDType result = I2CLCDType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertI2CLCDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buzzer createBuzzer() {
		BuzzerImpl buzzer = new BuzzerImpl();
		return buzzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Create a <code>Rectangle</code> instance from a <code>String</code>. The expected
	 * representation is "x,y,width,height". Illegal representations will return a null
	 * value. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if(values.length != 4) {
			return null;
		}

		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
			rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
		} catch(NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			rect = null;
		}
		return rect;
	}


	/**
	 * <!-- begin-user-doc -->
	 * Convert a <code>Rectangle</code> to a <code>String</code> representation. The
	 * <code>Rectangle</code> is represented as "x,y,width,height". 
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x+","+rect.y+","+rect.width+","+rect.height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if(values.length != 2) {
			return null;
		}
		
		Point point = new Point();
		try { 
			point.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
		} catch(NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			point = null;		
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		Point p = (Point)instanceValue;
		return p.x+","+p.y;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 *if idConnect is empty : name,type
	 *if idConnect not empty: name,type,idConnect
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Pin createPinFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		
		String[] values = initialValue.split(",");
		if(values.length < 2){
			return null;
		}
		TypePin type =  values[1].trim().equals(TypePin.IO.toString()) ? TypePin.IO
				: values[1].trim().equals(TypePin.Input.toString()) ? TypePin.Input
						: values[1].trim().equals(TypePin.Output.toString())? TypePin.Output
								:  values[1].trim().equals(TypePin.Passive.toString())? TypePin.Passive
										: values[1].trim().equals(TypePin.Power.toString())? TypePin.Power
												: null;
		if(type == null)
			return null;
		if(values.length == 2) {
			Pin pin = new Pin(values[0].trim(),  type);
			return pin;
		}
		else 
			if(values.length == 3){
			Pin pin = new Pin(values[0].trim(),  type);
			pin.setIdConnect(values[2].trim());
			return pin;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 *if idConnect is empty : name,type
	 *if idConnect not empty: name,type,idConnect
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPinToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null){
			return null;
		}
		Pin pin = (Pin)instanceValue;
		if(pin.getIdConnect().isEmpty()){
			return pin.getName().trim()  +  "," + pin.getType().toString();
		}
		else{
			return pin.getName().trim()  +  "," + pin.getType().toString() + "," + pin.getIdConnect();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwPackage getIotwPackage() {
		return (IotwPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IotwPackage getPackage() {
		return IotwPackage.eINSTANCE;
	}

} //IotwFactoryImpl
