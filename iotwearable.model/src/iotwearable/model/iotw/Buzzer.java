/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buzzer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Buzzer#getPin1 <em>Pin1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Buzzer#getPin2 <em>Pin2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Buzzer#getTone <em>Tone</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Buzzer#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getBuzzer()
 * @model
 * @generated
 */
public interface Buzzer extends OutputDevice {
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
	 * @see iotwearable.model.iotw.IotwPackage#getBuzzer_Pin1()
	 * @model default="1,Passive" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin1();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Buzzer#getPin1 <em>Pin1</em>}' attribute.
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
	 * @see iotwearable.model.iotw.IotwPackage#getBuzzer_Pin2()
	 * @model default="2,Passive" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin2();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Buzzer#getPin2 <em>Pin2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin2</em>' attribute.
	 * @see #getPin2()
	 * @generated
	 */
	void setPin2(Pin value);

	/**
	 * Returns the value of the '<em><b>Tone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tone</em>' attribute.
	 * @see #setTone(int)
	 * @see iotwearable.model.iotw.IotwPackage#getBuzzer_Tone()
	 * @model
	 * @generated
	 */
	int getTone();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Buzzer#getTone <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tone</em>' attribute.
	 * @see #getTone()
	 * @generated
	 */
	void setTone(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see iotwearable.model.iotw.IotwPackage#getBuzzer_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Buzzer#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // Buzzer
