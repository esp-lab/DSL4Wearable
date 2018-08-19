/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.LED#getPin1 <em>Pin1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.LED#getPin2 <em>Pin2</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getLED()
 * @model
 * @generated
 */
public interface LED extends OutputDevice {

	/**
	 * Returns the value of the '<em><b>Pin1</b></em>' attribute.
	 * The default value is <code>"1,Passive"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin1</em>' attribute.
	 * @see #setPin1(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getLED_Pin1()
	 * @model default="1,Passive" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin1();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.LED#getPin1 <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin1</em>' attribute.
	 * @see #getPin1()
	 * @generated
	 */
	void setPin1(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin2</b></em>' attribute.
	 * The default value is <code>"2,Passive"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin2</em>' attribute.
	 * @see #setPin2(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getLED_Pin2()
	 * @model default="2,Passive" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin2();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.LED#getPin2 <em>Pin2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin2</em>' attribute.
	 * @see #getPin2()
	 * @generated
	 */
	void setPin2(Pin value);
} // LED
