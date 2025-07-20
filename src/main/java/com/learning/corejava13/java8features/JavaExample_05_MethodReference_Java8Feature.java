package com.learning.corejava13.java8features;

import java.util.Arrays;
import java.util.List;

public class JavaExample_05_MethodReference_Java8Feature 
{
	public static void doubleIt(int i)
	{
		System.out.println("Value :"+ i*2);
	}
	
    public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
	
		System.out.println("Values of the List using forEach Method :");
		values.forEach( i -> System.out.println("Value :"+i));
		
		System.out.println("\nValues of the List using Method References :");
		//Using the Method Reference
		values.forEach(System.out::println);//Calling by Method
		
		//Note : We can use any method and not just SOP. Below is the example of some random 
		// method.
		System.out.println("\nValues of the List doubled using Method References :");
		values.forEach(JavaExample_05_MethodReference_Java8Feature::doubleIt);
		
	}
}
