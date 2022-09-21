package com.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapContaisKey {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Kamesh");
		hm.put(2, "Manoj");
		hm.put(3, "SasiKumar");
		hm.put(4, "kanna");

		for (Entry<Integer, String> kl : hm.entrySet()) {

			System.out.println(kl.getKey() + " :" + kl.getValue());
		}
		
		System.out.println("-----------------------------------");

		boolean containsKey = hm.containsKey(3);
		System.out.println(containsKey);
		
		System.out.println("----------------------------------------");

		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> next = itr.next();
			
			System.out.println(next.getKey()+" "+ next.getValue());
		}
	}

}
