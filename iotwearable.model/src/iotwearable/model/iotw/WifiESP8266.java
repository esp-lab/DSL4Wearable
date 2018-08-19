/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wifi ESP8266</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinTX <em>Pin TX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinRX <em>Pin RX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinCHPD <em>Pin CHPD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getSSID_ST <em>SSID ST</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPassword_ST <em>Password ST</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getMode <em>Mode</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getIdConnection <em>Id Connection</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPassword_AccessPoint <em>Password Access Point</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getSSID_AccessPoint <em>SSID Access Point</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPort <em>Port</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getIP <em>IP</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getBaud <em>Baud</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getConnectedChannel <em>Connected Channel</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266()
 * @model
 * @generated
 */
public interface WifiESP8266 extends Connectivity {
	/**
	 * Returns the value of the '<em><b>Pin TX</b></em>' attribute.
	 * The default value is <code>"TX,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin TX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin TX</em>' attribute.
	 * @see #setPinTX(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinTX()
	 * @model default="TX,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinTX();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinTX <em>Pin TX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin TX</em>' attribute.
	 * @see #getPinTX()
	 * @generated
	 */
	void setPinTX(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin RX</b></em>' attribute.
	 * The default value is <code>"RX,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin RX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin RX</em>' attribute.
	 * @see #setPinRX(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinRX()
	 * @model default="RX,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinRX();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinRX <em>Pin RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin RX</em>' attribute.
	 * @see #getPinRX()
	 * @generated
	 */
	void setPinRX(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin Vcc</b></em>' attribute.
	 * The default value is <code>"Vcc,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Vcc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Vcc</em>' attribute.
	 * @see #setPinVcc(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinVcc()
	 * @model default="Vcc,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinVcc();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinVcc <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Vcc</em>' attribute.
	 * @see #getPinVcc()
	 * @generated
	 */
	void setPinVcc(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin GND</b></em>' attribute.
	 * The default value is <code>"GND,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin GND</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin GND</em>' attribute.
	 * @see #setPinGND(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinGND()
	 * @model default="GND,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinGND();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinGND <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin GND</em>' attribute.
	 * @see #getPinGND()
	 * @generated
	 */
	void setPinGND(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin CHPD</b></em>' attribute.
	 * The default value is <code>"CHPD,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin CHPD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin CHPD</em>' attribute.
	 * @see #setPinCHPD(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinCHPD()
	 * @model default="CHPD,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinCHPD();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinCHPD <em>Pin CHPD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin CHPD</em>' attribute.
	 * @see #getPinCHPD()
	 * @generated
	 */
	void setPinCHPD(Pin value);

	/**
	 * Returns the value of the '<em><b>SSID ST</b></em>' attribute.
	 * The default value is <code>"IotWearable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSID ST</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSID ST</em>' attribute.
	 * @see #setSSID_ST(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_SSID_ST()
	 * @model default="IotWearable"
	 * @generated
	 */
	String getSSID_ST();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getSSID_ST <em>SSID ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSID ST</em>' attribute.
	 * @see #getSSID_ST()
	 * @generated
	 */
	void setSSID_ST(String value);

	/**
	 * Returns the value of the '<em><b>Password ST</b></em>' attribute.
	 * The default value is <code>"IotWearable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password ST</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password ST</em>' attribute.
	 * @see #setPassword_ST(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Password_ST()
	 * @model default="IotWearable"
	 * @generated
	 */
	String getPassword_ST();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPassword_ST <em>Password ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password ST</em>' attribute.
	 * @see #getPassword_ST()
	 * @generated
	 */
	void setPassword_ST(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"Both"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.WifiMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see iotwearable.model.iotw.WifiMode
	 * @see #setMode(WifiMode)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Mode()
	 * @model default="Both"
	 * @generated
	 */
	WifiMode getMode();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see iotwearable.model.iotw.WifiMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(WifiMode value);

	/**
	 * Returns the value of the '<em><b>Id Connection</b></em>' attribute.
	 * The default value is <code>"id_0"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.WifiIDConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Connection</em>' attribute.
	 * @see iotwearable.model.iotw.WifiIDConnection
	 * @see #setIdConnection(WifiIDConnection)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_IdConnection()
	 * @model default="id_0"
	 * @generated
	 */
	WifiIDConnection getIdConnection();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getIdConnection <em>Id Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Connection</em>' attribute.
	 * @see iotwearable.model.iotw.WifiIDConnection
	 * @see #getIdConnection()
	 * @generated
	 */
	void setIdConnection(WifiIDConnection value);

	/**
	 * Returns the value of the '<em><b>Password Access Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Access Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Access Point</em>' attribute.
	 * @see #setPassword_AccessPoint(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Password_AccessPoint()
	 * @model
	 * @generated
	 */
	String getPassword_AccessPoint();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPassword_AccessPoint <em>Password Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Access Point</em>' attribute.
	 * @see #getPassword_AccessPoint()
	 * @generated
	 */
	void setPassword_AccessPoint(String value);

	/**
	 * Returns the value of the '<em><b>SSID Access Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSID Access Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSID Access Point</em>' attribute.
	 * @see #setSSID_AccessPoint(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_SSID_AccessPoint()
	 * @model
	 * @generated
	 */
	String getSSID_AccessPoint();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getSSID_AccessPoint <em>SSID Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSID Access Point</em>' attribute.
	 * @see #getSSID_AccessPoint()
	 * @generated
	 */
	void setSSID_AccessPoint(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"80"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Port()
	 * @model default="80"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * The default value is <code>"192.168.4.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_IP()
	 * @model default="192.168.4.1"
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Baud</b></em>' attribute.
	 * The default value is <code>"baud_9600"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.ListBaud}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baud</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud</em>' attribute.
	 * @see iotwearable.model.iotw.ListBaud
	 * @see #setBaud(ListBaud)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Baud()
	 * @model default="baud_9600"
	 * @generated
	 */
	ListBaud getBaud();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getBaud <em>Baud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud</em>' attribute.
	 * @see iotwearable.model.iotw.ListBaud
	 * @see #getBaud()
	 * @generated
	 */
	void setBaud(ListBaud value);

	/**
	 * Returns the value of the '<em><b>Connected Channel</b></em>' attribute.
	 * The default value is <code>"Multiple"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.ListConnectionChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Channel</em>' attribute.
	 * @see iotwearable.model.iotw.ListConnectionChannel
	 * @see #setConnectedChannel(ListConnectionChannel)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_ConnectedChannel()
	 * @model default="Multiple"
	 * @generated
	 */
	ListConnectionChannel getConnectedChannel();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getConnectedChannel <em>Connected Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Channel</em>' attribute.
	 * @see iotwearable.model.iotw.ListConnectionChannel
	 * @see #getConnectedChannel()
	 * @generated
	 */
	void setConnectedChannel(ListConnectionChannel value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The default value is <code>"UDP"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.ListProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see iotwearable.model.iotw.ListProtocol
	 * @see #setProtocol(ListProtocol)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Protocol()
	 * @model default="UDP"
	 * @generated
	 */
	ListProtocol getProtocol();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see iotwearable.model.iotw.ListProtocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ListProtocol value);

} // WifiESP8266
