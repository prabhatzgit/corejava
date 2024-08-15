package com.example.java8.longestshortest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestAndShortestString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bond", "Einstein", "Alice", "Whitman", "Bob", "Spider");
		String longestString = names.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(longestString);
		String smallestString = names.stream().min(Comparator.comparingInt(String::length)).get();
		System.out.println(smallestString);

		// third longest string
		String[] stringNames = new String[] { "Bond", "Einstein", "Alice", "Whitman", "Bob", "Spider" };
		String thirdLongest = Arrays.stream(stringNames).sorted(Comparator.comparing(String::length).reversed())
				.limit(3).skip(2).findFirst().get();
		System.out.println(thirdLongest);

		String thirdSmallest = Arrays.stream(stringNames).sorted(Comparator.comparing(String::length)).limit(3).skip(2)
				.findFirst().get();
		System.out.println(thirdSmallest);
	}

}
