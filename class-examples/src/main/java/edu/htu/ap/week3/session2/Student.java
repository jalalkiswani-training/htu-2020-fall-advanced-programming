package edu.htu.ap.week3.session2;

public class Student {
	// attributes in OOP
	// instance variables
	private int number;
	private String name;
	private double avg;
	private String email;
	
	//empty default constructor
	public Student() {	
	}
	
	/* Constructor overloading....: having more than one construcotr
	   In this case, the method signature should be different
	*/
	//constructor
	public Student(int number,String name, double avg, String email) {
		this.number = number;
		this.name = name;
		this.avg = avg;
		this.email = email;		
	}

	public double getAvg() {
		return avg;
	}

	// setter
	public void setAvg(double avg) {
		//avg1: is local variable
		//avg : is instance variable
		// validation
		/*In case of having local variable with the same
		name of instance variable: Shadowing
		
		*/
		if (avg >= 35) {
			this.avg = avg;
		} else {
			System.out.println("Invalid Input :" + avg);
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
