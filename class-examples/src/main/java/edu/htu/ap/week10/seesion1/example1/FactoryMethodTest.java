package edu.htu.ap.week10.seesion1.example1;

public class FactoryMethodTest {
	public static void main(String[] args) {
		Car mercedes=CarFactory.createCar("123456", "Mercedes", 2014);
		
		Car mercedes2=CarFactory.createCar("123456787", "Mercedes", 2016);
		
		Car mercedes3=CarFactory.createCar("123456787", "Mercedes", 2018);
		mercedes3.setModel("CLS");
		
//		Engine engine=new Engine();
//		engine.setValves(4);
//		engine.setHorsePower(250);
//		
//		Wheel[] wheels=new Wheel[4];
//		for (int i = 0; i < wheels.length; i++) {
//			Wheel w=new Wheel();
//			w.setBrand("Michlene");
//			w.setHeight(55);
//			w.setWidth(255);
//			w.setRimSize(17);
//			w.setYear(2019);
//			wheels[i]=w;			
//		}
//		
//		Car mercedes=new Car();
//		mercedes.setVin("ABC12456789");
//		mercedes.setManfucaringYear(2013);
//		mercedes.setEngine(engine);
//		mercedes.setWheels(wheels);
//		mercedes.setMake("Mercedes");
//		mercedes.setModel("CGI");
//		mercedes.setYear(2014);
		
//		Engine engine2=new Engine();
//		engine2.setValves(4);
//		engine2.setHorsePower(250);
//		
//		Wheel[] wheels2=new Wheel[4];
//		for (int i = 0; i < wheels.length; i++) {
//			Wheel w=new Wheel();
//			w.setBrand("Michlene");
//			w.setHeight(55);
//			w.setWidth(255);
//			w.setRimSize(17);
//			w.setYear(2019);
//			wheels2[i]=w;			
//		}
//		
//		Car mercedes2=new Car();
//		mercedes2.setVin("ABC12456789");
//		mercedes2.setEngine(engine);
//		mercedes2.setWheels(wheels);
//		mercedes2.setMake("Mercedes");
//		mercedes2.setModel("CGI");
//		mercedes2.setYear(2014);
//		mercedes.setManfucaringYear(2013);
	}
}
