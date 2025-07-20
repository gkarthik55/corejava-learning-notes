package com.learning.corejava01.basics;

public class JavaExample_11_EnhancedForLoop 
{
	public static void main(String[] args) 
	{
		int marks[] = {10, 25, 65, 38, 80};
		
		int index=1; // We need to declare the Index ourself. 
		
		//Enhanced For Loop
		for(int mark : marks)
		{
			System.out.println(" Value of " + index +" is " + mark);
			index++;
		}
		
		//Limitations of for-each loop:

		// For-each loop is not appropriate when you want to modify the array:
		for (int num : marks) 
		{
		    // only changes num, not the array element
		    num = num*2; 
		}
		
		// For-each loops do not keep track of index. So we can not obtain array index using For-Each loop
		for (int num : marks) 
		{ 
			// do not know the index of num
		}
		
		// For-each only iterates forward over the array in single steps cannot be converted to a for-each loop
		for (int i=marks.length-1; i>0; i--) 
		{
		      System.out.println(marks[i]);
		}
		
		int newMarks[] = {23, 54, 76, 30, 10};
		// For-each cannot process two decision making statements at once cannot be easily converted to a for-each loop 
		for (int i=0; i<marks.length; i++) 
		{
		    if (marks[i] == newMarks[i]) 
		    { 
		    } 
		}
		
		// Use For-Each loop only to print the array list values.
	}
}
