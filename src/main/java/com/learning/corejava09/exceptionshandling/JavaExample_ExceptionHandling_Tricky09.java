package com.learning.corejava09.exceptionshandling;

public class JavaExample_ExceptionHandling_Tricky09
{
	public static void main(String[] args) 
	{
		try
		{    
            String s=null;  
            System.out.println(s.length());  
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
