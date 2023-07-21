package com.basic.array;

import java.util.Arrays;

public class ArrayBasic3 {

	public static void main(String[] args) {

		int[] numbers = { 12, 54, 25, 23, 6 };

		String[] word = { "Hi", "hello", "Welcome", "To", "java" };

		char[] character = { 'a', 'a', 'c', 'd', 'e' };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("===========================");
		
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
		System.out.println("===========================");
		
		for (int i = 0; i < character.length; i++) {
			System.out.println(character[i]);
		}

		System.out.println("===========================");

		System.out.println(Arrays.toString(character));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(word));
	}

}
