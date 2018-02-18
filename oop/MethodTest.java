package com.oop;


class Methodloop {
	void loop() {
		int i = 1;
		while (i <= 10) {
			System.out.println("The value of i is: " + i);
			i++;
		}
	}
}

class MethodInverseLoop {
	void inverseLoop() {
		int i = 10;
		while (i >= 1) {
			System.out.println("The value of i is: " + i);
			i--;
		}
	}
}

class MethodEven {
	void even() {
		int i = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println("The value of i is: " + i);
			}
			i++;
		}
	}
}

class MethodOdd {
	void odd() {
		int i = 0;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.println("The value of i is: " + i);
			}
			i++;
		}
	}
}

class MethodMultiples {
	void multiples() {
		int i = 1;
		while (i <= 10) {
			System.out.println("The multiples of 8 are: " + (8 * i));
			i++;
		}
	}
}

class MethodLoopSum {
	void loopSum() {
		int i = 1, sum = 0;
		while (i <= 10) {
			sum += i;
			System.out.println("The sum at " + i + " is: " + sum);
			i++;
		}
	}
}

class MethodFactorial {
	void factorial() {
		int i = 1, factorial = 1;
		while (i <= 5) {
			factorial *= i;
			i++;
		}
		System.out.println("The factorial value is: " + factorial);
	}
}

class MethodEvenSum {
	void EvenSum() {
		int i = 0, sum = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("The sum of even numbers is: " + sum);
	}
}

class MethodOddSum {
	void oddSum() {
		int i = 1, sum = 0;
		while (i <= 10) {
			if (i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println("The sum of odd numbers is: " + sum);
	}
}

class MethodFactor {
	void factor() {
		int i = 1, factor = 6;
		while (i <= factor) {
			if (factor % i == 0) {
				System.out.println("The factors of " + factor + " is: " + i);
			}
			i++;
		}
	}
}

class MethodPerfectNumber {
	void PerfectNumber() {
		int i = 1, factor = 6, sum = 0;
		while (i < factor) {
			if (factor % i == 0) {
				sum += i;
			}
			i++;
		}
		if (sum == factor) {
			System.out.println("the number is PerfectNumber");
		}
	}
}

class MethodFibonacci {
	void fibonacci() {
		int firstDigit = 0, secondDigit = 1, sum = 0, number = 1;
		while (number <= 10) {
			firstDigit = secondDigit;
			secondDigit = sum;
			System.out.println("The fibonacci Series is: " + sum);
			sum = firstDigit + secondDigit;
			number++;
		}
	}
}

class MethodDigits {
	void printDigits() {
		int num = 123, rem = 1;
		while (num != 0) {
			rem = num%10;
			num = num/10;
			System.out.println(rem);
		}
	}
}

class MethodDigitSum {
	void digitSum() {
		int num = 123, rem = 1, sum = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum += rem;
		}
		System.out.println("the sum of digits is: " + sum);
	}}

class MethodDigitSumCube{

	void digitSumCube() {
		int num = 123, rem = 1, sum = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum += rem * rem * rem;
		}
		System.out.println("the sum of cubes is: " + sum);
	}
}


class TraingleArea {
	public void area() {
		int base = 12, height = 5;
		double area = 0.5 * (base * height);
		System.out.println("The area of triangle is: " + area);
	}
}

class PalindromeFinder {
	public void palindrome() {
		int number = 121, rem = 1, temp = 0, test;
		test = number;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			temp = temp * 10 + rem;
		}
		if (temp == test) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}
}

class ArmstrongFinder {
	public void armstrong() {
		int number = 153, rem = 1, temp = 0, test;
		test = number;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			temp += rem * rem * rem;
		}
		if (test == temp) {
			System.out.println("The number is armstrong");
		} else {
			System.out.println("The number is not armstrong");
		}
	}
}

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraingleArea a1 = new TraingleArea();
		a1.area();

		PalindromeFinder p1 = new PalindromeFinder();
		p1.palindrome();

		ArmstrongFinder armstrong1 = new ArmstrongFinder();
		armstrong1.armstrong();
		
		Methodloop m1 = new Methodloop();
		m1.loop();
		
		MethodInverseLoop m2 = new MethodInverseLoop();
		m2.inverseLoop();
		
		MethodEven m3 = new MethodEven();
		m3.even();
		
		MethodOdd m4 = new MethodOdd();
		m4.odd();
		
		MethodEvenSum m5 = new MethodEvenSum();
		m5.EvenSum();
		
		MethodOddSum m6 = new MethodOddSum();
		m6.oddSum();
		}

}
