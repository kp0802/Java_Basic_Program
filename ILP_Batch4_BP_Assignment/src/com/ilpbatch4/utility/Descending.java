package com.ilpbatch4.utility;

public class Descending {

	public static void main(String[] args) {
		int num1 = 1, num2 = 6, num3 = 5;
		descend(num1,num2, num3);
	}

	private static void descend(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			System.out.print(num1 + ", ");
			if(num2 > num3) {
				System.out.print(num2 + ", " + num3);
			}
			else {
				System.out.print(num3 + ", "+ num2);
			}
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.print(num2 + ", ");
			if(num1> num3) {
				System.out.print(num1 + ", " + num3);
			}
			else {
				System.out.print(num3 + ", " + num1);
			}
		}
		else {
			System.out.print(num3 + ", ");
			if(num1 > num2) {
				System.out.print(num1 + ", " + num2);
			}
			else {
				System.out.print(num2 + ", " + num1);
			}
		}
		
	}

}
