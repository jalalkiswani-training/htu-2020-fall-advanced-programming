package edu.htu.advancedprogramming.week2.session1;

import java.util.Scanner;

public class Conditionals2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int number1 = s.nextInt();

		System.out.println("Please enter number 2: ");
		int number2 = s.nextInt();

		System.out.println("==================================");
		System.out.println("1- Add");
		System.out.println("2- Sub");
		System.out.println("3- Mul");
		System.out.println("4- Div");
		System.out.println("==================================");
		System.out.println("Please enter your choice: ");

		int ch = s.nextInt();
		int result = 0;
		switch (ch) {
		case 1:
			result = number1 + number2;
			break;
		case 2:
			result = number1 - number2;
			break;
		case 3:
			result = number1 * number2;
			break;
		case 4:
			result = number1 / number2;
			break;
		default:
			 System.out.println("Invalid Input");
		}
		System.out.println("Result = "+result);

	}
}
