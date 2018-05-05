package com.list.collections;

public abstract class AbstractClass {
	
	int value =3;
	
	abstract int add();
	protected abstract int sub();
	protected int add(int a, int b) {
		int c = a + b;
		return c;
	}

}
