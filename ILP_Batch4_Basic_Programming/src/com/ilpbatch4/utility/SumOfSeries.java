package com.ilpbatch4.utility;

public class SumOfSeries {

	public static void main(String[] args) {
		int input = 20;
		sumOfTheSeries(input);
	}

	private static void sumOfTheSeries(int input) {
		int output = 0;
		for(int i = 1; i <= input; i++)
		{
			 output= output + i; 
		}
		System.out.println("Sum of the series = " + output);
	}

}
