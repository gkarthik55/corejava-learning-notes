package com.learning.corejava09.exceptionshandling;

//a simple example of java nested try block.
public class JavaExample_03_ExceptionHandling
{
	public static void main(String[] args)
	{
		try
		{
			try
			{
				System.out.println("Divide by Zero..");
				int b = 39 / 0;
			} 
			catch (ArithmeticException e)
			{
				System.out.println(e);
			}

			try
			{
				int a[] = new int[5];
				a[5] = 14;
			} 
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}

			System.out.println("Other statement..");
		}
		catch (Exception e)
		{
			System.out.println("Exception is been handled" + e);
		}

		System.out.println("Normal flow..");
	}
}
