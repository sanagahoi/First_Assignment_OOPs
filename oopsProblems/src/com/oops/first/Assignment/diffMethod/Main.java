package com.oops.first.Assignment.diffMethod;
/** Write a program  

1- Check for palindrome number

3- Check whether the input number is a prime number
4- Print Fibonacci series of size n with first two numbers as 0, 1

Using Switch case and do-While loop provide all the above functionality, 
such that the user can select the functions that he/she needs to perform and exit the program based on the input.

Function Explanations in Brief: 

1) Palindrome number:

 The numbers which give the same value when reversed are called palindrome numbers.
Example: 121, 12321, 512215, etc.,


3) Prime number: 

The numbers which are only divisible by 1 & themselves are called prime numbers. 
(Or) 
The numbers which have factors as 1 and themselves are called prime numbers.

Example_1: If the input number is 23
Factors of 23 are 1, 23, and other than 1 it  is divisible by 23 only
Hence the number is prime.

Example_2: If the input number is 22
Factors of 22 are 1,2, 11, 22 and are divisible by 2 and 11.
Hence the number is not a prime number.

 4)Fibonacci series: 

The series of numbers whose next number is the sum of its previous two numbers is called the Fibonacci series.

Example_1: If the input number is 5,
The Fibonacci series  is: 0, 1, 1, 2, 3 (by default first two numbers are 0,1 (hardcoded), 
and we need to calculate the other nos in series)

Example_2: If the input number is 7
The Fibonacci series is: 0, 1, 1, 2, 3, 5 , 8
 
Exit:
The program should ask the user to choose the task they want to perform after executing a task, 
till choice 0 is entered to exit the program.*/
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ClassMethods method = new ClassMethods();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice from belowlist.\n" + "1. Findpalindrome of number.\n"
					+ "2. Print Pattern for a given no.\n" + "3.Check whetherthe no is a  prime number.\n"
					+ "4. Print Fibonacci series.\n" + "--> Enter0 to Exit.\n");
			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1: {
				method.checkPalindrome();
			}
				break;
			case 2: {
				method.printPattern();
			}
				break;
			case 3: {
				method.checkPrimeNumber();
			}
				break;
			case 4: {
				method.printFibonacciSeries();
				break;
			}	
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
		} while (choice != 0);
		System.out.println("Exit Successfully!!!");
		sc.close();
	}
}
