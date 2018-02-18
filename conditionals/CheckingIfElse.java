package com.conditionals;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class CheckingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 4;
		if (a>b) {
			System.out.println("A is bigger than B");
		} else {
			System.out.println("B is bigger than A");
		}
	
	int even = 4;
	if (even%2 == 0) {
		System.out.println("The number is even");
	} else {
		System.out.println("The number is odd");
	}
	
	int leap_year = 2004;
	if( leap_year%4 == 0 || leap_year%400 == 0) {
		System.out.println("This is a leap year");
	} else {
		System.out.println("This is not a leap year");
	}
	}
}
