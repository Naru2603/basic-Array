package com.basic.array.excercise;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int [] number = {10,25,11,2,3,5,7};

		Arrays.sort(number);
		
		System.out.println("Sorted Arrays using binary sort : ");
		for(int i = 0; i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
	}

}
