package com.learning.corejava11.hashing;

import java.util.Hashtable;
import java.util.Map;

public class JavaExample_01_HashTable 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> hashTable = new Hashtable<Integer, String>();
		
        // Input the values 
		hashTable.put(1, "Geeks"); 
		hashTable.put(12, "for Geeks"); 
		hashTable.put(15, "A computer"); 
		hashTable.put(3, "Portal"); 
  
        // Printing the Hashtable 
        System.out.println(hashTable); 
	}  
}

