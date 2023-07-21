package com.basic.array.excercise;

public class DescendingArray {

	public static void main(String[] args) {
		
		int [] number = {23,11,52,36,46,65};
		
		int temp = 0;
	
		for(int i = 0;i<number.length;i++) {
			for (int j = i+1;j<number.length;j++) {
				
				if(number[i]< number[j]) {
					temp = number [i];
					number[i] = number [j];
					number [j] = temp;
				}
			}
		}
		
		System.out.println("pritnign Descendig Array");
		
		for(int i = 0;i<number.length;i++) {
			
			System.out.print(number[i]+ " ");
		}

		}
	}

