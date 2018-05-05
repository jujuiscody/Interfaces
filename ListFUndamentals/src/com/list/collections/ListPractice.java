package com.list.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPractice{

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		List<student> studentList = new ArrayList<>();
		list.add("am");
		list.add("practicing");
		list.add("list");
		list.add("iteration");
		list.add(3, "am");
		//list.addAll(1, list);
		//list.set(5, "am");
		student studentData = new student();
		studentData.setName("a");
		studentData.setAddress("each"+ "am also");
		studentList.add(studentData);
		student studentData1 = new student();
		studentData1.setName("d");
		studentData1.setAddress("aeach"+ "am also");
		studentList.add(studentData1);
		student studentData2 = new student();
		studentData2.setName("a");
		studentData2.setAddress("aeach"+ "am also");
		studentList.add(studentData2);
		/*System.out.println(studentList.contains(studentData));
		Collections.sort(studentList);
		Collections.reverse(list);
		System.out.println(studentList);
		int a = studentData.add(studentData2);
		System.out.println(a);*/
		System.out.println("before:"+studentList);
		Collections.sort(studentList, new studentComparator());
		System.out.println("after:"+studentList);
		
		
		
		
	}

}
