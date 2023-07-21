package com.basic.array.excercise;

import java.util.Arrays;

public class TestDescendingArrayUsingComparator {

	public static void main(String[] args) {
		
		Integer [] number = {10,25,62,35,47,41};
		
	//	SortArrayUsingComparator obj= new SortArrayUsingComparator();
	// 	Arrays.sort(number, obj);
		
		Arrays.sort(number, new DescendingArrayUsingComparator()); // Anonymous object
		
		System.out.println(Arrays.toString(number));

	}

}
