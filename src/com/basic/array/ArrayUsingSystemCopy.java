package com.basic.array;

import java.util.Arrays;

public class ArrayUsingSystemCopy {

	public static void main(String[] args) {
		
		int [] numbers = {14,32,85,65,78};
		
		int [] copyNumber = new int [numbers.length];
		
		System.arraycopy(numbers, 0, copyNumber, 2, 3);
		
		System.out.println(Arrays.toString(copyNumber));

	}

}
