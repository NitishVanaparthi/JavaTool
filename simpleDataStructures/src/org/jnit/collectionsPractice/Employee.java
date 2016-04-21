package org.jnit.collectionsPractice;

public class Employee implements Comparable<Employee>{
	private String empId;
	private String empName;
	private double empSalary;
	private String date;

public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", date=" + date
				+ "]";
	}

	public Employee(String empId, String empName, double empSalary, String date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.date = date;
	}

	public Employee() {
		super();
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.getEmpId().compareTo(o.getEmpId());
	}
	

}
