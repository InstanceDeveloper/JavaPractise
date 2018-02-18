package com.array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 4, 3, 2, 1 };
		int b[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]  =  " + a[i]);
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]  =  " + b[i]);
		}
	}

}
