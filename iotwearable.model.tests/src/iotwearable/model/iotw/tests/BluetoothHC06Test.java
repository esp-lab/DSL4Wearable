/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.IotwFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bluetooth HC06</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BluetoothHC06Test extends ConnectivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BluetoothHC06Test.class);
	}

	/**
	 * Constructs a new Bluetooth HC06 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothHC06Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bluetooth HC06 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BluetoothHC06 getFixture() {
		return (BluetoothHC06)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createBluetoothHC06());
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

} //BluetoothHC06Test
