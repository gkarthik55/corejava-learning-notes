package com.learning.corejava10.collections;

import java.util.Stack;

public class JavaExample_02_List_Stack 
{
	public static void main(String[] args) 
	{
		Stack<String> names = new Stack<String>();  
		names.push("C++");  
		names.push("C#");  
		names.push("Java");  
		names.push("Phyton");
		names.push("Scala");
		names.pop();  
		
		System.out.println("Values of the List - Stack\n");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
	}
}
