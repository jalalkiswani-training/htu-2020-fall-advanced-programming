package com.edu.ap.week10.seesion1;

public class CarFactory {
	public static Car createMercedes(String vin, int year) {
		 Car car = createCar(vin, "Mercedes", year);
		 car.setSunRoof(true);
		 return car;
	}
	
	public static Car createCar(String vin, String brand, int year) {
		Engine engine = new Engine();
		engine.setValves(4);
		engine.setHorsePower(250);

		Wheel[] wheels = new Wheel[4];
		for (int i = 0; i < wheels.length; i++) {
			Wheel w = new Wheel();
			w.setBrand("Michlene");
			w.setHeight(55);
			w.setWidth(255);
			w.setRimSize(17);
			w.setYear(2019);
			wheels[i] = w;
		}

		Car car = new Car();
		car.setVin(vin);
		car.setManfucaringYear(year);
		car.setEngine(engine);
		car.setWheels(wheels);
		car.setMake(brand);
		car.setModel("CGI");
		car.setYear(2014);
		return car;
	}
}
