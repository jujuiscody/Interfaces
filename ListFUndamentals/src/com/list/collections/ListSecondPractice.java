package com.list.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListSecondPractice {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("man");
		list.add("fan");
		list.add("ban");
		list.add("can");
		System.out.println(list);
		List<String> listTwo = new ArrayList<String>();
		listTwo.add("van");
		listTwo.add("dan");
		listTwo.addAll(list);
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		listTwo.forEach(consumer);
		// listTwo.forEach((s)->System.out.println(s));
		System.out.println(list);
		System.out.println(listTwo);
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.matches("van");
			}
		};

		boolean a = listTwo.removeIf(predicate);
		System.out.println(a);
		System.out.println(listTwo);
		boolean b = list.removeIf((t) -> t.endsWith("am"));
		System.out.println(b);
	}

}
