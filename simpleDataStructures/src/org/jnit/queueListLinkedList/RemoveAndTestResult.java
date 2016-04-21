package org.jnit.queueListLinkedList;

public class RemoveAndTestResult {
	public boolean underflow;
	public Object value;

	public RemoveAndTestResult(boolean u) {
		underflow = u;
	}
	public RemoveAndTestResult(boolean u, Object v){
		underflow =u;
		value = v;
	}

}
