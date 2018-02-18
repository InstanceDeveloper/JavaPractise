package com.loops;

import javafx.beans.property.ReadOnlyMapProperty;

public class Checkingloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		while (i>=1) {
			System.out.println("The value of i is: "+i);
			i--;
		}

	}

}

class CheckingWhileEven {
	public static void main(String[] args) {
		int i =0;
		while (i<=10) {
			
			i += 2;
			System.out.println("The value of i is: "+i);
		}
	}
}

class CheckingWhileOdd {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.println("The value of i is: "+i);
			i += 2;
			
		}
	}
}

class CheckingWhileMultiples {
	public static void main(String[] args) {
		int  i = 1;
		while (i<= 10) {
			System.out.println("The multple of 5 with "+i+": "+(5*i));
			i++;
		}
	}
}

class CheckingWhileSum {
	public static void main(String[] args) {
		int i = 1,sum = 0;
		while (i<= 10) {
			sum = sum + i;
			System.out.println("The value of sum for every: "+i+" "+sum);
			i++;
		}
	}
}

class CheckingWhileFactorial {
	public static void main(String[] args) {
		int i = 1,factorial = 1;
		while (i <= 5) {
			factorial = factorial*i;
			i++;
		}
		System.out.println("The factorial value is:"+factorial);
	}
}

class WhileEvenIf{
	public static void main(String[] args) {
		int i =0;
		while (i<= 10) {
			if (i%2 == 0) {
				System.out.println("The value of i is: "+i);
			}
			i++;
		}
	}
}

class WhileOddIf {
	public static void main(String[] args) {
		int i = 0;
		while(i<=10) {
			if(i%2 == 1) {
				System.out.println("The value of i is: "+i);
			}
			i++;
		}
	}
}

class WhileEvenSum {
	public static void main(String[] args) {
		int i=0,sum = 0;
		while(i<=10) {
			if(i%2 == 0) {
				sum = sum +i;
			}
			i++;
		}
		System.out.println("The sum of even numbers is: "+sum);
	}
}


class WhileOddSum {
	public static void main(String[] args) {
		int i = 1,sum = 0;
		while(i<=10) {
			if(i%2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("The value of i is: "+sum);
	}
}

class WhileFactors {
	public static void main(String[] args) {
		int i = 1, factors = 6;
		while (i <= factors) {
			if (factors%i == 0) {
				System.out.println("The factors of "+factors+" is : "+i);
			}
			i++;
		}
	}
}

class WhilePerfect {
	public static void main(String[] args) {
		int i = 1, factor = 6, sum = 0, perfectNumber = 0;
		while ( i<= factor) {
			if (factor%i == 0) {
				sum = sum + i;
			}
			i++;
		}
		perfectNumber = sum - factor;
		if (perfectNumber == factor) {
			System.out.println("Pefect Number "+ perfectNumber);
		}
	}
}

class WhileFactorCount {
	public static void main(String[] args) {
		int  i =1,factor = 6, count = 0;
		while (i <= factor) {
			if ( factor%i == 0) {
				count++;
			}
			i++;
		}
		System.out.println("The number of factors are: "+count);
	}
}

class WhilePrime {
	public static void main(String[] args) {
		int i = 1, number = 371, count = 0;
		while (i<= number) {
			if (number%i == 0) {
				count++;
			}
			i++;
		}
		if(count == 2) {
			System.out.println("This is prime number");
		} else {
			System.out.println("This is not prime number");
		}
	}
}


class WhileFibonacci {
	public static void main(String[] args) {
		int firstDigit = 0, secondDigit = 1, sum = 0, number = 1;
		while(number <= 5) { 
			sum = firstDigit + secondDigit;
			firstDigit = secondDigit;
			secondDigit = sum;
			System.out.println("The fibonacci Series is: "+sum);
			number++;
		}
		
	}
}

class WhileDigits{
	public static void main(String[] args) {
		int number = 12345, remainder = 1, quotient = 1;
		while (number != 0) {
			remainder = number%10;
			quotient = number/10;
			number = quotient;
			System.out.println(remainder);
		}
	}
}

class WhileDigitSum {
	public static void main(String[] args) {
		int number = 3245, remainder = 1, quotient = 1, sum = 0;
		while (number != 0) {
			remainder = number%10;
			quotient = number/10;
			number = quotient;
			sum = sum + remainder;
		}
		System.out.println("The Sum of digits is :"+sum);
	}
}


class WhileDigitCube {
	public static void main(String[] args) {
		int number = 145, remainder = 1, quotient = 1, sum = 0;
		while (number != 0) {
			remainder = number%10;
			quotient = number/10;
			number = quotient;
			sum += remainder*remainder*remainder;
		}
		System.out.println("The sum of cubes of digits is: "+sum);
	}
}

class WhileArmstrong {
	public static void main(String[] args) {
		int number = 153, finalNumber = 153, remainder = 1, quotient = 1, sum = 0;
		while (number != 0) {
			remainder = number%10;
			quotient = number/10;
			number = quotient;
			sum += remainder*remainder*remainder;
		}
		if (finalNumber == sum) {
			System.out.println("The sum of cubes of digits is: "+sum);
		}
	}
}

class WhileReverseNumber {
	public static void main(String[] args) {
		int number = 123,remainder = 1,quotient =1;
		String	sum = "";
		while (number != 0) {
			remainder = number % 10;
			quotient = number / 10;
			number  = quotient;
			sum += remainder;
		}
		System.out.println("The Reverse of given number is :"+sum);
	}
}

class WhilePalindrome {
	public static void main(String[] args) {
		int number = 121, remainder = 1, quotient = 1;
		String palindrome = "";
		int numberPalindrome = 0, remainder1 = 1, quotient1 = 1;
		while (number != 0) {
			remainder = number % 10;
			quotient = number / 10;
			number = quotient;
			palindrome += remainder;
			numberPalindrome = Integer.parseInt(palindrome);
			remainder1 = numberPalindrome%10;
			quotient1 = numberPalindrome/10;
			numberPalindrome = quotient1;
			if(remainder1 == remainder) {
				System.out.println("the digit matched");
			}
		}
	}
}
