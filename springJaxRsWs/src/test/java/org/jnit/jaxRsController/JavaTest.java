package org.jnit.jaxRsController;

import junit.framework.TestCase;

//An example of test Fixtures 

public class JavaTest extends TestCase {
	protected int value1, value2;
	protected void setup(){
		value1= 3;
		value2 =3;
	}
	
	public void testAdd(){
		double result = value1 + value2;
		assertTrue(result == 6);
	}

}
