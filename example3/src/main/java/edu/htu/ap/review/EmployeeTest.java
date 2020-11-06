package edu.htu.ap.review;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		// int
		// float
		// double
		// boolean
		// long
		// char

		// String
		/*
		 * String name="Ali"; int length=name.length(); System.out.println(length);
		 */

		// Construction using new keyword
		// Employee Class- DataType
		// emp object (reference), variable
		// construction with parameters
		Employee emp = new Employee("Ali", 200, "IT");
		
		// construction without parameters, used with default constructor
		Employee emp3=new Employee();

		// Encapsulation : we are having emp as object that has instance variables
		String empName = emp.getName();

		System.out.println(empName);
		
		// how to call a method 
		// method overload : method with the same name but different signature number of parameters and types
		emp.sayHello();
		emp.sayHello("Hana", "SCI");

		// System.out.println(emp.getSalary());
		// System.out.println(emp.getDepartment());

		// System.out.println("employee name is "+ emp.getName()+" employee salary is "+
		// emp.getSalary() +
		// "emp department is "+ emp.getDepartment());

		/*
		 * Employee emp2 = new Employee(); System.out.println(emp2.getName());
		 */

		// read data from user 
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your grade");
		int grade=sc.nextInt();
		System.out.println(grade);
	}


}
