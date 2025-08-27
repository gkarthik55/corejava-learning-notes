package com.learning.corejava05.arrays;

import java.util.ArrayList;
import java.util.List;

public class JavaExample_06_ArrayAndArrayListDifferences
{
	public static void main(String[] args) 
	{
		int	arr[] = new int[5];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 25;
		
		System.out.println("Normal Array: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(" "+ arr[i]);
		}
		
		//Array List in Java
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(2);
		arrList.add(4);
		arrList.add(6);
		
		System.out.println("\nArray List in Java");
		for (int i=0;i<arrList.size(); i++)
		{
			System.out.print(" "+ arrList.get(i));
		}
		
	 } 
}	         
