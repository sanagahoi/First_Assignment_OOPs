package com.oops.problems;
/**
 * 1. Write a program in java to check whether the given number is an even number or not 
 * using ternary Operator.
 * 
 * 2. Write a program in java to check whether the given number is an even number or not 
 *  using an if else statement.
 *  If the number is even, it should print “Number is even”, otherwise it should print “Number is odd”.
 */

import java.util.Scanner;

public class EvenNumberChecker {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = in.nextInt();

		//1. using ternary operator
		checkEvenNumber(num);

		//2. using if condition
		isNumEven(num);

	}

	private static void checkEvenNumber(int num) {
		
		String result = num%2 == 0 ? "Even " : "Not an even ";
		
		//displaying the result
		System.out.println("The given no. is " + result + "number");

	}

	private static void isNumEven(int n) {

		if (n % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is Odd");
		}
	}

}
