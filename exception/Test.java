package com.exception;

import java.io.DataInputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println(ds.readInt());
	}	
}
