package com.learning.corejava01.basics;

public class JavaExample_09_StringBuffer
{
	public static void main(String[] args) 
	{
		// StringBuffer is a peer class of String that provides much of the functionality of String class.
		
		// String represents fixed-length, immutable character sequences while 
		// StringBuffer represents growable and writable character sequences.
		
		// StringBuffer may have characters and substrings inserted in the middle or appended to the end. 
		
		// It will automatically grow to make room for such additions and often has more characters preallocated 
		// than are actually needed, to allow room for growth.
		
		// It reserves room for 16 characters without reallocation. 
		StringBuffer s = new StringBuffer();
		
		//We can check by .capacity() method.
		System.out.println("StringBuffer Capacity: "+s.capacity());
		
		// It accepts an integer argument that explicitly sets the size of the buffer.
		StringBuffer s1 = new StringBuffer(20);
		
		// It accepts a String argument that sets the initial contents of the StringBuffer object and 
		// reserves room for 16 more characters without reallocation. i.e. +16 is added.
		StringBuffer s2 = new StringBuffer("Geeks for Geeks");
		System.out.println("StringBuffer s2 Capacity: "+s2.capacity()); // 15 + 16 = 31
		
        System.out.println("String buffer s  = " + s); 
        System.out.println("String buffer s1 = " + s1); 
        System.out.println("String buffer s2 = " + s2); 
        
        int length = s2.length(); 
        int capacity = s2.capacity(); 
        
        // length( ) and capacity( ): The length of a StringBuffer can be found by the length( ) method, 
        // while the total allocated capacity can be found by the capacity( ) method.
        
        System.out.println("Length of string GeeksforGeeks   = " + length); 
        System.out.println("Capacity of string GeeksforGeeks = " + capacity); 
        
        // append( ): It is used to add text at the end of the existence text. Here are a few of its forms:
        
        s2.append(" is Awesome.");
        System.out.println("String buffer = " + s2);
        
        s2.append(3);
        System.out.println("String buffer = " + s2);
        
        // reverse( ): It can reverse the characters within a StringBuffer object using reverse( ). 
        // This method returns the reversed object on which it was called. 
        StringBuffer s3 = new StringBuffer("Geeks for Geeks");
        s3.reverse();
        System.out.println("String buffer = " + s3);
        s3.reverse();
        System.out.println("String buffer = " + s3);
        
        // delete( ) and deleteCharAt( ): It can delete characters within a StringBuffer by using the methods delete( ) 
        // and deleteCharAt( ).
        StringBuffer s4 = new StringBuffer("GeeksforGeeks");
        System.out.println("s4:"+s4);
        
        //Starting from 0, Delete 5 characters. -UPTO how many characters.
        s4.delete(0, 5); 
        System.out.println(s4); // returns forGeeks 
        
        // Delete the character at 7th position.
        s4.deleteCharAt(7); 
        System.out.println(s4); // returns forGeek 
        
        //replace( ): It can replace one set of characters with another set inside a StringBuffer object by calling replace( ).
        StringBuffer s5 = new StringBuffer("GeeksforGeeks"); 
        s5.replace(5, 8, "are"); 
        System.out.println(s5); // returns GeeksareGeeks 
	}
}
