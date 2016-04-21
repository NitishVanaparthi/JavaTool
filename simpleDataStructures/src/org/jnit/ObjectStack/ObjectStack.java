package org.jnit.ObjectStack;

public class ObjectStack {

	// Stack Data structure implementation using Object Class in java
	private final int STACKSIZE = 100;
	private int top;
	private Object[] items;

	public ObjectStack() {
		items = new Object[STACKSIZE];
		top = -1;
	}

	public boolean empty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void push(Object x) {
		if (top > STACKSIZE - 1) {
			System.out.println("Stack OverFlow");
			System.exit(1);
		}
		items[++top] = x;
	}

	public Object pop() {
		if (empty()) {
			System.out.println("Stack underflow");
		}
		return items[top--];
	}

	public PopAndTestResult popAndTest() {
		if (empty())
			return new PopAndTestResult(true);
		else
			return new PopAndTestResult(false, items[top--]);
	}

	public Object peek() {
		if (empty()) {
			System.out.println("Stack undeflow");
			System.exit(1);
		}
		return items[top];
	}
}
