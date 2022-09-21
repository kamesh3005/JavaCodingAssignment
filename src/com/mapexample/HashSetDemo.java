package com.mapexample;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet<>();
		hs.add(100);
		hs.add("Welcom");
		hs.add(16.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		System.out.println("Befor removing the element");
		System.out.println(hs);

		
		//remove method
		hs.remove(null);

		System.out.println("After Removing the element");
		System.out.println(hs);
		
		//contains method
		boolean contains = hs.contains("Welcom");
		System.out.println(contains);
		System.out.println(hs.contains("xyz"));
		
		//isEmpty
		System.out.println(hs.isEmpty());
		
		//To read all the element in hashset
		
		for(Object ob:hs) {
			System.out.println(ob);
		}
		
		//AddAll Method
		HashSet<Integer>even=new HashSet<Integer>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		System.out.println("HashSet :"+even);
		
		HashSet<Integer>num=new HashSet<Integer>();
		
		num.addAll(even);
		num.add(10);
		System.out.println("New HashSet :"+num);
		
		//removeAll method
		num.removeAll(even);
		System.out.println(num);
		
		
		HashSet<Integer>hs1=new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		System.out.println("HashSet 1 :"+hs1);
		HashSet<Integer>hs2=new HashSet<Integer>();
		hs2.add(4);
		hs2.add(5);
		hs2.add(6);
		System.out.println("HashSet 2 "+hs2);
		//union of all element in the two set
		hs1.addAll(hs2);
		System.out.println("Union" +hs1);
		
		
		//common element between two set
		hs1.retainAll(hs2);
		System.out.println("Intersections"+hs1);
		
		
		//To find the Difference between two set element
		hs1.removeAll(hs2);
		System.out.println("difference :"+hs1);
		
	}

}
