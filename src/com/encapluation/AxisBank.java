package com.encapluation;

public class AxisBank extends Bank {

	public static void main(String[] args) {

		AxisBank ax = new AxisBank();
		ax.accoutDetials();
		ax.cridetCardDetials();
		ax.fixedDeposit();
		System.out.println(ax.banckName());
		branchName();
		ifscCode();

	}

	@Override
	public void accoutDetials() {
		System.out.println("Account Number is :500001234502");

	}

	@Override
	public void cridetCardDetials() {
		System.out.println("CridetCard Name is: Master card");

	}

	@Override
	public void fixedDeposit() {
		System.out.println("Deposited 2 lacks on the Fixed Amount");

	}

	@Override
	public String banckName() {

		String name = "AXIS BANK";

		return name;
	}

}
