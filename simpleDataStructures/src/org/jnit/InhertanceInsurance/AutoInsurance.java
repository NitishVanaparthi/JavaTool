package org.jnit.InhertanceInsurance;

public class AutoInsurance extends Insurance {
	private double autoDeduct;
	private String liecense;
	private String state;
	private String model;
	private int year;

	public void setAuto(int polnumber, String name, double amount, double premium, double d, String l, String s,
			String m, int y) {

		kind = AUTO;
		this.polnumber = polnumber;
		this.name = name;
		this.amount = amount;
		this.premium = premium;
		autoDeduct = d;
		liecense = l;
		state = s;
		model = m;
		year = y;

	}

	public double getDeduct() {
		return autoDeduct;
	}

	public String getLiecense() {
		return liecense;
	}

	public String getState() {
		return state;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

}
