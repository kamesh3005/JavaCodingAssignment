package com.mapexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();

		al1.add("Jaunary");
		al1.add("February");
		al1.add("March");
		al1.add("April");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("May");
		al2.add("June");
		al2.add("July");

		// 1.Add All method();
		al1.addAll(al2);
		System.out.println(al1);

		// clear method()
		al1.clear();
		System.out.println(al1);

		// clone Methods
		ArrayList<String> cloneList = (ArrayList<String>) al1.clone();
		System.out.println(cloneList);

		// contains Method
		System.out.println(al1.contains("April"));// true
		System.out.println(al1.contains("May"));// false

		// Indexof Method();
		System.out.println(al1.indexOf("March"));

		System.out.println(al1.indexOf("April") > 2);// true

		// lastIndexOf

		ArrayList<String> ls1 = new ArrayList<String>(
				Arrays.asList("kanna", "Ram", "Naveen", "Kanna", "Ravi", "Kumar"));

		System.out.println(ls1);
		int l = ls1.lastIndexOf("Ravi");
		System.out.println(l);

		// Remove Methods(); Remove the element
		ls1.remove(3);
		System.out.println(ls1);
		ls1.remove(2);
		System.out.println(ls1);

		// RetainsAll();
		ArrayList<String> ls2 = new ArrayList<String>(Arrays.asList("kanna", "Ram", "Naveen", "Ram", "Ravi", "Kumar"));

		System.out.println(ls2);
		ls2.retainAll(Collections.singleton("Ram"));
		System.out.println(ls2);

		// To create subList

		ArrayList<Integer> ai1 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		System.out.println(ai1);
		ArrayList<Integer> sublist = new ArrayList<Integer>(ai1.subList(3, 7));

		System.out.println(sublist);

		// To ArrayMethod
		ArrayList<String> ls3 = new ArrayList<String>(Arrays.asList("kanna", "Ram", "Naveen", "Ram", "Ravi", "Kumar"));

		Object[] ob = ls3.toArray();

		for (Object object : ob) {
			System.out.println(object);

		}

	}

}
