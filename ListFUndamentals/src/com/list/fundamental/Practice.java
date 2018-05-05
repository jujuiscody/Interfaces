package com.list.fundamental;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	
	static List <String> name = new ArrayList(10);
	static List <String> last = new ArrayList();

	public static void main(String[] args) {
		
		name.add("raju");
		name.add("dog");
		name.add("cat");
		name.add(3, "fan");
		System.out.println(last.addAll(0, name)); // it adds all elements of anoe list to other
		System.out.println(last.remove("dog"));// it removes given object
		System.out.println(last.size());// it gives element size
		System.out.println(last.lastIndexOf("cat")); // it gives the last occurence of given element or -1 if elemnet is not present.
		System.out.println(last.iterator().toString());
	}

}
