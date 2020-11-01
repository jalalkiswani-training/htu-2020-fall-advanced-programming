package edu.htu.ap.week3.session1;

public class StudentExample {
	public static void main(String[] args) {
		// Student: datatype
		// std: variable name (reference)
		// new Student(): construction
		Student std1 = new Student();
		std1.number = 101;
		std1.name = "Jalal";
		std1.avg = 50;
		std1.email="ata@ata.com";
		
		
		Student std2=new Student();
		std2.number=202;
		std2.name="Essa";
		std2.avg=60;
		
		System.out.println(std1.name);
		System.out.println(std2.name);
	}
}
