package com.basic.array;

public class ArrayBasic5 {

	public static void main(String[] args) {
		
		String s = "Hello";
		
		System.out.println(s.getClass().getName());
		
		Integer i = 20;
		
		System.out.println(i.getClass().getName());
		
		System.out.println("===================================");
		
		int [] num = {10,20,30,40};
		
		float [] num2 = {15,26,22,62,45};
		
		double [] num3 = {52,14,95,84,45};
		
		long [] num4 = {33,23,44,16,96};
		
		System.out.println(num.getClass().getName());
		System.out.println(num2.getClass().getName());
		System.out.println(num3.getClass().getName());
		System.out.println(num4.getClass().getName());

	}

}
