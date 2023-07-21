package com.basic.array.excercise;

public class MinValue {

	public static void main(String[] args) {

		int[] a = { 50, 2, 3, 4, 9, 5, 6 };

		int res = min(a);
		System.out.println("Minimum number is : ");
		System.out.print(res);

	}

	static int min(int[] num) {

		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		return min;
	}

}
