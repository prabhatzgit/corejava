package com.example.java8.mapentry;

import java.util.HashMap;
import java.util.Map;

public class FindEntryBasedOnValue {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(220892331, "Pakistan");
		hashMap.put(146748590, "Russia");
		hashMap.put(213728559, "Brazil");
		hashMap.put(382357386, "Indian");
		hashMap.put(332429717, "America");

		hashMap.entrySet().stream().filter(entry -> entry.getValue().equals("Indian")).forEach(System.out::println);
	}

}
