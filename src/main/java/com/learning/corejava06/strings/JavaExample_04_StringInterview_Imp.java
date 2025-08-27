package com.learning.corejava06.strings;

// write a program to print sum of digits in the given string

public class JavaExample_04_StringInterview_Imp
{
	public static void main(String[] args)
	{
		String str = "abc12xyz34pq5"; //1+2+3+4+5

		printSum(str);
	}
	
	public static void printSum(String input)
	{
		int sum = 0;

		for (int i=0; i<input.length(); i++)
		{
			char ch = input.charAt(i);

			if (Character.isDigit(ch))
			{
				sum = sum + ch - '0'; // Convert char digit to int
			}
		}

		System.out.println(sum);
	}
}
