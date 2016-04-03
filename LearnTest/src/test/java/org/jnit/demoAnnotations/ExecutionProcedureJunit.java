package org.jnit.demoAnnotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionProcedureJunit {
	@BeforeClass
	public static void beforClass(){
		System.out.println("beforClass");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass");
	}
	@Before
	public void before(){
		System.out.println("in before");
	}
	@After
	public void after(){
		System.out.println("in After");
	}
	@Test
	public void test(){
		System.out.println("in test case1");
	}
	@Test
	public void ignore(){
		System.out.println("in test case2");
	}

}
