package com.learning.corejava05.arrays;

public class JavaExample_04_ArraysPassedInMethods
{
	public static int findSum(int arr[])
	{
		int sum = 0;
		
		for(int i:arr)
		{
			sum = sum + i;
		}
		
		return sum;
	}

	public static void main(String[] args) 
	{
		int arr[] = new int[]{10, 58, 35, 46, 8};
		
		System.out.println("Single Dimension Array :");
		System.out.println("Sum of Array is "+ findSum(arr));
	 } 
}	         
