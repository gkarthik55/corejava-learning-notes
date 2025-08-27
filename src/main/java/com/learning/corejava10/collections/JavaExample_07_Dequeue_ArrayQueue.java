package com.learning.corejava10.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaExample_07_Dequeue_ArrayQueue 
{
	public static void main(String[] args) 
	{
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		
		//Traversing elements  
		for (String str : deque)
		{  
			System.out.println(str);  
		}  
	}  
}

