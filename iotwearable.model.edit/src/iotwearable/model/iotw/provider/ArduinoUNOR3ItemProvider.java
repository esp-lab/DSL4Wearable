/**
 */
package iotwearable.model.iotw.provider;


import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.IotwPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iotwearable.model.iotw.ArduinoUNOR3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoUNOR3ItemProvider extends MainboardItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoUNOR3ItemProvider(AdapterFactory adapterFactory) {
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

			addPin0PropertyDescriptor(object);
			addPin1PropertyDescriptor(object);
			addPin2PropertyDescriptor(object);
			addPin3PropertyDescriptor(object);
			addPin4PropertyDescriptor(object);
			addPin5PropertyDescriptor(object);
			addPin6PropertyDescriptor(object);
			addPin7PropertyDescriptor(object);
			addPin8PropertyDescriptor(object);
			addPin9PropertyDescriptor(object);
			addPin10PropertyDescriptor(object);
			addPin11PropertyDescriptor(object);
			addPin12PropertyDescriptor(object);
			addPin13PropertyDescriptor(object);
			addPinA0PropertyDescriptor(object);
			addPinA1PropertyDescriptor(object);
			addPinA2PropertyDescriptor(object);
			addPinA3PropertyDescriptor(object);
			addPinA4PropertyDescriptor(object);
			addPinA5PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pin0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin0_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN0,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin1_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN1,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin2_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN2,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin3_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN3,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin4_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN4,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin5 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin5PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin5_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin5_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN5,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin6 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin6PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin6_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin6_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN6,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin7 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin7PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin7_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin7_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN7,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin8 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin8PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin8_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin8_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN8,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin9 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin9PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin9_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin9_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN9,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin10 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin10PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin10_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin10_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN10,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin11 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin11PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin11_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin11_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN11,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin12_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN12,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPin13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pin13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pin13_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN13,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin A0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinA0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pinA0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pinA0_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN_A0,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin A1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinA1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pinA1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pinA1_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN_A1,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin A2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinA2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pinA2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pinA2_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN_A2,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin A3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinA3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pinA3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pinA3_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN_A3,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin A4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinA4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pinA4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pinA4_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN_A4,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin A5 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinA5PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoUNOR3_pinA5_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoUNOR3_pinA5_feature", "_UI_ArduinoUNOR3_type"),
				 IotwPackage.Literals.ARDUINO_UNOR3__PIN_A5,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ArduinoUNOR3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArduinoUNOR3"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArduinoUNOR3)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArduinoUNOR3_type") :
			getString("_UI_ArduinoUNOR3_type") + " " + label;
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

		switch (notification.getFeatureID(ArduinoUNOR3.class)) {
			case IotwPackage.ARDUINO_UNOR3__PIN0:
			case IotwPackage.ARDUINO_UNOR3__PIN1:
			case IotwPackage.ARDUINO_UNOR3__PIN2:
			case IotwPackage.ARDUINO_UNOR3__PIN3:
			case IotwPackage.ARDUINO_UNOR3__PIN4:
			case IotwPackage.ARDUINO_UNOR3__PIN5:
			case IotwPackage.ARDUINO_UNOR3__PIN6:
			case IotwPackage.ARDUINO_UNOR3__PIN7:
			case IotwPackage.ARDUINO_UNOR3__PIN8:
			case IotwPackage.ARDUINO_UNOR3__PIN9:
			case IotwPackage.ARDUINO_UNOR3__PIN10:
			case IotwPackage.ARDUINO_UNOR3__PIN11:
			case IotwPackage.ARDUINO_UNOR3__PIN12:
			case IotwPackage.ARDUINO_UNOR3__PIN13:
			case IotwPackage.ARDUINO_UNOR3__PIN_A0:
			case IotwPackage.ARDUINO_UNOR3__PIN_A1:
			case IotwPackage.ARDUINO_UNOR3__PIN_A2:
			case IotwPackage.ARDUINO_UNOR3__PIN_A3:
			case IotwPackage.ARDUINO_UNOR3__PIN_A4:
			case IotwPackage.ARDUINO_UNOR3__PIN_A5:
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
