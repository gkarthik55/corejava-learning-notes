package com.learning.corejava10.collections;

import java.util.LinkedList;
import java.util.List;

public class JavaExample_05_List_LinkedList 
{
	public static void main(String[] args) 
	{
		List<String> names = new LinkedList<>();
		names.add("C++");
		names.add("C#");
		names.add("Java");
		
		//Adding an element at the specific position  
		names.add(0, "Phyton");
		
		System.out.println("Values of the List - Linked List");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
		
        List<String> frontEnd = new LinkedList<String>();  
        frontEnd.add("Angular");  
        frontEnd.add("React");
        
        //Adding second list elements to the first list  
        names.addAll(frontEnd);  
        
		System.out.println("\nValues of the List after Adding - Linked List");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
		
        //Remove an element at the first position  
		names.remove(0);
		
        //Remove an element
		names.remove("C#");
		
		System.out.println("\nValues of the List after Deleting - Linked List");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
	}
}
