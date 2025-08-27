package com.learning.corejava10.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaExample_08_Set_HashSet 
{
	public static void main(String[] args) 
	{
		//Creating HashSet and adding elements  
		Set<String> set = new HashSet<String>(); 
		set.add("C");
		set.add("Java");
		set.add("C++");
		set.add("Java");
		set.add("C#");
		
		System.out.println("HashSet Elements");
		System.out.println("-----------------------");
		//Traversing elements  
		Iterator<String> itr = set.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
		System.out.println("-----------------------");
		
		//Removing specific element from HashSet  
        set.remove("C");
        System.out.println("After invoking remove(object) method: "+set);  
        System.out.println("-----------------------");
        
        Set<String> set1 = new HashSet<String>();  
        set1.add("Angular");
        set1.add("React");
        
     	set.addAll(set1);
        System.out.println("Updated List: "+set);  
        System.out.println("-----------------------");
        
        //Removing all the new elements from HashSet  
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        
        
        //Removing elements on the basis of specified condition  
        set.removeIf( str -> str.contains("C#"));
        set.removeIf(str -> str.contains("C++"));
        System.out.println("-----------------------");
        System.out.println("After invoking removeIf() method: "+set);
	}  
}

