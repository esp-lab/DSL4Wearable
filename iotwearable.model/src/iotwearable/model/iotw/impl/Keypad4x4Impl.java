/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.Pin;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keypad4x4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getKeys <em>Keys</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getRows <em>Rows</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getCols <em>Cols</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin1 <em>Pin1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin2 <em>Pin2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin3 <em>Pin3</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin4 <em>Pin4</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin5 <em>Pin5</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin6 <em>Pin6</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin7 <em>Pin7</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getPin8 <em>Pin8</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton1 <em>Name Button1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton2 <em>Name Button2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton3 <em>Name Button3</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton4 <em>Name Button4</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton5 <em>Name Button5</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton6 <em>Name Button6</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton7 <em>Name Button7</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton8 <em>Name Button8</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton9 <em>Name Button9</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButton0 <em>Name Button0</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButtonA <em>Name Button A</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButtonB <em>Name Button B</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButtonC <em>Name Button C</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButtonD <em>Name Button D</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButtonHash <em>Name Button Hash</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.Keypad4x4Impl#getNameButtonAsterisk <em>Name Button Asterisk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Keypad4x4Impl extends InputDeviceImpl implements Keypad4x4 {
	/**
	 * The default value of the '{@link #getKeys() <em>Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYS_EDEFAULT = "{\'1\',\'2\',\'3\',\'A\'},{\'4\',\'5\',\'6\',\'B\'},{\'7\',\'8\',\'9\',\'C\'},{\'*\',\'0\',\'#\',\'D\'}";

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected String keys = KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected static final int COLS_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected int cols = COLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin1() <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin1()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN1_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "R1,IO");

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
	protected static final Pin PIN2_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "R2,IO");

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
	protected static final Pin PIN3_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "R3,IO");

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
	protected static final Pin PIN4_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "R4,IO");

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
	protected static final Pin PIN5_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "C1,IO");

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
	protected static final Pin PIN6_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "C2,IO");

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
	protected static final Pin PIN7_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "C3,IO");

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
	protected static final Pin PIN8_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "C4,IO");

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
	 * The default value of the '{@link #getNameButton1() <em>Name Button1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton1()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON1_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton1() <em>Name Button1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton1()
	 * @generated
	 * @ordered
	 */
	protected String nameButton1 = NAME_BUTTON1_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton2() <em>Name Button2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton2()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON2_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton2() <em>Name Button2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton2()
	 * @generated
	 * @ordered
	 */
	protected String nameButton2 = NAME_BUTTON2_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton3() <em>Name Button3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton3()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON3_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton3() <em>Name Button3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton3()
	 * @generated
	 * @ordered
	 */
	protected String nameButton3 = NAME_BUTTON3_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton4() <em>Name Button4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton4()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON4_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton4() <em>Name Button4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton4()
	 * @generated
	 * @ordered
	 */
	protected String nameButton4 = NAME_BUTTON4_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton5() <em>Name Button5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton5()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON5_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton5() <em>Name Button5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton5()
	 * @generated
	 * @ordered
	 */
	protected String nameButton5 = NAME_BUTTON5_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton6() <em>Name Button6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton6()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON6_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton6() <em>Name Button6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton6()
	 * @generated
	 * @ordered
	 */
	protected String nameButton6 = NAME_BUTTON6_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton7() <em>Name Button7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton7()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON7_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton7() <em>Name Button7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton7()
	 * @generated
	 * @ordered
	 */
	protected String nameButton7 = NAME_BUTTON7_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton8() <em>Name Button8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton8()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON8_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton8() <em>Name Button8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton8()
	 * @generated
	 * @ordered
	 */
	protected String nameButton8 = NAME_BUTTON8_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton9() <em>Name Button9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton9()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON9_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton9() <em>Name Button9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton9()
	 * @generated
	 * @ordered
	 */
	protected String nameButton9 = NAME_BUTTON9_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButton0() <em>Name Button0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton0()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON0_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButton0() <em>Name Button0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButton0()
	 * @generated
	 * @ordered
	 */
	protected String nameButton0 = NAME_BUTTON0_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButtonA() <em>Name Button A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonA()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON_A_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButtonA() <em>Name Button A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonA()
	 * @generated
	 * @ordered
	 */
	protected String nameButtonA = NAME_BUTTON_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButtonB() <em>Name Button B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonB()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON_B_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButtonB() <em>Name Button B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonB()
	 * @generated
	 * @ordered
	 */
	protected String nameButtonB = NAME_BUTTON_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButtonC() <em>Name Button C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonC()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON_C_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButtonC() <em>Name Button C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonC()
	 * @generated
	 * @ordered
	 */
	protected String nameButtonC = NAME_BUTTON_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButtonD() <em>Name Button D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonD()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON_D_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButtonD() <em>Name Button D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonD()
	 * @generated
	 * @ordered
	 */
	protected String nameButtonD = NAME_BUTTON_D_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButtonHash() <em>Name Button Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonHash()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON_HASH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButtonHash() <em>Name Button Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonHash()
	 * @generated
	 * @ordered
	 */
	protected String nameButtonHash = NAME_BUTTON_HASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameButtonAsterisk() <em>Name Button Asterisk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonAsterisk()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BUTTON_ASTERISK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameButtonAsterisk() <em>Name Button Asterisk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameButtonAsterisk()
	 * @generated
	 * @ordered
	 */
	protected String nameButtonAsterisk = NAME_BUTTON_ASTERISK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Keypad4x4Impl() {
		super();
		this.name = "Keypad 4x4";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.KEYPAD4X4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeys() {
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCols() {
		return cols;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN1, oldPin1, pin1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN2, oldPin2, pin2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN3, oldPin3, pin3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN4, oldPin4, pin4));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN5, oldPin5, pin5));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN6, oldPin6, pin6));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN7, oldPin7, pin7));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__PIN8, oldPin8, pin8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton1() {
		return nameButton1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton1(String newNameButton1) {
		String oldNameButton1 = nameButton1;
		nameButton1 = newNameButton1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON1, oldNameButton1, nameButton1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton2() {
		return nameButton2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton2(String newNameButton2) {
		String oldNameButton2 = nameButton2;
		nameButton2 = newNameButton2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON2, oldNameButton2, nameButton2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton3() {
		return nameButton3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton3(String newNameButton3) {
		String oldNameButton3 = nameButton3;
		nameButton3 = newNameButton3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON3, oldNameButton3, nameButton3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton4() {
		return nameButton4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton4(String newNameButton4) {
		String oldNameButton4 = nameButton4;
		nameButton4 = newNameButton4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON4, oldNameButton4, nameButton4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton5() {
		return nameButton5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton5(String newNameButton5) {
		String oldNameButton5 = nameButton5;
		nameButton5 = newNameButton5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON5, oldNameButton5, nameButton5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton6() {
		return nameButton6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton6(String newNameButton6) {
		String oldNameButton6 = nameButton6;
		nameButton6 = newNameButton6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON6, oldNameButton6, nameButton6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton7() {
		return nameButton7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton7(String newNameButton7) {
		String oldNameButton7 = nameButton7;
		nameButton7 = newNameButton7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON7, oldNameButton7, nameButton7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton8() {
		return nameButton8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton8(String newNameButton8) {
		String oldNameButton8 = nameButton8;
		nameButton8 = newNameButton8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON8, oldNameButton8, nameButton8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton9() {
		return nameButton9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton9(String newNameButton9) {
		String oldNameButton9 = nameButton9;
		nameButton9 = newNameButton9;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON9, oldNameButton9, nameButton9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButton0() {
		return nameButton0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButton0(String newNameButton0) {
		String oldNameButton0 = nameButton0;
		nameButton0 = newNameButton0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON0, oldNameButton0, nameButton0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButtonA() {
		return nameButtonA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButtonA(String newNameButtonA) {
		String oldNameButtonA = nameButtonA;
		nameButtonA = newNameButtonA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON_A, oldNameButtonA, nameButtonA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButtonB() {
		return nameButtonB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButtonB(String newNameButtonB) {
		String oldNameButtonB = nameButtonB;
		nameButtonB = newNameButtonB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON_B, oldNameButtonB, nameButtonB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButtonC() {
		return nameButtonC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButtonC(String newNameButtonC) {
		String oldNameButtonC = nameButtonC;
		nameButtonC = newNameButtonC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON_C, oldNameButtonC, nameButtonC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButtonD() {
		return nameButtonD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButtonD(String newNameButtonD) {
		String oldNameButtonD = nameButtonD;
		nameButtonD = newNameButtonD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON_D, oldNameButtonD, nameButtonD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButtonHash() {
		return nameButtonHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButtonHash(String newNameButtonHash) {
		String oldNameButtonHash = nameButtonHash;
		nameButtonHash = newNameButtonHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON_HASH, oldNameButtonHash, nameButtonHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameButtonAsterisk() {
		return nameButtonAsterisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameButtonAsterisk(String newNameButtonAsterisk) {
		String oldNameButtonAsterisk = nameButtonAsterisk;
		nameButtonAsterisk = newNameButtonAsterisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.KEYPAD4X4__NAME_BUTTON_ASTERISK, oldNameButtonAsterisk, nameButtonAsterisk));
	}

	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Get the button by the name of the button set by the user.
	 * @param name : the name of the button set by the user.
	 * @return the button if name existed.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getButton(String name) {
		if(getNameButton0().equals(name)){
			return "0";
		}
		else if(getNameButton1().equals(name)){
			return "1";
		}
		else if(getNameButton2().equals(name)){
			return "2";
		}
		else if(getNameButton3().equals(name)){
			return "3";
		}
		else if(getNameButton4().equals(name)){
			return "4";
		}
		else if(getNameButton5().equals(name)){
			return "5";
		}
		else if(getNameButton6().equals(name)){
			return "6";
		}
		else if(getNameButton7().equals(name)){
			return "7";
		}
		else if(getNameButton8().equals(name)){
			return "8";
		}
		else if(getNameButton9().equals(name)){
			return "9";
		}
		else if(getNameButtonA().equals(name)){
			return "A";
		}
		else if(getNameButtonB().equals(name)){
			return "B";
		}
		else if(getNameButtonC().equals(name)){
			return "C";
		}
		else if(getNameButtonD().equals(name)){
			return "D";
		}
		else if(getNameButtonAsterisk().equals(name)){
			return "*";
		}
		else if(getNameButtonHash().equals(name)){
			return "#";
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.KEYPAD4X4__KEYS:
				return getKeys();
			case IotwPackage.KEYPAD4X4__ROWS:
				return getRows();
			case IotwPackage.KEYPAD4X4__COLS:
				return getCols();
			case IotwPackage.KEYPAD4X4__PIN1:
				return getPin1();
			case IotwPackage.KEYPAD4X4__PIN2:
				return getPin2();
			case IotwPackage.KEYPAD4X4__PIN3:
				return getPin3();
			case IotwPackage.KEYPAD4X4__PIN4:
				return getPin4();
			case IotwPackage.KEYPAD4X4__PIN5:
				return getPin5();
			case IotwPackage.KEYPAD4X4__PIN6:
				return getPin6();
			case IotwPackage.KEYPAD4X4__PIN7:
				return getPin7();
			case IotwPackage.KEYPAD4X4__PIN8:
				return getPin8();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON1:
				return getNameButton1();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON2:
				return getNameButton2();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON3:
				return getNameButton3();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON4:
				return getNameButton4();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON5:
				return getNameButton5();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON6:
				return getNameButton6();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON7:
				return getNameButton7();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON8:
				return getNameButton8();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON9:
				return getNameButton9();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON0:
				return getNameButton0();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_A:
				return getNameButtonA();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_B:
				return getNameButtonB();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_C:
				return getNameButtonC();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_D:
				return getNameButtonD();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_HASH:
				return getNameButtonHash();
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_ASTERISK:
				return getNameButtonAsterisk();
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
			case IotwPackage.KEYPAD4X4__PIN1:
				setPin1((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__PIN2:
				setPin2((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__PIN3:
				setPin3((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__PIN4:
				setPin4((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__PIN5:
				setPin5((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__PIN6:
				setPin6((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__PIN7:
				setPin7((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__PIN8:
				setPin8((Pin)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON1:
				setNameButton1((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON2:
				setNameButton2((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON3:
				setNameButton3((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON4:
				setNameButton4((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON5:
				setNameButton5((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON6:
				setNameButton6((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON7:
				setNameButton7((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON8:
				setNameButton8((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON9:
				setNameButton9((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON0:
				setNameButton0((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_A:
				setNameButtonA((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_B:
				setNameButtonB((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_C:
				setNameButtonC((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_D:
				setNameButtonD((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_HASH:
				setNameButtonHash((String)newValue);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_ASTERISK:
				setNameButtonAsterisk((String)newValue);
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
			case IotwPackage.KEYPAD4X4__PIN1:
				setPin1(PIN1_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__PIN2:
				setPin2(PIN2_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__PIN3:
				setPin3(PIN3_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__PIN4:
				setPin4(PIN4_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__PIN5:
				setPin5(PIN5_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__PIN6:
				setPin6(PIN6_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__PIN7:
				setPin7(PIN7_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__PIN8:
				setPin8(PIN8_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON1:
				setNameButton1(NAME_BUTTON1_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON2:
				setNameButton2(NAME_BUTTON2_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON3:
				setNameButton3(NAME_BUTTON3_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON4:
				setNameButton4(NAME_BUTTON4_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON5:
				setNameButton5(NAME_BUTTON5_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON6:
				setNameButton6(NAME_BUTTON6_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON7:
				setNameButton7(NAME_BUTTON7_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON8:
				setNameButton8(NAME_BUTTON8_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON9:
				setNameButton9(NAME_BUTTON9_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON0:
				setNameButton0(NAME_BUTTON0_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_A:
				setNameButtonA(NAME_BUTTON_A_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_B:
				setNameButtonB(NAME_BUTTON_B_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_C:
				setNameButtonC(NAME_BUTTON_C_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_D:
				setNameButtonD(NAME_BUTTON_D_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_HASH:
				setNameButtonHash(NAME_BUTTON_HASH_EDEFAULT);
				return;
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_ASTERISK:
				setNameButtonAsterisk(NAME_BUTTON_ASTERISK_EDEFAULT);
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
			case IotwPackage.KEYPAD4X4__KEYS:
				return KEYS_EDEFAULT == null ? keys != null : !KEYS_EDEFAULT.equals(keys);
			case IotwPackage.KEYPAD4X4__ROWS:
				return rows != ROWS_EDEFAULT;
			case IotwPackage.KEYPAD4X4__COLS:
				return cols != COLS_EDEFAULT;
			case IotwPackage.KEYPAD4X4__PIN1:
				return PIN1_EDEFAULT == null ? pin1 != null : !PIN1_EDEFAULT.equals(pin1);
			case IotwPackage.KEYPAD4X4__PIN2:
				return PIN2_EDEFAULT == null ? pin2 != null : !PIN2_EDEFAULT.equals(pin2);
			case IotwPackage.KEYPAD4X4__PIN3:
				return PIN3_EDEFAULT == null ? pin3 != null : !PIN3_EDEFAULT.equals(pin3);
			case IotwPackage.KEYPAD4X4__PIN4:
				return PIN4_EDEFAULT == null ? pin4 != null : !PIN4_EDEFAULT.equals(pin4);
			case IotwPackage.KEYPAD4X4__PIN5:
				return PIN5_EDEFAULT == null ? pin5 != null : !PIN5_EDEFAULT.equals(pin5);
			case IotwPackage.KEYPAD4X4__PIN6:
				return PIN6_EDEFAULT == null ? pin6 != null : !PIN6_EDEFAULT.equals(pin6);
			case IotwPackage.KEYPAD4X4__PIN7:
				return PIN7_EDEFAULT == null ? pin7 != null : !PIN7_EDEFAULT.equals(pin7);
			case IotwPackage.KEYPAD4X4__PIN8:
				return PIN8_EDEFAULT == null ? pin8 != null : !PIN8_EDEFAULT.equals(pin8);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON1:
				return NAME_BUTTON1_EDEFAULT == null ? nameButton1 != null : !NAME_BUTTON1_EDEFAULT.equals(nameButton1);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON2:
				return NAME_BUTTON2_EDEFAULT == null ? nameButton2 != null : !NAME_BUTTON2_EDEFAULT.equals(nameButton2);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON3:
				return NAME_BUTTON3_EDEFAULT == null ? nameButton3 != null : !NAME_BUTTON3_EDEFAULT.equals(nameButton3);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON4:
				return NAME_BUTTON4_EDEFAULT == null ? nameButton4 != null : !NAME_BUTTON4_EDEFAULT.equals(nameButton4);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON5:
				return NAME_BUTTON5_EDEFAULT == null ? nameButton5 != null : !NAME_BUTTON5_EDEFAULT.equals(nameButton5);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON6:
				return NAME_BUTTON6_EDEFAULT == null ? nameButton6 != null : !NAME_BUTTON6_EDEFAULT.equals(nameButton6);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON7:
				return NAME_BUTTON7_EDEFAULT == null ? nameButton7 != null : !NAME_BUTTON7_EDEFAULT.equals(nameButton7);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON8:
				return NAME_BUTTON8_EDEFAULT == null ? nameButton8 != null : !NAME_BUTTON8_EDEFAULT.equals(nameButton8);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON9:
				return NAME_BUTTON9_EDEFAULT == null ? nameButton9 != null : !NAME_BUTTON9_EDEFAULT.equals(nameButton9);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON0:
				return NAME_BUTTON0_EDEFAULT == null ? nameButton0 != null : !NAME_BUTTON0_EDEFAULT.equals(nameButton0);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_A:
				return NAME_BUTTON_A_EDEFAULT == null ? nameButtonA != null : !NAME_BUTTON_A_EDEFAULT.equals(nameButtonA);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_B:
				return NAME_BUTTON_B_EDEFAULT == null ? nameButtonB != null : !NAME_BUTTON_B_EDEFAULT.equals(nameButtonB);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_C:
				return NAME_BUTTON_C_EDEFAULT == null ? nameButtonC != null : !NAME_BUTTON_C_EDEFAULT.equals(nameButtonC);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_D:
				return NAME_BUTTON_D_EDEFAULT == null ? nameButtonD != null : !NAME_BUTTON_D_EDEFAULT.equals(nameButtonD);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_HASH:
				return NAME_BUTTON_HASH_EDEFAULT == null ? nameButtonHash != null : !NAME_BUTTON_HASH_EDEFAULT.equals(nameButtonHash);
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_ASTERISK:
				return NAME_BUTTON_ASTERISK_EDEFAULT == null ? nameButtonAsterisk != null : !NAME_BUTTON_ASTERISK_EDEFAULT.equals(nameButtonAsterisk);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IotwPackage.KEYPAD4X4___GET_BUTTON__STRING:
				return getButton((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (keys: ");
		result.append(keys);
		result.append(", rows: ");
		result.append(rows);
		result.append(", cols: ");
		result.append(cols);
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
		result.append(", nameButton1: ");
		result.append(nameButton1);
		result.append(", nameButton2: ");
		result.append(nameButton2);
		result.append(", nameButton3: ");
		result.append(nameButton3);
		result.append(", nameButton4: ");
		result.append(nameButton4);
		result.append(", nameButton5: ");
		result.append(nameButton5);
		result.append(", nameButton6: ");
		result.append(nameButton6);
		result.append(", nameButton7: ");
		result.append(nameButton7);
		result.append(", nameButton8: ");
		result.append(nameButton8);
		result.append(", nameButton9: ");
		result.append(nameButton9);
		result.append(", nameButton0: ");
		result.append(nameButton0);
		result.append(", nameButtonA: ");
		result.append(nameButtonA);
		result.append(", nameButtonB: ");
		result.append(nameButtonB);
		result.append(", nameButtonC: ");
		result.append(nameButtonC);
		result.append(", nameButtonD: ");
		result.append(nameButtonD);
		result.append(", nameButtonHash: ");
		result.append(nameButtonHash);
		result.append(", nameButtonAsterisk: ");
		result.append(nameButtonAsterisk);
		result.append(')');
		return result.toString();
	}
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pin1);
		pins.add(pin2);
		pins.add(pin3);
		pins.add(pin4);
		pins.add(pin5);
		pins.add(pin6);
		pins.add(pin7);
		pins.add(pin8);
		return pins;
	}
	@Override
	public void modifyPin(Pin pin) {
		if(pin == null){
			return;
		}
		if(pin.getName().equals(pin1.getName())){
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
		else if(pin.getName().equals(pin7.getName())){
			setPin7(pin);
		}
		else if(pin.getName().equals(pin8.getName())){
			setPin8(pin);
		}
	}
} //Keypad4x4Impl
