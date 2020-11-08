package edu.htu.ap.week4.session1;

public class Test {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setId(1);//Person
		m.setName("Ata");//Person
		m.setAge(50);//Person
		m.setSalary(1000);//Employee
		m.setDepartment("IT");//Manager
		
		m.hi();
		
		Student std=new Student();
		std.setName("Kamal");
		std.hi();
		
		Employee emp=new Employee();
		emp.setName("Essa");
		emp.hi();
	}
}
