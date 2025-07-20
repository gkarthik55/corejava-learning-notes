package com.learning.corejava01.basics;

public class JavaExample_12_ForLoopInJavaImportant 
{
	public static void main(String[] args) 
	{
		// Providing an expression in for loop is must. Java program to illustrate infinite loop
		
		// for( ; ; ) 
		// is similar to
		// while(true)
		{ 
            System.out.println("This is an infinite loop"); 
        } 
        
        // Initializing multiple variables : In Java, multiple variables can be initialized in initialization block of 
        // 'for loop' regardless of whether you use it in the loop or not.
		
        int x = 2; 
        for(int y=0, z=4; x<10 && y<10; x++, y++)
        // Simple. Multiple variables can be declared using comma(,) of same type.
        { 
            System.out.println(y + " "); 
        } 
      
        System.out.println("x:"+x); 
        
        // Redeclaration of a variable in initialization block : 
        // Suppose, an initialization variable is already declared as integer.
        // Can we re-declare it in for loop with other data type? No
        
        // x1 is integer 
        int x1 = 0; 
          
        // redeclaring x as long will not work 
        for(long y = 0, x2 = 1; x1 < 5; x1++)  
        {  
            System.out.print(x + " "); 
        } 
        
        // Variables in the loop are accessible only within: The variables that are declared in the 
        // initialization block can be accessed only within the loop.
        // x and y scope is only within for loop 
        for(int x2 = 0, y2 = 0; x2 < 3 && y2 < 3; x2++, y2++)  
        { 
            System.out.println(y2 + " "); 
        } 
        System.out.println(x); 
	}
}
