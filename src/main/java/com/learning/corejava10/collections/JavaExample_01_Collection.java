package com.learning.corejava10.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavaExample_01_Collection 
{
	public static void main(String[] args) 
	{
		Collection<Integer> values = new ArrayList<Integer>();
		values.add(45);
		values.add(80);
		values.add(20);
		
		Iterator<Integer> it = values.iterator();
		
		System.out.println("Values of the Collection");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
