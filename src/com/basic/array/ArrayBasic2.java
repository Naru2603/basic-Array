package com.basic.array;

public class ArrayBasic2 {

	public static void main(String[] args) {

		int[] number = new int[6];

		int j = 10;

		for (int i = 0; i < number.length; i++) {

			number[i] = j;
			j = j + 10;
		}

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

	}

}
