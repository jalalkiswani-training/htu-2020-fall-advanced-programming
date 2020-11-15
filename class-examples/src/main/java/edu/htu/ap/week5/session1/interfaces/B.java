package edu.htu.ap.week5.session1.interfaces;

// when we have an interface implements 
// multiple: is only implemented by interfaces
public class B implements A,C {

	
	
// from A
	public void sayGoodBye() {
		System.out.println("Goodbye from B");
		
	}
 // from C
	public void sayHi() {
		System.out.println("Say Hi");
		
	}
	// from A 
	public void sayHello() {
		System.out.println("Hello from B");
		
	}

}
