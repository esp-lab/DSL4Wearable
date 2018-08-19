/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.Component;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.ConnectionKind;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.RouterKind;
import iotwearable.model.iotw.StateSchema;
import java.util.Collection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectionImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectionImpl#getRouterKind <em>Router Kind</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectionImpl#getStateSchema <em>State Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendpoints;

	/**
	 * The default value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected static final RouterKind ROUTER_KIND_EDEFAULT = RouterKind.BENDPOINT;

	/**
	 * The cached value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected RouterKind routerKind = ROUTER_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Component source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Component target;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionKind KIND_EDEFAULT = ConnectionKind.STATE_FLOW;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConnectionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, IotwPackage.CONNECTION__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterKind getRouterKind() {
		return routerKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouterKind(RouterKind newRouterKind) {
		RouterKind oldRouterKind = routerKind;
		routerKind = newRouterKind == null ? ROUTER_KIND_EDEFAULT : newRouterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTION__ROUTER_KIND, oldRouterKind, routerKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Component)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotwPackage.CONNECTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Component newSource) {
		Component oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Component)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotwPackage.CONNECTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Component newTarget) {
		Component oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConnectionKind newKind) {
		ConnectionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSchema getStateSchema() {
		if (eContainerFeatureID() != IotwPackage.CONNECTION__STATE_SCHEMA) return null;
		return (StateSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateSchema(StateSchema newStateSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateSchema, IotwPackage.CONNECTION__STATE_SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateSchema(StateSchema newStateSchema) {
		if (newStateSchema != eInternalContainer() || (eContainerFeatureID() != IotwPackage.CONNECTION__STATE_SCHEMA && newStateSchema != null)) {
			if (EcoreUtil.isAncestor(this, newStateSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateSchema != null)
				msgs = ((InternalEObject)newStateSchema).eInverseAdd(this, IotwPackage.STATE_SCHEMA__CONNNECTIONS, StateSchema.class, msgs);
			msgs = basicSetStateSchema(newStateSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTION__STATE_SCHEMA, newStateSchema, newStateSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotwPackage.CONNECTION__STATE_SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateSchema((StateSchema)otherEnd, msgs);
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
			case IotwPackage.CONNECTION__STATE_SCHEMA:
				return basicSetStateSchema(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IotwPackage.CONNECTION__STATE_SCHEMA:
				return eInternalContainer().eInverseRemove(this, IotwPackage.STATE_SCHEMA__CONNNECTIONS, StateSchema.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.CONNECTION__BENDPOINTS:
				return getBendpoints();
			case IotwPackage.CONNECTION__ROUTER_KIND:
				return getRouterKind();
			case IotwPackage.CONNECTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IotwPackage.CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IotwPackage.CONNECTION__KIND:
				return getKind();
			case IotwPackage.CONNECTION__LABEL:
				return getLabel();
			case IotwPackage.CONNECTION__STATE_SCHEMA:
				return getStateSchema();
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
			case IotwPackage.CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
				return;
			case IotwPackage.CONNECTION__ROUTER_KIND:
				setRouterKind((RouterKind)newValue);
				return;
			case IotwPackage.CONNECTION__SOURCE:
				setSource((Component)newValue);
				return;
			case IotwPackage.CONNECTION__TARGET:
				setTarget((Component)newValue);
				return;
			case IotwPackage.CONNECTION__KIND:
				setKind((ConnectionKind)newValue);
				return;
			case IotwPackage.CONNECTION__LABEL:
				setLabel((String)newValue);
				return;
			case IotwPackage.CONNECTION__STATE_SCHEMA:
				setStateSchema((StateSchema)newValue);
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
			case IotwPackage.CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				return;
			case IotwPackage.CONNECTION__ROUTER_KIND:
				setRouterKind(ROUTER_KIND_EDEFAULT);
				return;
			case IotwPackage.CONNECTION__SOURCE:
				setSource((Component)null);
				return;
			case IotwPackage.CONNECTION__TARGET:
				setTarget((Component)null);
				return;
			case IotwPackage.CONNECTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case IotwPackage.CONNECTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case IotwPackage.CONNECTION__STATE_SCHEMA:
				setStateSchema((StateSchema)null);
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
			case IotwPackage.CONNECTION__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case IotwPackage.CONNECTION__ROUTER_KIND:
				return routerKind != ROUTER_KIND_EDEFAULT;
			case IotwPackage.CONNECTION__SOURCE:
				return source != null;
			case IotwPackage.CONNECTION__TARGET:
				return target != null;
			case IotwPackage.CONNECTION__KIND:
				return kind != KIND_EDEFAULT;
			case IotwPackage.CONNECTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case IotwPackage.CONNECTION__STATE_SCHEMA:
				return getStateSchema() != null;
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
		result.append(" (bendpoints: ");
		result.append(bendpoints);
		result.append(", routerKind: ");
		result.append(routerKind);
		result.append(", kind: ");
		result.append(kind);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
