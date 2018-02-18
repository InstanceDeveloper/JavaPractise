package com.oop;

public class MethodRecursion {
	int f;
	public int factorial(int n) {
		while(n != 1) {
			f = n*factorial(n-1);
		}
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRecursion test = new MethodRecursion();
		System.out.println(test.factorial(5));
	
	}
}
