package com.example.java8;

import java.util.HashMap;

public class SortHashMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Math", 98);
		hashMap.put("Data Structure", 85);
		hashMap.put("Database", 91);
		hashMap.put("Java", 95);
		hashMap.put("Operating System", 79);
		hashMap.put("Networking", 80);

		/*System.out.println(hashMap.stream()
			.sorted(Map.Entry.comparingByValue())
			.forEach(System.out::println));*/

	}

}
