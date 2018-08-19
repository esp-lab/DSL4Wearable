/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.IotwFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>I2CLCD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class I2CLCDTest extends OutputDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(I2CLCDTest.class);
	}

	/**
	 * Constructs a new I2CLCD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CLCDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this I2CLCD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected I2CLCD getFixture() {
		return (I2CLCD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createI2CLCD());
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

} //I2CLCDTest
