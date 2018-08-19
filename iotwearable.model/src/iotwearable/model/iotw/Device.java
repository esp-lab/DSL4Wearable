/**
 */
package iotwearable.model.iotw;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Device#getMainboard <em>Mainboard</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Device#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getDevice()
 * @model abstract="true"
 * @generated
 */
public interface Device extends Component {
	/**
	 * Returns the value of the '<em><b>Mainboard</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.Mainboard#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainboard</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainboard</em>' container reference.
	 * @see #setMainboard(Mainboard)
	 * @see iotwearable.model.iotw.IotwPackage#getDevice_Mainboard()
	 * @see iotwearable.model.iotw.Mainboard#getDevices
	 * @model opposite="devices" transient="false"
	 * @generated
	 */
	Mainboard getMainboard();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Device#getMainboard <em>Mainboard</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainboard</em>' container reference.
	 * @see #getMainboard()
	 * @generated
	 */
	void setMainboard(Mainboard value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iotwearable.model.iotw.IotwPackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Device#getName <em>Name</em>}' attribute.
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

} // Device
