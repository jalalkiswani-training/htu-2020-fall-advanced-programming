package edu.htu.ap.week4.session1;

public class Test {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setId(1);//Person
		m.setName("Ata");//Person
		m.setAge(50);//Person
		m.setBaseSalary(1000);//Employee
		m.setAllownces(100);
		m.setDeductions(50);
		m.setDepartment("IT");//Manager
//		int salary=m.getBaseSalary()+m.getAllownces()-m.getDeductions();
		System.out.println(m.calculateSalary());
		
		m.hi();
		
		Student std=new Student();
		std.setName("Kamal");
		std.hi();
		
		Employee emp=new Employee();
		emp.setName("Essa");
		emp.setBaseSalary(500);
		emp.setDeductions(40);
		emp.setAllownces(30);
//		int salary2=emp.getBaseSalary()+emp.getAllownces()-emp.getDeductions();
		System.out.println(emp.calculateSalary());
		emp.hi();
	}
}
