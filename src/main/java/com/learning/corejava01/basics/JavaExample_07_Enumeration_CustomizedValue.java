package com.learning.corejava01.basics;

// Java program to demonstrate how values can be assigned to enums. 
enum TrafficSignal 
{ 
	 RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN"); 
	
	// declaring private variable for getting values 
	 private String action; 

	 public String getAction() 
	 { 
	     return this.action; 
	 } 

	 // enum constructor - cannot be public or protected. It can be private or default.
	 // This is because enum in Java contains fixed constant values. 
	 // So, there is no point in having public or protected constructor 
	 // as you cannot create instance of enum.
	 TrafficSignal(String action) 
	 { 
	     this.action = action; 
	 }
} 

public class JavaExample_07_Enumeration_CustomizedValue 
{
	public static void main(String[] args) 
	{
		TrafficSignal signals[] = TrafficSignal.values();
  
        for (TrafficSignal signal : signals) 
        { 
            // use getter method to get the value 
            System.out.println("name : " + signal.name() + " action: " + signal.getAction() ); 
        } 
	}
}
