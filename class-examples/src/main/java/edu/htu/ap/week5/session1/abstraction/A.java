package edu.htu.ap.week5.session1.abstraction;

// abstract class : when a class has at least one abstract method - abstract, inheritance
public abstract  class A {
	// abstract method without the body , unimplemented method
	public abstract void sayHello();
	
	public void sayGoodBye() {
		System.out.println("Goodbye");
	}

}
