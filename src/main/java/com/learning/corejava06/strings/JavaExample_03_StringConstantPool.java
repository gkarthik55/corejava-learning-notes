package com.learning.corejava06.strings;

public class JavaExample_03_StringConstantPool
{
	public static void main(String[] args)
	{
		String s = "GeeksforGeeks"; // String Constant Pool
		
		//To check if its String Constant Pool
		if(s == "GeeksforGeeks")
		{
			System.out.println("The value is stored in  String Constant Pool.");
		}
		
		String str1 = new String ("GeeksforGeeks"); // Java Heap Memory
		
		String str2 = s + " is Awesome"; // Again its Java Heap Memory.
		//Its evaluated at runtime. It results in a new String object created at runtime using StringBuilder.

		if(str1 == "GeeksforGeeks")
		{
			System.out.println("The value is stored in  String Constant Pool.");
		}
		else
		{
			System.out.println("The value is stored in Heap Memory.");
		}
		
		if(str2 == "GeeksforGeeks  is Awesome")
		{
			System.out.println("The value is stored in  String Constant Pool.");
		}
		else
		{
			System.out.println("The value is stored in Heap Memory.");
		}
	}
}
