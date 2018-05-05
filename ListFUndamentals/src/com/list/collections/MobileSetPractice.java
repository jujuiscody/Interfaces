package com.list.collections;

import java.util.HashSet;
import java.util.Set;

public class MobileSetPractice {

	public static void main(String[] args) {
		
		Set<Mobile> mobileSet = new HashSet<Mobile>();
		Mobile device = new Mobile();
		device.setName("apple");
		device.setVersion(4);
		Mobile secondDevice = new Mobile();
		secondDevice.setName("apple");
		secondDevice.setVersion(2);
		Mobile thirdDevice = new Mobile();
		thirdDevice.setName("apple");
		thirdDevice.setVersion(3);
		Mobile four = new Mobile();
		mobileSet.add(device);
		mobileSet.add(secondDevice);
		mobileSet.add(thirdDevice);
		System.out.println(secondDevice.hashCode());
		System.out.println(thirdDevice.hashCode());
		System.out.println(mobileSet);
		
		
	}

}
