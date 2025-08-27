package com.learning.corejava09.exceptionshandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaExample_ExceptionHandling_Tricky06
{
	public static void main(String[] args) throws IOException 
	{
		//Let's see an example to handle checked exception.
        try 
        {  
        	FileReader file = new FileReader("sample1.txt"); //may throw exception
        	BufferedReader br = new BufferedReader(file);
        	String message = br.readLine();
        	
        	System.out.println(message);
        }  
		catch (FileNotFoundException e) 
        {  
            System.out.println(e);  
        }         
        System.out.println("File saved successfully");  
	}
}	         
