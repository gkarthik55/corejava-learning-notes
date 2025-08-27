package com.learning.corejava11.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaExample_3_SortingHashMap 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> subjectsMap = new HashMap<String, Integer>();
		
		subjectsMap.put("C++", 80); 
		subjectsMap.put("C", 90); 
		subjectsMap.put("Java", 80); 
		subjectsMap.put("Python", 75); 
		subjectsMap.put("Angular", 40); 
  
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(subjectsMap);
		//treeMap.putAll(subjectsMap);
		
		//System.out.println(treeMap.toString());
		for(Map.Entry<String, Integer> entry : treeMap.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+ " Value: "+entry.getValue());
		}
	}
}
