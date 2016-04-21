package org.jnit.InhertanceInsurance;

import java.util.Vector;

public class MainInsurance extends Insurance {
	public static void main(String args[]) {
		AutoInsurance policy1 = new AutoInsurance();
		HomeInsurance policy2 = new HomeInsurance();
		LifeInsurance policy3 = new LifeInsurance();

		policy1.setAuto(1111, "Tom Sawyer", 1000.00, 200.0, 500, "EMT-1", "NY", "Chevy", 1996);
		policy2.setHome(1234, "Huck Finn", 3000.00, 500.00, 500, 1950);
		policy3.setLife(5486, "Becky Brills", 3000.00, 250, "Tom Sawyer", 1940);

		System.out.println("kind = " + policy1.policyType() + " Name= " + policy1.getName() + " Deductable= "
				+ policy1.getDeduct());
		System.out.println("kind = " + policy2.policyType() + " Name= " + policy2.getName() + " Deductable= "
				+ policy2.getDeduct());
		System.out.println("kind = " + policy3.policyType() + " Name= " + policy3.getName() + " Benficiary= "
				+ policy3.getBenficiery());

		AutoInsurance autoPolicy;
		HomeInsurance homePolicy;
		LifeInsurance lifePolicy;
		Vector<Object> policies = new Vector<Object>();

		for (int i = 0; i < policies.size(); i++) {
			System.out.println("Policy Type=  " + ((Insurance) policies.elementAt(i)).policyType());

			switch (((Insurance) policies.elementAt(i)).getKind()) {
			case LIFE:
				lifePolicy = (LifeInsurance) policies.elementAt(i);
				System.out.println("Name= " + lifePolicy.getName() + "Benficiery= " + lifePolicy.getBenficiery());
				break;
			case HOME:
				homePolicy = (HomeInsurance) policies.elementAt(i);
				System.out.println("Name= " + homePolicy.getName() + "Deductable= " + homePolicy.getDeduct());
				break;
			case AUTO:
				autoPolicy = (AutoInsurance) policies.elementAt(i);
				System.out.println("Name= " + autoPolicy.getName() + "Deductable= " + autoPolicy.getDeduct());
				break;

			}
		}

	}

}
