package com.mapexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// To Create a Array List

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(15);
		ar.add(18);
		ar.add(26);

		// To find the size of the array
		System.out.println("The Size of the array is :" + ar.size());

		ar.add(63);
		ar.add(26);
		System.out.println("The Size of the array is :" + ar.size());

		// To get the value from the index
		System.out.println(ar.get(2));

		// To print all the values from the Array List using for loop
		// ***********************************************************
		System.out.println("By using Foreach Loop");
		System.out.println("-------------------------------");
		for (Object m : ar) {
			System.out.println(m);
		}

		System.out.println("-------------------------------");
		System.out.println("By using For Loop");
		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		//Generic Array List
		ArrayList<String>ar1=new ArrayList<String>();
		ar1.add("selenium");
		ar1.add("Java");
		ar1.add("python");
		
		ArrayList<Float>ar2=new ArrayList<Float>();
		ar2.add(63.23f);
		ar2.add(12.36f);
		
		
		ArrayList<Object>ar3=new ArrayList<Object>();
		ar3.add(56);
		ar3.add("Welcom");
		ar3.add(52.36);
		ar3.add(true);
		ar3.add('m');
		
		
		for(Object ob:ar3) {
			System.out.println(ob);
		}
		
		System.out.println("_------------------------------------");
		
		
		ArrayList<Employee>empArray=new ArrayList<Employee>();
		
		
		Employee emp1=new Employee("Ravi", 5632, 28, "Dev");
		Employee emp2=new Employee("Vijay", 5633, 32, "QA");
		Employee emp3=new Employee("Manoj", 5634, 29, "BA");
		Employee emp4=new Employee("santhosh", 5689, 35, "Manager");
		
		
		empArray.add(emp1);
		empArray.add(emp2);
		empArray.add(emp3);
		empArray.add(emp4);
		
		//Print value by using Iterator:
		  Iterator<Employee> itr = empArray.iterator(); while(itr.hasNext()) {
		  
		  Employee next = itr.next(); System.out.println(next.name);
		  System.out.println(next.id); System.out.println(next.age);
		  System.out.println(next.dept);
		  
		  
		  }
		  
		  System.out.println("---------------------------------------");
		 
		
		//Print value by using for each loop
		for(Employee em:empArray) {
			
			System.out.println(em.age);
			System.out.println(em.name);
			System.out.println(em.id);
			System.out.println(em.dept);
			
		}
		
		
		System.out.println("----------------------------");
		
		//Add all 
		
		
		ArrayList<String>ar6=new ArrayList<String>();
		ar6.add("Monday");
		ar6.add("Tuesday");
		ar6.add("Wenesday");
		
		
		ArrayList<String>ar7=new ArrayList<String>();
		ar7.add("Thursday");
		ar7.add("Friday");
		ar7.add("Sataday");
		
		ar6.addAll(ar7);
		
		for(String st:ar6) {
			System.out.println(st);
		}
		
		//removeAll:
		
		System.out.println("-----------------------------");
		
		ar6.removeAll(ar7);

		for(String st:ar6) {
			System.out.println(st);
		}
		
		System.out.println("_____________________________________");
		
		//retainAll();To print the common element in the two Array List
		
		ArrayList<String>ar8=new ArrayList<String>();
		ar8.add("Monday");
		ar8.add("Tuesday");
		ar8.add("Wenesday");
		
		
		ArrayList<String>ar9=new ArrayList<String>();
		ar9.add("Thursday");
		ar9.add("Friday");
		ar9.add("Monday");
		
		ar8.retainAll(ar9);
		
		for(int i=0;i<ar8.size();i++) {
			
			System.out.println(ar8.get(i));
		}
		
		
		
		
		
		
				

	}

}
