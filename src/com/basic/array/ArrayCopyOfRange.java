package com.basic.array;

import java.util.Arrays;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		
		int [] number = {41,12,32,10,85,44,55,33,5,65,2,4,6};
		
		int [] copyNumber = Arrays.copyOfRange(number, 5, 11);
		
		System.out.println(Arrays.toString(copyNumber));

	}

}
