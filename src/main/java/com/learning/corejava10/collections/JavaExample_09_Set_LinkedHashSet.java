package com.learning.corejava10.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaExample_09_Set_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		//Creating HashSet and adding elements  
		Set<String> set=new LinkedHashSet<>();  
		set.add("C++");  
		set.add("Java");  
		set.add("C#");  
		set.add("Python");
		set.add("Java");
		
		//Traversing elements
		System.out.println("-----------------------");
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		} 
		System.out.println("-----------------------");
		 
		//Removing specific element from HashSet  
        set.remove("C#");  
        System.out.println("After invoking remove(object) method: "+set);  
        Set<String> set1=new LinkedHashSet<>();  
        set1.add("Angular");  
        set1.add("React");  
        set.addAll(set1);
        
        System.out.println("-----------------------");
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet  
        set.removeAll(set1);
        
        System.out.println("-----------------------");
        System.out.println("After invoking removeAll() method: "+set);  
        
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("C#"));    
        set.removeIf(str -> str.contains("C++"));
        
        System.out.println("-----------------------");
        System.out.println("After invoking removeIf() method: "+set);  
	}  
}

