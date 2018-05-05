package com.list.fundamental;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {

	List list = new ArrayList();
	int count = 0;
	list.add("raju");
	for(int i = 0; i < 10; i++) {
		list.add(i);
	}
	System.out.println(list);
	Iterator i = list.iterator();
	while(i.hasNext()) {
			System.out.print(i.next());
			count++;
			i.remove();
			//if(count == 5)break;
	}
	System.out.print(list);

}}
