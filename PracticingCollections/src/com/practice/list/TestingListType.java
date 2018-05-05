package com.practice.list;

import java.util.Arrays;

public class TestingListType {
	
	public static void sum(int[] name) {
		int sum = 0;
		for(int i = 0; i < name.length; i++) {
			sum += name[i];	
		}
		System.out.println(sum);
		
	}
	
	
	public static int[] returningArray() {
		
		return new int[] {1,2,3,4};
	}

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7,7};
		String[] name = new String[2];
		int[] nums1 = {};
		Employee employee[] = new Employee[4];
		Employee emp = new Employee();
		emp.setNumber(1);
		emp.setName("");
		emp.setAddress("plano");
		employee[0] = emp;
		employee[1] = emp;
		employee[2] = emp;
		employee[3] = emp;
		System.out.println(emp.getName().getClass());
		for(int i = 0; i < employee.length;i++) {
		System.out.println(employee[i].getClass().getSuperclass());
		}
		
		TestingListType.sum(returningArray());
	
	}

}
