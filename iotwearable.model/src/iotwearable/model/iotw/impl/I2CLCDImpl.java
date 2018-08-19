/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.I2CLCDType;
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
 * An implementation of the model object '<em><b>I2CLCD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.I2CLCDImpl#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.I2CLCDImpl#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.I2CLCDImpl#getPinSDA <em>Pin SDA</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.I2CLCDImpl#getPinSCL <em>Pin SCL</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.I2CLCDImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class I2CLCDImpl extends OutputDeviceImpl implements I2CLCD {
	/**
	 * The default value of the '{@link #getPinGND() <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGND()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_GND_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "GND,IO");

	/**
	 * The cached value of the '{@link #getPinGND() <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGND()
	 * @generated
	 * @ordered
	 */
	protected Pin pinGND = PIN_GND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinVcc() <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVcc()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_VCC_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "Vcc,IO");

	/**
	 * The cached value of the '{@link #getPinVcc() <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVcc()
	 * @generated
	 * @ordered
	 */
	protected Pin pinVcc = PIN_VCC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinSDA() <em>Pin SDA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinSDA()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_SDA_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "SDA,IO");

	/**
	 * The cached value of the '{@link #getPinSDA() <em>Pin SDA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinSDA()
	 * @generated
	 * @ordered
	 */
	protected Pin pinSDA = PIN_SDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinSCL() <em>Pin SCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinSCL()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_SCL_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "SCL,IO");

	/**
	 * The cached value of the '{@link #getPinSCL() <em>Pin SCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinSCL()
	 * @generated
	 * @ordered
	 */
	protected Pin pinSCL = PIN_SCL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final I2CLCDType TYPE_EDEFAULT = I2CLCDType.I2CLCD2004;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected I2CLCDType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected I2CLCDImpl() {
		super();
		this.name = "I2C LCD";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.I2CLCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinGND() {
		return pinGND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinGND(Pin newPinGND) {
		Pin oldPinGND = pinGND;
		pinGND = newPinGND;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.I2CLCD__PIN_GND, oldPinGND, pinGND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinVcc() {
		return pinVcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinVcc(Pin newPinVcc) {
		Pin oldPinVcc = pinVcc;
		pinVcc = newPinVcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.I2CLCD__PIN_VCC, oldPinVcc, pinVcc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinSDA() {
		return pinSDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinSDA(Pin newPinSDA) {
		Pin oldPinSDA = pinSDA;
		pinSDA = newPinSDA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.I2CLCD__PIN_SDA, oldPinSDA, pinSDA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinSCL() {
		return pinSCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinSCL(Pin newPinSCL) {
		Pin oldPinSCL = pinSCL;
		pinSCL = newPinSCL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.I2CLCD__PIN_SCL, oldPinSCL, pinSCL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CLCDType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(I2CLCDType newType) {
		I2CLCDType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.I2CLCD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.I2CLCD__PIN_GND:
				return getPinGND();
			case IotwPackage.I2CLCD__PIN_VCC:
				return getPinVcc();
			case IotwPackage.I2CLCD__PIN_SDA:
				return getPinSDA();
			case IotwPackage.I2CLCD__PIN_SCL:
				return getPinSCL();
			case IotwPackage.I2CLCD__TYPE:
				return getType();
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
			case IotwPackage.I2CLCD__PIN_GND:
				setPinGND((Pin)newValue);
				return;
			case IotwPackage.I2CLCD__PIN_VCC:
				setPinVcc((Pin)newValue);
				return;
			case IotwPackage.I2CLCD__PIN_SDA:
				setPinSDA((Pin)newValue);
				return;
			case IotwPackage.I2CLCD__PIN_SCL:
				setPinSCL((Pin)newValue);
				return;
			case IotwPackage.I2CLCD__TYPE:
				setType((I2CLCDType)newValue);
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
			case IotwPackage.I2CLCD__PIN_GND:
				setPinGND(PIN_GND_EDEFAULT);
				return;
			case IotwPackage.I2CLCD__PIN_VCC:
				setPinVcc(PIN_VCC_EDEFAULT);
				return;
			case IotwPackage.I2CLCD__PIN_SDA:
				setPinSDA(PIN_SDA_EDEFAULT);
				return;
			case IotwPackage.I2CLCD__PIN_SCL:
				setPinSCL(PIN_SCL_EDEFAULT);
				return;
			case IotwPackage.I2CLCD__TYPE:
				setType(TYPE_EDEFAULT);
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
			case IotwPackage.I2CLCD__PIN_GND:
				return PIN_GND_EDEFAULT == null ? pinGND != null : !PIN_GND_EDEFAULT.equals(pinGND);
			case IotwPackage.I2CLCD__PIN_VCC:
				return PIN_VCC_EDEFAULT == null ? pinVcc != null : !PIN_VCC_EDEFAULT.equals(pinVcc);
			case IotwPackage.I2CLCD__PIN_SDA:
				return PIN_SDA_EDEFAULT == null ? pinSDA != null : !PIN_SDA_EDEFAULT.equals(pinSDA);
			case IotwPackage.I2CLCD__PIN_SCL:
				return PIN_SCL_EDEFAULT == null ? pinSCL != null : !PIN_SCL_EDEFAULT.equals(pinSCL);
			case IotwPackage.I2CLCD__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (pinGND: ");
		result.append(pinGND);
		result.append(", pinVcc: ");
		result.append(pinVcc);
		result.append(", pinSDA: ");
		result.append(pinSDA);
		result.append(", pinSCL: ");
		result.append(pinSCL);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pinGND);
		pins.add(pinVcc);
		pins.add(pinSDA);
		pins.add(pinSCL);
		return pins;
	}
	@Override
	public void modifyPin(Pin pin) {
		if(pin.getName().equals(pinGND.getName())){
			setPinGND(pin);
		}
		else if(pin.getName().equals(pinVcc.getName())){
			setPinVcc(pin);
		}
		else if(pin.getName().equals(pinSDA.getName())){
			setPinSDA(pin);
		}
		else if(pin.getName().equals(pinSCL.getName())){
			setPinSCL(pin);
		}
	}
} //I2CLCDImpl
