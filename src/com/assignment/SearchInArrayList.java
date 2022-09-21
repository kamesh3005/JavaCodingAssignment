package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String>Al=new ArrayList<String>(Arrays.asList("Apple","Orange",
				"Lemom","Grapes","Liche","Banana"));
		
		
		if(Al.contains("Orange")) {
			
			System.out.println("The Price of the Orange Fruit is 65 per KG");
		}
		else {
			
			System.out.println("The fruit is sould out");
		}
		

	}

}
