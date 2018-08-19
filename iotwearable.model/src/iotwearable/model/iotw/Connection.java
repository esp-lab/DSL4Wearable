/**
 */
package iotwearable.model.iotw;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Connection#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Connection#getRouterKind <em>Router Kind</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Connection#getTarget <em>Target</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Connection#getKind <em>Kind</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Connection#getLabel <em>Label</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Connection#getStateSchema <em>State Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see iotwearable.model.iotw.IotwPackage#getConnection_Bendpoints()
	 * @model dataType="iotwearable.model.iotw.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Router Kind</b></em>' attribute.
	 * The default value is <code>"Bendpoint"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.RouterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Kind</em>' attribute.
	 * @see iotwearable.model.iotw.RouterKind
	 * @see #setRouterKind(RouterKind)
	 * @see iotwearable.model.iotw.IotwPackage#getConnection_RouterKind()
	 * @model default="Bendpoint"
	 * @generated
	 */
	RouterKind getRouterKind();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Connection#getRouterKind <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Kind</em>' attribute.
	 * @see iotwearable.model.iotw.RouterKind
	 * @see #getRouterKind()
	 * @generated
	 */
	void setRouterKind(RouterKind value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Component)
	 * @see iotwearable.model.iotw.IotwPackage#getConnection_Source()
	 * @model
	 * @generated
	 */
	Component getSource();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Component value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Component)
	 * @see iotwearable.model.iotw.IotwPackage#getConnection_Target()
	 * @model
	 * @generated
	 */
	Component getTarget();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Component value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.ConnectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see iotwearable.model.iotw.ConnectionKind
	 * @see #setKind(ConnectionKind)
	 * @see iotwearable.model.iotw.IotwPackage#getConnection_Kind()
	 * @model
	 * @generated
	 */
	ConnectionKind getKind();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Connection#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see iotwearable.model.iotw.ConnectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConnectionKind value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see iotwearable.model.iotw.IotwPackage#getConnection_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Connection#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>State Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.StateSchema#getConnnections <em>Connnections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Schema</em>' container reference.
	 * @see #setStateSchema(StateSchema)
	 * @see iotwearable.model.iotw.IotwPackage#getConnection_StateSchema()
	 * @see iotwearable.model.iotw.StateSchema#getConnnections
	 * @model opposite="connnections" transient="false"
	 * @generated
	 */
	StateSchema getStateSchema();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Connection#getStateSchema <em>State Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Schema</em>' container reference.
	 * @see #getStateSchema()
	 * @generated
	 */
	void setStateSchema(StateSchema value);

} // Connection
