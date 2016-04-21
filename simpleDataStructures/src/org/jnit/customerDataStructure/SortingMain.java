package org.jnit.customerDataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingMain {
	public static void main(String[] args) {
		//ArrayLists are nor Synchronized but vectors are synchronized
		//to make arrayLists are synchronized use synchornization methods
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("black");
		Collections.sort(colors);
		Collections.frequency(colors, "red");
		Collections.sort(colors, Collections.reverseOrder());
		for (String string : colors) {
			System.out.println(string);
		}
		List<String> synchronizedColors = Collections.synchronizedList(colors);
		
		List<String> colors1= new ArrayList<>();
		colors1.add("pink");
		colors1.add("voilet");
		colors1.add("red");
		colors1.add("black");
		colors1.addAll(colors);
		System.out.println("------------------");
		for (String string : colors1) {
			System.out.println(string);
			
		}
		Customer c1 = new Customer("c_121", "Mike", "Lewisville");
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
		
		Collections.sort(customers);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("---------------");
		Collections.sort(customers, new CustomerCityComperator());
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		//un modifiable lists are used to implements lists with unmodifiability
		List<Customer> unmodifiableList = getCustomers();
		unmodifiableList.remove(0);
		
		
	}
	public static List<Customer> getCustomers(){
		Customer c1 = new Customer("c_121", "Mike", "Lewisville");
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
		return Collections.unmodifiableList(customers);
	}

}
