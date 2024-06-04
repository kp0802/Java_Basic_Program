package com.ilpbatch4.utility;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int input = 3;
		double sum = 0;
		for (int i = 1; i <= input; i++) {
			double value = factorial(i);
			sum = sum + (i / value);
		}
		System.out.println("Sum of the said factorial = " + sum);
	}
/***
 * 
 * @param input
 * @return
 */
	private static int factorial(int input) {
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}
		return (fact);
	}

}
