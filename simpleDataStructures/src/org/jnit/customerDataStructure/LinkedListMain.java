package org.jnit.customerDataStructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListMain {
	public static void main(String[] args) {
		//Linked lists are node base data structures
		Customer c1 = new Customer("c_121", "mike", "Lewisville");
		Customer c2 = new Customer("c_122", "Rob", "Woodbridge");
		Customer c3 = new Customer("c_123", "Tom", "castle");
		Customer c4 = new Customer("c_124", "Sam", "srewsburry");
		Customer c5 = new Customer("c_125", "Leonard", "westborough");
		List<Customer> customers = new LinkedList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		Vector<Customer> vectorCustomer = new Vector<>();
		vectorCustomer.add(c1);
		vectorCustomer.add(c2);
		vectorCustomer.add(c3);
		vectorCustomer.add(c4);
		vectorCustomer.add(c5);
	}

}
