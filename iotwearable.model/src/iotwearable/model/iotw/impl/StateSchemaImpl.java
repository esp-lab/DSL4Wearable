/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateSchema;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.StateSchemaImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.StateSchemaImpl#getConnnections <em>Connnections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateSchemaImpl extends MinimalEObjectImpl.Container implements StateSchema {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<StateComponent> components;

	/**
	 * The cached value of the '{@link #getConnnections() <em>Connnections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.STATE_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<StateComponent>(StateComponent.class, this, IotwPackage.STATE_SCHEMA__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnnections() {
		if (connnections == null) {
			connnections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, IotwPackage.STATE_SCHEMA__CONNNECTIONS, IotwPackage.CONNECTION__STATE_SCHEMA);
		}
		return connnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotwPackage.STATE_SCHEMA__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return ((InternalEList<?>)getConnnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.STATE_SCHEMA__COMPONENTS:
				return getComponents();
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return getConnnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IotwPackage.STATE_SCHEMA__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends StateComponent>)newValue);
				return;
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				getConnnections().clear();
				getConnnections().addAll((Collection<? extends Connection>)newValue);
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
			case IotwPackage.STATE_SCHEMA__COMPONENTS:
				getComponents().clear();
				return;
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				getConnnections().clear();
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
			case IotwPackage.STATE_SCHEMA__COMPONENTS:
				return components != null && !components.isEmpty();
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return connnections != null && !connnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateSchemaImpl
