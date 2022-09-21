package com.calculation;

public class Calculation {

	public static void main(String[] args) {
		Addition a = new Addition();
		Subraction s = new Subraction();
		Multiplication m = new Multiplication();
		Division d = new Division();
		a.add(10, 15);
		s.sub(9, 3);
		m.mul(10, 27);
		d.div(15, 5);

	}

}
