package com.learning.corejava09.exceptionshandling;


public class JavaExample_ExceptionHandling_Tricky07
{
	public static void main(String[] args) 
	{
		try
		{    
            int a[]=new int[5];
            
            a[5] = 30/0;    
        }    
		catch(ArithmeticException e)  
        {  
            System.out.println("Arithmetic Exception occurs");  
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
        catch(Exception e)  
        {  
            System.out.println("Parent Exception occurs");  
        } 
		
        System.out.println("Rest of the code");    
	}
}	         
