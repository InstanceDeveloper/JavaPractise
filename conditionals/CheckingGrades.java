package com.conditionals;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class CheckingGrades {
	public static void main(String[] args) {
		
	int sub1 = 80, sub2 = 85, sub3 = 88, sub4 = 55, sub5 = 77, sub6 = 79;
	int avg = (sub1+sub2+sub3+sub4+sub5+sub6)/6;
	
	if (avg >= 75) {
		System.out.println("Student got A grade");
	} else if (avg >= 60 && avg < 75) {
		System.out.println("Student got B grade");
	} else if (avg >= 50 && avg < 60) {
		System.out.println("Student got C grade");
	} else {
		System.out.println("Student failed to get a grade");
	}
}
}
