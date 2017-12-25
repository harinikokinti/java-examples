package com.harini.main;

import java.util.Set;
import java.util.TreeSet;

import com.harini.model.Employee;

public class ComparableExample {
	public static void main(String a[]) {
		Set<Employee> employees = new TreeSet<>();

		employees.add(new Employee(1007, "SriRama", 500000));
		employees.add(new Employee(1002, "Seetha", 1000000));
		employees.add(new Employee(1005, "Lakshmana", 90000));
		employees.add(new Employee(1003, "Bharatha", 80000));
		employees.add(new Employee(1004, "Sathrugna", 30000));
		
		Employee searchEmployee = new Employee(1001, "Test", 10);
		
		System.out.println("Employees sorted by natural comparable");
		
		CollectionUtil.printEmployees(employees);
		
		Set<Employee> salariedSorting = new TreeSet<>(new EmployeeSalaryComparator());
		salariedSorting.addAll(employees);
		
		System.out.println("Employees sorted by salary comparator");
		
		CollectionUtil.printEmployees(salariedSorting);

	}
}
