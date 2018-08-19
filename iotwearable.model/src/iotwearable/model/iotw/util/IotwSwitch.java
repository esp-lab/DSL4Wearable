/**
 */
package iotwearable.model.iotw.util;

import iotwearable.model.iotw.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iotwearable.model.iotw.IotwPackage
 * @generated
 */
public class IotwSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IotwPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwSwitch() {
		if (modelPackage == null) {
			modelPackage = IotwPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IotwPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.STATE_SCHEMA: {
				StateSchema stateSchema = (StateSchema)theEObject;
				T result = caseStateSchema(stateSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.STATE_COMPONENT: {
				StateComponent stateComponent = (StateComponent)theEObject;
				T result = caseStateComponent(stateComponent);
				if (result == null) result = caseComponent(stateComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseComponent(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.IO_DEVICE: {
				IODevice ioDevice = (IODevice)theEObject;
				T result = caseIODevice(ioDevice);
				if (result == null) result = caseDevice(ioDevice);
				if (result == null) result = caseComponent(ioDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.INPUT_DEVICE: {
				InputDevice inputDevice = (InputDevice)theEObject;
				T result = caseInputDevice(inputDevice);
				if (result == null) result = caseIODevice(inputDevice);
				if (result == null) result = caseDevice(inputDevice);
				if (result == null) result = caseComponent(inputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.OUTPUT_DEVICE: {
				OutputDevice outputDevice = (OutputDevice)theEObject;
				T result = caseOutputDevice(outputDevice);
				if (result == null) result = caseIODevice(outputDevice);
				if (result == null) result = caseDevice(outputDevice);
				if (result == null) result = caseComponent(outputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.CONNECTIVITY: {
				Connectivity connectivity = (Connectivity)theEObject;
				T result = caseConnectivity(connectivity);
				if (result == null) result = caseDevice(connectivity);
				if (result == null) result = caseComponent(connectivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.MAINBOARD: {
				Mainboard mainboard = (Mainboard)theEObject;
				T result = caseMainboard(mainboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.ARDUINO_UNOR3: {
				ArduinoUNOR3 arduinoUNOR3 = (ArduinoUNOR3)theEObject;
				T result = caseArduinoUNOR3(arduinoUNOR3);
				if (result == null) result = caseMainboard(arduinoUNOR3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.KEYPAD4X4: {
				Keypad4x4 keypad4x4 = (Keypad4x4)theEObject;
				T result = caseKeypad4x4(keypad4x4);
				if (result == null) result = caseInputDevice(keypad4x4);
				if (result == null) result = caseIODevice(keypad4x4);
				if (result == null) result = caseDevice(keypad4x4);
				if (result == null) result = caseComponent(keypad4x4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseInputDevice(button);
				if (result == null) result = caseIODevice(button);
				if (result == null) result = caseDevice(button);
				if (result == null) result = caseComponent(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.LED: {
				LED led = (LED)theEObject;
				T result = caseLED(led);
				if (result == null) result = caseOutputDevice(led);
				if (result == null) result = caseIODevice(led);
				if (result == null) result = caseDevice(led);
				if (result == null) result = caseComponent(led);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.I2CLCD: {
				I2CLCD i2CLCD = (I2CLCD)theEObject;
				T result = caseI2CLCD(i2CLCD);
				if (result == null) result = caseOutputDevice(i2CLCD);
				if (result == null) result = caseIODevice(i2CLCD);
				if (result == null) result = caseDevice(i2CLCD);
				if (result == null) result = caseComponent(i2CLCD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.BUZZER: {
				Buzzer buzzer = (Buzzer)theEObject;
				T result = caseBuzzer(buzzer);
				if (result == null) result = caseOutputDevice(buzzer);
				if (result == null) result = caseIODevice(buzzer);
				if (result == null) result = caseDevice(buzzer);
				if (result == null) result = caseComponent(buzzer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.BLUETOOTH_HC06: {
				BluetoothHC06 bluetoothHC06 = (BluetoothHC06)theEObject;
				T result = caseBluetoothHC06(bluetoothHC06);
				if (result == null) result = caseConnectivity(bluetoothHC06);
				if (result == null) result = caseDevice(bluetoothHC06);
				if (result == null) result = caseComponent(bluetoothHC06);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.WIFI_ESP8266: {
				WifiESP8266 wifiESP8266 = (WifiESP8266)theEObject;
				T result = caseWifiESP8266(wifiESP8266);
				if (result == null) result = caseConnectivity(wifiESP8266);
				if (result == null) result = caseDevice(wifiESP8266);
				if (result == null) result = caseComponent(wifiESP8266);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.STATE_FRAME: {
				StateFrame stateFrame = (StateFrame)theEObject;
				T result = caseStateFrame(stateFrame);
				if (result == null) result = caseStateComponent(stateFrame);
				if (result == null) result = caseComponent(stateFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseStateComponent(decision);
				if (result == null) result = caseComponent(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.START_POINT: {
				StartPoint startPoint = (StartPoint)theEObject;
				T result = caseStartPoint(startPoint);
				if (result == null) result = caseStateComponent(startPoint);
				if (result == null) result = caseComponent(startPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.END_POINT: {
				EndPoint endPoint = (EndPoint)theEObject;
				T result = caseEndPoint(endPoint);
				if (result == null) result = caseStateComponent(endPoint);
				if (result == null) result = caseComponent(endPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainboard(Mainboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino UNOR3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino UNOR3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoUNOR3(ArduinoUNOR3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateSchema(StateSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateComponent(StateComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIODevice(IODevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDevice(InputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDevice(OutputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivity(Connectivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keypad4x4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keypad4x4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeypad4x4(Keypad4x4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLED(LED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I2CLCD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I2CLCD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI2CLCD(I2CLCD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateFrame(StateFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPoint(StartPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth HC06</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth HC06</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBluetoothHC06(BluetoothHC06 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wifi ESP8266</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wifi ESP8266</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWifiESP8266(WifiESP8266 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buzzer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buzzer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuzzer(Buzzer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IotwSwitch
