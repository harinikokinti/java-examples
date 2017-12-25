package com.harini.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.harini.model.Student;

public class StudentCollectionExample  implements Comparator<Student>{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList 		 
		ArrayList<Student> arrayListStudent = new ArrayList<>();
		
		arrayListStudent.add(new Student(501,"Prabhas",530,6)); // adding student' details
		arrayListStudent.add(new Student(503,"Rana",550,3));
		arrayListStudent.add(new Student(502,"Anushka",500,5));
		arrayListStudent.add(new Student(506,"Ramya",580,1));
		arrayListStudent.add(new Student(505,"Thamana",555,2));
		arrayListStudent.add(new Student(504,"Nazar",540,4));
		arrayListStudent.add(new Student(504,"Nazar",540,4));
		
		arrayListStudent.set(3, new Student(510, "Harini", 1000, 1));  // to replace at the given position
		
		Iterator<Student> itr = arrayListStudent.iterator(); //  retriving those details and printing 	
		System.out.println("Student information stored in ArrayList " );
		System.out.println("----------------------------------------" );
		
		while(itr.hasNext()) {
			Student itrStudent = itr.next();			
			System.out.println("RegisterId:" + itrStudent.getRegisterId() + " StudentName:" 
					+ itrStudent.getName() + " TotalMarks: " + itrStudent.getMarks() +" Rank: "
					+ itrStudent.getRank()); 
		} 
			
		
		
		// Set 
		
		Set<Student> studentSet = new TreeSet<>(); // Using comparbale interface, sorting is done 
		studentSet.addAll(arrayListStudent) ;

		Iterator<Student> itrSet = studentSet.iterator();
		System.out.println();
		System.out.println("Student information stored in a Set / Sorted by Comparable " );
		System.out.println("----------------------------------------" );	
		
		while(itrSet.hasNext()) {
			Student itrSetStudent = itrSet.next();
			System.out.println("RegisterId:" + itrSetStudent.getRegisterId() + " StudentName:" 
					+ itrSetStudent.getName() + " TotalMarks: " + itrSetStudent.getMarks() +" Rank: "
					+ itrSetStudent.getRank()); 
			
		} 
		
		// Set with all Student's ranks sorted  using Comparator

		
		Set<Student> sortedStudents = new TreeSet<>(new StudentCollectionExample()); // implemented comparator logic see down
		sortedStudents.addAll(arrayListStudent);
		
		Iterator<Student> itrSet2 = sortedStudents.iterator();
		System.out.println();
		System.out.println("Student information stored in a Set / Sorted by Comparator");
		System.out.println("----------------------------------------------------------" );	
		
		while(itrSet2.hasNext()) {
			Student itrSetStudent2 = itrSet2.next();
			System.out.println("RegisterId:" + itrSetStudent2.getRegisterId() + " StudentName:" 
					+ itrSetStudent2.getName() + " TotalMarks: " + itrSetStudent2.getMarks() +" Rank: "
					+ itrSetStudent2.getRank()); 
		}
		
		
		// ArrayList with students sorted by Comparable
		
		Collections.sort(arrayListStudent);  //  sorts array lst elements  since Student class implements Comparable interface
		
		Iterator<Student> iarray = arrayListStudent.iterator(); //  retriving those details and printing 	
		System.out.println();
		System.out.println("----------------------------------------" );
		System.out.println("Student information stored in ArrayList - Sorted by Comparable " );
		System.out.println("----------------------------------------" );
		
		while(iarray.hasNext()) {
			Student itrStudent = iarray.next();			
			System.out.println("RegisterId:" + itrStudent.getRegisterId() + " StudentName:" 
					+ itrStudent.getName() + " TotalMarks: " + itrStudent.getMarks() +" Rank: "
					+ itrStudent.getRank()); 
		} 
		
		
		// ArrayList with students sorted by Comparator
		
				Collections.sort(arrayListStudent,new StudentCollectionExample()); //
				
				Iterator<Student> iarray2 = arrayListStudent.iterator(); //  retriving those details and printing 
				System.out.println();
				System.out.println("Student information stored in ArrayList - Sorted by Comparator " );
				System.out.println("----------------------------------------" );
				
				while(iarray2.hasNext()) {
					Student itrStudent = iarray2.next();			
					System.out.println("RegisterId:" + itrStudent.getRegisterId() + " StudentName:" 
							+ itrStudent.getName() + " TotalMarks: " + itrStudent.getMarks() +" Rank: "
							+ itrStudent.getRank()); 
				} 
				
		
	}		
	
	// comparator logic
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getRank() > s2.getRank() ? 1 : -1 ;		
	}
	
	}


