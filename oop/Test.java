package com.oop;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {
	
	static double a = 0l;
	
	
	static public boolean posNeg(int a, int b, boolean negative) {
		 if (!negative) {
			if (a<0 && b>0) {
				return false; 
			} else if (a>0 && b<0) {
				return false;
			} else if (a>0 && b>0) {
				return false;
			}
			
		  } else if(negative) {
			  if (a<0 && b<0) {
				  return true;
			  }
		  }
		return true;  
		}
	

	public static void main(String[] args) {

           // System.out.println(posNeg(1, 1, false));
            
           /* Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();
            // Write your code here.
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
            */
            System.out.println(a);
            
        }
}