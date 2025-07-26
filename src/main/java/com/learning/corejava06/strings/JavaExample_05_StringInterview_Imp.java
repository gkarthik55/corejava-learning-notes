package com.learning.corejava06.strings;

// write a program to print sum of Numbers in the given string

public class JavaExample_05_StringInterview_Imp
{
	public static void main(String[] args)
	{
		String str = "abc12xyz34pq5";
		
		sumOfNumbersInString(str);
	}
	
	public static void sumOfNumbersInString(String str)
	{
		int sum = 0;
		String number = "";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch))
			{
				number = number + ch; // String Concat 
			}
			else
			{
				if(!number.isEmpty())
				{
					System.out.println("Printing the Number :" + number);
					sum = sum + Integer.parseInt(number);
					
					number = "";
				}
			}
		}

		if(!number.isEmpty())
		{
			System.out.println("Printing the Number :" + number);
			sum = sum + Integer.parseInt(number);
		}
		
		System.out.println("Sum :"+ sum);
	}
}
