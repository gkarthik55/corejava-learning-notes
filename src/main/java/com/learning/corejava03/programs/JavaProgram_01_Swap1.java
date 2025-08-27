package com.learning.corejava03.programs;

public class JavaProgram_01_Swap1 
{
	public static void main(String[] args) 
	{
		System.out.println("Swap 2 Numbers:");
		
		int a = 4 ;
		int b = 5 ;
		
		System.out.println("Values before Swap:");
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		System.out.println("Values after Swap:");
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
	}
}
