package com.sample;

public class BankDetials extends AxisBank {

	public void accountHolderName() {
		System.out.println("Name is : Ramesh Babu R");
	}

	public void accountDetials() {

		System.out.println("Salary Accout");
	}

	private void ifscCode() {
		System.out.println("IFSC Number : AXS5000189A");
	}

	private void branchName() {
		System.out.println("Addyar Branch");
	}

	public static void main(String[] args) {

		BankDetials bk = new BankDetials();
		bk.accountDetials();
		bk.accountHolderName();
		bk.ifscCode();
		bk.branchName();
		bk.accountNumber();
		bk.cardDetials();
		bk.fixedDeposit();

	}

}
