package com.trainning;

public class BreakCondition {

	public static void main(String[] args) {

		for(int i=1;i<=11;i++) {
			
			if(i==3||i==5||i==7) {
				continue;
			}
			
			System.out.println(i);
		}
	}

	
}
