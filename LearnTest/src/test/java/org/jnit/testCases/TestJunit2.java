package org.jnit.testCases;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestJunit2 extends TestCase{
	protected double fvalue1;
	protected double  fvalue2;
	
	@Before
	public void setUp(){
		fvalue1 =2.0;
		fvalue2 = 3.0;
	}
	
	@Test
	public void testAdd(){
		System.out.println("No. of test Cases= "+this.countTestCases() );
		
		String name=this.getName();
		System.out.println("Test case Name= "+name);
		
		this.setName("testNewAdd");
		String newName = this.getName();
		System.out.println("updated name of the test case="+newName);
		//TestResult createResult();
		//TestResult run();
		//void run(TestResult result);
		//String toString();
		
	}
	public void tearDown(){
		
	}
	

}
