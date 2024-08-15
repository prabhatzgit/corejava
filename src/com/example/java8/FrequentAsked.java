package com.example.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentAsked {

	public static void main(String[] args) {
		// find the length of each word of a string array in ascending order
		String[] words = { "apple", "banana", "pear", "fig", "kiwi", "grape", "mango", "berry", "banana", "apple" };
		Map<Integer, List<String>> groupedByLength = Arrays.stream(words)
				.collect(Collectors.groupingBy(String::length));
		groupedByLength.forEach((length, wordList) -> System.out
				.println(length + " letters: " + new HashSet<>(wordList).stream().findFirst()));

		// to get first duplicate element of a string array
		String[] duplicateElement = { "apple", "banana", "pear", "fig", "kiwi", "grape", "mango", "berry", "banana",
				"apple" };
		String firstDuplicate = Arrays.stream(duplicateElement).filter(e -> !e.equals(words[0]))
				.filter(new HashSet<>()::add).findFirst().orElse(null);
		System.out.println(firstDuplicate);

		// find first non-repeated character of a string
		String str = "javaeightprogramming";
		Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		Optional<Character> firstNonRepeat = collect.entrySet().stream().filter((e) -> e.getValue() == 1)
				.map(e -> e.getKey()).findFirst();
		if (firstNonRepeat.isPresent()) {
			System.out.println("First non repeating:" + firstNonRepeat.get());
		}
		collect.forEach((x, y) -> System.out.println("Key: " + x + " Val: " + y));

		// find first repeat

		Optional<Character> firstRepeat = collect.entrySet().stream().filter((e) -> e.getValue() > 1)
				.map(e -> e.getKey()).findFirst();
		System.out.println("First repeating:" + firstRepeat.orElse(null));

		// Input string to reverse each word
		String input = "Java 8 is great";

		String result = Arrays.stream(input.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining());

		System.out.println(result);

	}

}
