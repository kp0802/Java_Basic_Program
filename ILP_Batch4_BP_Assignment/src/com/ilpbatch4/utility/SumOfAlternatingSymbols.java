package com.ilpbatch4.utility;

public class SumOfAlternatingSymbols {

	public static void main(String[] args) {
		int num = 7;
		sum(num);
	}

	private static void sum(int num) {
		int solution = 0;
		int check = 1;
		for(int i = 1; i <= num; i=i+2)
		{
			if(check == 1)
			{
				solution = solution + i;
				check = 0;
			}
			else
			{
				solution = solution - i;
				check = 1;
			}
		}
		System.out.print("Sum of the series = " + solution);
	}

}
