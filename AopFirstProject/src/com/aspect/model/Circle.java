package com.aspect.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String setNameReturn(String name) {
		this.name = name;
		System.out.println("am from set return");
		return name;
	}
}
