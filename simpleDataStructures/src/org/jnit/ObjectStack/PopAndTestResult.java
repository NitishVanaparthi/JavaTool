package org.jnit.ObjectStack;

public class PopAndTestResult {
	public boolean underflow;
	public Object value;

	PopAndTestResult(boolean u) {
		underflow = u;
	}

	PopAndTestResult(boolean u, Object v) {
		underflow = u;
		value = v;
	}

}
