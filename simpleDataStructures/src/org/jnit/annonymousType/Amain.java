package org.jnit.annonymousType;

public class Amain{
	public static void main(String[] args) {
		AnnonymousType a1 = new AnnonymousType() {
			
			@Override
			public void logout() {
				System.out.println("inside logout annnonymous block");
				
			}
			
			@Override
			public void login() {
				System.out.println("inside login annonymous inner type");
				
			}
		};
		a1.login();
		a1.logout();
	}

}
