package com.sample;

public class Calculation implements MathsOPerations {

	@Override
	public void addition(int a, int b) {

		System.out.println("Addition :" + (a + b));

	}

	@Override
	public void subraction(int a, int b) {
		System.out.println("Subraction :" + (a - b));

	}

	@Override
	public void multiplication(int a, int b) {

		System.out.println("Multiplicatons :" + (a * b));

	}

	public float division(float a, float b) {

		return a / b;
	}

	public static void main(String[] args) {

		Calculation cal = new Calculation();

		cal.addition(5, 8);
		cal.subraction(12, 6);
		cal.multiplication(8, 10);
		System.out.println("Division :" + cal.division(18.1f, 15.12f));

	}

}
