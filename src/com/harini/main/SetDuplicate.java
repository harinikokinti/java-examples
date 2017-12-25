package com.harini.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> nameSet = new HashSet<>();
		nameSet.add("Dhilli");
		nameSet.add("Harini");
		nameSet.add("Padma");
		nameSet.add("Mamatha");
		nameSet.add("Mamatha");
		nameSet.add(null);

		ArrayList<String> nameList = new ArrayList<>();

		nameList.add("Dhilli");
		nameList.add("Harini");
		nameList.add("Padma");
		nameList.add("Mamatha");
		nameList.add("Mamatha");
		nameList.add(null);

		System.out.println("Set  size :" + nameSet.size());
		System.out.println("List size :" + nameList.size());

	}
}
