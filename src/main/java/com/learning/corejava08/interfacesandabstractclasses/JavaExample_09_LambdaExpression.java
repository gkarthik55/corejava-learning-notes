package com.learning.corejava08.interfacesandabstractclasses;

@FunctionalInterface  
interface MyWriteable
{  
    void writeSomething();  
}  

public class JavaExample_09_LambdaExpression 
{
	public static void main(String[] args) 
	{
		//Without Lambda expression, MyWriteable implementation using anonymous class  
		MyWriteable obj1 = new MyWriteable()
		{  
			@Override
			public void writeSomething() 
			{
				System.out.println("I am writing using Anonymous Class");
			}  
		};  
		
		obj1.writeSomething();
        
		//Using Lambda Expression
		MyWriteable obj2 = ()->
		{
			System.out.println("I am writing using Lambda Expression");
		};  
		
		obj2.writeSomething();
	}
}
