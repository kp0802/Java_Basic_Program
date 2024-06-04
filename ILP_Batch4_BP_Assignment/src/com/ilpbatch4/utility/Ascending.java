package com.ilpbatch4.utility;

public class Ascending {

	public static void main(String[] args) {
		int input1 = 100, input2 = 2000, input3 = 10, input4 = 20;
		ascending(input1, input2, input3, input4);
	}

	private static void ascending(int input1, int input2, int input3, int input4) {
		if(input1 < input2 && input1 < input3 && input1 < input4) 
		{
			System.out.print(input1 + ", ");
			if(input2 < input3 && input2 < input4) 
			{
				System.out.print(input2 + ", ");
				if(input3 < input4) {
					System.out.print(input3 + ", " + input4);
				}
				else {
					System.out.print(input4 + ", " + input3);
				}
			}
			else if(input3 < input2 && input3 < input4){
				System.out.print(input3 + ", ");
				if(input2 < input4) {
					System.out.print(input2 + ", " + input4);
				}
				else {
					System.out.print(input4 + ", " + input2);
				}
			}
			else {														
				System.out.print(input4 + ", ");
				if(input2 < input3) {
					System.out.print(input2 + ", " + input3);
				}
				else {
					System.out.print(input3 + ", " + input2);
				}
			}
		}																 //Ends for input1
		else if(input2 < input1 && input2 < input3 && input2 < input4) 
		{ 																//Starts with input2
			System.out.print(input2 + ", ");
			if(input1 < input3 && input1 < input4) {
				System.out.print(input1 + ", ");
				if(input3 < input4) {
					System.out.print(input3 + ", " + input4);
				}
				else {
					System.out.print(input4 + ", " + input3);
				}
			}
			else if(input3 < input1 && input3 < input4) {
				System.out.print(input3 + ", ");
				if(input1 < input4) {
					System.out.print(input1 + ", " + input4);
				}
				else {
					System.out.print(input4 + ", " + input1);
				}
			}
		}																//Ends with input2
		else if(input3 < input1 && input3 < input2 && input3 < input4)
		{																//Starts with input3
			System.out.print(input3 + ", ");
			if(input1 < input2 && input1 < input4)
			{
				System.out.print(input1 + ", ");
				if(input2 < input4) 
				{
					System.out.print(input2 + ", " + input4);
				}
				else
				{
					System.out.print(input4 + ", " + input2);
				}
			}
			else if(input2 < input1 && input2 < input4)
			{
				System.out.print(input2 + ", " );
				if(input1 < input4)
				{
					System.out.print(input1 + ", " + input4);
				}
				else
				{
					System.out.print(input4 + ", " + input1);
				}
			}
			else
			{
				System.out.print(input4 + ", ");
				if(input1 < input2)
				{
					System.out.print(input1 + ", " + input2);
				}
				else
				{
					System.out.print(input2 + ", " + input1);
				}
			}
		}																//Ends with input3
		else															//Starts with input4
		{
			System.out.print(input4 + ", ");
			if(input1 < input2 && input1 < input3) 
			{
				System.out.print(input1 + ", ");
				if(input2 < input3)
				{
					System.out.print(input2 + ", " + input3);
				}
				else
				{
					System.out.print(input3 + ", " + input2);
				}
			}
			else if(input2 < input1 && input2 < input3)
			{
				System.out.print(input2 + ", ");
				if(input1 < input3)
				{
					System.out.print(input1 + ", " + input3);
				}
				else
				{
					System.out.print(input3 + ", " + input1);
				}
			}
			else
			{
				System.out.print(input3 + ", ");
				if(input1 < input2)
				{
					System.out.print(input1 + ", " + input2);
				}
				else
				{
					System.out.print(input2 + ", " + input1);
				}
			}
		}
	}


}
