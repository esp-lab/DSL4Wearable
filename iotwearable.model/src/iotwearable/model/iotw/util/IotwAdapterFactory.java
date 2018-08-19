/**
 */
package iotwearable.model.iotw.util;

import iotwearable.model.iotw.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iotwearable.model.iotw.IotwPackage
 * @generated
 */
public class IotwAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IotwPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IotwPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IotwSwitch<Adapter> modelSwitch =
		new IotwSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseStateSchema(StateSchema object) {
				return createStateSchemaAdapter();
			}
			@Override
			public Adapter caseStateComponent(StateComponent object) {
				return createStateComponentAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseIODevice(IODevice object) {
				return createIODeviceAdapter();
			}
			@Override
			public Adapter caseInputDevice(InputDevice object) {
				return createInputDeviceAdapter();
			}
			@Override
			public Adapter caseOutputDevice(OutputDevice object) {
				return createOutputDeviceAdapter();
			}
			@Override
			public Adapter caseConnectivity(Connectivity object) {
				return createConnectivityAdapter();
			}
			@Override
			public Adapter caseMainboard(Mainboard object) {
				return createMainboardAdapter();
			}
			@Override
			public Adapter caseArduinoUNOR3(ArduinoUNOR3 object) {
				return createArduinoUNOR3Adapter();
			}
			@Override
			public Adapter caseKeypad4x4(Keypad4x4 object) {
				return createKeypad4x4Adapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseLED(LED object) {
				return createLEDAdapter();
			}
			@Override
			public Adapter caseI2CLCD(I2CLCD object) {
				return createI2CLCDAdapter();
			}
			@Override
			public Adapter caseBuzzer(Buzzer object) {
				return createBuzzerAdapter();
			}
			@Override
			public Adapter caseBluetoothHC06(BluetoothHC06 object) {
				return createBluetoothHC06Adapter();
			}
			@Override
			public Adapter caseWifiESP8266(WifiESP8266 object) {
				return createWifiESP8266Adapter();
			}
			@Override
			public Adapter caseStateFrame(StateFrame object) {
				return createStateFrameAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseStartPoint(StartPoint object) {
				return createStartPointAdapter();
			}
			@Override
			public Adapter caseEndPoint(EndPoint object) {
				return createEndPointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Mainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Mainboard
	 * @generated
	 */
	public Adapter createMainboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.ArduinoUNOR3 <em>Arduino UNOR3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.ArduinoUNOR3
	 * @generated
	 */
	public Adapter createArduinoUNOR3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.StateSchema <em>State Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.StateSchema
	 * @generated
	 */
	public Adapter createStateSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.StateComponent <em>State Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.StateComponent
	 * @generated
	 */
	public Adapter createStateComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.IODevice <em>IO Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.IODevice
	 * @generated
	 */
	public Adapter createIODeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.InputDevice <em>Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.InputDevice
	 * @generated
	 */
	public Adapter createInputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.OutputDevice <em>Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.OutputDevice
	 * @generated
	 */
	public Adapter createOutputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Connectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Connectivity
	 * @generated
	 */
	public Adapter createConnectivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Keypad4x4 <em>Keypad4x4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Keypad4x4
	 * @generated
	 */
	public Adapter createKeypad4x4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.LED
	 * @generated
	 */
	public Adapter createLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.I2CLCD <em>I2CLCD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.I2CLCD
	 * @generated
	 */
	public Adapter createI2CLCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.StateFrame <em>State Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.StateFrame
	 * @generated
	 */
	public Adapter createStateFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.StartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.StartPoint
	 * @generated
	 */
	public Adapter createStartPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.BluetoothHC06 <em>Bluetooth HC06</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.BluetoothHC06
	 * @generated
	 */
	public Adapter createBluetoothHC06Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.WifiESP8266 <em>Wifi ESP8266</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.WifiESP8266
	 * @generated
	 */
	public Adapter createWifiESP8266Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iotwearable.model.iotw.Buzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iotwearable.model.iotw.Buzzer
	 * @generated
	 */
	public Adapter createBuzzerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IotwAdapterFactory
