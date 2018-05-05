package com.list.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		
		Set<String> firstSet = new HashSet<String>();
		
		firstSet.add("am");
		firstSet.add("coming");
		firstSet.add("am");
		firstSet.add("from");
		firstSet.add("coming");
		firstSet.add("louuis");
		
		for(String s: firstSet) {
			System.out.println(s);
		}
		
		Set<String> treeSet = new TreeSet<String>(firstSet); 
		System.out.println(treeSet);
		

	}

}
