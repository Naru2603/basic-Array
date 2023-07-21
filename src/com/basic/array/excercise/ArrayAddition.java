package com.basic.array.excercise;

public class ArrayAddition {

	public static void main(String[] args) {
		
		int [][] number1 = {{1,2,3},{4,5,6}};
		
		int [][] number2 = {{3,4,1},{4,1,2}};
		
		int [][] add = new int [2][3];
		
		for (int i = 0;i<2;i++) {
			for(int j = 0;j<3;j++) {
				
				add[i][j] = number1[i][j] + number2 [i][j];
				System.out.print(add[i][j]+ " ");
			}
			System.out.println(" ");
		}

	}

}
