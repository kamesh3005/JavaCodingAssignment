package com.encapluation;

public class EncapsulationDemo {

	private String emp_Name;
	private int emp_AccNo;
	private int emp_Age;
	private String emp_Dept;

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public int getEmp_AccNo() {
		return emp_AccNo;
	}

	public void setEmp_AccNo(int emp_AccNo) {
		this.emp_AccNo = emp_AccNo;
	}

	public int getEmp_Age() {
		return emp_Age;
	}

	public void setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
	}

	public String getEmp_Dept() {
		return emp_Dept;
	}

	public void setEmp_Dept(String emp_Dept) {
		this.emp_Dept = emp_Dept;
	}

	public static void main(String[] args) {

		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setEmp_Name("Naveen Kumar");
		ed.setEmp_Dept("QA");
		ed.setEmp_Age(28);
		ed.setEmp_AccNo(510004895);

		System.out.println("Employee name is :" + ed.getEmp_Name());
		System.out.println("Employee age is :" + ed.getEmp_Age());

		System.out.println("Employee Department is :" + ed.getEmp_Dept());

		System.out.println("Employee Account No is :" + ed.getEmp_AccNo());

	}

}
