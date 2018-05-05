package com.list.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashConstruction {

	public static void main(String[] args) {
		
		Set<String> h = new HashSet<String>(8, 0.55f);
		h.add("one");
		h.addAll(Arrays.asList(new String[] {"two","three","four","five"}));
		h.addAll(Arrays.asList(new String[] {"6","7","8","9","10"}));
		System.out.println(h.size());
		System.out.println(h.contains("8"));
		h.add("eleven");
		h.add("one");
		h.add("7");
		System.out.println(h.contains("four"));
		System.out.println(h);
	}

}
