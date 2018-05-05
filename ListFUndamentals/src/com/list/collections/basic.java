package com.list.collections;

import java.util.Scanner;

public class basic {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String input = sc.nextLine();
	System.out.println(input);
		//String name = "vegetable";
		
		
		for(char s: input.toCharArray()) {
			System.out.println(s);
			int total = 0;
			switch(s) {
			case '0':
				total=+6;
				break;
			case '1':
				total=+6;
				break;
			case '2':
				total=+6;
				break;
			case '3':
				total=+6;
				break;
			case '4':
				total=+6;
				break;
			}
			
			System.out.println(total);
		}
		
		
		
	}

}
