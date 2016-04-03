package org.jnit.testSuite;

import static org.junit.Assert.*;

import org.jnit.testingCalsses.MessageUtil;
import org.junit.Test;

public class TestJunit1 {
	String message="Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(timeout=3000)
	public void printMessage(){
		System.out.println("inside test printMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

}
