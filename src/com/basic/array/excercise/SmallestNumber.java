package com.basic.array.excercise;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		
		int [] number = {88,6,1,45,65,25};
		
		int result = findSmallestNumber(number);
		
		System.out.println("Smallest number is : "+result);

	}

	private static int findSmallestNumber(int[] number) {
		Arrays.sort(number);
		System.out.println("Sorted Array is : "+Arrays.toString(number));
		
		return number[0];
	}

}
