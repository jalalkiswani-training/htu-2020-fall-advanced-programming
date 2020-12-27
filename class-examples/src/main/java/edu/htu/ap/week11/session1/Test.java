package edu.htu.ap.week11.session1;

public class Test {
	public static void main(String[] args) {
		SingletonExample s1=SingletonExample.getInstance();//;new SingletonExample();
		
		s1.setVar1(10);
		s1.method1();//10
		
		SingletonExample s2=SingletonExample.getInstance();//new SingletonExample();
		//s2.setVar1(15);
		s2.method1();//10
		
		SingletonExample s3=s2;
		s3.method1();//10
	}
}
