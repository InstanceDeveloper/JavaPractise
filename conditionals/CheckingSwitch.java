package com.conditionals;



public class CheckingSwitch {

	
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
			case 10: System.out.println("This is 10th case"); break;
			case 20: System.out.println("This is 20th case"); break;
			case 30: System.out.println("This is 30th case"); break;			
			case 40: System.out.println("This is 40th case"); break;
			case 50: System.out.println("This is 50th case"); break;
			case 60: System.out.println("This is 60th case"); break;
			default:
			System.out.println("None of the case is matched");
		}		
	}
}
