package com.assignment;

import java.util.HashSet;
import java.util.TreeSet;

public class ConverHasSetIntoTreeSet {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("tester");
		hs.add("TL");
		hs.add("Dev");
		hs.add("system Analyst");
		hs.add("manager");
		System.out.println("HashSet : "+hs);
		
		
		TreeSet<String>tr=new TreeSet<String>(hs);
		System.out.println("Tree Set");
		
		for(Object ob:tr) {
			System.out.println(ob);
		}
		

	}

}
