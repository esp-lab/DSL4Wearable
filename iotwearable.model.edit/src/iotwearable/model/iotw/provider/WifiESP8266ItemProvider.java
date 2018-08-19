/**
 */
package iotwearable.model.iotw.provider;


import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.WifiESP8266;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iotwearable.model.iotw.WifiESP8266} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WifiESP8266ItemProvider extends ConnectivityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WifiESP8266ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPinTXPropertyDescriptor(object);
			addPinRXPropertyDescriptor(object);
			addPinVccPropertyDescriptor(object);
			addPinGNDPropertyDescriptor(object);
			addPinCHPDPropertyDescriptor(object);
			addSSID_STPropertyDescriptor(object);
			addPassword_STPropertyDescriptor(object);
			addModePropertyDescriptor(object);
			addIdConnectionPropertyDescriptor(object);
			addPassword_AccessPointPropertyDescriptor(object);
			addSSID_AccessPointPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addIPPropertyDescriptor(object);
			addBaudPropertyDescriptor(object);
			addConnectedChannelPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pin TX feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinTXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_pinTX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_pinTX_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PIN_TX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin RX feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinRXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_pinRX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_pinRX_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PIN_RX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin Vcc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinVccPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_pinVcc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_pinVcc_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PIN_VCC,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin GND feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinGNDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_pinGND_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_pinGND_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PIN_GND,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin CHPD feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinCHPDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_pinCHPD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_pinCHPD_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PIN_CHPD,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SSID ST feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSSID_STPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_sSID_ST_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_sSID_ST_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__SSID_ST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password ST feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassword_STPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_password_ST_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_password_ST_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PASSWORD_ST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_mode_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_idConnection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_idConnection_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__ID_CONNECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Access Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassword_AccessPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_password_AccessPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_password_AccessPoint_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PASSWORD_ACCESS_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SSID Access Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSSID_AccessPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_sSID_AccessPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_sSID_AccessPoint_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__SSID_ACCESS_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_port_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_iP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_iP_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Baud feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaudPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_baud_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_baud_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__BAUD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected Channel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_connectedChannel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_connectedChannel_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__CONNECTED_CHANNEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WifiESP8266_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WifiESP8266_protocol_feature", "_UI_WifiESP8266_type"),
				 IotwPackage.Literals.WIFI_ESP8266__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns WifiESP8266.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WifiESP8266"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WifiESP8266)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WifiESP8266_type") :
			getString("_UI_WifiESP8266_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(WifiESP8266.class)) {
			case IotwPackage.WIFI_ESP8266__PIN_TX:
			case IotwPackage.WIFI_ESP8266__PIN_RX:
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
			case IotwPackage.WIFI_ESP8266__PIN_GND:
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
			case IotwPackage.WIFI_ESP8266__SSID_ST:
			case IotwPackage.WIFI_ESP8266__PASSWORD_ST:
			case IotwPackage.WIFI_ESP8266__MODE:
			case IotwPackage.WIFI_ESP8266__ID_CONNECTION:
			case IotwPackage.WIFI_ESP8266__PASSWORD_ACCESS_POINT:
			case IotwPackage.WIFI_ESP8266__SSID_ACCESS_POINT:
			case IotwPackage.WIFI_ESP8266__PORT:
			case IotwPackage.WIFI_ESP8266__IP:
			case IotwPackage.WIFI_ESP8266__BAUD:
			case IotwPackage.WIFI_ESP8266__CONNECTED_CHANNEL:
			case IotwPackage.WIFI_ESP8266__PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
