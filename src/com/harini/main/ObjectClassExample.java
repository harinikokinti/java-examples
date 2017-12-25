package com.harini.main;

import com.harini.model.Employee;

public class ObjectClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee(104,"Mamatha",100000);
		Employee employee2 = new Employee(104,"Mamatha",100000);
		Employee employee3 = new Employee(105,"LakshmiNarayana",800000);
		
		Integer intToCompare = new Integer(100);
		// equals() 
		System.out.println("Employee1 and Employee2 are same : " + employee1.equals(employee2));
		System.out.println("Employee1 and Employee3 are same : " + employee1.equals(employee3));
		System.out.println("Employee1 and integer object are same : " + employee1.equals(intToCompare));
		// getClass()
		System.out.println("The current class name is : " + employee1.getClass());
		System.out.println("The hash code is : " + employee1.hashCode() + " , " + employee2.hashCode() + " , " + 
		employee3.hashCode() + " , " + intToCompare.hashCode());
		
		// toString()		
		System.out.println("The toString representation is : " + employee1);
		System.out.println(employee2);
				
	}

}
