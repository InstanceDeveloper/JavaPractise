package com.checkingAbstract;

abstract class ParentClass {
	abstract void m1();
	abstract void m1(int x);
	abstract void m1(String name);
	
	static void m4() {
		System.out.println("Concrete Method 4 in abstract class");
	}
	
	void m5() {
		System.out.println("Concrete Method 5 in abstract class");
	}
	
	void m6() {
		System.out.println("Concrete Method 6 in abstract class");
	}
}



public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
