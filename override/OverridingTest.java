package com.override;

class Teacher {
	Teacher parentMethod() {
		return new Teacher();
	}
}

class Student extends Teacher {
	Student parentMethod() {
		return new Student();
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher s1 = new Student();
		System.out.println(s1.parentMethod());
	}

}
