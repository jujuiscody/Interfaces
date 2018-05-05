package com.practice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModifException {

	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("list values :"+value);
			if(value.equals("one"))list.remove("two");
		}
		
		System.out.println(list);
				

	}

}
