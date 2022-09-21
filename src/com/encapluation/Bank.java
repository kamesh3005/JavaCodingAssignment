package com.encapluation;

public abstract class Bank {

	public abstract void accoutDetials();

	public abstract void cridetCardDetials();

	public abstract void fixedDeposit();

	public static void branchName() {
		System.out.println("Addyar Branch");
	}

	public static String ifscCode() {

		String ifscNumber = "SBI05312S";
		System.out.println(ifscNumber);
		return ifscNumber;
	}
	public abstract String banckName();

}
