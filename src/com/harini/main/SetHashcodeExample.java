package com.harini.main;

import java.util.HashSet;
import java.util.Set;

import com.harini.model.Employee;

public class SetHashcodeExample {

	public static void main(String a[]) {
		Set<Employee> employees = new HashSet<>();

		employees.add(new Employee(1001, "SriRama", 500000));
		employees.add(new Employee(1002, "Seetha", 1000000));
		employees.add(new Employee(1003, "Lakshmi", 90000));
		employees.add(new Employee(1003, "Bharatha", 80000));
		
		Employee searchEmployee = new Employee(1001, "Test", 10);
		
		System.out.println("contains : " + employees.contains(searchEmployee));

		CollectionUtil.printEmployees(employees);

	}
}