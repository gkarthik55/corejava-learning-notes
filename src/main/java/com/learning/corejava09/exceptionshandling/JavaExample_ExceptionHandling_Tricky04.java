package com.learning.corejava09.exceptionshandling;

public class JavaExample_ExceptionHandling_Tricky04
{
	public static void main(String[] args) 
	{
		//we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).
		try  
	    {  
	        int data=50/0; //may throw exception   
	    }  
	    
		// try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
	    catch(ArrayIndexOutOfBoundsException e)  
	    {  
	        System.out.println(e);  
	    }  
	    
		System.out.println("rest of the code");  
	}
}	         
