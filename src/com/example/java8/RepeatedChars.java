package com.example.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedChars {

	public static void main(String[] args) {

		String str = "javaeightprogramming";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map);
	}

}
