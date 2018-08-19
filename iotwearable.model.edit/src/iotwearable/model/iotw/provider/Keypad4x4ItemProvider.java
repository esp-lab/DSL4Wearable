/**
 */
package iotwearable.model.iotw.provider;


import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Keypad4x4;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iotwearable.model.iotw.Keypad4x4} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Keypad4x4ItemProvider extends InputDeviceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keypad4x4ItemProvider(AdapterFactory adapterFactory) {
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

			addKeysPropertyDescriptor(object);
			addRowsPropertyDescriptor(object);
			addColsPropertyDescriptor(object);
			addPin1PropertyDescriptor(object);
			addPin2PropertyDescriptor(object);
			addPin3PropertyDescriptor(object);
			addPin4PropertyDescriptor(object);
			addPin5PropertyDescriptor(object);
			addPin6PropertyDescriptor(object);
			addPin7PropertyDescriptor(object);
			addPin8PropertyDescriptor(object);
			addNameButton1PropertyDescriptor(object);
			addNameButton2PropertyDescriptor(object);
			addNameButton3PropertyDescriptor(object);
			addNameButton4PropertyDescriptor(object);
			addNameButton5PropertyDescriptor(object);
			addNameButton6PropertyDescriptor(object);
			addNameButton7PropertyDescriptor(object);
			addNameButton8PropertyDescriptor(object);
			addNameButton9PropertyDescriptor(object);
			addNameButton0PropertyDescriptor(object);
			addNameButtonAPropertyDescriptor(object);
			addNameButtonBPropertyDescriptor(object);
			addNameButtonCPropertyDescriptor(object);
			addNameButtonDPropertyDescriptor(object);
			addNameButtonHashPropertyDescriptor(object);
			addNameButtonAsteriskPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_keys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_keys_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__KEYS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_rows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_rows_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__ROWS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cols feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_cols_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_cols_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__COLS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_Keypad4x4_pin1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin1_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN1,
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
				 getString("_UI_Keypad4x4_pin2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin2_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN2,
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
				 getString("_UI_Keypad4x4_pin3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin3_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN3,
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
				 getString("_UI_Keypad4x4_pin4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin4_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN4,
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
				 getString("_UI_Keypad4x4_pin5_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin5_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN5,
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
				 getString("_UI_Keypad4x4_pin6_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin6_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN6,
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
				 getString("_UI_Keypad4x4_pin7_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin7_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN7,
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
				 getString("_UI_Keypad4x4_pin8_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_pin8_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__PIN8,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton1_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton2_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton3_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton4_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button5 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton5PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton5_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton5_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON5,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button6 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton6PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton6_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton6_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON6,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button7 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton7PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton7_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton7_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON7,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button8 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton8PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton8_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton8_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON8,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button9 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton9PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton9_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton9_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON9,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButton0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButton0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButton0_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON0,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButtonAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButtonA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButtonA_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON_A,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButtonBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButtonB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButtonB_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON_B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButtonCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButtonC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButtonC_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON_C,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button D feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButtonDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButtonD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButtonD_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON_D,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button Hash feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButtonHashPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButtonHash_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButtonHash_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON_HASH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Button Asterisk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameButtonAsteriskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Keypad4x4_nameButtonAsterisk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Keypad4x4_nameButtonAsterisk_feature", "_UI_Keypad4x4_type"),
				 IotwPackage.Literals.KEYPAD4X4__NAME_BUTTON_ASTERISK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Keypad4x4.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Keypad4x4"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Keypad4x4)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Keypad4x4_type") :
			getString("_UI_Keypad4x4_type") + " " + label;
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

		switch (notification.getFeatureID(Keypad4x4.class)) {
			case IotwPackage.KEYPAD4X4__KEYS:
			case IotwPackage.KEYPAD4X4__ROWS:
			case IotwPackage.KEYPAD4X4__COLS:
			case IotwPackage.KEYPAD4X4__PIN1:
			case IotwPackage.KEYPAD4X4__PIN2:
			case IotwPackage.KEYPAD4X4__PIN3:
			case IotwPackage.KEYPAD4X4__PIN4:
			case IotwPackage.KEYPAD4X4__PIN5:
			case IotwPackage.KEYPAD4X4__PIN6:
			case IotwPackage.KEYPAD4X4__PIN7:
			case IotwPackage.KEYPAD4X4__PIN8:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON1:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON2:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON3:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON4:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON5:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON6:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON7:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON8:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON9:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON0:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_A:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_B:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_C:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_D:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_HASH:
			case IotwPackage.KEYPAD4X4__NAME_BUTTON_ASTERISK:
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
