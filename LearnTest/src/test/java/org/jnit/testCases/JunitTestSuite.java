package org.jnit.testCases;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {
	public static void main(String argsString[]) {
		TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test case=  " + result.runCount());

		/*
		 * TestSuit class implements method from Test class they are * void
		 * addTest(Test test) void addTestSuite(Class<? extends TestCase>
		 * testCases) int countTestCases() String getName() void run(TestResult
		 * result) void setName(String name) void testAt(int index) int
		 * testcount() static test warning(String message)
		 */
	}

}
