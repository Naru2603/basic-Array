package com.basic.array.excercise;

public class AscendingSort {

	public static void main(String[] args) {
		
		int [] number = {10,5,9,4,6};
		
		int temp = 0;
		
		for (int i = 0;i<number.length;i++) {
			for(int j = i+1;j<number.length;j++) {
				if(number[i]>number[j]) {
				temp = number[i];
				number[i] = number[j];
				number [j] = temp;
				}
			}
		}
		System.out.println("Sorting array in Ascening Order");
		
		for(int i = 0;i<number.length;i++) {
			
			System.out.print(number[i]+ " ");
		}
	}

}
