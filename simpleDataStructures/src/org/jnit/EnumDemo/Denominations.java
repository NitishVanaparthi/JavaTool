package org.jnit.EnumDemo;

public enum Denominations {
	DIME(10),
	QUARTER(25),
	NICKEL(5);
	
	private Denominations(int val){
		this.denominationValue=val;
	}
	
	private int denominationValue;
	
	public int getDenominationValue() {
		return denominationValue;
	}
	public void setDenominationValue(int denominationValue) {
		this.denominationValue = denominationValue;
	}
	

}
