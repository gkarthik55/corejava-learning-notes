package com.learning.corejava03.programs;

public class JavaProgram_03_FibonacciSeries
{
	public static void main(String[] args)
	{
		int num = 25;
		int cur=0, a = 1, b=1;

		System.out.println("Fibonacci Series.");
		
		System.out.println(a);
		System.out.println(b);
		
		while(cur < num) 
		{
			cur = a+b;
			
			if ( cur > num)
				break;
			
			System.out.println(cur);
			
			a = b;
			b = cur;
		}
	}
}
