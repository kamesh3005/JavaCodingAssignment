package com.trainning;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		// Scanner sc=new Scanner(System.in);

		String str = " ";
		int number = 0;

		while (true) {
			try {

				System.out.println("Enter the Numbr...");

				number = Integer.parseInt(str);

				System.out.println(number);
				

			} catch (NumberFormatException e) {
				e.getStackTrace();
				System.out.println(e.getMessage());
			}
			break;
		}

	}

}
