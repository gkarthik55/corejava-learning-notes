package com.learning.corejava09.exceptionshandling;

public class JavaExample_ExceptionHandling_Tricky05
{
	public static void main(String[] args) 
	{
		//Let's see an example to handle another unchecked exception.
		try  
	    {  
	        int arr[]= {1,3,5,7};  
	        System.out.println(arr[10]); //may throw exception   
	    }  
	    catch(ArrayIndexOutOfBoundsException e)  
	    {  
	         System.out.println(e);  
	    }  
		
		System.out.println("rest of the code");  
	}
}	         
