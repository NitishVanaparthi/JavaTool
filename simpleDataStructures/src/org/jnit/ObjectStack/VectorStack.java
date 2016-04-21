package org.jnit.ObjectStack;

import java.util.Vector;
public class VectorStack {

	/*
	 * In Stack implmentation using Object class(primitive types) and array
	 * implementation of stack there drawbacks called stack size is not dynamic
	 * when comes to vector implementation of the stack data is dynamic which
	 * stisfy the Stack definition of being dynamic in nature
	 */
	
	public int top;
	@SuppressWarnings("rawtypes")
	public Vector items;
	@SuppressWarnings("rawtypes")
	public VectorStack(){
		items = new Vector();
		top = -1;
	}
	public boolean empty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	public void push(Object x){
		items.add(++top, x);
			}
	public Object pop(){
		if(empty()){
			System.out.println("stack underflwo");
			System.exit(1);
		}
		return items.remove(top--);
	}
	public PopAndTestResult popAndTest(){
		if(empty()){
			return new PopAndTestResult(true);
			
		}
		else 
			return new PopAndTestResult(false, items.remove(top--));
	}
	public Object peek(){
		if(empty()){
			System.out.println("Stack under flow");
			System.exit(1);
		}
		return items.get(top);
	}
	
}
