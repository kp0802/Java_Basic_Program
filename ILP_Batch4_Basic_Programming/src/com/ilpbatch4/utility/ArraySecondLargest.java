package com.ilpbatch4.utility;

public class ArraySecondLargest {

	public static void main(String[] args) {
		int a[] = {41,2,5,9,4,3};
		largestOfArray(a);
	}

	private static void largestOfArray(int[] a) {
		int largest = a[0];
		int secondLargest = a[1];
		int solution[];
		for(int i =1; i< a.length; i++) {	
			if(a[i] > largest) {
				secondLargest= largest;
				largest = a[i];
			}
			if(a[i] > secondLargest && a[i] < largest ) {
				secondLargest = a[i];
			}
		}
		System.out.print("Largest Number in the array is " + largest + " and the second largest number is " + secondLargest);
	}

}
