/**
 */
package iotwearable.model.iotw;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mainboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Mainboard#getDevices <em>Devices</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Mainboard#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getMainboard()
 * @model abstract="true"
 * @generated
 */
public interface Mainboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link iotwearable.model.iotw.Device}.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.Device#getMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see iotwearable.model.iotw.IotwPackage#getMainboard_Devices()
	 * @see iotwearable.model.iotw.Device#getMainboard
	 * @model opposite="mainboard" containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iotwearable.model.iotw.IotwPackage#getMainboard_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Mainboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDevice(Device device);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDevice(Device device);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	EList<Pin> getPinConnecteds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinDataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	void modifyPin(Pin pin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="iotwearable.model.iotw.Pin" pinDataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin findPin(Pin pin);

} // Mainboard
