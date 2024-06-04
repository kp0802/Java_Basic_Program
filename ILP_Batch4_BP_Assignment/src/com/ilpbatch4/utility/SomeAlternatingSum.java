package com.ilpbatch4.utility;

public class SomeAlternatingSum {

	public static void main(String[] args) {
		int terms = 3;
		sumOfSeries(terms);
	}

	private static void sumOfSeries(int terms) {
		int check = 1;
		int count = 1;
		int num = 1;
		int sum = 0;
		
		for(int i = 1; count <= terms; i = i + 2)
		{
			if(check == 1)
			{
				sum = sum + powerOf(i,num);
				num += 1;
				count += 1;
				check = 0;
			}
			else
			{
				sum = sum - powerOf(i,num);
				num += 1;
				count += 1;
				check = 1;
			}
		}
		System.out.print("Sum of the series: " + sum);
	}

	private static int powerOf(int i, int num) 
	{
		int product = 1;
		for(int j = 1; j <= num; j++)
		{
			product = product * i;
		}
		return product;
	}

}
