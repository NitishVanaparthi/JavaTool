package org.jnit.InhertanceInsurance;

public class HomeInsurance extends Insurance{
	private double homeDeduct;
	private int yearBuilt;
	public void setHome(int polnumber, String name, double amount, double premium, double h, int y){
		kind = HOME;
		this.polnumber = polnumber;
		this.name = name;
		this.amount = amount;
		this.premium = premium;
		homeDeduct = h;
		yearBuilt = y;
		
	}
	public double getDeduct() {
		return homeDeduct;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}

}
