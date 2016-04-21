package org.jnit.recursions;

public class MultiplicationMain {
	
	public long mult(long a, long b){
		long c, d, sum;
		if(b==1)
			return a;
		c=b-1;
		d=mult(a, c);
		sum=d+a;
		return sum;
	}
	
	public static void main(String args[]){
		MultiplicationMain mm = new MultiplicationMain();
		System.out.println(mm.mult(3, 4));
	}

}
