package com.list.collections;

import java.util.Comparator;

public class studentComparator implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);
	}

}
