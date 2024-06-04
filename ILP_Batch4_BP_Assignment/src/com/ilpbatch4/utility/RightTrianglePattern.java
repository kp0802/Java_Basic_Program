package com.ilpbatch4.utility;
 
public class RightTrianglePattern {
 
	public static void main(String[] args) {
		int rows = 7;
		displayTriangle(rows);
 
	}
 
	private static void displayTriangle(int rows) {
		for(int i = 1; i<= rows; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
 
}