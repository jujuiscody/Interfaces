package com.list.collections;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Valid Number: ");
		long number = scanner.nextLong();
		if(number > 0) {
			System.out.println("number is positive");
		}
		else if(number < 0){
			System.out.println("number is negative");
		}
		else{
			System.out.println("number is neither negative or positive");
		}
	}

}
