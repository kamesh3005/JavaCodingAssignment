package com.mapexample;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<Integer,String>();
		mp.put(1, "Java");
		mp.put(2, "Selenium");
		mp.put(3, "Sql");
		mp.put(4, "JavaSript");
		
		System.out.println(mp.get(1));
		System.out.println(mp.get(5));
		
		for(Entry m:mp.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(mp);
		
		mp.remove(3);
		System.out.println(mp);
		
		
		
		HashMap<Integer, Employee>empMap=new HashMap<Integer,Employee>();
		Employee emp1=new Employee("Kanna", 1001, 27, "Developer");
		Employee emp2=new Employee("Arun", 1002, 29, "Tester");
		Employee emp3=new Employee("Ramya", 1005, 32, "HR");
		Employee emp4=new Employee("Nithya", 1009, 25, "System Analysit");
		empMap.put(1, emp1);
		empMap.put(2, emp2);
		empMap.put(3, emp3);
		empMap.put(4, emp4);
		 
		for(Entry<Integer,Employee> m:empMap.entrySet()) {
			int key = m.getKey();
			Employee v = m.getValue();
			System.out.println(key + " "+"Emp_Info");
			System.out.println(v.name +" "+v.id +" "+v.dept +" "+v.age);
			
		}
		
		
	}

}
