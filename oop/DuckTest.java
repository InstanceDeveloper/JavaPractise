package com.oop;

class Duck{
	String color = "white";
	double weight = 2.00;
	String classification = "Swan";
}

public class DuckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new Duck();
		System.out.println("The color of duck is: "+d1.color);
		System.out.println("The weight of duck is: "+d1.weight);
		System.out.println("The classification of duck is: "+d1.classification);
	}

}
