package com.example.java8.stringmethods;

import java.util.stream.Stream;

public class CheckWordLetterInString {

	public static void main(String[] args) {
		// Check whether String contains specific Word
		String str = "Welcome to Java World";
		boolean checkSpecificWord = Stream.of(str).anyMatch(s -> s.contains("Java"));
		System.out.println(checkSpecificWord);
		// Check String endsWith specific Word
		boolean checkWordEndsWith = Stream.of(str).anyMatch(s -> s.endsWith("World"));
		System.out.println(checkWordEndsWith);
		// How to check whether particular String startsWith specific word/letter
		boolean checkWordStartsWith = Stream.of(str).anyMatch(s -> s.startsWith("Welcome"));
		System.out.println(checkWordStartsWith);
		boolean checkEmptyString = Stream.of(str).anyMatch(s -> s.isEmpty());
		System.out.println(checkEmptyString);
	}

}
