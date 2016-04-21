package orj.jnit.arrayStack;

public class StackArrayImplementation {
	/*
	 * // Implementation of Stack data structure using arrays // A stack is a
	 * ordered collection of items as arrays in java only // difference is
	 * elements of stack are inserted and deleted from only one // end
	 */

	/*
	 * We need three different operation to implement stack they are 1. PUSH()
	 * 2. POP() 3. peek()
	 */
	private final int STACKSIZE = 100;
	private int top;
	private int[] items;

	public StackArrayImplementation() {
		items = new int[STACKSIZE];
		top = -1;
	}

	// here we write a method that say whether stack is full or not
	public boolean empty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}

	public PopAndTest popAndTestResult() {
		if (empty()) {
			return new PopAndTest(true);
		} else
			return new PopAndTest(false, items[top--]);
	}

	public void pushAndTestResult(int x) {
		if (top == STACKSIZE - 1) {
			System.out.println("Stack OverFlow");
			System.exit(1);
		}
		items[++top] = x;
		System.out.println(x);

	}
	public int pop(){
		if(empty()){
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return items[top--];
	}

	public int peek() {
		if (empty()) {
			System.out.println("stack underflow");
			System.exit(1);
		}
		return items[top];
	}

	public static void main(String[] args) {
		StackArrayImplementation s = new StackArrayImplementation();
		PopAndTest pop = s.popAndTestResult();
		s.pushAndTestResult(3);
		s.pushAndTestResult(5);

		if (pop.underflow) {
			System.out.println("stack is underflow");
		} else
			System.out.println(s.items[s.top--]);

		s.peek();

	}
}
