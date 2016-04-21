package org.jnit.customerDataStructure;

import java.util.Comparator;

public class CustomerCityComperator implements Comparator<Customer> {
//to have more than one compare criterias for the object based collections we use Comparator Interface
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getCity().compareTo(o2.getCity());
	}

}
