package com.trainning;

public class CommonElementInArray {

	public static void commomNumber(int ar1[], int ar2[], int ar3[]) {

		int x = 0, y = 0, z = 0;
		while (x < ar1.length && y < ar2.length && z < ar3.length) {

			if (ar1[x] == ar2[y] && ar2[y] == ar3[z]) {

				System.out.println("The common element in the sorted array is: " + ar1[x]);
				x++;
				y++;
				z++;

			}

			else if (ar1[x] > ar2[y]) {
				y++;
			} else if (ar2[y] > ar3[z]) {
				z++;
			} else {
				x++;
			}
		}

	}

	public static void main(String[] args) {

		int ar1[] = { 2, 3, 9, 15, 20, 30, 40, 52 };
		int ar2[] = { 5, 10, 15, 19, 25, 30, 50, 58, 62 };
		int ar3[] = { 6, 8, 15, 18, 24, 30, 38, 48, 56, 72 };

		commomNumber(ar1, ar2, ar3);

	}

}
