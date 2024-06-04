package com.ilpbatch4.utility;


public class ContinuousSubArray {

	public static void main(String[] args) {
		int arr[] = {5,2,6,1,3,2,9,6,8,10};
		int check = 19;
		System.out.println("");
		checkSum(arr, check);
	}

	private static void checkSum(int[] arr, int check) {
		int sum;
		int count = 0;
		System.out.println("The indices are: ");
		for(int i = 0;i<10;i++) {
			sum = arr[i];
			for(int j = i+1; j < 10; j++) {
				sum += arr[j];
				if(sum == check)
				{
					System.out.print(i + " " + j);
					count++;
				}
			}
		}
		if(count == 0)
		{
			System.out.print("Sub-array not present");
		}
		
	}

}
