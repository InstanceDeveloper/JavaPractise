package com.oop;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

/*
- Bank
	- Accnt Number
	- Pin
	- Name
	- Balance
	- Address

	- deposit
	- withdraw
	- Balance Transfer
	- Balance inquiry
	-
*/

class Customer {
	int accountPin, verifyPin, customerChoice;
	String accountName,accountAddress;
	double accountBalance, depositAmount, withdrawAmount;
	
	int accountNumber = 50400;
	
	public Customer() {
		accountNumber++;
	}
	
	Scanner s = new Scanner(System.in);
	
	 public void customerDetials() {
		System.out.println("Enter Customer Name");
		accountName = s.next();
		System.out.println("Enter the location");
		accountAddress = s.next();
		System.out.println("Enter the amount to be deposited");
		accountBalance = s.nextDouble();
		accountNumber++;
	}
	
	void customerDeposit(double amount) {
		if (accountPin == verifyPin) {
			if (amount > 0) {
				System.out.println("The amount "+amount+" is going to be credited into "+accountNumber);
				accountBalance = accountBalance+amount;
				System.out.println("Total amount in "+accountNumber+" : "+accountBalance);
			} else {
				System.out.println("The deposit shoud be more than "+amount);
			}
		} else {
			System.out.println("The pin entered is wrong number");
		}
	}
	 
	void customerWithdraw(double amount) {
		if (accountPin == verifyPin) {
			if (amount < accountBalance) {
				System.out.println("The amount "+amount+" is going to be debited from "+accountNumber);
				accountBalance = accountBalance-amount;
				System.out.println("Total amount in "+accountNumber+" : "+accountBalance);
			}
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int choice = scan.nextInt();
		
		if (choice == 1) {
			new Customer().customerDetials();
		}
		
		
	}
 
}

