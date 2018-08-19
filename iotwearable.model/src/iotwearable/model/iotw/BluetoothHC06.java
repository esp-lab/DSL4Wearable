/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth HC06</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.BluetoothHC06#getPinTXD <em>Pin TXD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.BluetoothHC06#getPinRXD <em>Pin RXD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.BluetoothHC06#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.BluetoothHC06#getPinVCC <em>Pin VCC</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getBluetoothHC06()
 * @model
 * @generated
 */
public interface BluetoothHC06 extends Connectivity {
	/**
	 * Returns the value of the '<em><b>Pin TXD</b></em>' attribute.
	 * The default value is <code>"TXD,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin TXD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin TXD</em>' attribute.
	 * @see #setPinTXD(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getBluetoothHC06_PinTXD()
	 * @model default="TXD,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinTXD();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.BluetoothHC06#getPinTXD <em>Pin TXD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin TXD</em>' attribute.
	 * @see #getPinTXD()
	 * @generated
	 */
	void setPinTXD(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin RXD</b></em>' attribute.
	 * The default value is <code>"RXD,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin RXD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin RXD</em>' attribute.
	 * @see #setPinRXD(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getBluetoothHC06_PinRXD()
	 * @model default="RXD,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinRXD();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.BluetoothHC06#getPinRXD <em>Pin RXD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin RXD</em>' attribute.
	 * @see #getPinRXD()
	 * @generated
	 */
	void setPinRXD(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin GND</b></em>' attribute.
	 * The default value is <code>"GND,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin GND</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin GND</em>' attribute.
	 * @see #setPinGND(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getBluetoothHC06_PinGND()
	 * @model default="GND,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinGND();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.BluetoothHC06#getPinGND <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin GND</em>' attribute.
	 * @see #getPinGND()
	 * @generated
	 */
	void setPinGND(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin VCC</b></em>' attribute.
	 * The default value is <code>"VCC,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin VCC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin VCC</em>' attribute.
	 * @see #setPinVCC(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getBluetoothHC06_PinVCC()
	 * @model default="VCC,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinVCC();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.BluetoothHC06#getPinVCC <em>Pin VCC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin VCC</em>' attribute.
	 * @see #getPinVCC()
	 * @generated
	 */
	void setPinVCC(Pin value);

} // BluetoothHC06
