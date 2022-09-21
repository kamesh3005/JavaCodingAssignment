package com.sample;

public class StudentData {

	private void studentDetials(int id, String name, int age) {

		System.out.println("Student Id :" + id + "\n" + 
		"Student Name " + name + "\n" + "Student Age :" + age);
	}

	private void studentDetials(float mark, String grad) {

		System.out.println("Student mark :" + mark + "\n"
		+ "Student Grade : " + grad);
	}

	private void studentDetials(String address, String result) {

		System.out.println("Student Add :" + address + "\n" +
		"Student Result  :" +  result);
	}
	
	public void marksDetials(int m1,int m2,int m3,int m4,int m5) {
		
		System.out.println("The Total subject mark is :" +(m1+m2+m3+m4+m5));
	}

	public static void main(String[] args) {

		StudentData sd = new StudentData();
		sd.studentDetials(1001, "Kanna", 16);
		sd.studentDetials(58.23f, "A+");
		sd.studentDetials("Tambram", "pass");
		sd.marksDetials(40, 52, 63, 72, 50);

	}

}
