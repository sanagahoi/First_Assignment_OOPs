package com.oops.problems;

import java.util.Scanner;

/**
 * Write a program to interchange two numbers without using a third variable
 * Hint: perform addition and subtraction and use the same variables to store result.
 */
public class NumberInterchanger {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number..");
		num1 = sc.nextInt();
		System.out.println("Enter the second number....");
		num2 = sc.nextInt();
		
		num2 = num1+num2; //9+7 = 16
		System.out.println("Interchanging the Numbers ...");
		num1 = num2 - num1;
		System.out.println("First number is --> " + num1);
		num2 =num2 - num1;
		System.out.println("Second number is --> " + num2);
	}
}
