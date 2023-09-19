package com.oops.problems;
/**Write a java program to check whether a year is a leap year or not.*/

public class LeapYearChecker {

	public static void main(String[] args) {
		int yr = 1200;
		if (yr%400 == 0 ) {
			System.out.println("Leap year!! ");
				}else if (yr%100 == 0) {
			System.out.println(" Not a leap year!!");
		}else if (yr%4 ==0) {
			System.out.println("Leap year!! ");
		}else {
			System.out.println("Not a leap year... ");
		}
	}
}
