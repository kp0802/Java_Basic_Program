package com.ilpbatch4.utility;

public class Pattern1 {

	public static void main(String[] args) {
		int rows = 52;
		drawPattern(rows);
		drawAnotherPattern(rows);
		newPattern(rows);
	}

	private static void newPattern(int rows) {
		int copy;
		char c;
		for(int i = 1; i <= rows; i++) {
			int count = 1;
			copy = 1;
			c = 'A';
			for(int j = 1; j <= i; j++) {
				if(count == 1) {
					System.out.print(copy + " ");
					copy = copy+1;
					count = 0;
				}
				else {
					System.out.print(c + " ");
					c = (char) (c + 1);
					count = 1;
				}
			}
			System.out.println(" ");
		}
	}

	private static void drawAnotherPattern(int rows) {
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				if(j==1) {
					System.out.print(j);
				}
				else if(j%2==0) {
					System.out.print("  " + j);
				}
				else {
					System.out.print(" " + j);
				}
			}
			System.out.println(" ");
		}
	}

	private static void drawPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

}
