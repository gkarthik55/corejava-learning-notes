package com.learning.corejava13.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaExample_04_ForEach_ConsumerInterface 
{
    public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(10,20,30,40,50);
		
		List<Integer> val = Arrays.asList(1,2,3,4,5);
		val.forEach( i -> System.out.println("Value : "+ i));
	
		System.out.println("Values of the List using For-Each loop which implements Consumer Interface");

		//Implementing the Consumer Interface using the Anonymous Class.
		Consumer<Integer> obj = new Consumer<Integer>()
		{
			@Override
			public void accept(Integer i) 
			{
				System.out.println("Value : "+i);
			}
		};
		
		values.forEach(obj);

		//This entire thing of Anonymous class is replaced by Lambda Expression. So simple.
		//ForEach
		values.forEach((i) ->
		{
			System.out.println("Value : "+i);
		});
		
		//More Simplified...
		//In ForEach loop using the Lambda Expression to Implement the Consumer Interface
		values.forEach(i -> System.out.println("Value : "+i));
		
		//Using Method Reference in forEach loop.
		values.forEach(System.out::println);
	}
}
