package com.string;


public class StringMethodTest {
	
	static String Str = "Srikanth";
	static String Str2 = "srikanth";
	static String Str1 = "manohar";
	double pi = 3.1457;
	int x = (int) pi;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Str.length());
		System.out.println(Str.charAt(4));
		System.out.println(Str.equals(Str2));
		System.out.println(Str.compareTo(Str1));
		System.out.println(Str.compareTo(Str2));
		System.out.println(Str.compareToIgnoreCase(Str2));
		System.out.println(Str.compareToIgnoreCase(Str1));
		System.out.println(Str.startsWith("Sri"));
		System.out.println(Str.startsWith("ant", 4));
		System.out.println(Str.endsWith("th"));
		System.out.println(Str.indexOf("i"));
		System.out.println(Str1.lastIndexOf('a'));
		System.out.println(Str.substring(3, 6));
		System.out.println(Str.concat(Str1));
		System.out.println(Str2.replace('s', 'S'));
//		System.out.println(Str.matches(Str1));
		System.out.println(Str.contains("ant"));
	}

}
