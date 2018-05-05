package com.list.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CustomListPractice {
	
	public static void main (String args[]) {
		List<Customer> list = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setNumber(11);
		customer.setName("Zmyman");
		customer.setAddress("MA");
		list.add(customer);
		Customer customerTwo = new Customer();
		customerTwo.setNumber(2);
		customerTwo.setName("youMyMan");
		customerTwo.setAddress("aNH");
		list.add(customerTwo);
		Customer customerTwo1 = new Customer();
		customerTwo1.setNumber(2);
		customerTwo1.setName("AyouMyMan");
		customerTwo1.setAddress("bNH");
		list.add(customerTwo1);
	/*Comparator comparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.getName().compareTo(o2.getName());
		}

	};*/
	
	Collections.sort(list, (o1,o2)->o2.getName().compareTo(o1.getName()));
	System.out.println(list);
	//Collections.sort(list);
	System.out.println(list+"after lambda");
		//System.out.println(list.removeIf(t->t.equals(customer)));
		list.iterator().forEachRemaining((t)->System.out.println(t));
		
		
		
	}
}
