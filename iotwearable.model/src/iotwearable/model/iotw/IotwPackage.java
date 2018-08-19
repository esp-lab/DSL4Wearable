/**
 */
package iotwearable.model.iotw;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iotwearable.model.iotw.IotwFactory
 * @model kind="package"
 * @generated
 */
public interface IotwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iotw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iotwearable/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iotw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotwPackage eINSTANCE = iotwearable.model.iotw.impl.IotwPackageImpl.init();

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ComponentImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.MainboardImpl <em>Mainboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.MainboardImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getMainboard()
	 * @generated
	 */
	int MAINBOARD = 9;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ConnectionImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 1;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StateSchemaImpl <em>State Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StateSchemaImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateSchema()
	 * @generated
	 */
	int STATE_SCHEMA = 2;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.DeviceImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 4;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.IODeviceImpl <em>IO Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.IODeviceImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getIODevice()
	 * @generated
	 */
	int IO_DEVICE = 5;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.InputDeviceImpl <em>Input Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.InputDeviceImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getInputDevice()
	 * @generated
	 */
	int INPUT_DEVICE = 6;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.OutputDeviceImpl <em>Output Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.OutputDeviceImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getOutputDevice()
	 * @generated
	 */
	int OUTPUT_DEVICE = 7;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ConnectivityImpl <em>Connectivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ConnectivityImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectivity()
	 * @generated
	 */
	int CONNECTIVITY = 8;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl <em>Arduino UNOR3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ArduinoUNOR3Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getArduinoUNOR3()
	 * @generated
	 */
	int ARDUINO_UNOR3 = 10;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BENDPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Router Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ROUTER_KIND = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__KIND = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LABEL = 5;

	/**
	 * The feature id for the '<em><b>State Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STATE_SCHEMA = 6;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Connnections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA__CONNNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>State Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StateComponentImpl <em>State Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StateComponentImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateComponent()
	 * @generated
	 */
	int STATE_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMPONENT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMPONENT__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMPONENT__INCOMINGS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMPONENT__OUTGOINGS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMPONENT__NAME = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MAINBOARD = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_PINS = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_PIN_CONNECTEDS = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___MODIFY_PIN__PIN = COMPONENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE__CONSTRAINTS = DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE__MAINBOARD = DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE__NAME = DEVICE__NAME;

	/**
	 * The number of structural features of the '<em>IO Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE___GET_PINS = DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE___GET_PIN_CONNECTEDS = DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE___MODIFY_PIN__PIN = DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>IO Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DEVICE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__ID = IO_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__CONSTRAINTS = IO_DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__MAINBOARD = IO_DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__NAME = IO_DEVICE__NAME;

	/**
	 * The number of structural features of the '<em>Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE_FEATURE_COUNT = IO_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE___GET_PINS = IO_DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE___GET_PIN_CONNECTEDS = IO_DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE___MODIFY_PIN__PIN = IO_DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE_OPERATION_COUNT = IO_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE__ID = IO_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE__CONSTRAINTS = IO_DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE__MAINBOARD = IO_DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE__NAME = IO_DEVICE__NAME;

	/**
	 * The number of structural features of the '<em>Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE_FEATURE_COUNT = IO_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE___GET_PINS = IO_DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE___GET_PIN_CONNECTEDS = IO_DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE___MODIFY_PIN__PIN = IO_DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE_OPERATION_COUNT = IO_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__CONSTRAINTS = DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__MAINBOARD = DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__NAME = DEVICE__NAME;

	/**
	 * The number of structural features of the '<em>Connectivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY___GET_PINS = DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY___GET_PIN_CONNECTEDS = DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY___MODIFY_PIN__PIN = DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Connectivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD__DEVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Mainboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___ADD_DEVICE__DEVICE = 0;

	/**
	 * The operation id for the '<em>Remove Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___REMOVE_DEVICE__DEVICE = 1;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_PINS = 2;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_PIN_CONNECTEDS = 3;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___MODIFY_PIN__PIN = 4;

	/**
	 * The operation id for the '<em>Find Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___FIND_PIN__PIN = 5;

	/**
	 * The number of operations of the '<em>Mainboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__DEVICES = MAINBOARD__DEVICES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__NAME = MAINBOARD__NAME;

	/**
	 * The feature id for the '<em><b>Pin0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN0 = MAINBOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN1 = MAINBOARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN2 = MAINBOARD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN3 = MAINBOARD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pin4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN4 = MAINBOARD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pin5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN5 = MAINBOARD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pin6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN6 = MAINBOARD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pin7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN7 = MAINBOARD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pin8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN8 = MAINBOARD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pin9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN9 = MAINBOARD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pin10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN10 = MAINBOARD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pin11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN11 = MAINBOARD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pin12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN12 = MAINBOARD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pin13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN13 = MAINBOARD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pin A0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A0 = MAINBOARD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pin A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A1 = MAINBOARD_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pin A2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A2 = MAINBOARD_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pin A3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A3 = MAINBOARD_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pin A4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A4 = MAINBOARD_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pin A5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A5 = MAINBOARD_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Arduino UNOR3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3_FEATURE_COUNT = MAINBOARD_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>Add Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___ADD_DEVICE__DEVICE = MAINBOARD___ADD_DEVICE__DEVICE;

	/**
	 * The operation id for the '<em>Remove Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___REMOVE_DEVICE__DEVICE = MAINBOARD___REMOVE_DEVICE__DEVICE;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___GET_PINS = MAINBOARD___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___GET_PIN_CONNECTEDS = MAINBOARD___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___MODIFY_PIN__PIN = MAINBOARD___MODIFY_PIN__PIN;

	/**
	 * The operation id for the '<em>Find Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___FIND_PIN__PIN = MAINBOARD___FIND_PIN__PIN;

	/**
	 * The number of operations of the '<em>Arduino UNOR3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3_OPERATION_COUNT = MAINBOARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.Keypad4x4Impl <em>Keypad4x4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.Keypad4x4Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getKeypad4x4()
	 * @generated
	 */
	int KEYPAD4X4 = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__ID = INPUT_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__CONSTRAINTS = INPUT_DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__MAINBOARD = INPUT_DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME = INPUT_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__KEYS = INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__ROWS = INPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__COLS = INPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN1 = INPUT_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN2 = INPUT_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pin3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN3 = INPUT_DEVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pin4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN4 = INPUT_DEVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pin5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN5 = INPUT_DEVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pin6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN6 = INPUT_DEVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pin7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN7 = INPUT_DEVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pin8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN8 = INPUT_DEVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Name Button1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON1 = INPUT_DEVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Name Button2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON2 = INPUT_DEVICE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name Button3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON3 = INPUT_DEVICE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Name Button4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON4 = INPUT_DEVICE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Name Button5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON5 = INPUT_DEVICE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Name Button6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON6 = INPUT_DEVICE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Name Button7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON7 = INPUT_DEVICE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Name Button8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON8 = INPUT_DEVICE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Name Button9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON9 = INPUT_DEVICE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Name Button0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON0 = INPUT_DEVICE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Name Button A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_A = INPUT_DEVICE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Name Button B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_B = INPUT_DEVICE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Name Button C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_C = INPUT_DEVICE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Name Button D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_D = INPUT_DEVICE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Name Button Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_HASH = INPUT_DEVICE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Name Button Asterisk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_ASTERISK = INPUT_DEVICE_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Keypad4x4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4_FEATURE_COUNT = INPUT_DEVICE_FEATURE_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___GET_PINS = INPUT_DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___GET_PIN_CONNECTEDS = INPUT_DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___MODIFY_PIN__PIN = INPUT_DEVICE___MODIFY_PIN__PIN;

	/**
	 * The operation id for the '<em>Get Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___GET_BUTTON__STRING = INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Keypad4x4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4_OPERATION_COUNT = INPUT_DEVICE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.LEDImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getLED()
	 * @generated
	 */
	int LED = 13;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StateFrameImpl <em>State Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StateFrameImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateFrame()
	 * @generated
	 */
	int STATE_FRAME = 18;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.DecisionImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 19;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StartPointImpl <em>Start Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StartPointImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStartPoint()
	 * @generated
	 */
	int START_POINT = 20;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.EndPointImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 21;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.RouterKind <em>Router Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.RouterKind
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRouterKind()
	 * @generated
	 */
	int ROUTER_KIND = 23;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.WifiMode <em>Wifi Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.WifiMode
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiMode()
	 * @generated
	 */
	int WIFI_MODE = 24;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.WifiIDConnection <em>Wifi ID Connection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.WifiIDConnection
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiIDConnection()
	 * @generated
	 */
	int WIFI_ID_CONNECTION = 25;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.ListBaud <em>List Baud</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.ListBaud
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getListBaud()
	 * @generated
	 */
	int LIST_BAUD = 26;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.ListConnectionChannel <em>List Connection Channel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.ListConnectionChannel
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getListConnectionChannel()
	 * @generated
	 */
	int LIST_CONNECTION_CHANNEL = 27;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.ListProtocol <em>List Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.ListProtocol
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getListProtocol()
	 * @generated
	 */
	int LIST_PROTOCOL = 28;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.I2CLCDType <em>I2CLCD Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.I2CLCDType
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getI2CLCDType()
	 * @generated
	 */
	int I2CLCD_TYPE = 29;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.BuzzerImpl <em>Buzzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.BuzzerImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBuzzer()
	 * @generated
	 */
	int BUZZER = 15;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ButtonImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 12;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.BluetoothHC06Impl <em>Bluetooth HC06</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.BluetoothHC06Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBluetoothHC06()
	 * @generated
	 */
	int BLUETOOTH_HC06 = 16;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.WifiESP8266Impl <em>Wifi ESP8266</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.WifiESP8266Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiESP8266()
	 * @generated
	 */
	int WIFI_ESP8266 = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = INPUT_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONSTRAINTS = INPUT_DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MAINBOARD = INPUT_DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = INPUT_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PIN1 = INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = INPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___GET_PINS = INPUT_DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___GET_PIN_CONNECTEDS = INPUT_DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___MODIFY_PIN__PIN = INPUT_DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__ID = OUTPUT_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__CONSTRAINTS = OUTPUT_DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__MAINBOARD = OUTPUT_DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = OUTPUT_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN1 = OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN2 = OUTPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = OUTPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED___GET_PINS = OUTPUT_DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED___GET_PIN_CONNECTEDS = OUTPUT_DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED___MODIFY_PIN__PIN = OUTPUT_DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.I2CLCDImpl <em>I2CLCD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.I2CLCDImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getI2CLCD()
	 * @generated
	 */
	int I2CLCD = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__ID = OUTPUT_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__CONSTRAINTS = OUTPUT_DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__MAINBOARD = OUTPUT_DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__NAME = OUTPUT_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Pin GND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__PIN_GND = OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Vcc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__PIN_VCC = OUTPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin SDA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__PIN_SDA = OUTPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin SCL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__PIN_SCL = OUTPUT_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD__TYPE = OUTPUT_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>I2CLCD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD_FEATURE_COUNT = OUTPUT_DEVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD___GET_PINS = OUTPUT_DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD___GET_PIN_CONNECTEDS = OUTPUT_DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD___MODIFY_PIN__PIN = OUTPUT_DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>I2CLCD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD_OPERATION_COUNT = OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__ID = OUTPUT_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__CONSTRAINTS = OUTPUT_DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__MAINBOARD = OUTPUT_DEVICE__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__NAME = OUTPUT_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__PIN1 = OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__PIN2 = OUTPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__TONE = OUTPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__TIME = OUTPUT_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_FEATURE_COUNT = OUTPUT_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER___GET_PINS = OUTPUT_DEVICE___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER___GET_PIN_CONNECTEDS = OUTPUT_DEVICE___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER___MODIFY_PIN__PIN = OUTPUT_DEVICE___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_OPERATION_COUNT = OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__ID = CONNECTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__CONSTRAINTS = CONNECTIVITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__MAINBOARD = CONNECTIVITY__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__NAME = CONNECTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Pin TXD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_TXD = CONNECTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin RXD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_RXD = CONNECTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin GND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_GND = CONNECTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin VCC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_VCC = CONNECTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bluetooth HC06</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06_FEATURE_COUNT = CONNECTIVITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06___GET_PINS = CONNECTIVITY___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06___GET_PIN_CONNECTEDS = CONNECTIVITY___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06___MODIFY_PIN__PIN = CONNECTIVITY___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Bluetooth HC06</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06_OPERATION_COUNT = CONNECTIVITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__ID = CONNECTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__CONSTRAINTS = CONNECTIVITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__MAINBOARD = CONNECTIVITY__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__NAME = CONNECTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Pin TX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_TX = CONNECTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin RX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_RX = CONNECTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin Vcc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_VCC = CONNECTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin GND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_GND = CONNECTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pin CHPD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_CHPD = CONNECTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>SSID ST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__SSID_ST = CONNECTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Password ST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PASSWORD_ST = CONNECTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__MODE = CONNECTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Id Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__ID_CONNECTION = CONNECTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Password Access Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PASSWORD_ACCESS_POINT = CONNECTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>SSID Access Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__SSID_ACCESS_POINT = CONNECTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PORT = CONNECTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__IP = CONNECTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Baud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__BAUD = CONNECTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connected Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__CONNECTED_CHANNEL = CONNECTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PROTOCOL = CONNECTIVITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Wifi ESP8266</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266_FEATURE_COUNT = CONNECTIVITY_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266___GET_PINS = CONNECTIVITY___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266___GET_PIN_CONNECTEDS = CONNECTIVITY___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266___MODIFY_PIN__PIN = CONNECTIVITY___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Wifi ESP8266</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266_OPERATION_COUNT = CONNECTIVITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__ID = STATE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__CONSTRAINTS = STATE_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__INCOMINGS = STATE_COMPONENT__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__OUTGOINGS = STATE_COMPONENT__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__NAME = STATE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__CONTENT = STATE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME_FEATURE_COUNT = STATE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME_OPERATION_COUNT = STATE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ID = STATE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CONSTRAINTS = STATE_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INCOMINGS = STATE_COMPONENT__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTGOINGS = STATE_COMPONENT__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = STATE_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = STATE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = STATE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__ID = STATE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__CONSTRAINTS = STATE_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__INCOMINGS = STATE_COMPONENT__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__OUTGOINGS = STATE_COMPONENT__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__NAME = STATE_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Start Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT_FEATURE_COUNT = STATE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT_OPERATION_COUNT = STATE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ID = STATE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__CONSTRAINTS = STATE_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__INCOMINGS = STATE_COMPONENT__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__OUTGOINGS = STATE_COMPONENT__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NAME = STATE_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = STATE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_OPERATION_COUNT = STATE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.ConnectionKind <em>Connection Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.ConnectionKind
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectionKind()
	 * @generated
	 */
	int CONNECTION_KIND = 22;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 30;


	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 31;


	/**
	 * The meta object id for the '<em>Pin</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.Pin
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 32;


	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see iotwearable.model.iotw.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iotwearable.model.iotw.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Component#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see iotwearable.model.iotw.Component#getConstraints()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Constraints();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Mainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainboard</em>'.
	 * @see iotwearable.model.iotw.Mainboard
	 * @generated
	 */
	EClass getMainboard();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.Mainboard#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see iotwearable.model.iotw.Mainboard#getDevices()
	 * @see #getMainboard()
	 * @generated
	 */
	EReference getMainboard_Devices();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Mainboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotwearable.model.iotw.Mainboard#getName()
	 * @see #getMainboard()
	 * @generated
	 */
	EAttribute getMainboard_Name();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#addDevice(iotwearable.model.iotw.Device) <em>Add Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Device</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#addDevice(iotwearable.model.iotw.Device)
	 * @generated
	 */
	EOperation getMainboard__AddDevice__Device();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#removeDevice(iotwearable.model.iotw.Device) <em>Remove Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Device</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#removeDevice(iotwearable.model.iotw.Device)
	 * @generated
	 */
	EOperation getMainboard__RemoveDevice__Device();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#getPins() <em>Get Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pins</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#getPins()
	 * @generated
	 */
	EOperation getMainboard__GetPins();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#getPinConnecteds() <em>Get Pin Connecteds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pin Connecteds</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#getPinConnecteds()
	 * @generated
	 */
	EOperation getMainboard__GetPinConnecteds();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#modifyPin(iotwearable.model.iotw.Pin) <em>Modify Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Pin</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#modifyPin(iotwearable.model.iotw.Pin)
	 * @generated
	 */
	EOperation getMainboard__ModifyPin__Pin();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#findPin(iotwearable.model.iotw.Pin) <em>Find Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Pin</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#findPin(iotwearable.model.iotw.Pin)
	 * @generated
	 */
	EOperation getMainboard__FindPin__Pin();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.ArduinoUNOR3 <em>Arduino UNOR3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino UNOR3</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3
	 * @generated
	 */
	EClass getArduinoUNOR3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin0 <em>Pin0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin0</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin0()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin0();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin1()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin2()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin3 <em>Pin3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin3</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin3()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin4 <em>Pin4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin4</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin4()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin5 <em>Pin5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin5</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin5()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin5();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin6 <em>Pin6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin6</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin6()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin6();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin7 <em>Pin7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin7</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin7()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin7();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin8 <em>Pin8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin8</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin8()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin8();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin9 <em>Pin9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin9</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin9()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin9();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin10 <em>Pin10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin10</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin10()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin10();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin11 <em>Pin11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin11</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin11()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin11();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin12 <em>Pin12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin12</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin12()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin12();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin13 <em>Pin13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin13</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin13()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin13();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA0 <em>Pin A0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A0</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA0()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA0();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA1 <em>Pin A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A1</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA1()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA2 <em>Pin A2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A2</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA2()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA3 <em>Pin A3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A3</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA3()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA4 <em>Pin A4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A4</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA4()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA5 <em>Pin A5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A5</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA5()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA5();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see iotwearable.model.iotw.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute list '{@link iotwearable.model.iotw.Connection#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see iotwearable.model.iotw.Connection#getBendpoints()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Connection#getRouterKind <em>Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router Kind</em>'.
	 * @see iotwearable.model.iotw.Connection#getRouterKind()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_RouterKind();

	/**
	 * Returns the meta object for the reference '{@link iotwearable.model.iotw.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see iotwearable.model.iotw.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link iotwearable.model.iotw.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see iotwearable.model.iotw.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Connection#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see iotwearable.model.iotw.Connection#getKind()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Kind();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Connection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see iotwearable.model.iotw.Connection#getLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Label();

	/**
	 * Returns the meta object for the container reference '{@link iotwearable.model.iotw.Connection#getStateSchema <em>State Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Schema</em>'.
	 * @see iotwearable.model.iotw.Connection#getStateSchema()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_StateSchema();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StateSchema <em>State Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Schema</em>'.
	 * @see iotwearable.model.iotw.StateSchema
	 * @generated
	 */
	EClass getStateSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.StateSchema#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see iotwearable.model.iotw.StateSchema#getComponents()
	 * @see #getStateSchema()
	 * @generated
	 */
	EReference getStateSchema_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.StateSchema#getConnnections <em>Connnections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connnections</em>'.
	 * @see iotwearable.model.iotw.StateSchema#getConnnections()
	 * @see #getStateSchema()
	 * @generated
	 */
	EReference getStateSchema_Connnections();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StateComponent <em>State Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Component</em>'.
	 * @see iotwearable.model.iotw.StateComponent
	 * @generated
	 */
	EClass getStateComponent();

	/**
	 * Returns the meta object for the reference list '{@link iotwearable.model.iotw.StateComponent#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomings</em>'.
	 * @see iotwearable.model.iotw.StateComponent#getIncomings()
	 * @see #getStateComponent()
	 * @generated
	 */
	EReference getStateComponent_Incomings();

	/**
	 * Returns the meta object for the reference list '{@link iotwearable.model.iotw.StateComponent#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoings</em>'.
	 * @see iotwearable.model.iotw.StateComponent#getOutgoings()
	 * @see #getStateComponent()
	 * @generated
	 */
	EReference getStateComponent_Outgoings();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.StateComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotwearable.model.iotw.StateComponent#getName()
	 * @see #getStateComponent()
	 * @generated
	 */
	EAttribute getStateComponent_Name();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see iotwearable.model.iotw.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the container reference '{@link iotwearable.model.iotw.Device#getMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mainboard</em>'.
	 * @see iotwearable.model.iotw.Device#getMainboard()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Mainboard();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotwearable.model.iotw.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Device#getPins() <em>Get Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pins</em>' operation.
	 * @see iotwearable.model.iotw.Device#getPins()
	 * @generated
	 */
	EOperation getDevice__GetPins();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Device#getPinConnecteds() <em>Get Pin Connecteds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pin Connecteds</em>' operation.
	 * @see iotwearable.model.iotw.Device#getPinConnecteds()
	 * @generated
	 */
	EOperation getDevice__GetPinConnecteds();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Device#modifyPin(iotwearable.model.iotw.Pin) <em>Modify Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Pin</em>' operation.
	 * @see iotwearable.model.iotw.Device#modifyPin(iotwearable.model.iotw.Pin)
	 * @generated
	 */
	EOperation getDevice__ModifyPin__Pin();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.IODevice <em>IO Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Device</em>'.
	 * @see iotwearable.model.iotw.IODevice
	 * @generated
	 */
	EClass getIODevice();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.InputDevice <em>Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Device</em>'.
	 * @see iotwearable.model.iotw.InputDevice
	 * @generated
	 */
	EClass getInputDevice();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.OutputDevice <em>Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Device</em>'.
	 * @see iotwearable.model.iotw.OutputDevice
	 * @generated
	 */
	EClass getOutputDevice();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Connectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity</em>'.
	 * @see iotwearable.model.iotw.Connectivity
	 * @generated
	 */
	EClass getConnectivity();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Keypad4x4 <em>Keypad4x4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keypad4x4</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4
	 * @generated
	 */
	EClass getKeypad4x4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getKeys()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Keys();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getRows()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Rows();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getCols()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Cols();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin1()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin2()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin3 <em>Pin3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin3</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin3()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin4 <em>Pin4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin4</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin4()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin5 <em>Pin5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin5</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin5()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin5();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin6 <em>Pin6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin6</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin6()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin6();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin7 <em>Pin7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin7</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin7()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin7();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin8 <em>Pin8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin8</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin8()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin8();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton1 <em>Name Button1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button1</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton1()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton2 <em>Name Button2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button2</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton2()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton3 <em>Name Button3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button3</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton3()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton4 <em>Name Button4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button4</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton4()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton5 <em>Name Button5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button5</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton5()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton5();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton6 <em>Name Button6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button6</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton6()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton6();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton7 <em>Name Button7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button7</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton7()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton7();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton8 <em>Name Button8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button8</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton8()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton8();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton9 <em>Name Button9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button9</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton9()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton9();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton0 <em>Name Button0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button0</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton0()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton0();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonA <em>Name Button A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button A</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonA()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonA();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonB <em>Name Button B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button B</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonB()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonB();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonC <em>Name Button C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button C</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonC()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonC();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonD <em>Name Button D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button D</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonD()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonHash <em>Name Button Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button Hash</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonHash()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonHash();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonAsterisk <em>Name Button Asterisk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button Asterisk</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonAsterisk()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonAsterisk();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Keypad4x4#getButton(java.lang.String) <em>Get Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Button</em>' operation.
	 * @see iotwearable.model.iotw.Keypad4x4#getButton(java.lang.String)
	 * @generated
	 */
	EOperation getKeypad4x4__GetButton__String();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see iotwearable.model.iotw.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.LED#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.LED#getPin1()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.LED#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.LED#getPin2()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Pin2();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.I2CLCD <em>I2CLCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2CLCD</em>'.
	 * @see iotwearable.model.iotw.I2CLCD
	 * @generated
	 */
	EClass getI2CLCD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD#getPinGND <em>Pin GND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin GND</em>'.
	 * @see iotwearable.model.iotw.I2CLCD#getPinGND()
	 * @see #getI2CLCD()
	 * @generated
	 */
	EAttribute getI2CLCD_PinGND();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD#getPinVcc <em>Pin Vcc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Vcc</em>'.
	 * @see iotwearable.model.iotw.I2CLCD#getPinVcc()
	 * @see #getI2CLCD()
	 * @generated
	 */
	EAttribute getI2CLCD_PinVcc();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD#getPinSDA <em>Pin SDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin SDA</em>'.
	 * @see iotwearable.model.iotw.I2CLCD#getPinSDA()
	 * @see #getI2CLCD()
	 * @generated
	 */
	EAttribute getI2CLCD_PinSDA();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD#getPinSCL <em>Pin SCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin SCL</em>'.
	 * @see iotwearable.model.iotw.I2CLCD#getPinSCL()
	 * @see #getI2CLCD()
	 * @generated
	 */
	EAttribute getI2CLCD_PinSCL();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iotwearable.model.iotw.I2CLCD#getType()
	 * @see #getI2CLCD()
	 * @generated
	 */
	EAttribute getI2CLCD_Type();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StateFrame <em>State Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Frame</em>'.
	 * @see iotwearable.model.iotw.StateFrame
	 * @generated
	 */
	EClass getStateFrame();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.StateFrame#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see iotwearable.model.iotw.StateFrame#getContent()
	 * @see #getStateFrame()
	 * @generated
	 */
	EAttribute getStateFrame_Content();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see iotwearable.model.iotw.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Point</em>'.
	 * @see iotwearable.model.iotw.StartPoint
	 * @generated
	 */
	EClass getStartPoint();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see iotwearable.model.iotw.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.BluetoothHC06 <em>Bluetooth HC06</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth HC06</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06
	 * @generated
	 */
	EClass getBluetoothHC06();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinTXD <em>Pin TXD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin TXD</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinTXD()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinTXD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinRXD <em>Pin RXD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin RXD</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinRXD()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinRXD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinGND <em>Pin GND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin GND</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinGND()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinGND();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinVCC <em>Pin VCC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin VCC</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinVCC()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinVCC();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.WifiESP8266 <em>Wifi ESP8266</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wifi ESP8266</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266
	 * @generated
	 */
	EClass getWifiESP8266();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinTX <em>Pin TX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin TX</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinTX()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinTX();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinRX <em>Pin RX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin RX</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinRX()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinRX();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinVcc <em>Pin Vcc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Vcc</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinVcc()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinVcc();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinGND <em>Pin GND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin GND</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinGND()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinGND();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinCHPD <em>Pin CHPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin CHPD</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinCHPD()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinCHPD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getSSID_ST <em>SSID ST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSID ST</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getSSID_ST()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_SSID_ST();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPassword_ST <em>Password ST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password ST</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPassword_ST()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Password_ST();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getMode()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Mode();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getIdConnection <em>Id Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Connection</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getIdConnection()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_IdConnection();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPassword_AccessPoint <em>Password Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Access Point</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPassword_AccessPoint()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Password_AccessPoint();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getSSID_AccessPoint <em>SSID Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSID Access Point</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getSSID_AccessPoint()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_SSID_AccessPoint();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPort()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Port();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getIP()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_IP();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getBaud <em>Baud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getBaud()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Baud();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getConnectedChannel <em>Connected Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected Channel</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getConnectedChannel()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_ConnectedChannel();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getProtocol()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Protocol();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see iotwearable.model.iotw.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Button#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.Button#getPin1()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Pin1();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.ConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Kind</em>'.
	 * @see iotwearable.model.iotw.ConnectionKind
	 * @generated
	 */
	EEnum getConnectionKind();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.RouterKind <em>Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Router Kind</em>'.
	 * @see iotwearable.model.iotw.RouterKind
	 * @generated
	 */
	EEnum getRouterKind();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.WifiMode <em>Wifi Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wifi Mode</em>'.
	 * @see iotwearable.model.iotw.WifiMode
	 * @generated
	 */
	EEnum getWifiMode();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.WifiIDConnection <em>Wifi ID Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wifi ID Connection</em>'.
	 * @see iotwearable.model.iotw.WifiIDConnection
	 * @generated
	 */
	EEnum getWifiIDConnection();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.ListBaud <em>List Baud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Baud</em>'.
	 * @see iotwearable.model.iotw.ListBaud
	 * @generated
	 */
	EEnum getListBaud();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.ListConnectionChannel <em>List Connection Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Connection Channel</em>'.
	 * @see iotwearable.model.iotw.ListConnectionChannel
	 * @generated
	 */
	EEnum getListConnectionChannel();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.ListProtocol <em>List Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Protocol</em>'.
	 * @see iotwearable.model.iotw.ListProtocol
	 * @generated
	 */
	EEnum getListProtocol();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.I2CLCDType <em>I2CLCD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>I2CLCD Type</em>'.
	 * @see iotwearable.model.iotw.I2CLCDType
	 * @generated
	 */
	EEnum getI2CLCDType();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Buzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzzer</em>'.
	 * @see iotwearable.model.iotw.Buzzer
	 * @generated
	 */
	EClass getBuzzer();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Buzzer#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.Buzzer#getPin1()
	 * @see #getBuzzer()
	 * @generated
	 */
	EAttribute getBuzzer_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Buzzer#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.Buzzer#getPin2()
	 * @see #getBuzzer()
	 * @generated
	 */
	EAttribute getBuzzer_Pin2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Buzzer#getTone <em>Tone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tone</em>'.
	 * @see iotwearable.model.iotw.Buzzer#getTone()
	 * @see #getBuzzer()
	 * @generated
	 */
	EAttribute getBuzzer_Tone();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Buzzer#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see iotwearable.model.iotw.Buzzer#getTime()
	 * @see #getBuzzer()
	 * @generated
	 */
	EAttribute getBuzzer_Time();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the meta object for data type '{@link iotwearable.model.iotw.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pin</em>'.
	 * @see iotwearable.model.iotw.Pin
	 * @model instanceClass="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	EDataType getPin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotwFactory getIotwFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ComponentImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CONSTRAINTS = eINSTANCE.getComponent_Constraints();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.MainboardImpl <em>Mainboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.MainboardImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getMainboard()
		 * @generated
		 */
		EClass MAINBOARD = eINSTANCE.getMainboard();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINBOARD__DEVICES = eINSTANCE.getMainboard_Devices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINBOARD__NAME = eINSTANCE.getMainboard_Name();

		/**
		 * The meta object literal for the '<em><b>Add Device</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___ADD_DEVICE__DEVICE = eINSTANCE.getMainboard__AddDevice__Device();

		/**
		 * The meta object literal for the '<em><b>Remove Device</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___REMOVE_DEVICE__DEVICE = eINSTANCE.getMainboard__RemoveDevice__Device();

		/**
		 * The meta object literal for the '<em><b>Get Pins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___GET_PINS = eINSTANCE.getMainboard__GetPins();

		/**
		 * The meta object literal for the '<em><b>Get Pin Connecteds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___GET_PIN_CONNECTEDS = eINSTANCE.getMainboard__GetPinConnecteds();

		/**
		 * The meta object literal for the '<em><b>Modify Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___MODIFY_PIN__PIN = eINSTANCE.getMainboard__ModifyPin__Pin();

		/**
		 * The meta object literal for the '<em><b>Find Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___FIND_PIN__PIN = eINSTANCE.getMainboard__FindPin__Pin();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl <em>Arduino UNOR3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ArduinoUNOR3Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getArduinoUNOR3()
		 * @generated
		 */
		EClass ARDUINO_UNOR3 = eINSTANCE.getArduinoUNOR3();

		/**
		 * The meta object literal for the '<em><b>Pin0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN0 = eINSTANCE.getArduinoUNOR3_Pin0();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN1 = eINSTANCE.getArduinoUNOR3_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN2 = eINSTANCE.getArduinoUNOR3_Pin2();

		/**
		 * The meta object literal for the '<em><b>Pin3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN3 = eINSTANCE.getArduinoUNOR3_Pin3();

		/**
		 * The meta object literal for the '<em><b>Pin4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN4 = eINSTANCE.getArduinoUNOR3_Pin4();

		/**
		 * The meta object literal for the '<em><b>Pin5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN5 = eINSTANCE.getArduinoUNOR3_Pin5();

		/**
		 * The meta object literal for the '<em><b>Pin6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN6 = eINSTANCE.getArduinoUNOR3_Pin6();

		/**
		 * The meta object literal for the '<em><b>Pin7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN7 = eINSTANCE.getArduinoUNOR3_Pin7();

		/**
		 * The meta object literal for the '<em><b>Pin8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN8 = eINSTANCE.getArduinoUNOR3_Pin8();

		/**
		 * The meta object literal for the '<em><b>Pin9</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN9 = eINSTANCE.getArduinoUNOR3_Pin9();

		/**
		 * The meta object literal for the '<em><b>Pin10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN10 = eINSTANCE.getArduinoUNOR3_Pin10();

		/**
		 * The meta object literal for the '<em><b>Pin11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN11 = eINSTANCE.getArduinoUNOR3_Pin11();

		/**
		 * The meta object literal for the '<em><b>Pin12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN12 = eINSTANCE.getArduinoUNOR3_Pin12();

		/**
		 * The meta object literal for the '<em><b>Pin13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN13 = eINSTANCE.getArduinoUNOR3_Pin13();

		/**
		 * The meta object literal for the '<em><b>Pin A0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A0 = eINSTANCE.getArduinoUNOR3_PinA0();

		/**
		 * The meta object literal for the '<em><b>Pin A1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A1 = eINSTANCE.getArduinoUNOR3_PinA1();

		/**
		 * The meta object literal for the '<em><b>Pin A2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A2 = eINSTANCE.getArduinoUNOR3_PinA2();

		/**
		 * The meta object literal for the '<em><b>Pin A3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A3 = eINSTANCE.getArduinoUNOR3_PinA3();

		/**
		 * The meta object literal for the '<em><b>Pin A4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A4 = eINSTANCE.getArduinoUNOR3_PinA4();

		/**
		 * The meta object literal for the '<em><b>Pin A5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A5 = eINSTANCE.getArduinoUNOR3_PinA5();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ConnectionImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__BENDPOINTS = eINSTANCE.getConnection_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Router Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ROUTER_KIND = eINSTANCE.getConnection_RouterKind();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__KIND = eINSTANCE.getConnection_Kind();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__LABEL = eINSTANCE.getConnection_Label();

		/**
		 * The meta object literal for the '<em><b>State Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__STATE_SCHEMA = eINSTANCE.getConnection_StateSchema();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StateSchemaImpl <em>State Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StateSchemaImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateSchema()
		 * @generated
		 */
		EClass STATE_SCHEMA = eINSTANCE.getStateSchema();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SCHEMA__COMPONENTS = eINSTANCE.getStateSchema_Components();

		/**
		 * The meta object literal for the '<em><b>Connnections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SCHEMA__CONNNECTIONS = eINSTANCE.getStateSchema_Connnections();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StateComponentImpl <em>State Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StateComponentImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateComponent()
		 * @generated
		 */
		EClass STATE_COMPONENT = eINSTANCE.getStateComponent();

		/**
		 * The meta object literal for the '<em><b>Incomings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_COMPONENT__INCOMINGS = eINSTANCE.getStateComponent_Incomings();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_COMPONENT__OUTGOINGS = eINSTANCE.getStateComponent_Outgoings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_COMPONENT__NAME = eINSTANCE.getStateComponent_Name();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.DeviceImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Mainboard</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__MAINBOARD = eINSTANCE.getDevice_Mainboard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Get Pins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE___GET_PINS = eINSTANCE.getDevice__GetPins();

		/**
		 * The meta object literal for the '<em><b>Get Pin Connecteds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE___GET_PIN_CONNECTEDS = eINSTANCE.getDevice__GetPinConnecteds();

		/**
		 * The meta object literal for the '<em><b>Modify Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE___MODIFY_PIN__PIN = eINSTANCE.getDevice__ModifyPin__Pin();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.IODeviceImpl <em>IO Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.IODeviceImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getIODevice()
		 * @generated
		 */
		EClass IO_DEVICE = eINSTANCE.getIODevice();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.InputDeviceImpl <em>Input Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.InputDeviceImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getInputDevice()
		 * @generated
		 */
		EClass INPUT_DEVICE = eINSTANCE.getInputDevice();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.OutputDeviceImpl <em>Output Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.OutputDeviceImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getOutputDevice()
		 * @generated
		 */
		EClass OUTPUT_DEVICE = eINSTANCE.getOutputDevice();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ConnectivityImpl <em>Connectivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ConnectivityImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectivity()
		 * @generated
		 */
		EClass CONNECTIVITY = eINSTANCE.getConnectivity();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.Keypad4x4Impl <em>Keypad4x4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.Keypad4x4Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getKeypad4x4()
		 * @generated
		 */
		EClass KEYPAD4X4 = eINSTANCE.getKeypad4x4();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__KEYS = eINSTANCE.getKeypad4x4_Keys();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__ROWS = eINSTANCE.getKeypad4x4_Rows();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__COLS = eINSTANCE.getKeypad4x4_Cols();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN1 = eINSTANCE.getKeypad4x4_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN2 = eINSTANCE.getKeypad4x4_Pin2();

		/**
		 * The meta object literal for the '<em><b>Pin3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN3 = eINSTANCE.getKeypad4x4_Pin3();

		/**
		 * The meta object literal for the '<em><b>Pin4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN4 = eINSTANCE.getKeypad4x4_Pin4();

		/**
		 * The meta object literal for the '<em><b>Pin5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN5 = eINSTANCE.getKeypad4x4_Pin5();

		/**
		 * The meta object literal for the '<em><b>Pin6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN6 = eINSTANCE.getKeypad4x4_Pin6();

		/**
		 * The meta object literal for the '<em><b>Pin7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN7 = eINSTANCE.getKeypad4x4_Pin7();

		/**
		 * The meta object literal for the '<em><b>Pin8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN8 = eINSTANCE.getKeypad4x4_Pin8();

		/**
		 * The meta object literal for the '<em><b>Name Button1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON1 = eINSTANCE.getKeypad4x4_NameButton1();

		/**
		 * The meta object literal for the '<em><b>Name Button2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON2 = eINSTANCE.getKeypad4x4_NameButton2();

		/**
		 * The meta object literal for the '<em><b>Name Button3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON3 = eINSTANCE.getKeypad4x4_NameButton3();

		/**
		 * The meta object literal for the '<em><b>Name Button4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON4 = eINSTANCE.getKeypad4x4_NameButton4();

		/**
		 * The meta object literal for the '<em><b>Name Button5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON5 = eINSTANCE.getKeypad4x4_NameButton5();

		/**
		 * The meta object literal for the '<em><b>Name Button6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON6 = eINSTANCE.getKeypad4x4_NameButton6();

		/**
		 * The meta object literal for the '<em><b>Name Button7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON7 = eINSTANCE.getKeypad4x4_NameButton7();

		/**
		 * The meta object literal for the '<em><b>Name Button8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON8 = eINSTANCE.getKeypad4x4_NameButton8();

		/**
		 * The meta object literal for the '<em><b>Name Button9</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON9 = eINSTANCE.getKeypad4x4_NameButton9();

		/**
		 * The meta object literal for the '<em><b>Name Button0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON0 = eINSTANCE.getKeypad4x4_NameButton0();

		/**
		 * The meta object literal for the '<em><b>Name Button A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_A = eINSTANCE.getKeypad4x4_NameButtonA();

		/**
		 * The meta object literal for the '<em><b>Name Button B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_B = eINSTANCE.getKeypad4x4_NameButtonB();

		/**
		 * The meta object literal for the '<em><b>Name Button C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_C = eINSTANCE.getKeypad4x4_NameButtonC();

		/**
		 * The meta object literal for the '<em><b>Name Button D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_D = eINSTANCE.getKeypad4x4_NameButtonD();

		/**
		 * The meta object literal for the '<em><b>Name Button Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_HASH = eINSTANCE.getKeypad4x4_NameButtonHash();

		/**
		 * The meta object literal for the '<em><b>Name Button Asterisk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_ASTERISK = eINSTANCE.getKeypad4x4_NameButtonAsterisk();

		/**
		 * The meta object literal for the '<em><b>Get Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEYPAD4X4___GET_BUTTON__STRING = eINSTANCE.getKeypad4x4__GetButton__String();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.LEDImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__PIN1 = eINSTANCE.getLED_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__PIN2 = eINSTANCE.getLED_Pin2();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.I2CLCDImpl <em>I2CLCD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.I2CLCDImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getI2CLCD()
		 * @generated
		 */
		EClass I2CLCD = eINSTANCE.getI2CLCD();

		/**
		 * The meta object literal for the '<em><b>Pin GND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD__PIN_GND = eINSTANCE.getI2CLCD_PinGND();

		/**
		 * The meta object literal for the '<em><b>Pin Vcc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD__PIN_VCC = eINSTANCE.getI2CLCD_PinVcc();

		/**
		 * The meta object literal for the '<em><b>Pin SDA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD__PIN_SDA = eINSTANCE.getI2CLCD_PinSDA();

		/**
		 * The meta object literal for the '<em><b>Pin SCL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD__PIN_SCL = eINSTANCE.getI2CLCD_PinSCL();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD__TYPE = eINSTANCE.getI2CLCD_Type();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StateFrameImpl <em>State Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StateFrameImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateFrame()
		 * @generated
		 */
		EClass STATE_FRAME = eINSTANCE.getStateFrame();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_FRAME__CONTENT = eINSTANCE.getStateFrame_Content();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.DecisionImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StartPointImpl <em>Start Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StartPointImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStartPoint()
		 * @generated
		 */
		EClass START_POINT = eINSTANCE.getStartPoint();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.EndPointImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.BluetoothHC06Impl <em>Bluetooth HC06</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.BluetoothHC06Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBluetoothHC06()
		 * @generated
		 */
		EClass BLUETOOTH_HC06 = eINSTANCE.getBluetoothHC06();

		/**
		 * The meta object literal for the '<em><b>Pin TXD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_TXD = eINSTANCE.getBluetoothHC06_PinTXD();

		/**
		 * The meta object literal for the '<em><b>Pin RXD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_RXD = eINSTANCE.getBluetoothHC06_PinRXD();

		/**
		 * The meta object literal for the '<em><b>Pin GND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_GND = eINSTANCE.getBluetoothHC06_PinGND();

		/**
		 * The meta object literal for the '<em><b>Pin VCC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_VCC = eINSTANCE.getBluetoothHC06_PinVCC();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.WifiESP8266Impl <em>Wifi ESP8266</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.WifiESP8266Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiESP8266()
		 * @generated
		 */
		EClass WIFI_ESP8266 = eINSTANCE.getWifiESP8266();

		/**
		 * The meta object literal for the '<em><b>Pin TX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_TX = eINSTANCE.getWifiESP8266_PinTX();

		/**
		 * The meta object literal for the '<em><b>Pin RX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_RX = eINSTANCE.getWifiESP8266_PinRX();

		/**
		 * The meta object literal for the '<em><b>Pin Vcc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_VCC = eINSTANCE.getWifiESP8266_PinVcc();

		/**
		 * The meta object literal for the '<em><b>Pin GND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_GND = eINSTANCE.getWifiESP8266_PinGND();

		/**
		 * The meta object literal for the '<em><b>Pin CHPD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_CHPD = eINSTANCE.getWifiESP8266_PinCHPD();

		/**
		 * The meta object literal for the '<em><b>SSID ST</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__SSID_ST = eINSTANCE.getWifiESP8266_SSID_ST();

		/**
		 * The meta object literal for the '<em><b>Password ST</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PASSWORD_ST = eINSTANCE.getWifiESP8266_Password_ST();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__MODE = eINSTANCE.getWifiESP8266_Mode();

		/**
		 * The meta object literal for the '<em><b>Id Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__ID_CONNECTION = eINSTANCE.getWifiESP8266_IdConnection();

		/**
		 * The meta object literal for the '<em><b>Password Access Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PASSWORD_ACCESS_POINT = eINSTANCE.getWifiESP8266_Password_AccessPoint();

		/**
		 * The meta object literal for the '<em><b>SSID Access Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__SSID_ACCESS_POINT = eINSTANCE.getWifiESP8266_SSID_AccessPoint();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PORT = eINSTANCE.getWifiESP8266_Port();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__IP = eINSTANCE.getWifiESP8266_IP();

		/**
		 * The meta object literal for the '<em><b>Baud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__BAUD = eINSTANCE.getWifiESP8266_Baud();

		/**
		 * The meta object literal for the '<em><b>Connected Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__CONNECTED_CHANNEL = eINSTANCE.getWifiESP8266_ConnectedChannel();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PROTOCOL = eINSTANCE.getWifiESP8266_Protocol();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ButtonImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__PIN1 = eINSTANCE.getButton_Pin1();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.ConnectionKind <em>Connection Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.ConnectionKind
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectionKind()
		 * @generated
		 */
		EEnum CONNECTION_KIND = eINSTANCE.getConnectionKind();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.RouterKind <em>Router Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.RouterKind
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRouterKind()
		 * @generated
		 */
		EEnum ROUTER_KIND = eINSTANCE.getRouterKind();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.WifiMode <em>Wifi Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.WifiMode
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiMode()
		 * @generated
		 */
		EEnum WIFI_MODE = eINSTANCE.getWifiMode();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.WifiIDConnection <em>Wifi ID Connection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.WifiIDConnection
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiIDConnection()
		 * @generated
		 */
		EEnum WIFI_ID_CONNECTION = eINSTANCE.getWifiIDConnection();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.ListBaud <em>List Baud</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.ListBaud
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getListBaud()
		 * @generated
		 */
		EEnum LIST_BAUD = eINSTANCE.getListBaud();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.ListConnectionChannel <em>List Connection Channel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.ListConnectionChannel
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getListConnectionChannel()
		 * @generated
		 */
		EEnum LIST_CONNECTION_CHANNEL = eINSTANCE.getListConnectionChannel();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.ListProtocol <em>List Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.ListProtocol
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getListProtocol()
		 * @generated
		 */
		EEnum LIST_PROTOCOL = eINSTANCE.getListProtocol();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.I2CLCDType <em>I2CLCD Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.I2CLCDType
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getI2CLCDType()
		 * @generated
		 */
		EEnum I2CLCD_TYPE = eINSTANCE.getI2CLCDType();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.BuzzerImpl <em>Buzzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.BuzzerImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBuzzer()
		 * @generated
		 */
		EClass BUZZER = eINSTANCE.getBuzzer();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZER__PIN1 = eINSTANCE.getBuzzer_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZER__PIN2 = eINSTANCE.getBuzzer_Pin2();

		/**
		 * The meta object literal for the '<em><b>Tone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZER__TONE = eINSTANCE.getBuzzer_Tone();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZER__TIME = eINSTANCE.getBuzzer_Time();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Pin</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.Pin
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPin()
		 * @generated
		 */
		EDataType PIN = eINSTANCE.getPin();

	}

} //IotwPackage
