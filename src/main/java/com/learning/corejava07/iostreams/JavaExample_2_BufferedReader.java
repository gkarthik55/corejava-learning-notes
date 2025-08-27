package com.learning.corejava07.iostreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaExample_2_BufferedReader
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an Integer \n");
		// Read line reads the String, we need to parse the string to int using parseInt().
		int i = Integer.parseInt(br.readLine());
	
		System.out.println("Enter the String");
		String str = br.readLine();
		
		System.out.println("You have entered :"+ i + " and name as " + str);
	}			
}	         
