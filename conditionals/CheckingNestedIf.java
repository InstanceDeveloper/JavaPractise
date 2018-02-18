package com.conditionals;

public class CheckingNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 4, c = 5;
		if (a>b) {
			if (a>c) {
				System.out.println("A is bigger than B & C");
			}
		}
		if (b>a) {
			if (b>c) {
				System.out.println("B is also bigger than C & A");
			}
		}
		
		if (c>a) {
			if (c>b) {
				System.out.println("C is also bigger than B & A");
			}
		}
		
	}

}
