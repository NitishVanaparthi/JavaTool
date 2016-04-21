package org.jnit.recursions;

public class Fibinocci {
	public long fib(long n) {
		long x, y;
		if (n < 0) {
			return -1;
		}
		if (n <= 1)
			return n;
		x = fib(n - 1);
		y = fib(n - 2);
		return x + y;

	}
	public static void main(String args[]){
		Fibinocci fibnocci = new Fibinocci();
		System.out.println(fibnocci.fib(50));
	}

}
