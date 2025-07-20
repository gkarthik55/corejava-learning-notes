package com.learning.corejava09.exceptionshandling;

public class JavaExample_05_ExceptionHandling
{
	//Let's see the java finally example where exception occurs and handled.
	public static void main(String[] args) 
	{
		 try
		 {  
			   int data=25/0;  
			   System.out.println(data);  
		 }  
		 catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }  
		 finally
		 {
			 System.out.println("Finally Block is always executed..");
		 }  
		 
		 System.out.println("Rest of the code...");  
	}  
}	         
