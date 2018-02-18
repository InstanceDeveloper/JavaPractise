package com.oop;

class PalindromeParam {
	public void palindrome(int num) {
		int testnum, rem = 1, sum = 0;
		testnum = num;
		while (num != 0) {
			rem = num%10;
			num = num/10;
			sum = sum*10 +rem;
		}
		if(testnum == sum) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}
}

public class MethodParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeParam p1 = new PalindromeParam();
		p1.palindrome(121);
		int num = 145;
		p1.palindrome(num);
	}

}
