package com.assignment;

import java.util.HashSet;

public class ConverHashSetToArray {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Mercury");
		hs.add("Mars");
		hs.add("Jupiter");
		hs.add("earth");
		hs.add("pluto");

		System.out.println("HashSet" + hs);

		String[] arr = new String[hs.size()];
		String[] array = hs.toArray(arr);
		System.out.println("Array Element");

		for (String ar : array) {
			System.out.println(ar);
		}
	}

}
