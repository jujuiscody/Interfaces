package com.list.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setUNIntDif {

	public static void main(String[] args) {
		// initialized two sets with array of type integer
		Set<Integer> setOne = new HashSet<Integer>();
		setOne.addAll(Arrays.asList(new Integer[] {1,3,4,6,7,9}));
		Set<Integer> setTwo = new HashSet<Integer>();
		setTwo.addAll(Arrays.asList(new Integer[] {1,4,7,9}));
		
		// this will give an example of union of two set elemnts
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(setOne);
		union.addAll(setTwo);
		System.out.println(union);

		// specified set checks with other and rmoves elemnts from specified unsimilar to existing and returns result
		Set<Integer> intersection = new HashSet<Integer>(setOne);
		intersection.retainAll(setTwo);
		System.out.println("intersection of two sets:"+intersection);
		
		// differentiate two sets and discards similar elements and results the set values
		Set<Integer> difference = new HashSet<Integer>(setOne);
		difference.removeAll(setTwo);
		System.out.println(difference);
		System.out.println(difference.size());
	}

}
