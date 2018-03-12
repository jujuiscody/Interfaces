package com.aspect.model;

import com.aspect.aspectService.Loggable;

public class Triangle {

	private String name;

	public String getName() {
		System.out.println("triangle get called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw (new RuntimeException() );
	}
@Loggable
	public String setNameReturn(String name) {
		this.name = name;
		System.out.println("am from set return");
		return name;
			}

}
