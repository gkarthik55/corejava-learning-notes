package com.learning.corejava08.interfacesandabstractclasses;

//A simple Java program to demonstrate multiple inheritance through default methods. 

interface MyWriter 
{ 
	 default void show() 
	 { 
	     System.out.println("I am a Writer"); 
	 } 
	 
	 // static method 
	 static void display() 
	 { 
	     System.out.println("I am a Writer"); 
	 } 
} 

class MyPen implements MyWriter
{
	// Overriding default show method 
	@Override
    public void show() 
    { 
        // use super keyword to call the show method of Writer interface 
		MyWriter.super.show(); 
    } 
}

// If we remove implementation of default method from �TestClass�, 
// we get compiler error. 
public class JavaExample_02_StaticMethods_UsingInterfaces_Java8 
{
	public static void main(String[] args) 
	{
		MyWriter.display();
	}
}
