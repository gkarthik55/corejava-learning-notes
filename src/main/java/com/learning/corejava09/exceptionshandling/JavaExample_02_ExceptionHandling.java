package com.learning.corejava09.exceptionshandling;

public class JavaExample_02_ExceptionHandling
{
	public static void main(String[] args) 
	{
		//some scenarios where unchecked exceptions may occur.		
		try
		{
			int a=8, b=2;
			
			//A scenario where ArithmeticException occurs.
			int sum = a/b;
			System.out.println("Sum : "+sum);
			
			//A scenario where NullPointerException occurs.
			String s = null;
			//s.charAt(2);
			
			//A scenario where NumberFormatException occurs
			String s2 = "abc";
			int i = Integer.parseInt(s2);
			
			System.out.println("Value of i : "+i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic Exception has occured.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormat Exception has occured.");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception has occured.");
		}
		catch(Exception e)
		{
			System.out.println("General Exception has occured"+ e);
		}
		finally
		{
			System.out.println("Finally block executed.");
		}
		
	}		
}	         
