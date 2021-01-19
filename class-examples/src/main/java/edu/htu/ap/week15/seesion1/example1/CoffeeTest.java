package edu.htu.ap.week15.seesion1.example1;

public class CoffeeTest {
	public static void main(String[] args) {
		// CoffeMaker: datataype
		// cm1: reference
		// CoffeeMaker(): construct a new "Object"
		CoffeMaker cm1 = new CoffeMaker();
		cm1.setWater(200);
		cm1.setCoffee(25);
		cm1.setSugar(8);
		
		cm1.makeCoffee();
	}
}
