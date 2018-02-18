package com.collections;

import java.util.*;

interface Shape {
	public void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("This is Circle");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is rectangle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is Square");
	}
}

class Triangle implements Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is Triangle");
	}
}

public class RunTimeTypeIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector s = new Vector();
		s.addElement(new Circle());
		s.addElement(new Rectangle());
		s.addElement(new Square());
		s.addElement(new Triangle());
		
		Enumeration<Shape> e = s.elements();
		
		while (e.hasMoreElements()) {
			e.nextElement().draw();
		}
	}

}
