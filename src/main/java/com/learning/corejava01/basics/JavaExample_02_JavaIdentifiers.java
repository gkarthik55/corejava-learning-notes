package com.learning.corejava01.basics;

public class JavaExample_02_JavaIdentifiers 
{
	public static void main(String[] args) 
	{
		// Examples of valid identifiers
		int MyVariable = 5;
		int MYVARIABLE;
		int myvariable;
		int _myvariable;
		int $myvariable;
		int sum_of_array;
		int geeks123;

		// Only '_' and '$' is allowed in the beginning and '_' in the middle.
		System.out.println("Value of MyVariable:" + MyVariable);
	}
}
