package com.learning.corejava01.basics;

// Instance Variables: Instance variables are non-static variables and are declared in a class outside any method, 
// constructor or block.
class Employee 
{    
    // These variables are instance variables. These variables are in a class and are not inside any function 
    int empId; 
    String empName; 
}

class Counter
{
	public static int count=1;
}

class Emp 
{ 
	   // static variable salary 
	   public static String CEO = "Larry Ellison"; 
} 
	  

public class JavaExample_10_Variables 
{
	public static void main(String[] args) 
	{
		//Local Variables: A variable defined within a block or method or constructor is called local variable
		 //local variable is age 
        int age = 0; 
        age = age + 5;
        System.out.println("Age : "+age);

        // Final variable in Java can be assigned a value only once, we can assign a value either in declaration or later.
        final int i=20;
        //i = 30; // Error because i is final.
		System.out.println(i);
        
		//Static Variables: Static variables are also known as Class variables.
		System.out.println(Counter.count);
		Counter.count++;
		System.out.println(Counter.count);
	}

}
