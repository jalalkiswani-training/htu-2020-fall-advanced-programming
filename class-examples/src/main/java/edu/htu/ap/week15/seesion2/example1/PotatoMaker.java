package edu.htu.ap.week15.seesion2.example1;

public class PotatoMaker {
	private int potato;
	private int oil;
	private int water;

	public void makePotato() {
		clean();
		peel();
		slice();
		fry();
		serve();
	}

	private void clean() {
		System.out.println("Cleaning..");
	}

	private void peel() {
		System.out.println("Peeling...");
	}

	protected void slice() {
		System.out.println("Slicing as Sticks");
	}

	private void serve() {
		System.out.println("Done...");
	}

	private void fry() {
		System.out.println("Frying...");
	}

	public int getPotato() {
		return potato;
	}

	public void setPotato(int potato) {
		this.potato = potato;
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}


}
