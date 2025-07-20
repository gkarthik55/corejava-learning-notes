package com.learning.corejava06.strings;

//write a program to print sum of digits in the given string

public class JavaExample_04_StringInterviewQuestion
{
	public static void main(String[] args)
	{
		String str = "12dfs345234dfc"; //1+2+3+4+5+2+3+4
		
		System.out.println(printSum(str));
	}
	
	public static int printSum(String str)
	{
		int sum = 0;

		char charArr[] = str.toCharArray();
		int len = charArr.length;
		
		for(int i=0; i<len; i++)
		{
			if(charArr[i] >= 48 && charArr[i] <= 58)
			{
				// sum = sum + charArr[i];  <-- This will not work
				sum = sum + Character.getNumericValue(charArr[i]);
			}
		}
		
		return sum;
	}
}
