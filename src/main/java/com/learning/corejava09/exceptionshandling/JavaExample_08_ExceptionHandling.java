package com.learning.corejava09.exceptionshandling;

import java.io.IOException;

//Program which describes that checked exceptions are not propagated
public class JavaExample_08_ExceptionHandling 
{
	void m() throws IOException
	{
		throw new java.io.IOException("There is an error in the device.."); //checked exception
	}  
	void n() throws IOException
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
		   System.out.println("Exception is been handled..");
		   System.out.println(e);
	   }  
	}  
	
	public static void main(String[] args) 
	{
		JavaExample_08_ExceptionHandling obj=new JavaExample_08_ExceptionHandling();  
		obj.p();  
		
	    System.out.println("Rest of the code...");  
	}  
}	         
