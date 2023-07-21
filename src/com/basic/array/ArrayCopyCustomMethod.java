package com.basic.array;

import java.util.Arrays;

public class ArrayCopyCustomMethod {

	public static void main(String[] args) {

		int[] number = { 11, 54, 7, 5, 3, 5, 9 };

		int[] copyNumber = copyGivenArray(number);

		System.out.println(Arrays.toString(copyNumber));

		System.out.println(number == copyNumber);// if it returns false then new copy has created

	}

	private static int[] copyGivenArray(int[] input) {

		int[] copyInput = new int[input.length];

		for (int i = 0; i < input.length; i++) {

			copyInput[i] = input[i];
		}
		return copyInput;
	}

}
