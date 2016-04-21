package org.jnit.BankingReflectionsHOS;

import org.jnit.ObjectStack.ObjectStack;

public class BankTransactions {

	public static void main(String[] args) {
		/*
		 * This class is a demonstration of how banking transactions are
		 * developed Banking transactions make use of Rollback and commit
		 * transaction So they make use of stack Data Structure (LIFO) This
		 * example for Banking transactions using Reflections and Heterogeneous
		 * data into Stack
		 */
		//stack with objects
		ObjectStack stack = new ObjectStack();
		double amount;
		Object o;
		Class<? extends Object> c;
		String s;
		amount =1000.00;
		stack.push(new Double(amount));
		DesignatedTractions transactions = new DesignatedTractions(5000, "Direct Deposit");
		stack.push(transactions);
		while(!stack.empty()){
			//reflection methods to get the name of the referenced class.In the code below, o.getClass returns the class object associated with o's class, and c.getName returns a string containing the name of the class represented by c
			o=stack.peek();
			c=o.getClass();
			s=c.getName();
			if("DesignatedTransactions".equals(s)){
				transactions = ((DesignatedTractions) o);
				transactions.println();
			}
			else if("java.lang.Double".equals(s)){
				amount = ((Double) o).doubleValue();
				System.out.println(" "+ amount);
			}
		}
		
				

	}

}
