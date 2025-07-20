package com.learning.corejava05.arrays;

public class JavaExample_01_Arrays
{
	public static void main(String[] args) 
	{
		// declares an Array of integers. 
	    int[] arr; 
	          
	    // allocating memory for 5 integers. 
	    arr = new int[5]; 
	          
	    arr[0] = 10; 
	    arr[1] = 20; 
	    arr[2] = 30; 
	    arr[3] = 40; 
	    arr[4] = 50; 
	    
	    System.out.println("---------------- Array 1 ----------------");
	    for (int i = 0; i < arr.length; i++) 
	    {
		    System.out.println("Element at Index:" + i + " : "+ arr[i]);   
	    }
	    
		int arr2[] = new int[] {10, 20, 30, 40, 50, 60, 70, 80};
		int len = arr2.length;
		
	    System.out.println("---------------- Array 2 ----------------");
		for(int i=0; i<len; i++)
		{
			System.out.println("Element at Index:"+i+" is "+arr2[i]);
		}
	 } 
}	         
