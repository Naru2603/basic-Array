package com.basic.array.excercise;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int [] number = {45,54,25,12,6,65,21,10};
		
		int res = findSecondSmallestnumber(number);
		System.out.println("Second smallaest number is : "+ res);

	}

	private static int findSecondSmallestnumber(int[] number) {
		Arrays.sort(number);
		
		System.out.println(Arrays.toString(number));
		return number[1];
	}

}
