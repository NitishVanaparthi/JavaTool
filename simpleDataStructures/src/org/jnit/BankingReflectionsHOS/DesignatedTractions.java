package org.jnit.BankingReflectionsHOS;

public class DesignatedTractions {
	private double amount;
	private String designation;
	public DesignatedTractions(double a, String d){
		amount = a;
		designation = d;
	}
	public void println(){
		System.out.println(" "+designation+" "+amount);
	}

}
