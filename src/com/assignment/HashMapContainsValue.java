package com.assignment;

import java.util.HashMap;

public class HashMapContainsValue {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1001, "Scrum Master");
		hm.put(1002, "Business Analyst");
		hm.put(1003, "Design Engineer");
		hm.put(1004, "Developer");
		hm.put(1005, "QA");
		System.out.println("Value in HashMap :" + hm);

		if (hm.containsValue("Developer")) {

			System.out.println("To Develop the Application");
		} else {
			System.out.println("choosen incorrect options");
		}

		if (hm.containsValue("Product owner")) {
			System.out.println("PO is a stack Holder");
		} else {

			System.out.println("choosen incorret option");
		}

	}

}
