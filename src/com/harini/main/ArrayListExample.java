package com.harini.main;

import java.util.List;
import java.util.ArrayList;

import com.harini.model.Employee;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(createEmployee(101, "Harini", 50000));
		employeeList.add(createEmployee(102, "Dhilli", 80000));
		employeeList.add(createEmployee(103, "Padma", 90000));
		//employeeList.clone();
		

		System.out.println("The number of Employees " + employeeList.size());
		
		int findId = 101;

		for (int i = 0; i <= employeeList.size(); i++) {
			Employee employee = employeeList.get(i);

			if (employee.getId() == findId) {
				System.out.println("Name: " + employee.getName() + " Salary :" + employee.getSalary());
				break;
			}

		}
		
	CollectionUtil.printEmployees(employeeList);
	
	// Extra Practice on Lists
	
		ArrayList<String> namesList = new ArrayList<>();
		
		namesList.add("Harini");
		namesList.add("Dhilli");
		namesList.add("Mamatha");
		namesList.add("Lakshminarayana");
		
		System.out.println("The names in the first list are : " +namesList);
		
		List<String> secondList = new ArrayList<>();
		secondList.add("amma");
		secondList.add("nanna");
		
		namesList.addAll(secondList);
		
		System.out.println("The names in the first list after copying: " +namesList);
		
	}

	
	
	public static Employee createEmployee(int id, String name, int salary) {
		Employee emp = new Employee(id, name, salary);
		/*emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);*/
		return emp;
	}
	
	
	
	}


