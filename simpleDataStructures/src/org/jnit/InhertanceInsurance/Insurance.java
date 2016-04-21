package org.jnit.InhertanceInsurance;

public class Insurance {
	protected final static int LIFE=1;
	protected final static int AUTO=2;
	protected final static int HOME=3;
	protected int kind;
	protected int polnumber;
	protected double amount;
	protected double premium;
	protected String name;
	public int getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String policyType(){
		if(kind==LIFE){
			return "LIFE";
		}
		else if(kind==AUTO){
			return "AUTO";
		}
		else if(kind==HOME){
			return "HOME";
		}
		else{
			System.out.println("Invalid insurance type");
			System.exit(1);
			return " ";
		}
		
	}
	

}
