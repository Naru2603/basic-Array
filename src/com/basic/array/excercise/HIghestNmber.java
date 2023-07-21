package com.basic.array.excercise;

import java.util.Arrays;

public class HIghestNmber {

	public static void main(String[] args) {
		
		int [] num = {10,85,65,23,42,77};
		
		int res = finHighestNumber(num);
		System.out.println("Highest number is : "+res);
	}


	private static int finHighestNumber(int[] num) {
		
		Arrays.sort(num);
		
		return num[num.length-1];
	}

}
