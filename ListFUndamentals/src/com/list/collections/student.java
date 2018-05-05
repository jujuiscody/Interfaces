package com.list.collections;

public class student implements Comparable<student>{
	
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", address=" + address + "]";
	}
	@Override
	public int compareTo(student o) {
		System.out.println(o.getName()+ " am in compare for arg "+ this.getName()+ " am besides to this");
		return this.getName().compareTo(o.getName());	
	}
	
	public int add(student o) {
		System.out.println(this.getName() + o.getName());
		return o.getName().compareTo(this.getName());
		
	}
	
	

	

}
