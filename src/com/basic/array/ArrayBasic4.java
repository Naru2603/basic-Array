package com.basic.array;

public class ArrayBasic4 {

	public static void main(String[] args) {
		
		Object [] myArray = {1,"hello",'c',10L,2.5f};
		
		System.out.println(" Length of an arry is : "+myArray.length);
		
		System.out.println(myArray[0].getClass().getName());
		System.out.println(myArray[1].getClass().getName());
		System.out.println(myArray[2].getClass().getName());
		System.out.println(myArray[3].getClass().getName());
		System.out.println(myArray[4].getClass().getName());

		System.out.println("Printing String array :");
		for (int i = 0;i<myArray.length; i++) {
			
			if(myArray[i] instanceof String) {
				
				System.out.println(myArray[i]);
			}
		}
	}

}
