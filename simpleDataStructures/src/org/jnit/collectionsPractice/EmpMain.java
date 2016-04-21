package org.jnit.collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class EmpMain {

	public static void main(String[] args) {

		Employee e1 = new Employee("123sdf", "Robbin", 3.00, "3/22/2016");
		Employee e2 = new Employee("123gth", "BatMan", 5.00, "3/22/2016");
		Employee e3 = new Employee("123jkl", "SuperMan", 5.00, "3/22/2016");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		for (Employee emp1 : emp) {
			System.out.println(emp1);
		}
		
		/* Use key value pairs of maps to set the values*/
		
		Map<String, Employee> map = new TreeMap<String, Employee>();
		map.put(e1.getEmpName(), e1);
		map.put(e2.getEmpName(), e2);
		map.put(e3.getEmpName(), e3);
		
		for(Entry<String, Employee> emp3: map.entrySet()){
			System.out.println("Printing Map Values" + emp3);
			
		}
		
		/*tree map to sort the values*/
		/*hashcode, equals, set, heap memory*/
		//Anonymous type
		
		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId().compareTo(o2.getEmpId());
			}
		});

	}
}
