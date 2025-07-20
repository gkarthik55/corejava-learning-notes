package com.learning.corejava08.interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaExample_04_ComparatorInterface_AnonymousClass 
{
	public static void main(String[] args) 
	{
		List<Integer> arrList = new ArrayList<>();
		arrList.add(356);
		arrList.add(212);
		arrList.add(851);
		arrList.add(464);
		arrList.add(148);
		
		//Creating an Anonymous Class of Comparator i.e. 
		//Creating a Class on Fly
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				if(o1%10 > o2%10)
					return 1;
				else 
					return -1;
			}	
		};
		
		//Sorting the Array list using Comparator
		Collections.sort(arrList, comp);
		
		System.out.println("List of Interger Array Elements");
		
		for(Integer i:arrList)
		{
			System.out.print(" " + i);
		}
	}
}
