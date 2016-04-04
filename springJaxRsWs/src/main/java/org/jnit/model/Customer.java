package org.jnit.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int customerId;
	private String cname;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Customer(String cname, String street, String city,
			String state, String country, String zipCode) {
		super();
		this.cname = cname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname
				+ ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + "]";
	}
	public Customer(int customerId, String cname, String street, String city, String state, String country,
			String zipCode) {
		super();
		this.customerId = customerId;
		this.cname = cname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	

}
