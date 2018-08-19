/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.IotwFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arduino UNOR3</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoUNOR3Test extends MainboardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArduinoUNOR3Test.class);
	}

	/**
	 * Constructs a new Arduino UNOR3 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoUNOR3Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arduino UNOR3 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArduinoUNOR3 getFixture() {
		return (ArduinoUNOR3)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createArduinoUNOR3());
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

} //ArduinoUNOR3Test
