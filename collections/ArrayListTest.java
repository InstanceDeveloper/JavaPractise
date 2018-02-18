package com.collections;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList testList = new ArrayList();
		
		testList.add(10);
		testList.add(90);
		testList.add(80);
		testList.add(70);
		testList.add(60);
		
		System.out.println(testList);
		
		testList.add(5, 50); //add method to add object at certain index
		System.out.println(testList);
		
		testList.remove(4); //remove method to add object at certain index
		System.out.println(testList);
		
		//testList.remove();
		System.out.println(testList);
	}

}
