package com.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class CreateSetViewOfMapping {

	public static void main(String[] args) {

		HashMap<Integer, String> mp = new HashMap<Integer, String>();

		mp.put(1, "Java");
		mp.put(2, "selenium");
		mp.put(3, "Sql");
		mp.put(4, "MangoDB");
		mp.put(5, "servlet");

		Iterator<Entry<Integer, String>> itr = mp.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> next = itr.next();
			System.out.println(next.getKey() + " " + next.getValue());
		}

	}

}
