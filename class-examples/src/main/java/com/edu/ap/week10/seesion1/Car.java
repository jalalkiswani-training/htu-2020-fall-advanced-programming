package com.edu.ap.week10.seesion1;

public class Car {
	private String vin;
	private String make;
	private int year;
	private String model;
	private Wheel[] wheels;
	private Engine engine;
	private int manfucaringYear;
	private boolean sunRoof;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getManfucaringYear() {
		return manfucaringYear;
	}

	public void setManfucaringYear(int manfucaringYear) {
		this.manfucaringYear = manfucaringYear;
	}

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}

}
