package com.basic.array.excercise;

import java.util.Arrays;

public class SecondHIghestNumber {

	public static void main(String[] args) {

		int[] number = { 41, 56, 12, 4, 36, 96 };

		int res = findSecondHighestNumber(number);
		System.out.println("Second highest numbers is : " + res);

	}

	private static int findSecondHighestNumber(int[] number) {

		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		return number[number.length - 2];
	}

}
