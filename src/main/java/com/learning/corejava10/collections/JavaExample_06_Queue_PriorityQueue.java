package com.learning.corejava10.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaExample_06_Queue_PriorityQueue 
{
	public static void main(String[] args) 
	{
		Queue<String> queue = new PriorityQueue<>();  
		
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		
		System.out.println("Head Element : "+queue.element());
		System.out.println("Head Element : "+queue.peek());
		
		System.out.println("------------------------------------");
		System.out.println("Iterating the Queue elements:");
		System.out.println("------------------------------------");
		
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
		System.out.println("------------------------------------");
		
		queue.remove();
		queue.poll();
		
		System.out.println("After removing two elements:");  
		System.out.println("------------------------------------");
		
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext())
		{  
			System.out.println(itr2.next());  
		}
		
		System.out.println("------------------------------------");
	}  
}

