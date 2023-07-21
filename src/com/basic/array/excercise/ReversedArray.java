package com.basic.array.excercise;

import java.util.Arrays;

public class ReversedArray {

	public static void main(String[] args) {
		
		int [] num = {45,12,23,51,10,11};
		
		int res = findHighestNumber(num);
		
		System.out.println("Highest number is : "+res);
		
	}

	private static int findHighestNumber(int[] num) {
		Arrays.sort(num);
		int [] reversedArray = new int[num.length];
		
		int j = 0;
		
		for (int i = num.length-1; i>=0;i--) {
			reversedArray[j] = num[i];
			j++;
		}
		return reversedArray[0];
	}

}
