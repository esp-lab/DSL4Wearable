/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Button#getPin1 <em>Pin1</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends InputDevice {
	/**
	 * Returns the value of the '<em><b>Pin1</b></em>' attribute.
	 * The default value is <code>"1,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin1</em>' attribute.
	 * @see #setPin1(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getButton_Pin1()
	 * @model default="1,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin1();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Button#getPin1 <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin1</em>' attribute.
	 * @see #getPin1()
	 * @generated
	 */
	void setPin1(Pin value);

} // Button
