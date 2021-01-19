package edu.htu.ap.week15.seesion1.example1;

public class CoffeMaker {
	public static final int MIN_SUGAR_AMOUNT = 5;
	public static final int MIN_COFFEE_AMOUNT = 10;
	// constant: naming convention: all caps with underscores
	public static final int MIN_WATER_AMOUNT = 300;
	private int water;
	private int coffee;
	private int sugar;

	public void makeCoffee() {
		int errorCode = checkAmounts();
		if (errorCode == 0) {
			boil();
			addCoffee();
			addSugar();
			mixContents();
			serve();
		}
	}

	private int checkAmounts() {
		if (water >= MIN_WATER_AMOUNT) {
			if (coffee >= MIN_COFFEE_AMOUNT) {
				if (sugar >= MIN_SUGAR_AMOUNT) {
					System.out.println("Add ingradiatents are availble");
					return 0;
				} else {
					System.out.println("Please add sugar : " + MIN_SUGAR_AMOUNT);
					return -3;
				}
			} else {
				System.out.println("Please add coffee :" + MIN_COFFEE_AMOUNT);
				return -2;
			}
		} else {
			System.out.println("Please add water : " + MIN_WATER_AMOUNT);
			return -1;
		}
	}

	private void boil() {
		water -= MIN_WATER_AMOUNT;
		System.out.println("Boiling Water");
	}

	private void addCoffee() {
		coffee -= MIN_COFFEE_AMOUNT;
		System.out.println("Adding coffee");
	}

	private void addSugar() {
		sugar -= MIN_SUGAR_AMOUNT;
		System.out.println("Adding sugar");
	}

	private void mixContents() {
		System.out.println("Mixing contents");
	}

	private void serve() {
		System.out.println("Serving coffee");
		System.out.println("Thank you, please remove your cup");
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		//validation
		if (water >= 0) {
			this.water = water;
		}else {
			System.out.println("Invalid amount");
		}
	}

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

}
