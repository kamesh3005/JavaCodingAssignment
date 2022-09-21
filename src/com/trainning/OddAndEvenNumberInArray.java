package com.trainning;

import java.util.Scanner;

public class OddAndEvenNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array Length");

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Enter the Number");

			arr[i] = sc.nextInt();
		}

		System.out.println("Even Number :-");
		for (int i = 0; i < n; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " ");

			}
		}
		System.out.println("Odd Number :-");
		for (int i = 0; i < n; i++) {

			if (arr[i] % 2 != 0) {
				System.out.println(arr[i] + " ");

			}
		}

	}

}
