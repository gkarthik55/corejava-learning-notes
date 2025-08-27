package com.learning.corejava08.interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaExample_05_ComparatorInterface_LambdaExpression 
{
	public static void main(String[] args) 
	{
		List<Integer> arrList = new ArrayList<>();
		arrList.add(356);
		arrList.add(212);
		arrList.add(851);
		arrList.add(464);
		arrList.add(148);
		
		// Creating a Lambda Expression for the Anonymous Class of Comparator i.e. 
		// Lambda Expression anda thakshana Close your Eyes example nyaapka maadko- 
		// Simple - Method na elle barithini antha.  
		// To avoid the boiler plate code
		
		Comparator<Integer> comp = (o1, o2) -> 
			{
//				if(o1%10 > o2 %10)
//					return 1;
//				else 
//					return -1;
				
				//or ternary expression
				return o1%10 > o2%10? 1: -1;
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
