package com.mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		// HashMap m = new HashMap<>();

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(101, "kamesh");
		m.put(102, "Ramesh");
		m.put(103, "Raghu");
		m.put(104, "vinoth");
		m.put(105, "Dinesh");
		m.put(103, "charu");
		m.put(106, "Kamesh");
		System.out.println(m);

		// To get the particular pair from the hashmap
		System.out.println(m.get(105));

		// remove pair from the Hashmap
		System.out.println(m.remove(106));

		// To find the Key present in the hashmap
		System.out.println(m.containsKey(101));// true
		System.out.println(m.containsKey(106));// false

		// To find the value is present in the HashMap
		System.out.println(m.containsValue("kamesh"));// true

		// To find the Hashmap contains data
		System.out.println(m.isEmpty());// false

		// To print only key from the HashMap
		System.out.println(m.keySet());

		// To print all the values as collection
		System.out.println(m.values());

		// To Return all the Entries as set
		System.out.println(m.entrySet());

		// To read the key individually

		for (Object ind : m.keySet()) {

			System.out.println(ind);

		}

		// To read the value individually
		for (Object val : m.values()) {
			System.out.println(val);
		}

		// To print Key and value
		System.out.println("------------------------------------");

		for (Object en : m.keySet()) {

			System.out.println(en + " " + m.get(en));
		}
		
		System.out.println("---------------------------------------");

		// Using Entry Method:
		// *********************
		System.out.println("Print the value by using Entry Set method");

		for (Entry en : m.entrySet()) {

			System.out.println(en.getKey() + " " + en.getValue());
		}
		
		
		
		//By using Iterator:
		//*******************
		
		
		System.out.println("------------------------------------");	
		System.out.println("Print the value by using Iterator");
		
		Iterator itr=m.entrySet().iterator();
		while(itr.hasNext()) {
			
			Map.Entry next = (Entry) itr.next();
			
			System.out.println(next.getKey() +" "+next.getValue());
		}
		
		
		
		

	}

}
