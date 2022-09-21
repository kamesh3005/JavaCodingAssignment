package com.trainning;

public class MaximumAndMinimunValueInArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 6,  8, 9, 10, 15, 16, 11 };

		int len = arr.length;
		int max = arr[0];
		int min = arr[0];
		double sum=arr[0];

		for (int i = 1; i < len; i++) {
			sum +=arr[i];

			if (arr[i] > max) {
				max = arr[i];
			}

			else if (arr[i] < min) {
				min = arr[i];
			}
		}
		double x=(sum-max-min)/arr.length-2;

		System.out.printf("Avg value of array of integer larg and small "+x);

	}

}
