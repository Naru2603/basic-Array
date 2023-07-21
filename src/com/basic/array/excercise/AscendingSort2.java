package com.basic.array.excercise;

import java.util.Arrays;

public class AscendingSort2 {

	public static void main(String[] args) {

		int[] number = { 10, 5, 9, 4, 6 };

		int[] sortedArray = SortGivenArray(number);

		System.out.println("Sorting array in Ascening Order");

		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] SortGivenArray(int[] number) {
		int temp = 0;

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		return number;

	}

}
