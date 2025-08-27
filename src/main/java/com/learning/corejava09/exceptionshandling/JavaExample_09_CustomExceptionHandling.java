package com.learning.corejava09.exceptionshandling;

// Here we are creating a custom exception i.e. Its Unchecked Exception.
class InvalidAgeException extends RuntimeException
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}  

public class JavaExample_09_CustomExceptionHandling
{
	static void validate(int age)
	{  
	     if(age<18)
	     {
	    	 throw new InvalidAgeException("Age is not valid for Voting.!!");  
	     }
	     else
	     {
	    	 System.out.println("Welcome to Voting.");  
	     }
	}  
	
	public static void main(String[] args) 
	{
		try
		{  
			validate(13);  
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
		}  
		  
		System.out.println("Rest of the code...");  
	}  
}	         
