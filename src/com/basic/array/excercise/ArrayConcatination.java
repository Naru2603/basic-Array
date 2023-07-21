package com.basic.array.excercise;

import java.util.Arrays;

public class ArrayConcatination {

	public static void main(String[] args) {
		
		int [] number1 = {10,20,30,40};
		
		int [] number2 = {50,40,70,80,90,5};
		
		int [] concatedArray = concateTwoArray(number1, number2);
		System.out.println(Arrays.toString(concatedArray));
}

	private static int[] concateTwoArray(int[] number1, int[] number2) {
		
		int [] res = new int [number1.length + number2.length];
		
		int j = 0;
		for(int i = 0;i<res.length;i++) {
			
			if(i<= number1.length-1) {
				res[i] = number1[i];
			}
			else {
				res[i] = number2[j];
				j++;
			}
		}
		return res;
	}
}
