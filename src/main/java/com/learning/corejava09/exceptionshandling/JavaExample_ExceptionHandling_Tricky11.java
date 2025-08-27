package com.learning.corejava09.exceptionshandling;

import java.io.IOException;

class M
{  
	void method() throws IOException
	{  
		throw new IOException("device error");  
	}   
} 

public class JavaExample_ExceptionHandling_Tricky11
{
	public static void main(String[] args) throws IOException 
	{
		M m=new M();  
	    m.method();  
	  
	    System.out.println("normal flow...");     
		System.out.println("rest of the code...");    
	}         
}	         
