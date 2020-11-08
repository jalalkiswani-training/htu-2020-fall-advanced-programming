package edu.htu.ap.week4.session1;

//child class==> sub-class
public class Employee extends Person {
	private int baseSalary;
	private int deductions;
	private int allownces;
	
	public int calculateSalary() {
		int finalSalary=getBaseSalary()+getAllownces()-getDeductions();
		return finalSalary;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getDeductions() {
		return deductions;
	}

	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}

	public int getAllownces() {
		return allownces;
	}

	public void setAllownces(int allownces) {
		this.allownces = allownces;
	}

}
