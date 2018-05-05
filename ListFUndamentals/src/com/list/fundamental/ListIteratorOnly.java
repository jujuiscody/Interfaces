package com.list.fundamental;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorOnly {

	public static void main(String[] args) {
		int count = 0;
		List list = new ArrayList();
		
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		
		ListIterator li = list.listIterator();
			while(li.hasNext()) {
				int i = (int) li.next();
				count++;
				System.out.print(i);
				//System.out.println();
				if(count == 5) {
					while(li.hasPrevious()) {
						int l = (int) li.previous();
						l++;
						li.set(l);
						System.out.print("fan:"+l);
						li.remove();
						System.out.print("fan1:"+i);

						System.out.println(li);
					}
					
				}
			}
	}

}
