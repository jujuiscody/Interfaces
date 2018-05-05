package com.list.fundamental;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerator {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		for(int i = 0; i <= 10; i++) 
			v.addElement(i);
			System.out.println(v);
			Vector v1 = new Vector();
			for(int i = 5; i <= 10; i++)
				v1.removeElement(i);
			System.out.println(v1);
			Enumeration e = v.elements();
			e = v1.elements();
			while(e.hasMoreElements()) {
				int i = (int) e.nextElement();
				System.out.println(i);
				//if(e.nextElement() == 5)break;
			}
		

	}

}
