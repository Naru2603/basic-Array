package com.basic.array.excercise;

import java.util.Arrays;

public class DescendingArray2 {

	public static void main(String[] args) {
		
		int [] num = {12,22,55,33,47,65};
		
		int [] sortNum = sortGivenArray(num);
		
		System.out.println(Arrays.toString(sortNum));

	}

	private static int[] sortGivenArray(int [] number) {
		
		int temp = 0;
		
		for (int i = 0; i<number.length;i++) {
			for(int j = i+1; j<number.length;j++) {
			
				if(number[i]<number[j]) {
					temp = number[i];
					number [i] = number [j];
					number [j] = temp;
				}
				
		}
		
	}
		return number;
	}
	}
