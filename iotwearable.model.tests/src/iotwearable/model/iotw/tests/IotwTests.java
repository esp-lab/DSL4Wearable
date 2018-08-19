/**
 */
package iotwearable.model.iotw.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>iotw</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotwTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new IotwTests("iotw Tests");
		suite.addTestSuite(ArduinoUNOR3Test.class);
		suite.addTestSuite(Keypad4x4Test.class);
		suite.addTestSuite(ButtonTest.class);
		suite.addTestSuite(LEDTest.class);
		suite.addTestSuite(I2CLCDTest.class);
		suite.addTestSuite(BuzzerTest.class);
		suite.addTestSuite(BluetoothHC06Test.class);
		suite.addTestSuite(WifiESP8266Test.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwTests(String name) {
		super(name);
	}

} //IotwTests
