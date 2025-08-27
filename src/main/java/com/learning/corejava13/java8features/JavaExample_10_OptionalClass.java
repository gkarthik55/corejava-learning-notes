package com.learning.corejava13.java8features;

import java.util.Optional;

public class JavaExample_10_OptionalClass 
{
	public static void main(String[] args) 
	{
		String[] str = new String[10];
		
		Optional<String> value = Optional.ofNullable(str[5]);  
        if(value.isPresent())
        {  
        	// check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }
        else
        {
        	System.out.println("String value is not present.");
        }
        
        String[] str1 = new String[10];        
        str1[5] = "Core Java";// Setting value for 5th index  
        
        Optional<String> value1 = Optional.ofNullable(str1[5]);
        
        if(value1.isPresent())
        {  
        	// It Checks, value is present or not  
            String lowercaseString = str1[5].toLowerCase();  
            System.out.println("Value fetched after checking : "+lowercaseString);
            
            System.out.println("Value fetched from Optional : "+value1.get());
        }
        else  
        {
        	 System.out.println("String value is not present"); 
        }
	}
}
