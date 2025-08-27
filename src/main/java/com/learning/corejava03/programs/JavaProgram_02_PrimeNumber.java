package com.learning.corejava03.programs;

public class JavaProgram_02_PrimeNumber
{
	public static void main(String[] args)
	{
		int num = 6;

		if (isPrime(num)) {
			System.out.println("It is a Prime number.");
		}
		else {
			System.out.println("It is not a Prime number.");
		}
	}

	static boolean isPrime(int num)
	{
		for (int i=2; i<num/2; i++)
		{
			if(num % i == 0)
				return false;
		}	
	
		return true;
	}
}
