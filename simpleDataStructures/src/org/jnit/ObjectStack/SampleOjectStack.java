package org.jnit.ObjectStack;

public class SampleOjectStack {

	public static void main(String[] args) {
		ObjectStack s = new ObjectStack();
		int x;
		System.out.println(s.empty());
		for (int i = 0; i < 10; i++)
			//create an integer object
			s.push(new Integer(i));

		System.out.println("Result of Peek=" + s.peek());
		while (!s.empty()) {
			System.out.println("Stack is not empty");
			//remove from the integer object
			x = ((Integer) s.pop()).intValue();
			System.out.println("  " + x);
		}

		System.out.println("stack is empty");
		ClassA a;
		System.out.println(s.empty());
		for (int i = 65; i < 91; i++) {
			a = new ClassA(i, (char) i);
			s.push(a);
		}
		while (!s.empty()) {
			System.out.println("Stack is not empty");
			a = (ClassA) s.pop();
			a.println();
		}

	}

}
