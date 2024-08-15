package com.example.java8.mapentry;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindLargestAndSmallestEntryByKey {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(220892331, "Pakistan");
		hashMap.put(146748590, "Russia");
		hashMap.put(213728559, "Brazil");
		hashMap.put(382357386, "Indian");
		hashMap.put(332429717, "America");

		Entry<Integer, String> entryWithLargestKey = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).findFirst().get();
		System.out.println(entryWithLargestKey);

		Entry<Integer, String> entryWithSmallestKey = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).findFirst().get();
		System.out.println(entryWithSmallestKey);
	}

}
