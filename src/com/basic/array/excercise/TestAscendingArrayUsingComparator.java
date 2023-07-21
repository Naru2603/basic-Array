package com.basic.array.excercise;

import java.util.Arrays;

public class TestAscendingArrayUsingComparator {

	public static void main(String[] args) {
		
		Integer [] number = {45,25,33,12,10,15};
		
		AscendingArrayUsingComparator obj = new AscendingArrayUsingComparator();

		Arrays.sort(number, obj);
		
		System.out.println(Arrays.toString(number));
	}

}
