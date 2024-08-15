package com.example.java8.stringmethods;

import java.util.stream.Stream;

public class GetACharacterFromString {

	public static void main(String[] args) {
		String str = "GetACharacterFromString";
		char charAt5 = Stream.of(str).map(s -> s.charAt(5)).findFirst().get();
		System.out.println(charAt5);
		char charAt12 = Stream.of(str).map(s -> s.charAt(12)).findFirst().get();
		System.out.println(charAt12);
	}

}
