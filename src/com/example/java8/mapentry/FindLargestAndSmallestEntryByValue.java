package com.example.java8.mapentry;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindLargestAndSmallestEntryByValue {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(220892331, "Pakistan");
		hashMap.put(146748590, "Russia");
		hashMap.put(213728559, "Brazil");
		hashMap.put(382357386, "Indian");
		hashMap.put(332429717, "America");

		Entry<Integer, String> entryWithLargestValue = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get();
		System.out.println(entryWithLargestValue);

		Entry<Integer, String> entryWithSmallestValue = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).findFirst().get();
		System.out.println(entryWithSmallestValue);
	}

}
