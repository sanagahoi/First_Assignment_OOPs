package com.oops.problems;
/**
 * Write a program in java to print the following pattern (Hint : Use nested for loop)

 *
 **
 ***
 ****
 *****

 * @author zebronics
 */
public class SimplePattern {

	public static void main(String[] args) {
		for (int i = 1; i<=5 ; i++ ) {
			for(int j=1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
