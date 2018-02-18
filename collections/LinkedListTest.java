package com.collections;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList testList = new LinkedList();
		
		testList.add(1, new LinkedListTest());
		testList.add(20);
		testList.add(30);
		testList.add(40);
		testList.add(50);
		testList.add(60);
		
		System.out.println(testList);
		
		int size = testList.size();
		System.out.println(size);
		
		boolean isEmpty = testList.isEmpty();
		System.out.println(isEmpty);
		
		boolean testResult = testList.contains(10);
		System.out.println(testResult);
		
	}

}
