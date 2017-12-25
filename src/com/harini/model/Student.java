package com.harini.model;

public class Student  implements Comparable<Student>{
	private int registerId;
	private String name;
	private double marks;
	private int rank;
	
	public Student(int registerId, String name, double marks, int rank) {
		this.registerId = registerId;
		this.name = name;
		this.marks = marks;
		this.rank = rank;		
	}
	
	public int getRegisterId() {
		return registerId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public int getRank() {
		return rank;
	}
	
	@Override
	public int compareTo(Student x) {
		if(this.getRegisterId() == x.getRegisterId()) 
			return 0; 
			else if(this.getRegisterId() < x.getRegisterId())
				return -1 ;
			else return 1;
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(marks);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rank;
		result = prime * result + registerId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(marks) != Double.doubleToLongBits(other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rank != other.rank)
			return false;
		if (registerId != other.registerId)
			return false;
		return true;
	}
		
	}
	
