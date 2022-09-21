package com.assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateValueInArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Kanna");
		al.add("Ravi");
		al.add("Guna");
		al.add("Kanna");
		al.add("Ravi");

		for (String na : al) {

			System.out.println(na);
		}
		HashSet<String> hs = new HashSet<String>(al);

		System.out.println("------------------------------------");

		for (String ha : hs) {
			System.out.println(ha);
		}

	}

}
