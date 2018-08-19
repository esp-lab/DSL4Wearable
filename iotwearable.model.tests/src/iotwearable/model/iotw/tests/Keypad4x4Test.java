/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.Keypad4x4;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Keypad4x4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Keypad4x4#getButton(java.lang.String) <em>Get Button</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class Keypad4x4Test extends InputDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Keypad4x4Test.class);
	}

	/**
	 * Constructs a new Keypad4x4 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keypad4x4Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Keypad4x4 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Keypad4x4 getFixture() {
		return (Keypad4x4)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createKeypad4x4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link iotwearable.model.iotw.Keypad4x4#getButton(java.lang.String) <em>Get Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.Keypad4x4#getButton(java.lang.String)
	 * @generated
	 */
	public void testGetButton__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //Keypad4x4Test
