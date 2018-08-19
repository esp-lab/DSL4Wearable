package iotwearable.validation.test;

import static org.junit.Assert.*;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.Decision;
import iotwearable.model.iotw.EndPoint;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.StartPoint;
import iotwearable.validation.StateComponentConnectionValidator;

import org.junit.Test;

public class StateComponentConnectionValidatorTest {
	EndPoint endPoint;
	StartPoint startPoint;
	Connection connection;
	Decision decision;
	StateComponentConnectionValidator validator;
	
	@Test
	public void invalid_Connect_Start_From_EndPoint() {
		endPoint = IotwFactory.eINSTANCE.createEndPoint();
		validator = new StateComponentConnectionValidator(endPoint, null);
		assertEquals(false, validator.isValid());
		assertEquals("Not start to itself.", validator.getInvalidMessage());
	}
	
	@Test
	public void invalid_Connect_With_2_Connection_From_StartPoint() {
		startPoint = IotwFactory.eINSTANCE.createStartPoint();
		connection = IotwFactory.eINSTANCE.createConnection();
		connection.setSource(startPoint);
		startPoint.getOutgoings().add(connection);
		
		validator = new StateComponentConnectionValidator(startPoint, null);
		assertEquals(false, validator.isValid());
		assertEquals("Only one connection.", validator.getInvalidMessage());
	}
	
	@Test
	public void invalid_Connect_To_StartPoint() {
		startPoint = IotwFactory.eINSTANCE.createStartPoint();
		validator = new StateComponentConnectionValidator(startPoint, startPoint);
		assertEquals(false, validator.isValid());
		assertEquals("Not connect to StartPoint.", validator.getInvalidMessage());
	}
	@Test
	public void invalid_Decision_Connect_To_Itself() {
		decision = IotwFactory.eINSTANCE.createDecision();
		validator = new StateComponentConnectionValidator(decision, decision);
		assertEquals(false, validator.isValid());
		assertEquals("Not connect to itself.", validator.getInvalidMessage());
	}
}
