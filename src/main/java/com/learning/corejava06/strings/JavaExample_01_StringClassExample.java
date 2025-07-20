package com.learning.corejava06.strings;

public class JavaExample_01_StringClassExample
{
	public static void main(String[] args)
	{
		String s = "GeeksforGeeks"; // String Constant Pool
		
		// Returns the number of characters in the String.
		System.out.println("String length = " + s.length());

		// Returns the character at ith index.
		System.out.println("Character at 3rd position = " + s.charAt(3));
		s.substring(3);

		// Return the substring from the ith index character
		// to end of string
		System.out.println("Substring " + s.substring(3));

		// Returns the substring from i to j-1 index.
		System.out.println("Substring  = " + s.substring(2, 5));

		// Concatenates string2 to the end of string1.
		String s1 = "Geeks";
		String s2 = "forGeeks";

		System.out.println("Concatenated string  = " + s1.concat(s2));

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));

		// Checking equality of Strings
		Boolean out = "Geeks".equals("geeks");
		System.out.println("Checking Equality  " + out);
		out = "Geeks".equals("Geeks");
		System.out.println("Checking Equality  " + out);

		// Converting cases
		String word1 = "GeeKyMe";
		System.out.println("Changing to lower Case " + word1.toLowerCase());

		// Converting cases
		String word2 = "GeekyME";
		System.out.println("Changing to UPPER Case " + word1.toUpperCase());

		// Trimming the word
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());

		// Replacing characters
		String str3 = "feeksforfeeks";
		System.out.println("Original String " + str3);
		String str4 = "feeksforfeeks".replace('f', 'g');
		System.out.println("Replaced f with g -> " + str4);
	}
}
