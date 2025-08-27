package com.learning.corejava09.exceptionshandling;

public class JavaExample_01_ExceptionHandling
{
	public static void main(String[] args) 
	{
		int a=6, b=0;
		
		try
		{
			System.out.println("Begin of try block:");
			
			int sum = a/b;
			
			System.out.println("Sum : "+sum);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured"+ e);
		}
		finally
		{
			System.out.println("Finally block executed.");
		}
		
	}		
}	         
