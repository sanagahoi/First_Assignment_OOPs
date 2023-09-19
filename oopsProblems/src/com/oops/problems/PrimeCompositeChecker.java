package com.oops.problems;

import java.util.Scanner;

/**Create a basic Switch case statement which will handle the following cases:

if number is 1 : it should display "neither prime nor composite"

if number is 2 : it should display "no is prime"

if number is 4 : it should display "no is composite"
 */
public class PrimeCompositeChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		switch (num) {
		case 1:
			System.out.println("neither prime nor composite");
			break;
			
		case 2:
			System.out.println("no is prime");
			break;
			
		case 4:
			System.out.println("no is composite");
			break;
		}
		
	}

}
