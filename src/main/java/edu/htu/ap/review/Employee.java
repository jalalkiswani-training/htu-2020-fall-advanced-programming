package edu.htu.ap.review;

public class Employee {
	private String name; // Syntax to define a variable : access modifier (private) , datatype, name of
							// attribute
	private int salary;
	private String department;

// Class name Employee 
// Default Constructor 
	public Employee() {

	}

	// Constructor with Parameters
	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

// Encapsulation - private attributes and public setters and getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// method overload: method with same name , but different signature number of
	// parameters, type of parameters
	public void sayHello() {
		System.out.println("Hello from Employee");
	}

	public void sayHello(String name) {
		System.out.println("Hello from " + name);
	}

	public void sayHello(String name, String department) {
		System.out.println("Hello from " + name + " department " + department);

	}

}
