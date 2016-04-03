package org.jnit.writingTests;

public class EmpBusinessLogic {
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}

	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if (employeeDetails.getMonthlySalary() < 1000) {
			appraisal = 500;

		} else {
			appraisal = 500;

		}
		return appraisal;
	}

}
