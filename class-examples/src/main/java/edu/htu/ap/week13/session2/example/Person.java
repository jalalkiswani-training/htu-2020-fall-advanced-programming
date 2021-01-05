package edu.htu.ap.week13.session2.example;

// using builder design pattern
// create class , instance variables, setters and getters
// declare static create method that create a new object of the class, return data type of the same class,
// return the created object
// Create method for every instance variable that calls the corresponding setter method
// return this. of the same object it was called on


public class Person {
	private String name;
	private int id;
	private int age;
	private String nationality;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + ", nationality=" + nationality + "]";
	}

	public static Person create() {
		return new Person();
	}
	
	public Person name(String name) {
		setName(name);
		return this;
	}
	
	public Person id(int id) {
		setId(id);
		return this;
	}
	
	public Person age(int age) {
		setAge(age);
		return this;
	}
	
	
	// Person p=new Person();
	//p.nationailty("Jordanian");
	public Person nationality(String nationality) {
		setNationality(nationality);
		return this;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
