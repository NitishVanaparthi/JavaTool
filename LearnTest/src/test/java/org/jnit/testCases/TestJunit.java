package org.jnit.testCases;

import static org.junit.Assert.*;

import org.jnit.testingCalsses.MessageUtil;
import org.junit.Test;

public class TestJunit {
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		message = "New World";
		assertEquals(message, messageUtil.printMessage());
	}
	

}
