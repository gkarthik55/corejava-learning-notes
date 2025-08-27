package com.learning.corejava09.exceptionshandling;

public class JavaExample_ExceptionHandling_Tricky01
{
	public static void main(String[] args) 
	{
		//an example to resolve the exception in a catch block.
		
		int i=50;  
	    int j=0;  
	    int data;  
	     
	    try  
	    {  
	       data=i/j; //It will throw exception   
	    }  
	    // handling the exception  
	    catch(Exception e)  
	    {  
	    	// resolving the exception in catch block  
	        System.out.println(i/(j/2));  
	    }  
	}		
}	         
