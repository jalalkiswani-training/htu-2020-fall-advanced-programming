package edu.htu.ap.week13.session2.example;

public class BuilderTest {

	public static void main(String[] args) {
		Person p1=Person.create().name("Ahmad").age(25).nationality("Jordanian").id(12223);
		System.out.println(p1);
		
		Person p2=Person.create();
		p2.name("khaled").age(30);
		System.out.println(p2);
		

	}

}
