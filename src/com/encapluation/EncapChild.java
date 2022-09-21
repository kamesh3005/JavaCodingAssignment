package com.encapluation;

public class EncapChild {

	public static void main(String[] args) {

		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setEmp_Name("Kannan");
		ed.setEmp_Dept("Developer");
		ed.setEmp_Age(27);

		System.out.println("EP_name:" + ed.getEmp_Name());
		System.out.println("EP_age :" + ed.getEmp_Age());
		System.out.println("EP_accNo: " + ed.getEmp_Dept());
	}

}
