package org.jnit.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jnit.testingCalsses.PrimeNumberChecker;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;

	@Before
	public void intializer() {
		primeNumberChecker = new PrimeNumberChecker();
	}

	public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 23, true }

		});
	}

	@Test
	public void testPrimeNumberChecker() {
		System.out.println("parameterized number is= " + inputNumber);
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
		primeNumberChecker.validate(inputNumber);
	}

}
