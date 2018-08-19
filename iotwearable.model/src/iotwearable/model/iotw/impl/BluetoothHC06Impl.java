/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.BluetoothHC06;
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
 * An implementation of the model object '<em><b>Bluetooth HC06</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.BluetoothHC06Impl#getPinTXD <em>Pin TXD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.BluetoothHC06Impl#getPinRXD <em>Pin RXD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.BluetoothHC06Impl#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.BluetoothHC06Impl#getPinVCC <em>Pin VCC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BluetoothHC06Impl extends ConnectivityImpl implements BluetoothHC06 {
	/**
	 * The default value of the '{@link #getPinTXD() <em>Pin TXD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinTXD()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_TXD_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "TXD,IO");

	/**
	 * The cached value of the '{@link #getPinTXD() <em>Pin TXD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinTXD()
	 * @generated
	 * @ordered
	 */
	protected Pin pinTXD = PIN_TXD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinRXD() <em>Pin RXD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinRXD()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_RXD_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "RXD,IO");

	/**
	 * The cached value of the '{@link #getPinRXD() <em>Pin RXD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinRXD()
	 * @generated
	 * @ordered
	 */
	protected Pin pinRXD = PIN_RXD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinGND() <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGND()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_GND_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "GND,Power");

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
	 * The default value of the '{@link #getPinVCC() <em>Pin VCC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVCC()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_VCC_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "VCC,Power");

	/**
	 * The cached value of the '{@link #getPinVCC() <em>Pin VCC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVCC()
	 * @generated
	 * @ordered
	 */
	protected Pin pinVCC = PIN_VCC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BluetoothHC06Impl() {
		super();
		this.name ="Bluetooth HC06";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.BLUETOOTH_HC06;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinTXD() {
		return pinTXD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinTXD(Pin newPinTXD) {
		Pin oldPinTXD = pinTXD;
		pinTXD = newPinTXD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BLUETOOTH_HC06__PIN_TXD, oldPinTXD, pinTXD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinRXD() {
		return pinRXD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinRXD(Pin newPinRXD) {
		Pin oldPinRXD = pinRXD;
		pinRXD = newPinRXD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BLUETOOTH_HC06__PIN_RXD, oldPinRXD, pinRXD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BLUETOOTH_HC06__PIN_GND, oldPinGND, pinGND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinVCC() {
		return pinVCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinVCC(Pin newPinVCC) {
		Pin oldPinVCC = pinVCC;
		pinVCC = newPinVCC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.BLUETOOTH_HC06__PIN_VCC, oldPinVCC, pinVCC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.BLUETOOTH_HC06__PIN_TXD:
				return getPinTXD();
			case IotwPackage.BLUETOOTH_HC06__PIN_RXD:
				return getPinRXD();
			case IotwPackage.BLUETOOTH_HC06__PIN_GND:
				return getPinGND();
			case IotwPackage.BLUETOOTH_HC06__PIN_VCC:
				return getPinVCC();
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
			case IotwPackage.BLUETOOTH_HC06__PIN_TXD:
				setPinTXD((Pin)newValue);
				return;
			case IotwPackage.BLUETOOTH_HC06__PIN_RXD:
				setPinRXD((Pin)newValue);
				return;
			case IotwPackage.BLUETOOTH_HC06__PIN_GND:
				setPinGND((Pin)newValue);
				return;
			case IotwPackage.BLUETOOTH_HC06__PIN_VCC:
				setPinVCC((Pin)newValue);
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
			case IotwPackage.BLUETOOTH_HC06__PIN_TXD:
				setPinTXD(PIN_TXD_EDEFAULT);
				return;
			case IotwPackage.BLUETOOTH_HC06__PIN_RXD:
				setPinRXD(PIN_RXD_EDEFAULT);
				return;
			case IotwPackage.BLUETOOTH_HC06__PIN_GND:
				setPinGND(PIN_GND_EDEFAULT);
				return;
			case IotwPackage.BLUETOOTH_HC06__PIN_VCC:
				setPinVCC(PIN_VCC_EDEFAULT);
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
			case IotwPackage.BLUETOOTH_HC06__PIN_TXD:
				return PIN_TXD_EDEFAULT == null ? pinTXD != null : !PIN_TXD_EDEFAULT.equals(pinTXD);
			case IotwPackage.BLUETOOTH_HC06__PIN_RXD:
				return PIN_RXD_EDEFAULT == null ? pinRXD != null : !PIN_RXD_EDEFAULT.equals(pinRXD);
			case IotwPackage.BLUETOOTH_HC06__PIN_GND:
				return PIN_GND_EDEFAULT == null ? pinGND != null : !PIN_GND_EDEFAULT.equals(pinGND);
			case IotwPackage.BLUETOOTH_HC06__PIN_VCC:
				return PIN_VCC_EDEFAULT == null ? pinVCC != null : !PIN_VCC_EDEFAULT.equals(pinVCC);
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
		result.append(" (pinTXD: ");
		result.append(pinTXD);
		result.append(", pinRXD: ");
		result.append(pinRXD);
		result.append(", pinGND: ");
		result.append(pinGND);
		result.append(", pinVCC: ");
		result.append(pinVCC);
		result.append(')');
		return result.toString();
	}
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pinRXD);
		pins.add(pinTXD);
		pins.add(pinGND);
		pins.add(pinVCC);
		return pins;
	}
	@Override
	public void modifyPin(Pin pin) {
		if(pin.getName().equals(pinRXD.getName())){
			setPinRXD(pin);
		}
		else if(pin.getName().equals(pinTXD.getName())){
			setPinTXD(pin);
		}
		else if(pin.getName().equals(pinGND.getName())){
			setPinGND(pin);
		}
		else if(pin.getName().equals(pinVCC.getName())){
			setPinVCC(pin);
		}
	
	}
} //BluetoothHC06Impl
