package com.basic.array.excercise;

import java.util.Arrays;

public class RepeatedCharacterArray {

	public static void main(String[] args) {

		String string = "helloWorldwelcometojava";
		
		int res = findRepeatedCharacterArray(string);
		System.out.println(res);

	}

	private static int findRepeatedCharacterArray(String string) {
		char ch [] =string.toCharArray();
		
		for(int i =0; i<=ch.length;i++) {
			System.out.println(ch[i]+" ");
		}
		System.out.println("\n");
		
		for(int i = 0;i<=ch.length;i++) {
			int count = 1;
			for(int j = 0;j<ch.length;j++) {
				if(ch[i]== ch [j]) {
					count++;
				}
				
			}
			System.out.println(ch[i]+"--"+count);
	
		}
		return 0;
	}

}
