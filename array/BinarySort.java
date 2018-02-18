package com.array;

import java.util.Scanner;

public class BinarySort {
//	private static Scanner sc;
	static int a[] = {7,2,3,5,6};
	static int key;
	
	

	static void binarySort() {
				
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] < a[j]) {
					System.out.println("a["+i+"]"+a[i]);
					key  = a[i];
					System.out.println("a["+j+"]"+a[j]);
					a[i] = a[j];
					System.out.println("key"+key);
					a[j] = key;
					
					System.out.println("--------------");
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		binarySort();

	}

}
