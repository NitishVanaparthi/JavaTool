package org.jnit.ObjectStack;

public class ClassA {
	private double value;
	private char charecter;
	public ClassA(double v, char c){
		value=v;
		charecter = c;
	}
	public void println(){
		System.out.println(" "+value+" "+charecter);
	}

}
