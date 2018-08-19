/**
 */
package iotwearable.model.iotw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>I2CLCD Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iotwearable.model.iotw.IotwPackage#getI2CLCDType()
 * @model
 * @generated
 */
public enum I2CLCDType implements Enumerator {
	/**
	 * The '<em><b>I2CLCD2004</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2CLCD2004_VALUE
	 * @generated
	 * @ordered
	 */
	I2CLCD2004(0, "I2CLCD2004", "I2CLCD2004"),

	/**
	 * The '<em><b>I2CLCD1602</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2CLCD1602_VALUE
	 * @generated
	 * @ordered
	 */
	I2CLCD1602(1, "I2CLCD1602", "I2CLCD1602");

	/**
	 * The '<em><b>I2CLCD2004</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I2CLCD2004</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I2CLCD2004
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I2CLCD2004_VALUE = 0;

	/**
	 * The '<em><b>I2CLCD1602</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I2CLCD1602</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I2CLCD1602
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I2CLCD1602_VALUE = 1;

	/**
	 * An array of all the '<em><b>I2CLCD Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final I2CLCDType[] VALUES_ARRAY =
		new I2CLCDType[] {
			I2CLCD2004,
			I2CLCD1602,
		};

	/**
	 * A public read-only list of all the '<em><b>I2CLCD Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<I2CLCDType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>I2CLCD Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static I2CLCDType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			I2CLCDType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>I2CLCD Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static I2CLCDType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			I2CLCDType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>I2CLCD Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static I2CLCDType get(int value) {
		switch (value) {
			case I2CLCD2004_VALUE: return I2CLCD2004;
			case I2CLCD1602_VALUE: return I2CLCD1602;
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
	private I2CLCDType(int value, String name, String literal) {
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
	
} //I2CLCDType
