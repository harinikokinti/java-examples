package com.harini.main;

import java.util.Collection;
import java.util.Iterator;

import com.harini.model.Employee;

public class CollectionUtil {
	public static void printEmployees(Collection<Employee> employees) {

		Iterator<Employee> employeeItr = employees.iterator();

		System.out.println();
		System.out.println("Retrives Employees details using Values");
		while (employeeItr.hasNext()) {
			Employee empValues = employeeItr.next();
			System.out.println(
					"ID:" + empValues.getId() + " Name: " + empValues.getName() + " Salary: " + empValues.getSalary());

		}
	}
}
