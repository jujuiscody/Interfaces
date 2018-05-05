package com.list.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstMap {

	public static void main(String[] args) {

		Map<String, Integer> firstMap = new HashMap<String, Integer>();
		firstMap.put("one", 1);
		firstMap.put("one", 2);
		firstMap.put("two", 2);
		firstMap.put("two", 3);
		System.out.println(firstMap.get("one"));

		for (Map.Entry<String, Integer> entry : firstMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		firstMap.forEach((s, i) -> {
			System.out.println(s);
			System.out.println(i);
		});

		Map<String, List<String>> nestedMap = new HashMap<>();
		List<String> firstSetList = Arrays.asList("some", "any");
		nestedMap.put("one", firstSetList);
		nestedMap.put("two", firstSetList);
		nestedMap.put("three", firstSetList);
		nestedMap.forEach((s, l) -> {
			System.out.println(s);
			System.out.println(l);
		});

	}

}
