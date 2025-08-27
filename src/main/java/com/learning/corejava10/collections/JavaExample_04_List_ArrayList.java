package com.learning.corejava10.collections;

import java.util.List;
import java.util.ArrayList;

public class JavaExample_04_List_ArrayList 
{
	public static void main(String[] args) 
	{
		List<String> names = new ArrayList<>();
		names.add("Java");
		names.add("C++");
		names.add("Java");
		names.add("C#");
		
		//Adding an element at the specific position  
		names.add(0, "Phyton");
		System.out.println("Values of the List - Array List");
		
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
		
		//addAll() method adds all the elements from names to dupNames. 
		List<String> dupNames = new ArrayList<>();
		dupNames.addAll(names);
		
		System.out.println("Values of the Duplicate List - Array List");
		for(int i=0, n=dupNames.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
	
        //Removing specific element from arraylist  
		dupNames.remove("C++");  
        System.out.println("After invoking remove(object) method: "+dupNames);   
        
        //Removing element on the basis of specific position  
        dupNames.remove(0);  
        System.out.println("After invoking remove(index) method: "+dupNames);
        
        dupNames.removeIf(str -> str.contains("Java"));
        System.out.println("After invoking removeAll() method: "+dupNames);   
	}
}
