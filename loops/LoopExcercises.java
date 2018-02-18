package com.loops;

public class LoopExcercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {
			int number = i, temp, rev = 0, r = 1;
			temp = number;
			while (number != 0) {
				r = number % 10;
				number = number / 10;
				rev = rev * 10 + r;
			}

			if (rev == temp) {
				System.out.println("This is palindrome " + i);
			}
		}
	}
}

class primeNumber1000 {
	public static void main(String[] args) {

		for (int j = 3; j <= 1000; j++) {
			int i = 1, count = 0;
			int number = j;
			while (i <= number) {
				if (number % i == 0) {
					count++;
				}
				i++;
			}
			if (count == 2) {
				System.out.println("This is prime number " + number);
			}
		}
	}
}

class armstrongNumber1000 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			int number = i, remainder = 1, sum = 0;
			int temp = number;
			while (number != 0) {
				remainder = number % 10;
				number = number / 10;
				sum += remainder * remainder * remainder;
			}
			if (temp == sum) {
				System.out.println("The armstrong number is: " + temp);
			}

		}
	}
}

class armstrongNumberSum {
	public static void main(String[] args) {
		int totalSum = 0;
		for (int i = 1; i < 1000; i++) {
			int number = i, remainder = 1, sum = 0;
			int temp = number;
			while (number != 0) {
				remainder = number % 10;
				number = number / 10;
				sum += remainder * remainder * remainder;
			}
			if (temp == sum) {
				System.out.println("The armstrong number is: " + temp);
				totalSum += temp;
				System.out.println("The total armstrong number sum is: " + totalSum);
			}

		}
	}
}

class PrimeArmstrong {
	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			int number = i, remainder = 1, sum = 0, j = 1, count = 0;
			int temp = number;
			while (number != 0) {
				remainder = number % 10;
				number = number / 10;
				sum += remainder * remainder * remainder;
			}
			if (temp == sum) {
				System.out.println("The armstrong number is: " + temp);
				while (j <= temp) {
					if (temp % j == 0) {
						count++;
					}
					j++;
				}
				if (count == 2) {
					System.out.println("This is prime armstrong :" + temp);
				}
			}

		}
	}
}

class palindromeSum {
	public static void main(String[] args) {
		int totalSum = 0;
		for (int i = 1; i <= 1000; i++) {
			int number = i, temp, rev = 0, r = 1;
			temp = number;
			while (number != 0) {
				r = number % 10;
				number = number / 10;
				rev = rev * 10 + r;
			}

			if (rev == temp) {
				System.out.println("This is palindrome " + i);
				totalSum += temp;
				System.out.println("The total Sum of Palindromes upto 100: " + totalSum);
			}
		}
	}
}

class PalindromePrime {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			int number = i, temp, rev = 0, r = 1, j = 1, count = 0;
			temp = number;
			while (number != 0) {
				r = number % 10;
				number = number / 10;
				rev = rev * 10 + r;
			}

			if (rev == temp) {
				// System.out.println("This is palindrome "+i);
				while (j <= temp) {
					if (temp % j == 0) {
						count++;
					}
					j++;
				}
				if (count == 2) {
					System.out.println("This is a prime palindrome: " + temp);
				}
			}
		}
	}
}

class PrimeSum {
	public static void main(String[] args) {
		int totalSum = 2;
		for (int j = 3; j <= 1000; j++) {
			int i = 1, count = 0;
			int number = j;
			while (i <= number) {
				if (number % i == 0) {
					count++;
				}
				i++;
			}
			if (count == 2) {
				System.out.println("This is prime number " + number);
				totalSum += number;
				System.out.println("The total sum of primes upto 1000: " + totalSum);
			}
		}
	}
}

class PerfectPrime {
	public static void main(String[] args) {
		for (int j = 3; j <= 1000; j++) {
			int i = 1, count = 0, div = 1, perfectPrime, factorSum = 0;
			int number = j;
			while (i <= number) {
				if (number % i == 0) {
					count++;
				}
				i++;
			}
			if (count == 2) {
				System.out.println("This is prime number " + number);
				perfectPrime = number;
				while (div < perfectPrime) {
					if (perfectPrime % div == 0) {
						factorSum += div;
					}
					div++;
				}
				if (factorSum == number) {
					System.out.println("This is perfect prime number");
				}
			}
		}
	}
}

class PrintEvenOddDigits {
	public static void main(String[] args) {
		int number = 32458, rem = 1;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			if (rem % 2 == 0) {
				System.out.println("Thi is even number of the digit: " + rem);
			} else {
				System.out.println("This is odd number of the digit: " + rem);
			}
		}
	}
}

class PrintPrimeDigits {
	public static void main(String[] args) {
		int number = 54671, rem = 1, i = 1, count = 0;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			if (rem != 0) {
				while (i <= rem) {
					if (rem % i == 0) {
						count++;
					}
					i++;
					if (count == 2) {
						System.out.println("This is prime number of the digit :" + rem);
					}
				}
			}
			if (number < 10 && number != 0) {
				while (i <= number) {
					if (number % i == 0) {
						count++;
					}
					i++;
				}
				if (count == 2) {
					System.out.println("This is prime number of the digit :" + number);
				}
			}
		}
	}
}

class PrintPerfectDigits {
	public static void main(String[] args) {
		int num = 12368, rem = 1;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;

			int sum = 0, temp, i = 1;
			temp = rem;

			while (i < temp) {
				if (temp % i == 0) {
					sum += i;
				}
				i++;
			}

			if (temp == sum) {
				System.out.println("This is perfect number of digit: " + temp);
			}
			// i=1; sum=0;
		}
	}
}

class PrintMiddleDigits {
	public static void main(String[] args) {
		int num = 34625, rem = 1, count = 0, middleNum = 0, temp = 1;
		int rem1 = 1;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			count++;
			if (count == 1) {
				temp = num;
				while (temp != 0) {
					rem1 = temp % 10;
					temp = temp / 10;
					// System.out.println(rem1);
					middleNum = middleNum * 10 + rem1;
					// System.out.println(middleNum);
				}
				temp = middleNum / 10;
				System.out.println(temp);
			}

		}
	}
}