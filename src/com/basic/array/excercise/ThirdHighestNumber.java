package com.basic.array.excercise;

import java.util.Arrays;

public class ThirdHighestNumber {

	public static void main(String[] args) {
		
		int [] num = {10,62,25,45,22,95,47,78,65};
		
		int res = findThirdHighestNumber(num);
		System.out.println(res);

	}

	private static int findThirdHighestNumber(int[] num) {
		Arrays.sort(num);
		System.out.println("Sorted array is : "+Arrays.toString(num));
		
		return num[num.length-3];
	}

}
