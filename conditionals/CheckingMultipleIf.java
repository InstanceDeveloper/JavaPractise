package com.conditionals;

public class CheckingMultipleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		if (a%2 == 0) {
			System.out.println("A is even");
		}
		if(a%2 != 0) {
			System.out.println("A is odd");
		}
	}

}

 class CheckingLeapMultipleIf {
	public static void main(String[] args) {
		int year = 2008;
		if( year%4 == 0 && year%100 == 0 ) {
			System.out.println("This is leap year");
		}
		if( year%4 != 0 || year%100 != 0 ) {
			System.out.println("This is not leap year");
		}
	}
}
 
class CheckingGreatestThree {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 5;
		if (a>b && a>c) {
			System.out.println("A is bigger than B and C");
		}
		if (b>a && b>c) {
			System.out.println("B is bigger than A & C");
		}
		if (c>b && c>a) {
			System.out.println("C is bigger than A  &  B");
		}
	}
}