package com.basic.array.excercise;

import java.util.Arrays;

public class ClonnedArray {

	public static void main(String[] args) {
		
		int[] number = { 50, 2, 3, 4, 9, 5, 6 };
		
		int [] copyArray = number.clone();
		
		System.out.println(Arrays.toString(copyArray));
		System.out.println(number == copyArray);
	}

}
