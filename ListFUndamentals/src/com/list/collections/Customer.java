package com.list.collections;


public class Customer implements Comparable<Customer>{

	private int number;
	private String name;
	private String address;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

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
		return "Customer [number=" + number + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getAddress().compareTo(o.getAddress());
	}

	

}
