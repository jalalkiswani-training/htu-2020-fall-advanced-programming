package edu.htu.advancedprogramming.week2.session1;

public class StringExample {
	public static void main(String[] args) {
		String str = "Hello from uncle Jalal";
		int l = str.length();
		String sub = str.substring(6);

		String str2 = str + ", Goodbye";// concatination

		System.out.println(l);
		System.out.println(sub);
		System.out.println(str2);

		String name1 = "Ata";
		String name2 = "Ata";
		if (name1.equals(name2)) {
			System.out.println("Equaled");
		}else {
			System.out.println("Not Equaled");
		}
	}
}
