package org.jnit.customerDataStructure;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
	// LInked Hashset retains insertion order
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("red");
		System.out.println("set does not allow duplicate data" + colors.size());
		for (String string : colors) {
			System.out.println(string);
		}
		// nothing to remove index in sets as they are nor index base
		// datastructures.
		Employee e1 = new Employee("Sam", 1000, "Lewisville");
		Employee e2 = new Employee("Ben", 2000, "palin");
		Employee e3 = new Employee("Roy", 3000, "Delhi");
		Employee e4 = new Employee("Sam", 1000, "Lewisville");
		Set<Employee> emp = new HashSet<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		System.out.println("Employees size" + emp.size());
		// here its doing == comparision
		// I need to override hashcode and equalTo methods.
		System.out.println("hell".hashCode());
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		System.out.println("------------------------");
		Set<String> colors1 = new TreeSet<>();
		colors1.add("red");
		colors1.add("white");
		colors1.add("black");
		colors1.add("red");
		System.out.println(colors1.size());
		System.out.println(colors1);
		
		System.out.println("-------------------------");
		Set<Employee> employeeTs = new TreeSet<>();
		employeeTs.add(e1);
		employeeTs.add(e2);
		employeeTs.add(e3);
		employeeTs.add(e4);
		System.out.println(employeeTs.size());
		for (Employee employee : employeeTs) {
			System.out.println(employee);
		}
		
		
		System.out.println("------------------------------");
		
		Set<Employee> employeeCs = new TreeSet<>(new EmployeeCityComperator());
		employeeCs.add(e1);
		employeeCs.add(e2);
		employeeCs.add(e3);
		employeeCs.add(e4);
		System.out.println(employeeCs.size());
		for (Employee employee : employeeCs) {
			System.out.println(employee);
		}
		//to convert from array to list we use asList()
		//vice versa we use toArray(); 
		
		
		

	}

}
