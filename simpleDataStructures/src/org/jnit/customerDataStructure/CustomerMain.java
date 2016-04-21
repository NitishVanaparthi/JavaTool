package org.jnit.customerDataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c1 = new Customer("c_121", "mike", "Lewisville");
		Customer c2 = new Customer("c_122", "Rob", "Woodbridge");
		Customer c3 = new Customer("c_123", "Tom", "castle");
		Customer c4 = new Customer("c_124", "Sam", "srewsburry");
		Customer c5 = new Customer("c_125", "Leonard", "westborough");
		List<Customer> customers = new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		for (Customer cust : customers) {
			System.out.println(cust);
		}
		
		System.out.println("------------------");
		Iterator<Customer> it = customers.iterator();
		while(it.hasNext()){
			Customer c = it.next();
			System.out.println(c);
		}
		
		System.out.println("------------------");
		ListIterator<Customer> lit = customers.listIterator();
		while(lit.hasNext()){
			Customer c = lit.next();
			System.out.println(c);
		}
		
		System.out.println("------------------");
		//List Iterator is bidirectional
		ListIterator<Customer> lit1 = customers.listIterator(customers.size());
		while(lit1.hasPrevious()){
			Customer c = lit1.previous();
			System.out.println(c);
		}
		
		System.out.println("------------------");
		//List contains an object
		Customer c0 = new Customer("c_121", "mike", "Lewisville");
		System.out.println(customers.contains(c1));
		System.out.println(customers.contains(c0));
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);

	}

}
