package edu.htu.ap.week15.seesion2.example1;

//Inheritance 
//CirclePotatoMaker: child - subclass
//PotatoMaker: parent - super class
public class CirclePotatoMaker extends PotatoMaker{
	
	@Override
	protected void slice() {
		System.out.println("Slicing as circles");
	}
}
