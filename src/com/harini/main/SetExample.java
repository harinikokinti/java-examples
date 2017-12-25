package com.harini.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.harini.model.Employee;

public class SetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employee> employeeSet = new HashSet<>();

		employeeSet.add(createEmployee(101, "Harini", 500000));
		employeeSet.add(createEmployee(102, "Dhilli", 1000000));
		employeeSet.add(createEmployee(103, "Padma", 90000));

		System.out.println("The number of Employees " + employeeSet.size());

		int findId = 102;

		Iterator<Employee> itr = employeeSet.iterator();

		while (itr.hasNext()) {
			Employee employee = itr.next();
			if (employee.getId() == findId) {
				System.out.println("Name: " + employee.getName() + " Salary :" + employee.getSalary());
				break;
			}
		}
		
		CollectionUtil.printEmployees(employeeSet);
	}

	public static Employee createEmployee(int id, String name, int salary) {
		Employee emp = new Employee(id, name, salary);
		/*
		 * emp.setId(id); emp.setName(name); emp.setSalary(salary);
		 */
		return emp;
	}
}
