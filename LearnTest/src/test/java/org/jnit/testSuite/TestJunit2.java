package org.jnit.testSuite;

import static org.junit.Assert.*;

import org.jnit.testingCalsses.MessageUtil;
import org.junit.Test;

public class TestJunit2 {
	String message="Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationTest(){
		System.out.println("inside SalutationTest()");
		message="Hi!"+message;
		assertEquals(message, messageUtil.salutationMessage());
	}


}
