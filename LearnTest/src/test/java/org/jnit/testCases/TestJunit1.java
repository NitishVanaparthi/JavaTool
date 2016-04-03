package org.jnit.testCases;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit1 {
	
	@Test
	public void testAdd(){
		int num = 5;
		String temp = null;
		String str = "return if it is not found";
		boolean boo = true;
		
		assertEquals("return if it is not found", str);
		assertFalse(num>6);
		assertNotNull(str);
		assertNull(temp);
		assertTrue(boo);
		//fail();
	}

}
