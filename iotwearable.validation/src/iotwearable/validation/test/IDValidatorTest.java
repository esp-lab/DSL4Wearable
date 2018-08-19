package iotwearable.validation.test;

import static org.junit.Assert.*;
import iotwearable.validation.IDValidator;

import org.junit.Test;

public class IDValidatorTest {
	IDValidator validator;
	@Test
	public void validate_ValidID() {
		validator = new IDValidator("Hello", null);
		assertEquals(true, validator.isValid());
	}
	@Test
	public void validate_InvalidID_Null(){
		validator = new IDValidator(null, null);
		assertEquals(false, validator.isValid());
		assertEquals("Error: ID is null.", validator.getInvalidMessage());
	}
	@Test
	public void validate_InvalidID_IsEmpty(){
		validator = new IDValidator("", null);
		assertEquals(false, validator.isValid());
		assertEquals("Error: ID is empty.", validator.getInvalidMessage());
	}
	@Test
	public void validate_InvalidID_NumberFirst(){
		String message = "Error: The id invalid."
				+ "\n Note: ID only include letters, '_', positive integers"
				+ " and start with _ or letters.";
		validator = new IDValidator("1kfjk", null);
		assertEquals(false, validator.isValid());
		assertEquals(message, validator.getInvalidMessage());
	}
	@Test
	public void validate_InvalidID_Number(){
		String message = "Error: The id invalid."
				+ "\n Note: ID only include letters, '_', positive integers"
				+ " and start with _ or letters.";
		validator = new IDValidator("1", null);
		assertEquals(false, validator.isValid());
		assertEquals(message, validator.getInvalidMessage());
	}
	@Test
	public void validate_InvalidID_SymbolSpecial(){
		String message = "Error: The id invalid."
				+ "\n Note: ID only include letters, '_', positive integers"
				+ " and start with _ or letters.";
		validator = new IDValidator("k&fjk", null);
		assertEquals(false, validator.isValid());
		assertEquals(message, validator.getInvalidMessage());
	}
	@Test
	public void validate_InvalidID_SpaceFirst(){
		String message = "Error: The id invalid."
				+ "\n Note: ID only include letters, '_', positive integers"
				+ " and start with _ or letters.";
		validator = new IDValidator(" 1kfjk", null);
		assertEquals(false, validator.isValid());
		assertEquals(message, validator.getInvalidMessage());
	}
	@Test
	public void validate_InvalidID_SpaceLast(){
		String message = "Error: The id invalid."
				+ "\n Note: ID only include letters, '_', positive integers"
				+ " and start with _ or letters.";
		validator = new IDValidator("1kfjk", null);
		assertEquals(false, validator.isValid());
		assertEquals(message, validator.getInvalidMessage());
	}
}
