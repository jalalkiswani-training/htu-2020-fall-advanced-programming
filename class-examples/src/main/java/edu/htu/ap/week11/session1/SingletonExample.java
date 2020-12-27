package edu.htu.ap.week11.session1;

public class SingletonExample {
	private static SingletonExample instance=new SingletonExample();	
	private int var1;
	
	public static SingletonExample getInstance() {
		return instance;
	}
	
	private SingletonExample() {
	}

	public void method1() {
		System.out.println("Method 1 from Singleton Example with value :"+var1);
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

}
