package com.learning.corejava05.arrays;

public class JavaExample_05_FinalArrays
{
	public static void main(String[] args) 
	{
		final int arr[] = {1, 2, 3, 4, 5};  // Note: arr is final  
		
		int arr2[] = {6, 7, 8, 9, 10};
		
		for (int i = 0; i < arr.length; i++) 
	    { 
	        arr[i] = arr[i]*10;   
	        System.out.println(arr[i]);           
	    }       
		
		// Now trying to change the reference of arr object. 
		//arr =arr2;
		
	 } 
	
	// The array arr is declared as final, but the elements of array are changed without any problem. 
	// Arrays are objects and object variables are always references in Java.
	
	// So, when we declare an object variable as final, it means that the variable cannot be changed to refer to 
	// anything else. For example, the following program 1 compiles without any error and program fails in compilation.
	
	// So a final array means that the array variable which is actually a reference to an 
	// object, cannot be changed to refer to anything else, but the members of array can be modified.
}	         
