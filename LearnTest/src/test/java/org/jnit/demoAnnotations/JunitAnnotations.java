package org.jnit.demoAnnotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotations {
	
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
		System.out.println("in test");
	}
	@Ignore
	public void ignore(){
		System.out.println("in ignoretest");
	}

}
