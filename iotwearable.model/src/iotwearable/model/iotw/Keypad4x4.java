/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keypad4x4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getKeys <em>Keys</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getRows <em>Rows</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getCols <em>Cols</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin1 <em>Pin1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin2 <em>Pin2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin3 <em>Pin3</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin4 <em>Pin4</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin5 <em>Pin5</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin6 <em>Pin6</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin7 <em>Pin7</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getPin8 <em>Pin8</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton1 <em>Name Button1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton2 <em>Name Button2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton3 <em>Name Button3</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton4 <em>Name Button4</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton5 <em>Name Button5</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton6 <em>Name Button6</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton7 <em>Name Button7</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton8 <em>Name Button8</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton9 <em>Name Button9</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButton0 <em>Name Button0</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButtonA <em>Name Button A</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButtonB <em>Name Button B</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButtonC <em>Name Button C</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButtonD <em>Name Button D</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButtonHash <em>Name Button Hash</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getNameButtonAsterisk <em>Name Button Asterisk</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4()
 * @model
 * @generated
 */
public interface Keypad4x4 extends InputDevice {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute.
	 * The default value is <code>"{\'1\',\'2\',\'3\',\'A\'},{\'4\',\'5\',\'6\',\'B\'},{\'7\',\'8\',\'9\',\'C\'},{\'*\',\'0\',\'#\',\'D\'}"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute.
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Keys()
	 * @model default="{\'1\',\'2\',\'3\',\'A\'},{\'4\',\'5\',\'6\',\'B\'},{\'7\',\'8\',\'9\',\'C\'},{\'*\',\'0\',\'#\',\'D\'}" changeable="false"
	 * @generated
	 */
	String getKeys();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Rows()
	 * @model default="4" changeable="false"
	 * @generated
	 */
	int getRows();

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' attribute.
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Cols()
	 * @model default="4" changeable="false"
	 * @generated
	 */
	int getCols();

	/**
	 * Returns the value of the '<em><b>Pin1</b></em>' attribute.
	 * The default value is <code>"R1,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin1</em>' attribute.
	 * @see #setPin1(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin1()
	 * @model default="R1,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin1();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin1 <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin1</em>' attribute.
	 * @see #getPin1()
	 * @generated
	 */
	void setPin1(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin2</b></em>' attribute.
	 * The default value is <code>"R2,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin2</em>' attribute.
	 * @see #setPin2(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin2()
	 * @model default="R2,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin2();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin2 <em>Pin2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin2</em>' attribute.
	 * @see #getPin2()
	 * @generated
	 */
	void setPin2(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin3</b></em>' attribute.
	 * The default value is <code>"R3,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin3</em>' attribute.
	 * @see #setPin3(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin3()
	 * @model default="R3,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin3();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin3 <em>Pin3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin3</em>' attribute.
	 * @see #getPin3()
	 * @generated
	 */
	void setPin3(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin4</b></em>' attribute.
	 * The default value is <code>"R4,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin4</em>' attribute.
	 * @see #setPin4(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin4()
	 * @model default="R4,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin4();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin4 <em>Pin4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin4</em>' attribute.
	 * @see #getPin4()
	 * @generated
	 */
	void setPin4(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin5</b></em>' attribute.
	 * The default value is <code>"C1,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin5</em>' attribute.
	 * @see #setPin5(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin5()
	 * @model default="C1,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin5();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin5 <em>Pin5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin5</em>' attribute.
	 * @see #getPin5()
	 * @generated
	 */
	void setPin5(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin6</b></em>' attribute.
	 * The default value is <code>"C2,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin6</em>' attribute.
	 * @see #setPin6(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin6()
	 * @model default="C2,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin6();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin6 <em>Pin6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin6</em>' attribute.
	 * @see #getPin6()
	 * @generated
	 */
	void setPin6(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin7</b></em>' attribute.
	 * The default value is <code>"C3,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin7</em>' attribute.
	 * @see #setPin7(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin7()
	 * @model default="C3,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin7();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin7 <em>Pin7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin7</em>' attribute.
	 * @see #getPin7()
	 * @generated
	 */
	void setPin7(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin8</b></em>' attribute.
	 * The default value is <code>"C4,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin8</em>' attribute.
	 * @see #setPin8(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_Pin8()
	 * @model default="C4,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPin8();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getPin8 <em>Pin8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin8</em>' attribute.
	 * @see #getPin8()
	 * @generated
	 */
	void setPin8(Pin value);

	/**
	 * Returns the value of the '<em><b>Name Button1</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button1</em>' attribute.
	 * @see #setNameButton1(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton1()
	 * @model default=""
	 * @generated
	 */
	String getNameButton1();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton1 <em>Name Button1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button1</em>' attribute.
	 * @see #getNameButton1()
	 * @generated
	 */
	void setNameButton1(String value);

	/**
	 * Returns the value of the '<em><b>Name Button2</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button2</em>' attribute.
	 * @see #setNameButton2(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton2()
	 * @model default=""
	 * @generated
	 */
	String getNameButton2();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton2 <em>Name Button2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button2</em>' attribute.
	 * @see #getNameButton2()
	 * @generated
	 */
	void setNameButton2(String value);

	/**
	 * Returns the value of the '<em><b>Name Button3</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button3</em>' attribute.
	 * @see #setNameButton3(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton3()
	 * @model default=""
	 * @generated
	 */
	String getNameButton3();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton3 <em>Name Button3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button3</em>' attribute.
	 * @see #getNameButton3()
	 * @generated
	 */
	void setNameButton3(String value);

	/**
	 * Returns the value of the '<em><b>Name Button4</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button4</em>' attribute.
	 * @see #setNameButton4(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton4()
	 * @model default=""
	 * @generated
	 */
	String getNameButton4();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton4 <em>Name Button4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button4</em>' attribute.
	 * @see #getNameButton4()
	 * @generated
	 */
	void setNameButton4(String value);

	/**
	 * Returns the value of the '<em><b>Name Button5</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button5</em>' attribute.
	 * @see #setNameButton5(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton5()
	 * @model default=""
	 * @generated
	 */
	String getNameButton5();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton5 <em>Name Button5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button5</em>' attribute.
	 * @see #getNameButton5()
	 * @generated
	 */
	void setNameButton5(String value);

	/**
	 * Returns the value of the '<em><b>Name Button6</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button6</em>' attribute.
	 * @see #setNameButton6(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton6()
	 * @model default=""
	 * @generated
	 */
	String getNameButton6();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton6 <em>Name Button6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button6</em>' attribute.
	 * @see #getNameButton6()
	 * @generated
	 */
	void setNameButton6(String value);

	/**
	 * Returns the value of the '<em><b>Name Button7</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button7</em>' attribute.
	 * @see #setNameButton7(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton7()
	 * @model default=""
	 * @generated
	 */
	String getNameButton7();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton7 <em>Name Button7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button7</em>' attribute.
	 * @see #getNameButton7()
	 * @generated
	 */
	void setNameButton7(String value);

	/**
	 * Returns the value of the '<em><b>Name Button8</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button8</em>' attribute.
	 * @see #setNameButton8(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton8()
	 * @model default=""
	 * @generated
	 */
	String getNameButton8();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton8 <em>Name Button8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button8</em>' attribute.
	 * @see #getNameButton8()
	 * @generated
	 */
	void setNameButton8(String value);

	/**
	 * Returns the value of the '<em><b>Name Button9</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button9</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button9</em>' attribute.
	 * @see #setNameButton9(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton9()
	 * @model default=""
	 * @generated
	 */
	String getNameButton9();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton9 <em>Name Button9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button9</em>' attribute.
	 * @see #getNameButton9()
	 * @generated
	 */
	void setNameButton9(String value);

	/**
	 * Returns the value of the '<em><b>Name Button0</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button0</em>' attribute.
	 * @see #setNameButton0(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButton0()
	 * @model default=""
	 * @generated
	 */
	String getNameButton0();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButton0 <em>Name Button0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button0</em>' attribute.
	 * @see #getNameButton0()
	 * @generated
	 */
	void setNameButton0(String value);

	/**
	 * Returns the value of the '<em><b>Name Button A</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button A</em>' attribute.
	 * @see #setNameButtonA(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButtonA()
	 * @model default=""
	 * @generated
	 */
	String getNameButtonA();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonA <em>Name Button A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button A</em>' attribute.
	 * @see #getNameButtonA()
	 * @generated
	 */
	void setNameButtonA(String value);

	/**
	 * Returns the value of the '<em><b>Name Button B</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button B</em>' attribute.
	 * @see #setNameButtonB(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButtonB()
	 * @model default=""
	 * @generated
	 */
	String getNameButtonB();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonB <em>Name Button B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button B</em>' attribute.
	 * @see #getNameButtonB()
	 * @generated
	 */
	void setNameButtonB(String value);

	/**
	 * Returns the value of the '<em><b>Name Button C</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button C</em>' attribute.
	 * @see #setNameButtonC(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButtonC()
	 * @model default=""
	 * @generated
	 */
	String getNameButtonC();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonC <em>Name Button C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button C</em>' attribute.
	 * @see #getNameButtonC()
	 * @generated
	 */
	void setNameButtonC(String value);

	/**
	 * Returns the value of the '<em><b>Name Button D</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button D</em>' attribute.
	 * @see #setNameButtonD(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButtonD()
	 * @model default=""
	 * @generated
	 */
	String getNameButtonD();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonD <em>Name Button D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button D</em>' attribute.
	 * @see #getNameButtonD()
	 * @generated
	 */
	void setNameButtonD(String value);

	/**
	 * Returns the value of the '<em><b>Name Button Hash</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button Hash</em>' attribute.
	 * @see #setNameButtonHash(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButtonHash()
	 * @model default=""
	 * @generated
	 */
	String getNameButtonHash();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonHash <em>Name Button Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button Hash</em>' attribute.
	 * @see #getNameButtonHash()
	 * @generated
	 */
	void setNameButtonHash(String value);

	/**
	 * Returns the value of the '<em><b>Name Button Asterisk</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Button Asterisk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Button Asterisk</em>' attribute.
	 * @see #setNameButtonAsterisk(String)
	 * @see iotwearable.model.iotw.IotwPackage#getKeypad4x4_NameButtonAsterisk()
	 * @model default=""
	 * @generated
	 */
	String getNameButtonAsterisk();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonAsterisk <em>Name Button Asterisk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Button Asterisk</em>' attribute.
	 * @see #getNameButtonAsterisk()
	 * @generated
	 */
	void setNameButtonAsterisk(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getButton(String name);

} // Keypad4x4
