package com.learning.corejava11.hashing;

import java.util.HashMap;
import java.util.Map;

public class JavaExample_02_HashMap 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		
	    System.out.println("Initial list of elements: "+ hashMap);
	    System.out.println("-----------------------------------");
	    
	    hashMap.put(100,"C++");    
	    hashMap.put(101,"Java");    
	    hashMap.put(102,"Python");
	    
	    System.out.println("After invoking put() method ");
	    
	    for(Map.Entry<Integer, String> entry : hashMap.entrySet())
	    {    
	    	System.out.println("Key : "+entry.getKey()+" Value: "+entry.getValue());
	    }
	    System.out.println("-----------------------------------");
	    
	    hashMap.putIfAbsent(103, "Angular");  
	    System.out.println("After invoking putIfAbsent() method ");  
	    
	    for(Map.Entry<Integer, String> entry : hashMap.entrySet())
	    {    
	    	System.out.println("Key : "+entry.getKey()+" Value: "+entry.getValue());  
	    }
	    
	    Map<Integer,String> subjectsMap = new HashMap<Integer,String>();  
	    subjectsMap.put(104,"React");
	    subjectsMap.put(105, "Java Script");
	    subjectsMap.putAll(hashMap);  
	    
	    System.out.println("-----------------------------------");
	    
	    System.out.println("After invoking putAll() method ");  
	    for(Map.Entry<Integer, String> entry : subjectsMap.entrySet())
	    {    
	    	System.out.println("Key : "+entry.getKey()+" Value: "+entry.getValue());
	    }
	    System.out.println("-----------------------------------");
	 }  
}  


