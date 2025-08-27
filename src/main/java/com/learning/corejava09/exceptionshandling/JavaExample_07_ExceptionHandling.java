package com.learning.corejava09.exceptionshandling;

// Program of Exception Propagation

// Unchecked Exception is thrown by default i.e. Exception Propagation happens.
public class JavaExample_07_ExceptionHandling
{
	void m() 
	{  
		int data=50/0; //throws ArithmeticException
	}  
		  
	void n()
	{  
		m();  
	}  
		  
	void p()
	{  
		try
		{  
		    n();  
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}  
	}
	
	public static void main(String[] args) 
	{
		JavaExample_07_ExceptionHandling obj = new JavaExample_07_ExceptionHandling();  
		obj.p();  
		
	    System.out.println("Rest of the code...");  
	}  
}	         
