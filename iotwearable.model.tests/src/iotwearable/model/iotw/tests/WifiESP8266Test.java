/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.WifiESP8266;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wifi ESP8266</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WifiESP8266Test extends ConnectivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WifiESP8266Test.class);
	}

	/**
	 * Constructs a new Wifi ESP8266 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiESP8266Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wifi ESP8266 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WifiESP8266 getFixture() {
		return (WifiESP8266)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createWifiESP8266());
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

} //WifiESP8266Test
