package edu.htu.ap.week11.session1;

public class StaticTest {
	private static int counter=0;

	public static void main(String[] args) {
		System.out.println("Hi from main");
		StaticTest t=new StaticTest();
		t.method1();
	}
	
	private static StaticTest instance=new StaticTest();


	public StaticTest() {
		System.out.println("Hi from construcotor:"+counter++);
	}
	
	public void method1() {
		System.out.println("Hi from method 1");		
	}
}
