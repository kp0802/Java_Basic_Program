package com.ilpbatch4.utility;
import java.util.Random;
import java.util.random.*;


public class MissingNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int num = 10;
		int arr[] = new int[10];
		for(int i = 0; i<10;i++)
		{
			arr[i] = random.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		checkForMissingNo(arr, num);

	}

	private static void checkForMissingNo(int[] arr, int num) {
		int check = 0;
		int missing = 0;
		System.out.print("Missing numbers are: ");
		for(int i = 0; i < num; i++)
		{
			missing = 0;
			check = 0;
			for(int j = 0; j < num; j++)
			{
				if(arr[j] == i)
				{
					check=0;
					break;
				}
				else
				{
					check = 1;
					missing = i;
				}
			}
			if(check == 1)
			{
				System.out.print(missing + " ");
			}
		}
		
	}

}
