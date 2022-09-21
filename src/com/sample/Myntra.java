package com.sample;

public class Myntra extends Flipkart {

	public void productName() {
		System.out.println("Myntra");
	}

	public void logOut() {

		System.out.println("User is in Logout Page");
	}

	public static void main(String[] args) {

		Myntra my = new Myntra();
		my.loginPage();
		my.accoutDetiasl();
		my.addTocart();
		my.payment();
		my.eCartName();
		my.wishList();
		my.accoutDetiasl();
		my.productName();
		my.logOut();

	}

}
