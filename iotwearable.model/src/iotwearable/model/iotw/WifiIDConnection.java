/**
 */
package iotwearable.model.iotw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Wifi ID Connection</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iotwearable.model.iotw.IotwPackage#getWifiIDConnection()
 * @model
 * @generated
 */
public enum WifiIDConnection implements Enumerator {
	/**
	 * The '<em><b>Id 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_0_VALUE
	 * @generated
	 * @ordered
	 */
	ID_0(0, "id_0", "id_0"),

	/**
	 * The '<em><b>Id 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_1_VALUE
	 * @generated
	 * @ordered
	 */
	ID_1(1, "id_1", "id_1"),

	/**
	 * The '<em><b>Id 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_2_VALUE
	 * @generated
	 * @ordered
	 */
	ID_2(2, "id_2", "id_2"),

	/**
	 * The '<em><b>Id 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_3_VALUE
	 * @generated
	 * @ordered
	 */
	ID_3(3, "id_3", "id_3"),

	/**
	 * The '<em><b>Id 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_4_VALUE
	 * @generated
	 * @ordered
	 */
	ID_4(4, "id_4", "id_4");

	/**
	 * The '<em><b>Id 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id 0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_0
	 * @model name="id_0"
	 * @generated
	 * @ordered
	 */
	public static final int ID_0_VALUE = 0;

	/**
	 * The '<em><b>Id 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_1
	 * @model name="id_1"
	 * @generated
	 * @ordered
	 */
	public static final int ID_1_VALUE = 1;

	/**
	 * The '<em><b>Id 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_2
	 * @model name="id_2"
	 * @generated
	 * @ordered
	 */
	public static final int ID_2_VALUE = 2;

	/**
	 * The '<em><b>Id 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id 3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_3
	 * @model name="id_3"
	 * @generated
	 * @ordered
	 */
	public static final int ID_3_VALUE = 3;

	/**
	 * The '<em><b>Id 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id 4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_4
	 * @model name="id_4"
	 * @generated
	 * @ordered
	 */
	public static final int ID_4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Wifi ID Connection</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WifiIDConnection[] VALUES_ARRAY =
		new WifiIDConnection[] {
			ID_0,
			ID_1,
			ID_2,
			ID_3,
			ID_4,
		};

	/**
	 * A public read-only list of all the '<em><b>Wifi ID Connection</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WifiIDConnection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wifi ID Connection</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WifiIDConnection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WifiIDConnection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wifi ID Connection</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WifiIDConnection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WifiIDConnection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wifi ID Connection</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WifiIDConnection get(int value) {
		switch (value) {
			case ID_0_VALUE: return ID_0;
			case ID_1_VALUE: return ID_1;
			case ID_2_VALUE: return ID_2;
			case ID_3_VALUE: return ID_3;
			case ID_4_VALUE: return ID_4;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WifiIDConnection(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //WifiIDConnection
