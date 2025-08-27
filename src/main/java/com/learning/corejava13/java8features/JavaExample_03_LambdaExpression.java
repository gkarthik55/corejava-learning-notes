package com.learning.corejava13.java8features;

@FunctionalInterface  
interface MyWriteable
{  
    void writeSomething(int i);  
}  

public class JavaExample_03_LambdaExpression 
{
	public static void main(String[] args) 
	{
		// Without Lambda expression, MyWriteable implementation using Anonymous class  
		MyWriteable obj1 = new MyWriteable()
		{
			@Override
			public void writeSomething(int i)
			{
				System.out.println("I am writing the value of i using Anonymous class " + i);
			}
		};
		
		obj1.writeSomething(25);
        
		//Using Lambda Expression
		MyWriteable obj2 = (int i) ->
		{
			System.out.println("I am writing the value of i using Lambda Expression " + i);
		};
		obj2.writeSomething(12);
	}
}
