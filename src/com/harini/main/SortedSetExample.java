package com.harini.main;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String args[]) {
		Set<Integer> sortedNumbers = new TreeSet<>();		
		sortedNumbers.add(20);
		sortedNumbers.add(10);
		sortedNumbers.add(100);
		sortedNumbers.add(80);
		sortedNumbers.add(4);
		System.out.println("The Sorted Numbers are: " );
		Iterator<Integer> itr = sortedNumbers.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
	}
	

}
