package com.basic.array;

import java.util.Arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) {

		int[] num = { 12, 55, 23, 1, 42, 56 };

		int[] copyNum = Arrays.copyOf(num, num.length);

		System.out.println(Arrays.toString(copyNum));

		System.out.println(num == copyNum);
		System.out.println("========================");

		int[] num2 = num;
		System.out.println(Arrays.toString(num2));
		System.out.println(num == num2); //// it had copied only reference. It doesn't create new copy

	}

}
