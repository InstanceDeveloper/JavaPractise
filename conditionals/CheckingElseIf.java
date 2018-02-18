package com.conditionals;

public class CheckingElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=4, c=5;
		if (a>b && a>c) {
			System.out.println("A is bigger than B & C");
		} else if( b>c){
			System.out.println("B is bigger than A & C");
		} else {
			System.out.println("C is bigger than A & B");
		}
	}

}
