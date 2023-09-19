package com.oops.first.Assignment.diffMethod;

import java.util.Scanner;

public class ClassMethods implements classInterface {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void checkPalindrome() {
		int remainder, sum = 0, temp;
		System.out.println("Enter a number to check if it is a palindrome \n");
		int value = sc.nextInt();
		temp = value;
		while (value > 0) {
			remainder = value % 10;
			// getting remainder
			System.out.println("remain : " + remainder + " & sum : " + sum);
			sum = (sum * 10) + remainder;
			System.out.println("sum: " + sum);
			value = value / 10;
			System.out.println("value: " + value);
		}
		if (temp == sum)
			System.out.println(temp + " is a palindrome\n");
		else
			System.out.println(temp + " is not palindrome\n");
	}

	@Override
	public void printPattern() {
		String pattern = "";
		System.out.println("Enter a number to print thepattern.\n");
		int value = sc.nextInt();
		if (value > 0) {
			for (int i = value; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					pattern += "*";
				}
				System.out.println(pattern);
				pattern = "";
			}
			System.out.println();
		} else
			System.out.println("enter valid no \n");

	}

	@Override
	public void checkPrimeNumber() {
		System.out.println("Enter a number to check whether it is a prime not \n");
		int value = sc.nextInt();
		boolean flag = false;
		if (value <= 1) {
			System.out.println(value + " is not a prime no.");
		} else {
			for (int i = 2; i <= value / 2; i++) {
				// condition for non-prime number
				if (value % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(value + " is a prime number.");
			else
				System.out.println(value + " is not a prime number.");
			System.out.println();
		}
	}

	@Override
	public void printFibonacciSeries() {

		System.out.println("Enter a number to print the Fibonacci series of the number.\n");
		int value = sc.nextInt();
		int first = 0, second = 1, sum = 0;
		if (value == 0) {
			System.out.println("The fibonacci series is: " + first);
		} else if (value == 1) {
			System.out.println("The fibonacci series is: " + first + ", " + second);
		} else {
			System.out.print("The fibonacci series is: " + first + ", " + second);
			while (value > 1) {
				sum = first + second;
				System.out.print(", " + sum);
				first = second;
				second = sum;
				value -= 1;
			}
		}
		System.out.println();
	}

}


