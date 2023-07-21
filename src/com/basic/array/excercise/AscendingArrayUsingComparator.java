package com.basic.array.excercise;

import java.util.Comparator;

public class AscendingArrayUsingComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {

		if (n1 == n2) {
			return 0;
		} else if (n1 > n2)
			return 1;
		else
			return -1;

	}
}
