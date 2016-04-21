package org.jnit.ObjectStack;

import java.util.ArrayList;
import java.util.List;

public class ListStack {
	public int top;
	@SuppressWarnings("rawtypes")
	public List items;

	@SuppressWarnings("rawtypes")
	public ListStack() {
		items = new ArrayList();
		top = -1;
	}

	public boolean empty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public void push(Object x) {
		items.add(++top, x);
	}

	public Object pop() {
		if (empty()) {
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
