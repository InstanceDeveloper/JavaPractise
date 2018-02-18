package com.array;

import java.util.Scanner;

public class LinearSearch {
	static int a[] = new int[5];
	static int key;
	private static Scanner sc;
	
	static int linearSearch() {
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter values for array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter Key to search");
		key = sc.nextInt();
		
		if(linearSearch() != 0) {
			System.out.println("The key "+key+" found at : "+linearSearch()+" in the given array");
		} else {
			System.out.println("The given key is not found in the array");
		}
	}

}
