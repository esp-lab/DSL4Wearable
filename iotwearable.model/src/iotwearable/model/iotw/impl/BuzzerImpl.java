/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.Buzzer;
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
 * An implementation of the model object '<em><b>Buzzer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.BuzzerImpl#getPin1 <em>Pin1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.BuzzerImpl#getPin2 <em>Pin2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.BuzzerImpl#getTone <em>Tone</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.BuzzerImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuzzerImpl extends OutputDeviceImpl implements Buzzer {
	/**
	 * The default value of the '{@link #getPin1() <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin1()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN1_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "1,Passive");

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
	protected static final Pin PIN2_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "2,Passive");

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
	 * The default value of the '{@link #getTone() <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTone()
	 * @generated
	 * @ordered
	 */
	protected static final int TONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTone() <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTone()
	 * @generated
	 * @ordered
	 */
	protected int tone = TONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BuzzerImpl() {
		super();
		this.name ="Buzzer";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.BUZZER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BUZZER__PIN1, oldPin1, pin1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BUZZER__PIN2, oldPin2, pin2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTone() {
		return tone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTone(int newTone) {
		int oldTone = tone;
		tone = newTone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BUZZER__TONE, oldTone, tone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BUZZER__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.BUZZER__PIN1:
				return getPin1();
			case IotwPackage.BUZZER__PIN2:
				return getPin2();
			case IotwPackage.BUZZER__TONE:
				return getTone();
			case IotwPackage.BUZZER__TIME:
				return getTime();
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
			case IotwPackage.BUZZER__PIN1:
				setPin1((Pin)newValue);
				return;
			case IotwPackage.BUZZER__PIN2:
				setPin2((Pin)newValue);
				return;
			case IotwPackage.BUZZER__TONE:
				setTone((Integer)newValue);
				return;
			case IotwPackage.BUZZER__TIME:
				setTime((Integer)newValue);
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
			case IotwPackage.BUZZER__PIN1:
				setPin1(PIN1_EDEFAULT);
				return;
			case IotwPackage.BUZZER__PIN2:
				setPin2(PIN2_EDEFAULT);
				return;
			case IotwPackage.BUZZER__TONE:
				setTone(TONE_EDEFAULT);
				return;
			case IotwPackage.BUZZER__TIME:
				setTime(TIME_EDEFAULT);
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
			case IotwPackage.BUZZER__PIN1:
				return PIN1_EDEFAULT == null ? pin1 != null : !PIN1_EDEFAULT.equals(pin1);
			case IotwPackage.BUZZER__PIN2:
				return PIN2_EDEFAULT == null ? pin2 != null : !PIN2_EDEFAULT.equals(pin2);
			case IotwPackage.BUZZER__TONE:
				return tone != TONE_EDEFAULT;
			case IotwPackage.BUZZER__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(" (pin1: ");
		result.append(pin1);
		result.append(", pin2: ");
		result.append(pin2);
		result.append(", Tone: ");
		result.append(tone);
		result.append(", Time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pin1);
		pins.add(pin2);
		return pins;
	}
	
	@Override
	public void modifyPin(Pin pin) {
		if(pin.getName().equals(pin1.getName())){
			setPin1(pin);
		}
		else if(pin.getName().equals(pin2.getName())){
			setPin2(pin);
		}
	}
} //BuzzerImpl
