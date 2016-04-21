package org.jnit.EnumDemo;

public class Orders {
	
	private Status status;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public static void main(String[] args) {
		Orders o1 = new Orders();
		o1.setStatus(Status.PLACED);
	}

}
