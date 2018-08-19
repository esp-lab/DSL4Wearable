/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I2CLCD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.I2CLCD#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.I2CLCD#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.I2CLCD#getPinSDA <em>Pin SDA</em>}</li>
 *   <li>{@link iotwearable.model.iotw.I2CLCD#getPinSCL <em>Pin SCL</em>}</li>
 *   <li>{@link iotwearable.model.iotw.I2CLCD#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getI2CLCD()
 * @model
 * @generated
 */
public interface I2CLCD extends OutputDevice {
	/**
	 * Returns the value of the '<em><b>Pin GND</b></em>' attribute.
	 * The default value is <code>"GND,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin GND</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin GND</em>' attribute.
	 * @see #setPinGND(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getI2CLCD_PinGND()
	 * @model default="GND,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinGND();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.I2CLCD#getPinGND <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin GND</em>' attribute.
	 * @see #getPinGND()
	 * @generated
	 */
	void setPinGND(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin Vcc</b></em>' attribute.
	 * The default value is <code>"Vcc,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Vcc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Vcc</em>' attribute.
	 * @see #setPinVcc(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getI2CLCD_PinVcc()
	 * @model default="Vcc,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinVcc();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.I2CLCD#getPinVcc <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Vcc</em>' attribute.
	 * @see #getPinVcc()
	 * @generated
	 */
	void setPinVcc(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin SDA</b></em>' attribute.
	 * The default value is <code>"SDA,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin SDA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin SDA</em>' attribute.
	 * @see #setPinSDA(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getI2CLCD_PinSDA()
	 * @model default="SDA,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinSDA();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.I2CLCD#getPinSDA <em>Pin SDA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin SDA</em>' attribute.
	 * @see #getPinSDA()
	 * @generated
	 */
	void setPinSDA(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin SCL</b></em>' attribute.
	 * The default value is <code>"SCL,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin SCL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin SCL</em>' attribute.
	 * @see #setPinSCL(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getI2CLCD_PinSCL()
	 * @model default="SCL,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinSCL();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.I2CLCD#getPinSCL <em>Pin SCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin SCL</em>' attribute.
	 * @see #getPinSCL()
	 * @generated
	 */
	void setPinSCL(Pin value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"I2CLCD2004"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.I2CLCDType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iotwearable.model.iotw.I2CLCDType
	 * @see #setType(I2CLCDType)
	 * @see iotwearable.model.iotw.IotwPackage#getI2CLCD_Type()
	 * @model default="I2CLCD2004"
	 * @generated
	 */
	I2CLCDType getType();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.I2CLCD#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iotwearable.model.iotw.I2CLCDType
	 * @see #getType()
	 * @generated
	 */
	void setType(I2CLCDType value);

} // I2CLCD
