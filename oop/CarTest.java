package com.oop;

class Car {
	String make = "Toyota";
	String model = "Camry";
	String color = "Grey";
	int milage = 171222;
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println("The make of car is: "+c1.make);
		System.out.println("The model of car is: "+c1.model);
		System.out.println("The color of car is: "+c1.color);
		System.out.println("The milage of car is: "+c1.milage);
	}

}
