/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.Component;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.ConnectionKind;
import iotwearable.model.iotw.Connectivity;
import iotwearable.model.iotw.Decision;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.EndPoint;
import iotwearable.model.iotw.I2CLCDType;
import iotwearable.model.iotw.IODevice;
import iotwearable.model.iotw.InputDevice;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.ListBaud;
import iotwearable.model.iotw.ListConnectionChannel;
import iotwearable.model.iotw.ListProtocol;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.OutputDevice;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.RouterKind;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;
import iotwearable.model.iotw.WifiESP8266;
import iotwearable.model.iotw.WifiIDConnection;
import iotwearable.model.iotw.WifiMode;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotwPackageImpl extends EPackageImpl implements IotwPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoUNOR3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keypad4x4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i2CLCDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothHC06EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wifiESP8266EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wifiModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wifiIDConnectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listBaudEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listConnectionChannelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum i2CLCDTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pinEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iotwearable.model.iotw.IotwPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IotwPackageImpl() {
		super(eNS_URI, IotwFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IotwPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IotwPackage init() {
		if (isInited) return (IotwPackage)EPackage.Registry.INSTANCE.getEPackage(IotwPackage.eNS_URI);

		// Obtain or create and register package
		IotwPackageImpl theIotwPackage = (IotwPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IotwPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IotwPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIotwPackage.createPackageContents();

		// Initialize created meta-data
		theIotwPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIotwPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IotwPackage.eNS_URI, theIotwPackage);
		return theIotwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Id() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Constraints() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainboard() {
		return mainboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainboard_Devices() {
		return (EReference)mainboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainboard_Name() {
		return (EAttribute)mainboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__AddDevice__Device() {
		return mainboardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__RemoveDevice__Device() {
		return mainboardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__GetPins() {
		return mainboardEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__GetPinConnecteds() {
		return mainboardEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__ModifyPin__Pin() {
		return mainboardEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__FindPin__Pin() {
		return mainboardEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoUNOR3() {
		return arduinoUNOR3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin0() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin1() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin2() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin3() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin4() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin5() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin6() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin7() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin8() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin9() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin10() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin11() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin12() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin13() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA0() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA1() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA2() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA3() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA4() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA5() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Bendpoints() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_RouterKind() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Source() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Target() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Kind() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Label() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_StateSchema() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateSchema() {
		return stateSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSchema_Components() {
		return (EReference)stateSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSchema_Connnections() {
		return (EReference)stateSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateComponent() {
		return stateComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateComponent_Incomings() {
		return (EReference)stateComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateComponent_Outgoings() {
		return (EReference)stateComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateComponent_Name() {
		return (EAttribute)stateComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Mainboard() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDevice__GetPins() {
		return deviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDevice__GetPinConnecteds() {
		return deviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDevice__ModifyPin__Pin() {
		return deviceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIODevice() {
		return ioDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDevice() {
		return inputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDevice() {
		return outputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectivity() {
		return connectivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeypad4x4() {
		return keypad4x4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Keys() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Rows() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Cols() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin1() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin2() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin3() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin4() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin5() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin6() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin7() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin8() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton1() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton2() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton3() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton4() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton5() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton6() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton7() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton8() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton9() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton0() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonA() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonB() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonC() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonD() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonHash() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonAsterisk() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeypad4x4__GetButton__String() {
		return keypad4x4EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Pin1() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Pin2() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2CLCD() {
		return i2CLCDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD_PinGND() {
		return (EAttribute)i2CLCDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD_PinVcc() {
		return (EAttribute)i2CLCDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD_PinSDA() {
		return (EAttribute)i2CLCDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD_PinSCL() {
		return (EAttribute)i2CLCDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD_Type() {
		return (EAttribute)i2CLCDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateFrame() {
		return stateFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateFrame_Content() {
		return (EAttribute)stateFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartPoint() {
		return startPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndPoint() {
		return endPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothHC06() {
		return bluetoothHC06EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinTXD() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinRXD() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinGND() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinVCC() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWifiESP8266() {
		return wifiESP8266EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinTX() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinRX() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinVcc() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinGND() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinCHPD() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_SSID_ST() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Password_ST() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Mode() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_IdConnection() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Password_AccessPoint() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_SSID_AccessPoint() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Port() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_IP() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Baud() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_ConnectedChannel() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Protocol() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Pin1() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionKind() {
		return connectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouterKind() {
		return routerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWifiMode() {
		return wifiModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWifiIDConnection() {
		return wifiIDConnectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListBaud() {
		return listBaudEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListConnectionChannel() {
		return listConnectionChannelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListProtocol() {
		return listProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getI2CLCDType() {
		return i2CLCDTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzer() {
		return buzzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuzzer_Pin1() {
		return (EAttribute)buzzerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuzzer_Pin2() {
		return (EAttribute)buzzerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuzzer_Tone() {
		return (EAttribute)buzzerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuzzer_Time() {
		return (EAttribute)buzzerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPin() {
		return pinEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwFactory getIotwFactory() {
		return (IotwFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__ID);
		createEAttribute(componentEClass, COMPONENT__CONSTRAINTS);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__BENDPOINTS);
		createEAttribute(connectionEClass, CONNECTION__ROUTER_KIND);
		createEReference(connectionEClass, CONNECTION__SOURCE);
		createEReference(connectionEClass, CONNECTION__TARGET);
		createEAttribute(connectionEClass, CONNECTION__KIND);
		createEAttribute(connectionEClass, CONNECTION__LABEL);
		createEReference(connectionEClass, CONNECTION__STATE_SCHEMA);

		stateSchemaEClass = createEClass(STATE_SCHEMA);
		createEReference(stateSchemaEClass, STATE_SCHEMA__COMPONENTS);
		createEReference(stateSchemaEClass, STATE_SCHEMA__CONNNECTIONS);

		stateComponentEClass = createEClass(STATE_COMPONENT);
		createEReference(stateComponentEClass, STATE_COMPONENT__INCOMINGS);
		createEReference(stateComponentEClass, STATE_COMPONENT__OUTGOINGS);
		createEAttribute(stateComponentEClass, STATE_COMPONENT__NAME);

		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__MAINBOARD);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEOperation(deviceEClass, DEVICE___GET_PINS);
		createEOperation(deviceEClass, DEVICE___GET_PIN_CONNECTEDS);
		createEOperation(deviceEClass, DEVICE___MODIFY_PIN__PIN);

		ioDeviceEClass = createEClass(IO_DEVICE);

		inputDeviceEClass = createEClass(INPUT_DEVICE);

		outputDeviceEClass = createEClass(OUTPUT_DEVICE);

		connectivityEClass = createEClass(CONNECTIVITY);

		mainboardEClass = createEClass(MAINBOARD);
		createEReference(mainboardEClass, MAINBOARD__DEVICES);
		createEAttribute(mainboardEClass, MAINBOARD__NAME);
		createEOperation(mainboardEClass, MAINBOARD___ADD_DEVICE__DEVICE);
		createEOperation(mainboardEClass, MAINBOARD___REMOVE_DEVICE__DEVICE);
		createEOperation(mainboardEClass, MAINBOARD___GET_PINS);
		createEOperation(mainboardEClass, MAINBOARD___GET_PIN_CONNECTEDS);
		createEOperation(mainboardEClass, MAINBOARD___MODIFY_PIN__PIN);
		createEOperation(mainboardEClass, MAINBOARD___FIND_PIN__PIN);

		arduinoUNOR3EClass = createEClass(ARDUINO_UNOR3);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN0);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN1);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN2);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN3);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN4);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN5);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN6);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN7);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN8);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN9);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN10);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN11);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN12);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN13);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A0);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A1);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A2);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A3);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A4);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A5);

		keypad4x4EClass = createEClass(KEYPAD4X4);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__KEYS);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__ROWS);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__COLS);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN1);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN2);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN3);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN4);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN5);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN6);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN7);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN8);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON1);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON2);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON3);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON4);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON5);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON6);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON7);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON8);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON9);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON0);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_A);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_B);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_C);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_D);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_HASH);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_ASTERISK);
		createEOperation(keypad4x4EClass, KEYPAD4X4___GET_BUTTON__STRING);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__PIN1);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__PIN1);
		createEAttribute(ledEClass, LED__PIN2);

		i2CLCDEClass = createEClass(I2CLCD);
		createEAttribute(i2CLCDEClass, I2CLCD__PIN_GND);
		createEAttribute(i2CLCDEClass, I2CLCD__PIN_VCC);
		createEAttribute(i2CLCDEClass, I2CLCD__PIN_SDA);
		createEAttribute(i2CLCDEClass, I2CLCD__PIN_SCL);
		createEAttribute(i2CLCDEClass, I2CLCD__TYPE);

		buzzerEClass = createEClass(BUZZER);
		createEAttribute(buzzerEClass, BUZZER__PIN1);
		createEAttribute(buzzerEClass, BUZZER__PIN2);
		createEAttribute(buzzerEClass, BUZZER__TONE);
		createEAttribute(buzzerEClass, BUZZER__TIME);

		bluetoothHC06EClass = createEClass(BLUETOOTH_HC06);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_TXD);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_RXD);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_GND);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_VCC);

		wifiESP8266EClass = createEClass(WIFI_ESP8266);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_TX);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_RX);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_VCC);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_GND);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_CHPD);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__SSID_ST);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PASSWORD_ST);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__MODE);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__ID_CONNECTION);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PASSWORD_ACCESS_POINT);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__SSID_ACCESS_POINT);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PORT);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__IP);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__BAUD);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__CONNECTED_CHANNEL);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PROTOCOL);

		stateFrameEClass = createEClass(STATE_FRAME);
		createEAttribute(stateFrameEClass, STATE_FRAME__CONTENT);

		decisionEClass = createEClass(DECISION);

		startPointEClass = createEClass(START_POINT);

		endPointEClass = createEClass(END_POINT);

		// Create enums
		connectionKindEEnum = createEEnum(CONNECTION_KIND);
		routerKindEEnum = createEEnum(ROUTER_KIND);
		wifiModeEEnum = createEEnum(WIFI_MODE);
		wifiIDConnectionEEnum = createEEnum(WIFI_ID_CONNECTION);
		listBaudEEnum = createEEnum(LIST_BAUD);
		listConnectionChannelEEnum = createEEnum(LIST_CONNECTION_CHANNEL);
		listProtocolEEnum = createEEnum(LIST_PROTOCOL);
		i2CLCDTypeEEnum = createEEnum(I2CLCD_TYPE);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
		pinEDataType = createEDataType(PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateComponentEClass.getESuperTypes().add(this.getComponent());
		deviceEClass.getESuperTypes().add(this.getComponent());
		ioDeviceEClass.getESuperTypes().add(this.getDevice());
		inputDeviceEClass.getESuperTypes().add(this.getIODevice());
		outputDeviceEClass.getESuperTypes().add(this.getIODevice());
		connectivityEClass.getESuperTypes().add(this.getDevice());
		arduinoUNOR3EClass.getESuperTypes().add(this.getMainboard());
		keypad4x4EClass.getESuperTypes().add(this.getInputDevice());
		buttonEClass.getESuperTypes().add(this.getInputDevice());
		ledEClass.getESuperTypes().add(this.getOutputDevice());
		i2CLCDEClass.getESuperTypes().add(this.getOutputDevice());
		buzzerEClass.getESuperTypes().add(this.getOutputDevice());
		bluetoothHC06EClass.getESuperTypes().add(this.getConnectivity());
		wifiESP8266EClass.getESuperTypes().add(this.getConnectivity());
		stateFrameEClass.getESuperTypes().add(this.getStateComponent());
		decisionEClass.getESuperTypes().add(this.getStateComponent());
		startPointEClass.getESuperTypes().add(this.getStateComponent());
		endPointEClass.getESuperTypes().add(this.getStateComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Id(), ecorePackage.getEString(), "id", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Constraints(), this.getRectangle(), "constraints", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_RouterKind(), this.getRouterKind(), "routerKind", "Bendpoint", 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Source(), this.getComponent(), null, "source", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Target(), this.getComponent(), null, "target", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Kind(), this.getConnectionKind(), "kind", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Label(), ecorePackage.getEString(), "label", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_StateSchema(), this.getStateSchema(), this.getStateSchema_Connnections(), "stateSchema", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateSchemaEClass, StateSchema.class, "StateSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateSchema_Components(), this.getStateComponent(), null, "components", null, 0, -1, StateSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSchema_Connnections(), this.getConnection(), this.getConnection_StateSchema(), "connnections", null, 0, -1, StateSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateComponentEClass, StateComponent.class, "StateComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateComponent_Incomings(), this.getConnection(), null, "incomings", null, 0, -1, StateComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateComponent_Outgoings(), this.getConnection(), null, "outgoings", null, 0, -1, StateComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_Mainboard(), this.getMainboard(), this.getMainboard_Devices(), "mainboard", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDevice__GetPins(), this.getPin(), "getPins", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDevice__GetPinConnecteds(), this.getPin(), "getPinConnecteds", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDevice__ModifyPin__Pin(), null, "modifyPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPin(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ioDeviceEClass, IODevice.class, "IODevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputDeviceEClass, InputDevice.class, "InputDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputDeviceEClass, OutputDevice.class, "OutputDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectivityEClass, Connectivity.class, "Connectivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainboardEClass, Mainboard.class, "Mainboard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainboard_Devices(), this.getDevice(), this.getDevice_Mainboard(), "devices", null, 0, -1, Mainboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainboard_Name(), ecorePackage.getEString(), "name", "", 0, 1, Mainboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMainboard__AddDevice__Device(), null, "addDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "device", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__RemoveDevice__Device(), null, "removeDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "device", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMainboard__GetPins(), this.getPin(), "getPins", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMainboard__GetPinConnecteds(), this.getPin(), "getPinConnecteds", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__ModifyPin__Pin(), null, "modifyPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPin(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__FindPin__Pin(), this.getPin(), "findPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPin(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduinoUNOR3EClass, ArduinoUNOR3.class, "ArduinoUNOR3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArduinoUNOR3_Pin0(), this.getPin(), "pin0", "0,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin1(), this.getPin(), "pin1", "1,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin2(), this.getPin(), "pin2", "2,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin3(), this.getPin(), "pin3", "3,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin4(), this.getPin(), "pin4", "4,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin5(), this.getPin(), "pin5", "5,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin6(), this.getPin(), "pin6", "6,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin7(), this.getPin(), "pin7", "7,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin8(), this.getPin(), "pin8", "8,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin9(), this.getPin(), "pin9", "9,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin10(), this.getPin(), "pin10", "10,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin11(), this.getPin(), "pin11", "11,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin12(), this.getPin(), "pin12", "12,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin13(), this.getPin(), "pin13", "13,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA0(), this.getPin(), "pinA0", "A0,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA1(), this.getPin(), "pinA1", "A1,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA2(), this.getPin(), "pinA2", "A2,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA3(), this.getPin(), "pinA3", "A3,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA4(), this.getPin(), "pinA4", "A4,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA5(), this.getPin(), "pinA5", "A5,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keypad4x4EClass, Keypad4x4.class, "Keypad4x4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeypad4x4_Keys(), ecorePackage.getEString(), "keys", "{\'1\',\'2\',\'3\',\'A\'},{\'4\',\'5\',\'6\',\'B\'},{\'7\',\'8\',\'9\',\'C\'},{\'*\',\'0\',\'#\',\'D\'}", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Rows(), ecorePackage.getEInt(), "rows", "4", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Cols(), ecorePackage.getEInt(), "cols", "4", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin1(), this.getPin(), "pin1", "R1,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin2(), this.getPin(), "pin2", "R2,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin3(), this.getPin(), "pin3", "R3,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin4(), this.getPin(), "pin4", "R4,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin5(), this.getPin(), "pin5", "C1,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin6(), this.getPin(), "pin6", "C2,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin7(), this.getPin(), "pin7", "C3,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin8(), this.getPin(), "pin8", "C4,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton1(), ecorePackage.getEString(), "nameButton1", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton2(), ecorePackage.getEString(), "nameButton2", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton3(), ecorePackage.getEString(), "nameButton3", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton4(), ecorePackage.getEString(), "nameButton4", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton5(), ecorePackage.getEString(), "nameButton5", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton6(), ecorePackage.getEString(), "nameButton6", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton7(), ecorePackage.getEString(), "nameButton7", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton8(), ecorePackage.getEString(), "nameButton8", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton9(), ecorePackage.getEString(), "nameButton9", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton0(), ecorePackage.getEString(), "nameButton0", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonA(), ecorePackage.getEString(), "nameButtonA", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonB(), ecorePackage.getEString(), "nameButtonB", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonC(), ecorePackage.getEString(), "nameButtonC", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonD(), ecorePackage.getEString(), "nameButtonD", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonHash(), ecorePackage.getEString(), "nameButtonHash", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonAsterisk(), ecorePackage.getEString(), "nameButtonAsterisk", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getKeypad4x4__GetButton__String(), ecorePackage.getEString(), "getButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Pin1(), this.getPin(), "pin1", "1,IO", 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, iotwearable.model.iotw.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLED_Pin1(), this.getPin(), "pin1", "1,Passive", 0, 1, iotwearable.model.iotw.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLED_Pin2(), this.getPin(), "pin2", "2,Passive", 0, 1, iotwearable.model.iotw.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i2CLCDEClass, iotwearable.model.iotw.I2CLCD.class, "I2CLCD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI2CLCD_PinGND(), this.getPin(), "pinGND", "GND,IO", 0, 1, iotwearable.model.iotw.I2CLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2CLCD_PinVcc(), this.getPin(), "pinVcc", "Vcc,IO", 0, 1, iotwearable.model.iotw.I2CLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2CLCD_PinSDA(), this.getPin(), "pinSDA", "SDA,IO", 0, 1, iotwearable.model.iotw.I2CLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2CLCD_PinSCL(), this.getPin(), "pinSCL", "SCL,IO", 0, 1, iotwearable.model.iotw.I2CLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2CLCD_Type(), this.getI2CLCDType(), "type", "I2CLCD2004", 0, 1, iotwearable.model.iotw.I2CLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buzzerEClass, Buzzer.class, "Buzzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuzzer_Pin1(), this.getPin(), "pin1", "1,Passive", 0, 1, Buzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuzzer_Pin2(), this.getPin(), "pin2", "2,Passive", 0, 1, Buzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuzzer_Tone(), ecorePackage.getEInt(), "Tone", null, 0, 1, Buzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuzzer_Time(), ecorePackage.getEInt(), "Time", null, 0, 1, Buzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bluetoothHC06EClass, BluetoothHC06.class, "BluetoothHC06", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBluetoothHC06_PinTXD(), this.getPin(), "pinTXD", "TXD,IO", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothHC06_PinRXD(), this.getPin(), "pinRXD", "RXD,IO", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothHC06_PinGND(), this.getPin(), "pinGND", "GND,Power", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothHC06_PinVCC(), this.getPin(), "pinVCC", "VCC,Power", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wifiESP8266EClass, WifiESP8266.class, "WifiESP8266", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWifiESP8266_PinTX(), this.getPin(), "pinTX", "TX,IO", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinRX(), this.getPin(), "pinRX", "RX,IO", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinVcc(), this.getPin(), "pinVcc", "Vcc,Power", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinGND(), this.getPin(), "pinGND", "GND,Power", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinCHPD(), this.getPin(), "pinCHPD", "CHPD,Power", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_SSID_ST(), ecorePackage.getEString(), "sSID_ST", "IotWearable", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Password_ST(), ecorePackage.getEString(), "password_ST", "IotWearable", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Mode(), this.getWifiMode(), "mode", "Both", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_IdConnection(), this.getWifiIDConnection(), "idConnection", "id_0", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Password_AccessPoint(), ecorePackage.getEString(), "password_AccessPoint", null, 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_SSID_AccessPoint(), ecorePackage.getEString(), "sSID_AccessPoint", null, 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Port(), ecorePackage.getEInt(), "port", "80", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_IP(), ecorePackage.getEString(), "iP", "192.168.4.1", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Baud(), this.getListBaud(), "baud", "baud_9600", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_ConnectedChannel(), this.getListConnectionChannel(), "connectedChannel", "Multiple", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Protocol(), this.getListProtocol(), "protocol", "UDP", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateFrameEClass, StateFrame.class, "StateFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateFrame_Content(), ecorePackage.getEString(), "content", null, 0, 1, StateFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startPointEClass, StartPoint.class, "StartPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(connectionKindEEnum, ConnectionKind.class, "ConnectionKind");
		addEEnumLiteral(connectionKindEEnum, ConnectionKind.STATE_FLOW);
		addEEnumLiteral(connectionKindEEnum, ConnectionKind.OUTSIDE_FLOW);

		initEEnum(routerKindEEnum, RouterKind.class, "RouterKind");
		addEEnumLiteral(routerKindEEnum, RouterKind.BENDPOINT);
		addEEnumLiteral(routerKindEEnum, RouterKind.MANHATTAN);

		initEEnum(wifiModeEEnum, WifiMode.class, "WifiMode");
		addEEnumLiteral(wifiModeEEnum, WifiMode.STATION);
		addEEnumLiteral(wifiModeEEnum, WifiMode.ACCESS_POINT);
		addEEnumLiteral(wifiModeEEnum, WifiMode.BOTH);

		initEEnum(wifiIDConnectionEEnum, WifiIDConnection.class, "WifiIDConnection");
		addEEnumLiteral(wifiIDConnectionEEnum, WifiIDConnection.ID_0);
		addEEnumLiteral(wifiIDConnectionEEnum, WifiIDConnection.ID_1);
		addEEnumLiteral(wifiIDConnectionEEnum, WifiIDConnection.ID_2);
		addEEnumLiteral(wifiIDConnectionEEnum, WifiIDConnection.ID_3);
		addEEnumLiteral(wifiIDConnectionEEnum, WifiIDConnection.ID_4);

		initEEnum(listBaudEEnum, ListBaud.class, "ListBaud");
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_9600);
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_19200);
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_38400);
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_57600);
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_74880);
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_115200);
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_230400);
		addEEnumLiteral(listBaudEEnum, ListBaud.BAUD_250000);

		initEEnum(listConnectionChannelEEnum, ListConnectionChannel.class, "ListConnectionChannel");
		addEEnumLiteral(listConnectionChannelEEnum, ListConnectionChannel.SINGLE);
		addEEnumLiteral(listConnectionChannelEEnum, ListConnectionChannel.MULTIPLE);

		initEEnum(listProtocolEEnum, ListProtocol.class, "ListProtocol");
		addEEnumLiteral(listProtocolEEnum, ListProtocol.TCP);
		addEEnumLiteral(listProtocolEEnum, ListProtocol.UDP);

		initEEnum(i2CLCDTypeEEnum, I2CLCDType.class, "I2CLCDType");
		addEEnumLiteral(i2CLCDTypeEEnum, I2CLCDType.I2CLCD2004);
		addEEnumLiteral(i2CLCDTypeEEnum, I2CLCDType.I2CLCD1602);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pinEDataType, Pin.class, "Pin", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IotwPackageImpl
