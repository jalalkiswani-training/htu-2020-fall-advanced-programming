package edu.htu.ap.week3.session2;

public class StudentExample {
	public static void main(String[] args) {
		// Student: datatype
		// std: variable name (reference)
		// new Student(): construction
		Student std0=new Student(505, "Kamal", 66, "kamal@kamal1.com");
		
		Student std1 = new Student();
		std1.setNumber(101);
		std1.setName("Jalal");
		std1.setAvg(-50);
		std1.setEmail("ata@ata.com");
		
		Student std2=new Student();
		std2.setNumber(202);
		std2.setName("Essa");
		std2.setAvg(60);
		
		System.out.println(std1.getName());
		System.out.println(std2.getName());
	}
}
