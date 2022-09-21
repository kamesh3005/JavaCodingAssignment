package com.trainning;

import java.util.Arrays;

public class MovesAll0TotheEnd {

	public static void moveZero(int[] arr) {

		int len = arr.length;

		int newArray[] = new int[len];
		int count = 0;
		for (int i = 0; i < len; i++) {

			if (arr[i] != 0) {
				newArray[count] = arr[i];
				count++;

			}
		}

		System.out.println(Arrays.toString(newArray));

	}

	public static void main(String[] args) {

		int[] j = { 1, 0, 2, 0, 3, 0, 0, 0, 1, 0, 8, 9, 0, 5, 8, 0, 1 };
		moveZero(j);

	}

}
