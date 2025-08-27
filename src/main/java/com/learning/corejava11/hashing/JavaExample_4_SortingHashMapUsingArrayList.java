package com.learning.corejava11.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaExample_4_SortingHashMapUsingArrayList 
{

	public static void main(String[] args) 
	{
		 // This map stores unsorted values 
	    Map<String, Integer> subjectsMap = new HashMap<>(); 
	    
		// putting values in the Map
	    subjectsMap.put("Python", 75); 
		subjectsMap.put("C++", 50); 
		subjectsMap.put("Java", 80); 
		subjectsMap.put("Angular", 40);
		subjectsMap.put("React", 25); 
  
        List<String> sortedKeys = new ArrayList<String>(subjectsMap.keySet());
        
        Collections.sort(sortedKeys);  
  
        // Display the TreeMap which is naturally sorted 
        for (String key : sortedKeys)
        {
        	System.out.println("Key : " + key + "\tValue: " + subjectsMap.get(key));
        }
	}


}
