package org.jnit.customerDataStructure;

public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee(String name, int salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}

	

	@Override
	public int hashCode() {
		return name.hashCode() + city.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.getName().equals(emp.getName()) && this.getCity().equals(emp.getCity());
	}

}
