package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayListToAtotherList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Java",
				"Selenium", "Oracal", "JSP", "Phyton"));
		System.out.println("WithOut Clone   "   + al);
		ArrayList<String> cloneObject = (ArrayList<String>) al.clone();

		System.out.println("After clone : " + cloneObject);
	}

}
