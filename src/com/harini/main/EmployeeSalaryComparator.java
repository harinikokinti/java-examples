package com.harini.main;

import java.util.Comparator;

import com.harini.model.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary() > o2.getSalary() ? 1 : -1;
	}

}
