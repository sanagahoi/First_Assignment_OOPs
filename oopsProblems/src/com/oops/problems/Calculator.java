package com.oops.problems;

import java.util.Scanner;

/**
 * Write a program in java to implement a basic calculator using switch case statement 
 * Accept two no as user input and print the result based on operation.
 * Display list of options
        1 → addition
        2 → subtraction
        3 → multiplication
        4 → division
        Perform division only if the second number is not
 * equal to 0. If the second number is 0 print “Cannot be divided” on console.
 * 
 * @author zebronics
 */

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		System.out.println("First no.--> ");
		int num1 = sc.nextInt();
		System.out.println("Second nu. --> ");
		int num2 = sc.nextInt();
		System.out.println("Which operation you want to perform with the given numbers " + num1 + " and " + num2 
				+ " \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
		
		int inputValue = sc.nextInt();
		
		switch(inputValue) {
		
		case 1:
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println(num1 * num2);
			break;
		case 4:
			if(num2 != 0) {
				System.out.println(num1/num2);
			}else {
				System.out.println("Cannot be divided");
			}
			break;
		default:
			System.out.println("Invalid input!!!.....");
		}
	}
}
