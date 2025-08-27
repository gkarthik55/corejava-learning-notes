package com.learning.corejava06.strings;

// write a program to reverse the given string
public class JavaExample_07_StringInterviewQuestion
{
	public static void main(String[] args)
	{
		// Approach 1: Using String charAt.
		String str = "This is a Demo for String Reverse";
		String reverse = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			reverse += str.charAt(i);
		}
		
		System.out.println(reverse);
		
		// Approach 2:
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
}
