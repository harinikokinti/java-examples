package com.harini.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.harini.model.Employee;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Employee> employeeMap = new HashMap<>();

		Employee emp1 = new Employee(101, "Harini", 50000);
		Employee emp2 = new Employee(102, "Dhilli", 80000);
		Employee emp3 = new Employee(103, "Padma", 90000);

		employeeMap.put(emp1.getId(), emp1); // Adds Employee details
		employeeMap.put(emp2.getId(), emp2);
		employeeMap.put(emp3.getId(), emp3);

		Employee foundEmployee = employeeMap.get(103); // Retrives Employee
														// object

		System.out.println("Name : " + foundEmployee.getName() + " Salary: " + foundEmployee.getSalary());

		Set<Integer> keysSet = employeeMap.keySet();
		Iterator<Integer> itr = keysSet.iterator();

		System.out.println("Retrives Employee details using keys");
		while (itr.hasNext()) {
			Integer empID = itr.next();
			Employee employee = employeeMap.get(empID);			
			System.out.println(
					"ID:" + employee.getId() + " Name: " + employee.getName() + " Salary: " + employee.getSalary());

		}
		
		
		Collection<Employee> employeeValues =  employeeMap.values();
		
		CollectionUtil.printEmployees(employeeValues);  //static methods must be called using class name
		/*
		Iterator<Employee> employeeItr = employeeValues.iterator();
		
		System.out.println();
		System.out.println("Retrives Employee details using Values");
		while(employeeItr.hasNext()) {
		Employee empValues = employeeItr.next();
		System.out.println(
				"ID:" + empValues.getId() + " Name: " + empValues.getName() + " Salary: " + empValues.getSalary());

		} */
		
		

	}

}
