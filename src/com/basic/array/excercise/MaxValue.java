package com.basic.array.excercise;

import java.util.Arrays;

public class MaxValue {

	public static void main(String[] args) {
		int[] number = { 55, 12, 32, 99, 54, 102 };

		int res = max(number);
		System.out.println("Maximum number is : ");
		System.out.println(res);
	}

	private static int max(int[] number) {
		
		int max = number[0];
		
		for(int i = 1;i<number.length;i++) {
			
			if(max<number[i]) {
				
				max = number[i];
			}
		}
		return max;
	}

}
