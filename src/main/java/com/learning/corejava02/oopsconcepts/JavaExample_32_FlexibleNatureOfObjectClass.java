package com.learning.corejava02.oopsconcepts;

public class JavaExample_32_FlexibleNatureOfObjectClass 
{
	public static void main(String[] args) 
	{
		Object y; 
		  
        y = 'A'; 
        System.out.println(y.getClass().getName()); 
  
        y = 1; 
        System.out.println(y.getClass().getName()); 
  
        y = "Hi"; 
        System.out.println(y.getClass().getName()); 
  
        y = 1.222; 
        System.out.println(y.getClass().getName()); 
  
        y = false; 
        System.out.println(y.getClass().getName()); 
        
        // Such a behaviour can be attributed to the fact that java.lang.Object is 
        // super class to all other classes. Hence, a reference variable of type Object 
        // can be practically used to refer objects of any class.
        
        Integer x = 10;
        
     }
}
