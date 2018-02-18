package com.loops;

public class CheckingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10, number2 = 15;

		int operation = 2;

		switch (operation) {

		case 1:
			System.out.println("The sum of two number is: " + (number1 + number2));
			break;

		case 2:
			if (number2 > number1) {
				System.out.println("The difference of two numbers is: " + (number2 - number1));
			} else {
				System.out.println("The difference of two numbers is: " + (number1 - number2));
			}
			break;

		case 3:
			System.out.println("The multiplication of two numbers is: " + (number2 * number1));
			break;

		case 4:

			if (number2 > number1) {
				System.out.println("The divsion of two numbers is: " + (number2 / number1));
			} else {
				System.out.println("The division of two numbers is: " + (number1 / number2));
			}
			break;

		default:
			System.out.println("Please enter the correct operation for two numbers ");

		}
	}

}

class switchNumberTest {

	public static void main(String args[]) {

		int number = 153, i = 1, tempNumber;
		int operation = 3;

		switch (operation) {
		case 1:
			int count = 0;
			while (i <= number) {
				if (number % i == 0) {
					count++;
				}
				i++;
			}
			if (count == 2) {
				System.out.println("This is prime number: " + (number));
			} else {
				System.out.println("This is not prime number: " + number);
			}
			break;

		case 2:
			tempNumber = number;
			int palindromeNumber = 0;
			while (tempNumber != 0) {
				int rem = 0;
				rem = tempNumber % 10;
				tempNumber = tempNumber / 10;
				palindromeNumber = palindromeNumber * 10 + rem;
			}
			if (palindromeNumber == number) {
				System.out.println("This is palindrome number");
			} else {
				System.out.println("This is not palindrome number");
			}
			break;

		case 3:
			tempNumber = number;
			int armstrongNumber = 0;

			while (tempNumber != 0) {
				int rem = 0;
				rem = tempNumber % 10;
				tempNumber = tempNumber / 10;
				armstrongNumber += rem * rem * rem;
			}
			if (armstrongNumber == number) {
				System.out.println("This is armstrong number");
			} else {
				System.out.println("This is not armstrong number");
			}
			break;

		case 4:
			tempNumber = number;
			int factSum = 0;
			while (i < tempNumber) {
				if (tempNumber % i == 0) {
					factSum += i;
				}
				i++;
			}
			if (factSum == number) {
				System.out.println("This is perfect number");
			} else {
				System.out.println("This is not perfect number");
			}
			break;
		default:
			System.out.println("the program has terminated because of wrong operation selection");
			System.exit(0);

		}

	}

}