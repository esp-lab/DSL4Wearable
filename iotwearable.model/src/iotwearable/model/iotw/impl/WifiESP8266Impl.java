/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.ListBaud;
import iotwearable.model.iotw.ListConnectionChannel;
import iotwearable.model.iotw.ListProtocol;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.WifiESP8266;

import iotwearable.model.iotw.WifiIDConnection;
import iotwearable.model.iotw.WifiMode;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wifi ESP8266</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinTX <em>Pin TX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinRX <em>Pin RX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinCHPD <em>Pin CHPD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getSSID_ST <em>SSID ST</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPassword_ST <em>Password ST</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getMode <em>Mode</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getIdConnection <em>Id Connection</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPassword_AccessPoint <em>Password Access Point</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getSSID_AccessPoint <em>SSID Access Point</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPort <em>Port</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getIP <em>IP</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getBaud <em>Baud</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getConnectedChannel <em>Connected Channel</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WifiESP8266Impl extends ConnectivityImpl implements WifiESP8266 {
	/**
	 * The default value of the '{@link #getPinTX() <em>Pin TX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinTX()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_TX_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "TX,IO");

	/**
	 * The cached value of the '{@link #getPinTX() <em>Pin TX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinTX()
	 * @generated
	 * @ordered
	 */
	protected Pin pinTX = PIN_TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinRX() <em>Pin RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinRX()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_RX_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "RX,IO");

	/**
	 * The cached value of the '{@link #getPinRX() <em>Pin RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinRX()
	 * @generated
	 * @ordered
	 */
	protected Pin pinRX = PIN_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinVcc() <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVcc()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_VCC_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "Vcc,Power");

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
	 * The default value of the '{@link #getPinCHPD() <em>Pin CHPD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinCHPD()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_CHPD_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "CHPD,Power");

	/**
	 * The cached value of the '{@link #getPinCHPD() <em>Pin CHPD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinCHPD()
	 * @generated
	 * @ordered
	 */
	protected Pin pinCHPD = PIN_CHPD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSID_ST() <em>SSID ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID_ST()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_ST_EDEFAULT = "IotWearable";

	/**
	 * The cached value of the '{@link #getSSID_ST() <em>SSID ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID_ST()
	 * @generated
	 * @ordered
	 */
	protected String sSID_ST = SSID_ST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword_ST() <em>Password ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword_ST()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_ST_EDEFAULT = "IotWearable";

	/**
	 * The cached value of the '{@link #getPassword_ST() <em>Password ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword_ST()
	 * @generated
	 * @ordered
	 */
	protected String password_ST = PASSWORD_ST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final WifiMode MODE_EDEFAULT = WifiMode.BOTH;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected WifiMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdConnection() <em>Id Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdConnection()
	 * @generated
	 * @ordered
	 */
	protected static final WifiIDConnection ID_CONNECTION_EDEFAULT = WifiIDConnection.ID_0;

	/**
	 * The cached value of the '{@link #getIdConnection() <em>Id Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdConnection()
	 * @generated
	 * @ordered
	 */
	protected WifiIDConnection idConnection = ID_CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword_AccessPoint() <em>Password Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword_AccessPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_ACCESS_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword_AccessPoint() <em>Password Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword_AccessPoint()
	 * @generated
	 * @ordered
	 */
	protected String password_AccessPoint = PASSWORD_ACCESS_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSID_AccessPoint() <em>SSID Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID_AccessPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_ACCESS_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSID_AccessPoint() <em>SSID Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID_AccessPoint()
	 * @generated
	 * @ordered
	 */
	protected String sSID_AccessPoint = SSID_ACCESS_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 80;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = "192.168.4.1";

	/**
	 * The cached value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected String iP = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaud() <em>Baud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaud()
	 * @generated
	 * @ordered
	 */
	protected static final ListBaud BAUD_EDEFAULT = ListBaud.BAUD_9600;

	/**
	 * The cached value of the '{@link #getBaud() <em>Baud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaud()
	 * @generated
	 * @ordered
	 */
	protected ListBaud baud = BAUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectedChannel() <em>Connected Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedChannel()
	 * @generated
	 * @ordered
	 */
	protected static final ListConnectionChannel CONNECTED_CHANNEL_EDEFAULT = ListConnectionChannel.MULTIPLE;

	/**
	 * The cached value of the '{@link #getConnectedChannel() <em>Connected Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedChannel()
	 * @generated
	 * @ordered
	 */
	protected ListConnectionChannel connectedChannel = CONNECTED_CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ListProtocol PROTOCOL_EDEFAULT = ListProtocol.UDP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ListProtocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WifiESP8266Impl() {
		super();
		this.name ="Wifi ESP8266";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.WIFI_ESP8266;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinTX() {
		return pinTX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinTX(Pin newPinTX) {
		Pin oldPinTX = pinTX;
		pinTX = newPinTX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_TX, oldPinTX, pinTX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinRX() {
		return pinRX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinRX(Pin newPinRX) {
		Pin oldPinRX = pinRX;
		pinRX = newPinRX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_RX, oldPinRX, pinRX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_VCC, oldPinVcc, pinVcc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_GND, oldPinGND, pinGND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinCHPD() {
		return pinCHPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinCHPD(Pin newPinCHPD) {
		Pin oldPinCHPD = pinCHPD;
		pinCHPD = newPinCHPD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_CHPD, oldPinCHPD, pinCHPD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSSID_ST() {
		return sSID_ST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSSID_ST(String newSSID_ST) {
		String oldSSID_ST = sSID_ST;
		sSID_ST = newSSID_ST;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__SSID_ST, oldSSID_ST, sSID_ST));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword_ST() {
		return password_ST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword_ST(String newPassword_ST) {
		String oldPassword_ST = password_ST;
		password_ST = newPassword_ST;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PASSWORD_ST, oldPassword_ST, password_ST));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(WifiMode newMode) {
		WifiMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiIDConnection getIdConnection() {
		return idConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdConnection(WifiIDConnection newIdConnection) {
		WifiIDConnection oldIdConnection = idConnection;
		idConnection = newIdConnection == null ? ID_CONNECTION_EDEFAULT : newIdConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__ID_CONNECTION, oldIdConnection, idConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword_AccessPoint() {
		return password_AccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword_AccessPoint(String newPassword_AccessPoint) {
		String oldPassword_AccessPoint = password_AccessPoint;
		password_AccessPoint = newPassword_AccessPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PASSWORD_ACCESS_POINT, oldPassword_AccessPoint, password_AccessPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSSID_AccessPoint() {
		return sSID_AccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSSID_AccessPoint(String newSSID_AccessPoint) {
		String oldSSID_AccessPoint = sSID_AccessPoint;
		sSID_AccessPoint = newSSID_AccessPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__SSID_ACCESS_POINT, oldSSID_AccessPoint, sSID_AccessPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIP() {
		return iP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIP(String newIP) {
		String oldIP = iP;
		iP = newIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__IP, oldIP, iP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListBaud getBaud() {
		return baud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaud(ListBaud newBaud) {
		ListBaud oldBaud = baud;
		baud = newBaud == null ? BAUD_EDEFAULT : newBaud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__BAUD, oldBaud, baud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListConnectionChannel getConnectedChannel() {
		return connectedChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedChannel(ListConnectionChannel newConnectedChannel) {
		ListConnectionChannel oldConnectedChannel = connectedChannel;
		connectedChannel = newConnectedChannel == null ? CONNECTED_CHANNEL_EDEFAULT : newConnectedChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__CONNECTED_CHANNEL, oldConnectedChannel, connectedChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ListProtocol newProtocol) {
		ListProtocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				return getPinTX();
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				return getPinRX();
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				return getPinVcc();
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				return getPinGND();
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				return getPinCHPD();
			case IotwPackage.WIFI_ESP8266__SSID_ST:
				return getSSID_ST();
			case IotwPackage.WIFI_ESP8266__PASSWORD_ST:
				return getPassword_ST();
			case IotwPackage.WIFI_ESP8266__MODE:
				return getMode();
			case IotwPackage.WIFI_ESP8266__ID_CONNECTION:
				return getIdConnection();
			case IotwPackage.WIFI_ESP8266__PASSWORD_ACCESS_POINT:
				return getPassword_AccessPoint();
			case IotwPackage.WIFI_ESP8266__SSID_ACCESS_POINT:
				return getSSID_AccessPoint();
			case IotwPackage.WIFI_ESP8266__PORT:
				return getPort();
			case IotwPackage.WIFI_ESP8266__IP:
				return getIP();
			case IotwPackage.WIFI_ESP8266__BAUD:
				return getBaud();
			case IotwPackage.WIFI_ESP8266__CONNECTED_CHANNEL:
				return getConnectedChannel();
			case IotwPackage.WIFI_ESP8266__PROTOCOL:
				return getProtocol();
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
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				setPinTX((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				setPinRX((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				setPinVcc((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				setPinGND((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				setPinCHPD((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__SSID_ST:
				setSSID_ST((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PASSWORD_ST:
				setPassword_ST((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__MODE:
				setMode((WifiMode)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__ID_CONNECTION:
				setIdConnection((WifiIDConnection)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PASSWORD_ACCESS_POINT:
				setPassword_AccessPoint((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__SSID_ACCESS_POINT:
				setSSID_AccessPoint((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PORT:
				setPort((Integer)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__IP:
				setIP((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__BAUD:
				setBaud((ListBaud)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__CONNECTED_CHANNEL:
				setConnectedChannel((ListConnectionChannel)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PROTOCOL:
				setProtocol((ListProtocol)newValue);
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
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				setPinTX(PIN_TX_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				setPinRX(PIN_RX_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				setPinVcc(PIN_VCC_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				setPinGND(PIN_GND_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				setPinCHPD(PIN_CHPD_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__SSID_ST:
				setSSID_ST(SSID_ST_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PASSWORD_ST:
				setPassword_ST(PASSWORD_ST_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__ID_CONNECTION:
				setIdConnection(ID_CONNECTION_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PASSWORD_ACCESS_POINT:
				setPassword_AccessPoint(PASSWORD_ACCESS_POINT_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__SSID_ACCESS_POINT:
				setSSID_AccessPoint(SSID_ACCESS_POINT_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__IP:
				setIP(IP_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__BAUD:
				setBaud(BAUD_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__CONNECTED_CHANNEL:
				setConnectedChannel(CONNECTED_CHANNEL_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				return PIN_TX_EDEFAULT == null ? pinTX != null : !PIN_TX_EDEFAULT.equals(pinTX);
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				return PIN_RX_EDEFAULT == null ? pinRX != null : !PIN_RX_EDEFAULT.equals(pinRX);
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				return PIN_VCC_EDEFAULT == null ? pinVcc != null : !PIN_VCC_EDEFAULT.equals(pinVcc);
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				return PIN_GND_EDEFAULT == null ? pinGND != null : !PIN_GND_EDEFAULT.equals(pinGND);
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				return PIN_CHPD_EDEFAULT == null ? pinCHPD != null : !PIN_CHPD_EDEFAULT.equals(pinCHPD);
			case IotwPackage.WIFI_ESP8266__SSID_ST:
				return SSID_ST_EDEFAULT == null ? sSID_ST != null : !SSID_ST_EDEFAULT.equals(sSID_ST);
			case IotwPackage.WIFI_ESP8266__PASSWORD_ST:
				return PASSWORD_ST_EDEFAULT == null ? password_ST != null : !PASSWORD_ST_EDEFAULT.equals(password_ST);
			case IotwPackage.WIFI_ESP8266__MODE:
				return mode != MODE_EDEFAULT;
			case IotwPackage.WIFI_ESP8266__ID_CONNECTION:
				return idConnection != ID_CONNECTION_EDEFAULT;
			case IotwPackage.WIFI_ESP8266__PASSWORD_ACCESS_POINT:
				return PASSWORD_ACCESS_POINT_EDEFAULT == null ? password_AccessPoint != null : !PASSWORD_ACCESS_POINT_EDEFAULT.equals(password_AccessPoint);
			case IotwPackage.WIFI_ESP8266__SSID_ACCESS_POINT:
				return SSID_ACCESS_POINT_EDEFAULT == null ? sSID_AccessPoint != null : !SSID_ACCESS_POINT_EDEFAULT.equals(sSID_AccessPoint);
			case IotwPackage.WIFI_ESP8266__PORT:
				return port != PORT_EDEFAULT;
			case IotwPackage.WIFI_ESP8266__IP:
				return IP_EDEFAULT == null ? iP != null : !IP_EDEFAULT.equals(iP);
			case IotwPackage.WIFI_ESP8266__BAUD:
				return baud != BAUD_EDEFAULT;
			case IotwPackage.WIFI_ESP8266__CONNECTED_CHANNEL:
				return connectedChannel != CONNECTED_CHANNEL_EDEFAULT;
			case IotwPackage.WIFI_ESP8266__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
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
		result.append(" (pinTX: ");
		result.append(pinTX);
		result.append(", pinRX: ");
		result.append(pinRX);
		result.append(", pinVcc: ");
		result.append(pinVcc);
		result.append(", pinGND: ");
		result.append(pinGND);
		result.append(", pinCHPD: ");
		result.append(pinCHPD);
		result.append(", sSID_ST: ");
		result.append(sSID_ST);
		result.append(", password_ST: ");
		result.append(password_ST);
		result.append(", mode: ");
		result.append(mode);
		result.append(", idConnection: ");
		result.append(idConnection);
		result.append(", password_AccessPoint: ");
		result.append(password_AccessPoint);
		result.append(", sSID_AccessPoint: ");
		result.append(sSID_AccessPoint);
		result.append(", port: ");
		result.append(port);
		result.append(", iP: ");
		result.append(iP);
		result.append(", baud: ");
		result.append(baud);
		result.append(", connectedChannel: ");
		result.append(connectedChannel);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pinTX);
		pins.add(pinRX);
		pins.add(pinGND);
		pins.add(pinVcc);
		return pins;
	}
	@Override
	public void modifyPin(Pin pin) {
		if(pin.getName().equals(pinRX.getName())){
			setPinRX(pin);
		}
		else if(pin.getName().equals(pinTX.getName())){
			setPinTX(pin);
		}
		else if(pin.getName().equals(pinGND.getName())){
			setPinGND(pin);
		}
		else if(pin.getName().equals(pinVcc.getName())){
			setPinVcc(pin);
		}
	}
} //WifiESP8266Impl
