package org.jnit.customerDataStructure;

public class Customer implements Comparable<Customer>{
	private String customerId;
	private String custName;
	private String city;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer(String customerId, String custName, String city) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custName=" + custName + ", city=" + city + "]";
	}
	
	@Override
	public boolean equals(Object o){
		Customer c = (Customer)o;
		 return this.getCustomerId().equals(c.getCustomerId());
	}
	@Override
	public int compareTo(Customer o) {
		return this.getCustName().compareTo(o.getCustName());
	}

}
