package com.learning.corejava07.iostreams;

import java.util.Scanner;

public class JavaExample_1_Scanner
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Integer");
		int  i = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		// In Scanner class if we call nextLine() method after any one of the seven 
		// nextXXX() method then the nextLine() doesn't not read values from console 
		// and cursor will not come into console it will skip that step. 
		// The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().
		
		System.out.println("You have entered " + i + " and name as " + str);
		sc.close();
	}		
}	         
