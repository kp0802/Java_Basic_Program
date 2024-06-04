package com.ilpbatch4.utility;

import java.util.Random;
import java.util.random.*;

public class DuplicateElements {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = random.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		findDuplicateNumber(arr);
	}

	private static void findDuplicateNumber(int[] arr) {
		int duplicate = 0;
		int check;
		System.out.println("Duplicate values are: ");
		for(int i = 0; i < 10; i++)
		{
			check = 0;
			for(int j = 0; j < 10; j++)
			{
				if(arr[i] == arr[j])
				{
					check = check + 1;
				}
			}
			if(check == 2)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

}
