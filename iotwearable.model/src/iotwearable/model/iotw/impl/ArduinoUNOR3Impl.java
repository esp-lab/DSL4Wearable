/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Pin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino UNOR3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin0 <em>Pin0</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin1 <em>Pin1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin2 <em>Pin2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin3 <em>Pin3</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin4 <em>Pin4</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin5 <em>Pin5</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin6 <em>Pin6</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin7 <em>Pin7</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin8 <em>Pin8</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin9 <em>Pin9</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin10 <em>Pin10</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin11 <em>Pin11</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin12 <em>Pin12</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPin13 <em>Pin13</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPinA0 <em>Pin A0</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPinA1 <em>Pin A1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPinA2 <em>Pin A2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPinA3 <em>Pin A3</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPinA4 <em>Pin A4</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl#getPinA5 <em>Pin A5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArduinoUNOR3Impl extends MainboardImpl implements ArduinoUNOR3 {
	/**
	 * The default value of the '{@link #getPin0() <em>Pin0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin0()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN0_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "0,IO");

	/**
	 * The cached value of the '{@link #getPin0() <em>Pin0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin0()
	 * @generated
	 * @ordered
	 */
	protected Pin pin0 = PIN0_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin1() <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin1()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN1_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "1,IO");

	/**
	 * The cached value of the '{@link #getPin1() <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin1()
	 * @generated
	 * @ordered
	 */
	protected Pin pin1 = PIN1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin2() <em>Pin2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin2()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN2_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "2,IO");

	/**
	 * The cached value of the '{@link #getPin2() <em>Pin2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin2()
	 * @generated
	 * @ordered
	 */
	protected Pin pin2 = PIN2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin3() <em>Pin3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin3()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN3_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "3,IO");

	/**
	 * The cached value of the '{@link #getPin3() <em>Pin3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin3()
	 * @generated
	 * @ordered
	 */
	protected Pin pin3 = PIN3_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin4() <em>Pin4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin4()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN4_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "4,IO");

	/**
	 * The cached value of the '{@link #getPin4() <em>Pin4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin4()
	 * @generated
	 * @ordered
	 */
	protected Pin pin4 = PIN4_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin5() <em>Pin5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin5()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN5_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "5,IO");

	/**
	 * The cached value of the '{@link #getPin5() <em>Pin5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin5()
	 * @generated
	 * @ordered
	 */
	protected Pin pin5 = PIN5_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin6() <em>Pin6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin6()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN6_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "6,IO");

	/**
	 * The cached value of the '{@link #getPin6() <em>Pin6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin6()
	 * @generated
	 * @ordered
	 */
	protected Pin pin6 = PIN6_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin7() <em>Pin7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin7()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN7_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "7,IO");

	/**
	 * The cached value of the '{@link #getPin7() <em>Pin7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin7()
	 * @generated
	 * @ordered
	 */
	protected Pin pin7 = PIN7_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin8() <em>Pin8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin8()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN8_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "8,IO");

	/**
	 * The cached value of the '{@link #getPin8() <em>Pin8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin8()
	 * @generated
	 * @ordered
	 */
	protected Pin pin8 = PIN8_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin9() <em>Pin9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin9()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN9_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "9,IO");

	/**
	 * The cached value of the '{@link #getPin9() <em>Pin9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin9()
	 * @generated
	 * @ordered
	 */
	protected Pin pin9 = PIN9_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin10() <em>Pin10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin10()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN10_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "10,IO");

	/**
	 * The cached value of the '{@link #getPin10() <em>Pin10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin10()
	 * @generated
	 * @ordered
	 */
	protected Pin pin10 = PIN10_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin11() <em>Pin11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin11()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN11_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "11,IO");

	/**
	 * The cached value of the '{@link #getPin11() <em>Pin11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin11()
	 * @generated
	 * @ordered
	 */
	protected Pin pin11 = PIN11_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin12() <em>Pin12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin12()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN12_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "12,IO");

	/**
	 * The cached value of the '{@link #getPin12() <em>Pin12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin12()
	 * @generated
	 * @ordered
	 */
	protected Pin pin12 = PIN12_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin13() <em>Pin13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin13()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN13_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "13,IO");

	/**
	 * The cached value of the '{@link #getPin13() <em>Pin13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin13()
	 * @generated
	 * @ordered
	 */
	protected Pin pin13 = PIN13_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinA0() <em>Pin A0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA0()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_A0_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "A0,Input");

	/**
	 * The cached value of the '{@link #getPinA0() <em>Pin A0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA0()
	 * @generated
	 * @ordered
	 */
	protected Pin pinA0 = PIN_A0_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinA1() <em>Pin A1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA1()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_A1_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "A1,Input");

	/**
	 * The cached value of the '{@link #getPinA1() <em>Pin A1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA1()
	 * @generated
	 * @ordered
	 */
	protected Pin pinA1 = PIN_A1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinA2() <em>Pin A2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA2()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_A2_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "A2,Input");

	/**
	 * The cached value of the '{@link #getPinA2() <em>Pin A2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA2()
	 * @generated
	 * @ordered
	 */
	protected Pin pinA2 = PIN_A2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinA3() <em>Pin A3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA3()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_A3_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "A3,Input");

	/**
	 * The cached value of the '{@link #getPinA3() <em>Pin A3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA3()
	 * @generated
	 * @ordered
	 */
	protected Pin pinA3 = PIN_A3_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinA4() <em>Pin A4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA4()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_A4_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "A4,Input");

	/**
	 * The cached value of the '{@link #getPinA4() <em>Pin A4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA4()
	 * @generated
	 * @ordered
	 */
	protected Pin pinA4 = PIN_A4_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinA5() <em>Pin A5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA5()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_A5_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "A5,Input");

	/**
	 * The cached value of the '{@link #getPinA5() <em>Pin A5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA5()
	 * @generated
	 * @ordered
	 */
	protected Pin pinA5 = PIN_A5_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ArduinoUNOR3Impl() {
		super();
		this.name = "Arduino UNO R3";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.ARDUINO_UNOR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin0() {
		return pin0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin0(Pin newPin0) {
		Pin oldPin0 = pin0;
		pin0 = newPin0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN0, oldPin0, pin0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin1() {
		return pin1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin1(Pin newPin1) {
		Pin oldPin1 = pin1;
		pin1 = newPin1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN1, oldPin1, pin1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin2() {
		return pin2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin2(Pin newPin2) {
		Pin oldPin2 = pin2;
		pin2 = newPin2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN2, oldPin2, pin2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin3() {
		return pin3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin3(Pin newPin3) {
		Pin oldPin3 = pin3;
		pin3 = newPin3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN3, oldPin3, pin3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin4() {
		return pin4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin4(Pin newPin4) {
		Pin oldPin4 = pin4;
		pin4 = newPin4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN4, oldPin4, pin4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin5() {
		return pin5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin5(Pin newPin5) {
		Pin oldPin5 = pin5;
		pin5 = newPin5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN5, oldPin5, pin5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin6() {
		return pin6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin6(Pin newPin6) {
		Pin oldPin6 = pin6;
		pin6 = newPin6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN6, oldPin6, pin6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin7() {
		return pin7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin7(Pin newPin7) {
		Pin oldPin7 = pin7;
		pin7 = newPin7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN7, oldPin7, pin7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin8() {
		return pin8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin8(Pin newPin8) {
		Pin oldPin8 = pin8;
		pin8 = newPin8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN8, oldPin8, pin8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin9() {
		return pin9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin9(Pin newPin9) {
		Pin oldPin9 = pin9;
		pin9 = newPin9;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN9, oldPin9, pin9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin10() {
		return pin10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin10(Pin newPin10) {
		Pin oldPin10 = pin10;
		pin10 = newPin10;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN10, oldPin10, pin10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin11() {
		return pin11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin11(Pin newPin11) {
		Pin oldPin11 = pin11;
		pin11 = newPin11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN11, oldPin11, pin11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin12() {
		return pin12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin12(Pin newPin12) {
		Pin oldPin12 = pin12;
		pin12 = newPin12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN12, oldPin12, pin12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin13() {
		return pin13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin13(Pin newPin13) {
		Pin oldPin13 = pin13;
		pin13 = newPin13;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN13, oldPin13, pin13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinA0() {
		return pinA0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinA0(Pin newPinA0) {
		Pin oldPinA0 = pinA0;
		pinA0 = newPinA0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN_A0, oldPinA0, pinA0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinA1() {
		return pinA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinA1(Pin newPinA1) {
		Pin oldPinA1 = pinA1;
		pinA1 = newPinA1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN_A1, oldPinA1, pinA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinA2() {
		return pinA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinA2(Pin newPinA2) {
		Pin oldPinA2 = pinA2;
		pinA2 = newPinA2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN_A2, oldPinA2, pinA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinA3() {
		return pinA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinA3(Pin newPinA3) {
		Pin oldPinA3 = pinA3;
		pinA3 = newPinA3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN_A3, oldPinA3, pinA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinA4() {
		return pinA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinA4(Pin newPinA4) {
		Pin oldPinA4 = pinA4;
		pinA4 = newPinA4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN_A4, oldPinA4, pinA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinA5() {
		return pinA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinA5(Pin newPinA5) {
		Pin oldPinA5 = pinA5;
		pinA5 = newPinA5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_UNOR3__PIN_A5, oldPinA5, pinA5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.ARDUINO_UNOR3__PIN0:
				return getPin0();
			case IotwPackage.ARDUINO_UNOR3__PIN1:
				return getPin1();
			case IotwPackage.ARDUINO_UNOR3__PIN2:
				return getPin2();
			case IotwPackage.ARDUINO_UNOR3__PIN3:
				return getPin3();
			case IotwPackage.ARDUINO_UNOR3__PIN4:
				return getPin4();
			case IotwPackage.ARDUINO_UNOR3__PIN5:
				return getPin5();
			case IotwPackage.ARDUINO_UNOR3__PIN6:
				return getPin6();
			case IotwPackage.ARDUINO_UNOR3__PIN7:
				return getPin7();
			case IotwPackage.ARDUINO_UNOR3__PIN8:
				return getPin8();
			case IotwPackage.ARDUINO_UNOR3__PIN9:
				return getPin9();
			case IotwPackage.ARDUINO_UNOR3__PIN10:
				return getPin10();
			case IotwPackage.ARDUINO_UNOR3__PIN11:
				return getPin11();
			case IotwPackage.ARDUINO_UNOR3__PIN12:
				return getPin12();
			case IotwPackage.ARDUINO_UNOR3__PIN13:
				return getPin13();
			case IotwPackage.ARDUINO_UNOR3__PIN_A0:
				return getPinA0();
			case IotwPackage.ARDUINO_UNOR3__PIN_A1:
				return getPinA1();
			case IotwPackage.ARDUINO_UNOR3__PIN_A2:
				return getPinA2();
			case IotwPackage.ARDUINO_UNOR3__PIN_A3:
				return getPinA3();
			case IotwPackage.ARDUINO_UNOR3__PIN_A4:
				return getPinA4();
			case IotwPackage.ARDUINO_UNOR3__PIN_A5:
				return getPinA5();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IotwPackage.ARDUINO_UNOR3__PIN0:
				setPin0((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN1:
				setPin1((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN2:
				setPin2((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN3:
				setPin3((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN4:
				setPin4((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN5:
				setPin5((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN6:
				setPin6((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN7:
				setPin7((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN8:
				setPin8((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN9:
				setPin9((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN10:
				setPin10((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN11:
				setPin11((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN12:
				setPin12((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN13:
				setPin13((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A0:
				setPinA0((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A1:
				setPinA1((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A2:
				setPinA2((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A3:
				setPinA3((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A4:
				setPinA4((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A5:
				setPinA5((Pin)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IotwPackage.ARDUINO_UNOR3__PIN0:
				setPin0(PIN0_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN1:
				setPin1(PIN1_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN2:
				setPin2(PIN2_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN3:
				setPin3(PIN3_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN4:
				setPin4(PIN4_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN5:
				setPin5(PIN5_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN6:
				setPin6(PIN6_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN7:
				setPin7(PIN7_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN8:
				setPin8(PIN8_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN9:
				setPin9(PIN9_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN10:
				setPin10(PIN10_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN11:
				setPin11(PIN11_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN12:
				setPin12(PIN12_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN13:
				setPin13(PIN13_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A0:
				setPinA0(PIN_A0_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A1:
				setPinA1(PIN_A1_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A2:
				setPinA2(PIN_A2_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A3:
				setPinA3(PIN_A3_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A4:
				setPinA4(PIN_A4_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_UNOR3__PIN_A5:
				setPinA5(PIN_A5_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IotwPackage.ARDUINO_UNOR3__PIN0:
				return PIN0_EDEFAULT == null ? pin0 != null : !PIN0_EDEFAULT.equals(pin0);
			case IotwPackage.ARDUINO_UNOR3__PIN1:
				return PIN1_EDEFAULT == null ? pin1 != null : !PIN1_EDEFAULT.equals(pin1);
			case IotwPackage.ARDUINO_UNOR3__PIN2:
				return PIN2_EDEFAULT == null ? pin2 != null : !PIN2_EDEFAULT.equals(pin2);
			case IotwPackage.ARDUINO_UNOR3__PIN3:
				return PIN3_EDEFAULT == null ? pin3 != null : !PIN3_EDEFAULT.equals(pin3);
			case IotwPackage.ARDUINO_UNOR3__PIN4:
				return PIN4_EDEFAULT == null ? pin4 != null : !PIN4_EDEFAULT.equals(pin4);
			case IotwPackage.ARDUINO_UNOR3__PIN5:
				return PIN5_EDEFAULT == null ? pin5 != null : !PIN5_EDEFAULT.equals(pin5);
			case IotwPackage.ARDUINO_UNOR3__PIN6:
				return PIN6_EDEFAULT == null ? pin6 != null : !PIN6_EDEFAULT.equals(pin6);
			case IotwPackage.ARDUINO_UNOR3__PIN7:
				return PIN7_EDEFAULT == null ? pin7 != null : !PIN7_EDEFAULT.equals(pin7);
			case IotwPackage.ARDUINO_UNOR3__PIN8:
				return PIN8_EDEFAULT == null ? pin8 != null : !PIN8_EDEFAULT.equals(pin8);
			case IotwPackage.ARDUINO_UNOR3__PIN9:
				return PIN9_EDEFAULT == null ? pin9 != null : !PIN9_EDEFAULT.equals(pin9);
			case IotwPackage.ARDUINO_UNOR3__PIN10:
				return PIN10_EDEFAULT == null ? pin10 != null : !PIN10_EDEFAULT.equals(pin10);
			case IotwPackage.ARDUINO_UNOR3__PIN11:
				return PIN11_EDEFAULT == null ? pin11 != null : !PIN11_EDEFAULT.equals(pin11);
			case IotwPackage.ARDUINO_UNOR3__PIN12:
				return PIN12_EDEFAULT == null ? pin12 != null : !PIN12_EDEFAULT.equals(pin12);
			case IotwPackage.ARDUINO_UNOR3__PIN13:
				return PIN13_EDEFAULT == null ? pin13 != null : !PIN13_EDEFAULT.equals(pin13);
			case IotwPackage.ARDUINO_UNOR3__PIN_A0:
				return PIN_A0_EDEFAULT == null ? pinA0 != null : !PIN_A0_EDEFAULT.equals(pinA0);
			case IotwPackage.ARDUINO_UNOR3__PIN_A1:
				return PIN_A1_EDEFAULT == null ? pinA1 != null : !PIN_A1_EDEFAULT.equals(pinA1);
			case IotwPackage.ARDUINO_UNOR3__PIN_A2:
				return PIN_A2_EDEFAULT == null ? pinA2 != null : !PIN_A2_EDEFAULT.equals(pinA2);
			case IotwPackage.ARDUINO_UNOR3__PIN_A3:
				return PIN_A3_EDEFAULT == null ? pinA3 != null : !PIN_A3_EDEFAULT.equals(pinA3);
			case IotwPackage.ARDUINO_UNOR3__PIN_A4:
				return PIN_A4_EDEFAULT == null ? pinA4 != null : !PIN_A4_EDEFAULT.equals(pinA4);
			case IotwPackage.ARDUINO_UNOR3__PIN_A5:
				return PIN_A5_EDEFAULT == null ? pinA5 != null : !PIN_A5_EDEFAULT.equals(pinA5);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pin0: ");
		result.append(pin0);
		result.append(", pin1: ");
		result.append(pin1);
		result.append(", pin2: ");
		result.append(pin2);
		result.append(", pin3: ");
		result.append(pin3);
		result.append(", pin4: ");
		result.append(pin4);
		result.append(", pin5: ");
		result.append(pin5);
		result.append(", pin6: ");
		result.append(pin6);
		result.append(", pin7: ");
		result.append(pin7);
		result.append(", pin8: ");
		result.append(pin8);
		result.append(", pin9: ");
		result.append(pin9);
		result.append(", pin10: ");
		result.append(pin10);
		result.append(", pin11: ");
		result.append(pin11);
		result.append(", pin12: ");
		result.append(pin12);
		result.append(", pin13: ");
		result.append(pin13);
		result.append(", pinA0: ");
		result.append(pinA0);
		result.append(", pinA1: ");
		result.append(pinA1);
		result.append(", pinA2: ");
		result.append(pinA2);
		result.append(", pinA3: ");
		result.append(pinA3);
		result.append(", pinA4: ");
		result.append(pinA4);
		result.append(", pinA5: ");
		result.append(pinA5);
		result.append(')');
		return result.toString();
	}
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pin0);
		pins.add(pin1);
		pins.add(pin2);
		pins.add(pin3);
		pins.add(pin4);
		pins.add(pin5);
		pins.add(pin6);
		pins.add(pin7);
		pins.add(pin8);
		pins.add(pin9);
		pins.add(pin10);
		pins.add(pin11);
		pins.add(pin12);
		pins.add(pin13);
		pins.add(pinA0);
		pins.add(pinA1);
		pins.add(pinA2);
		pins.add(pinA3);
		pins.add(pinA4);
		pins.add(pinA5);
		return pins;
	}
	@Override
	public void modifyPin(Pin pin) {
		if(pin == null){
			return;
		}
		if(pin.getName().equals(pin0.getName())){
			setPin0(pin);
		}
		else if(pin.getName().equals(pin1.getName())){
			setPin1(pin);
		}
		else if(pin.getName().equals(pin2.getName())){
			setPin2(pin);
		}
		else if(pin.getName().equals(pin3.getName())){
			setPin3(pin);
		}
		else if(pin.getName().equals(pin4.getName())){
			setPin4(pin);
		}
		else if(pin.getName().equals(pin5.getName())){
			setPin5(pin);
		}
		else if(pin.getName().equals(pin6.getName())){
			setPin6(pin);
		}
		else if(pin.getName().equals(pin7.getName()))	{
			setPin7(pin);
		}
		else if(pin.getName().equals(pin8.getName())){
			setPin8(pin);
		}
		else if(pin.getName().equals(pin9.getName())){
			setPin9(pin);
		}
		else if(pin.getName().equals(pin10.getName())){
			setPin10(pin);
		}
		else if(pin.getName().equals(pin11.getName())){
			setPin11(pin);
		}
		else if(pin.getName().equals(pin12.getName())){
			setPin12(pin);
		}
		else if(pin.getName().equals(pin13.getName())){
			setPin13(pin);
		}
		else if(pin.getName().equals(pinA0.getName())){
			setPinA0(pin);
		}
		else if(pin.getName().equals(pinA1.getName())){
			setPinA1(pin);
		}
		else if(pin.getName().equals(pinA2.getName())){
			setPinA2(pin);
		}
		else if(pin.getName().equals(pinA3.getName())){
			setPinA3(pin);
		}
		else if(pin.getName().equals(pinA4.getName())){
			setPinA4(pin);
		}
		else if(pin.getName().equals(pinA5.getName())){
			setPinA5(pin);
		}
	}
} //ArduinoUNOR3Impl
