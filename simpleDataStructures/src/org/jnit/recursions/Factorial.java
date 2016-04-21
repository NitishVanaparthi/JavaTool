package org.jnit.recursions;

public class Factorial {
	public long fact(long n) {
		long x;
		long y;

		if (n == 0)
			return 1;
		x = n - 1;
		y = fact(x);

		return n * y;

	}

	public static void main(String args[]) {
		Factorial factorial = new Factorial();

		System.out.println(factorial.fact(10));
	}

}
