package com.learning.corejava09.exceptionshandling;

public class JavaExample_06_ExceptionHandling
{
	//Let's see the java finally example where exception occurs and handled.

	static void validateAge(int age)
	{
		if(age<18)
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println("Welcome to Voting");
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			validateAge(13);  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	    finally
	    {
	    	System.out.println("Finally block executed.");
	    }
	    System.out.println("Rest of the code...");  
	}  
}	         
