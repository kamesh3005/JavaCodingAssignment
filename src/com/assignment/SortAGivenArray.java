package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAGivenArray {

	public static void main(String[] args) {

		ArrayList<Integer> ay = new ArrayList<Integer>(
				Arrays.asList(5, 6, 8, 1, 2, 45, 63, 25, 20, 19, 18, 32, 7, 9, 12));
		System.out.println("Before Sorting : " + ay);
		Collections.sort(ay);
		System.out.println("After Sorting :" + ay);
	}

}
