package com.edu.ap.week10.seesion1.example2;

public class Test {
	public static void main(String[] args) {
		B b=new B();
		b.method1();
		
		A a=new A();
		a.setA1(10);
		a.setA2("Ata");
		a.setA3(b);
		
		a.getA3().method1();
	}
}
