package com.array;

import java.util.Scanner;

public class BinarySearch {

	static int a[] = new int[7];
	static int key, mid;
	private static Scanner sc;

	static int binarySearch() {
		if (a.length > 0) {
			mid = (0 + a.length) / 2;

			if (key == a[mid]) {
				return mid;
			}

			if (key <= a[mid]) {
				for (int i = 0; i < a[mid]; i++) {
					if (key == a[i]) {
						return i;
					}
				}
			}

			if (key >= a[mid]) {
				for (int i = a.length - 1; i >= a[mid]; i--) {
					if (key == a[i]) {
						return i;
					}
				}
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter values for Binary Search array");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter  key value");
		key = sc.nextInt();

		if (binarySearch() != 0) {
			System.out.println("The key " + key + "is found at :" + binarySearch());
		} else {
			System.out.println("The key is not found in the give array");
		}
	}

}
