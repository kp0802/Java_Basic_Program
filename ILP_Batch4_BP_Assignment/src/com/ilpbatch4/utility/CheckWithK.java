package com.ilpbatch4.utility;
import java.util.Random;
import java.util.random.*;

public class CheckWithK {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		for(int i =0;i<10;i++)
		{
			arr[i] = random.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		int check = random.nextInt(15);
		System.out.println("");
		System.out.println("The value to be checked with: " + check);
		checkSum(arr, check);
		System.out.println(" ");
	}

	private static void checkSum(int[] arr, int check) 
	{
		int sum = 0;
		int count = 0;
		System.out.println("The possible pairs are: ");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i] + arr[j] == check) {
					System.out.print(arr[i] + " and "+ arr[j] + " ");
					count ++;
				}
			}
		}
		if(count == 0)
		{
			System.out.print("None");
		}
		
	}

}
