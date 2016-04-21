package org.jnit.InhertanceInsurance;

public class LifeInsurance extends Insurance {
	private String benficiery;
	private int yearBorn;
	public void setLife(int polNumber, String name, double amount, double premium, String b, int y){
		kind = LIFE;
		this.polnumber = polNumber;
		this.name = name;
		this.amount = amount;
		this.premium = premium;
		benficiery = b;
		yearBorn = y;
	}
	
	public String getBenficiery() {
		return benficiery;
	}
	public int getYearBorn() {
		return yearBorn;
	}
	

}
