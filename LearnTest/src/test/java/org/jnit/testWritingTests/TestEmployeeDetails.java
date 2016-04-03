package org.jnit.testWritingTests;

import static org.junit.Assert.*;

import org.jnit.writingTests.EmpBusinessLogic;
import org.jnit.writingTests.EmployeeDetails;
import org.junit.Test;

public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	@Test
	public void calculateAppraisal(){
		employee.setName("Tim Dreyer");
		employee.setMonthlySalary(5000);
		employee.setAge(25);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	@Test
	public void testCalculateYearlySalary(){
		employee.setName("Tim Dreyer");
		employee.setMonthlySalary(8000);
		employee.setAge(25);
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
		
	}

}
