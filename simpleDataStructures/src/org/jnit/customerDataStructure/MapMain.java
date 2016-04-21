package org.jnit.customerDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {
		Map<String, String> testMap = new HashMap<>();
		testMap.put("Red", "R");
		testMap.put("Black", "B");
		testMap.put("Green", "G");
		testMap.put("Red", "Rd");
		Collections.synchronizedMap(testMap);

		System.out.println(testMap.get("Red"));
		System.out.println(testMap.size());
		// testMap.clear();
		System.out.println(testMap.isEmpty());
		for (Map.Entry<String, String> entry : testMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		Map<Employee, Boolean> employeeMap = new HashMap<>();
		Employee e1 = new Employee("Sam", 1000, "Lewisville");
		Employee e2 = new Employee("Ben", 2000, "Palin");
		Employee e3 = new Employee("Roy", 3000, "Delhi");
		Employee e4 = new Employee("Sam", 1000, "Lewisville");

		employeeMap.put(e1, true);
		employeeMap.put(e2, true);
		employeeMap.put(e3, true);
		employeeMap.put(e4, false);

		for (Map.Entry<Employee, Boolean> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Map<Employee, Boolean> employeeTreeSet = new TreeMap<>();

		employeeTreeSet.put(e1, true);
		employeeTreeSet.put(e2, true);
		employeeTreeSet.put(e3, true);
		employeeTreeSet.put(e4, false);
		// Tree Map and TreeSet need compareTo implementation to sort or
		// identify duplicate values
		for (Map.Entry<Employee, Boolean> entry : employeeTreeSet.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// HashTable does not allow null keys or null Values
		// it is a thread safe data structure
		// it throw null pointer exception
		Map<String, String> employeeTableSet = new Hashtable<>();
		employeeTableSet.put("Red", "R");
		employeeTableSet.put("Black", "B");
		employeeTableSet.put("Green", "G");
		employeeTableSet.put("Red", "Rd");
		//employeeTableSet.put(null, "o");
		//employeeTableSet.put("Orange", null);
		
		System.out.println("===================");
		Map<String, List<Integer>> ListMap = new HashMap<>();
		List<Integer> l1 = Arrays.asList(2, 4, 6, 8);
		ListMap.put("rob", l1);
		
		for (Map.Entry<String, List<Integer>> entry: ListMap.entrySet()) {
			System.out.println(entry.getKey());
			for (Integer integer : l1) {
				System.out.println(integer);
			}
		}
	}

}
