package com.learning.corejava02.oopsconcepts;

// Java program to demonstrate encapsulation

// Encapsulation refers to the bundling of fields and methods inside a single class.
// It prevents outer classes from accessing and changing fields and methods of a class. 

// This also helps to achieve data hiding.
class Encapsulate 
{ 
	 // private variables declared these can only be accessed by public methods of class 
	 private String geekName; 
	 private int geekRoll; 
	 private int geekAge; 
	
	 // get method for age to access private variable geekAge 
	 public int getAge()  
	 { 
	   return geekAge; 
	 } 
	
	 // get method for name to access private variable geekName 
	 public String getName()  
	 { 
	   return geekName; 
	 } 
	   
	 // get method for roll to access private variable geekRoll 
	 public int getRoll()  
	 { 
	    return geekRoll; 
	 } 
	
	 // set method for age to access private variable geekage 
	 public void setAge( int newAge) 
	 { 
	   geekAge = newAge; 
	 } 
	
	 // set method for name to access private variable geekName 
	 public void setName(String newName) 
	 { 
	   geekName = newName; 
	 } 
	   
	 // set method for roll to access private variable geekRoll 
	 public void setRoll( int newRoll)  
	 { 
	   geekRoll = newRoll; 
	 } 
} 

public class JavaExample_19_DataEncapsulation 
{
	public static void main(String[] args) 
	{
		Encapsulate obj = new Encapsulate(); 
        
        // setting values of the variables  
        obj.setName("Karthik"); 
        obj.setAge(28); 
        obj.setRoll(47); 
          
        // Displaying values of the variables 
        System.out.println("Geek's name: " + obj.getName()); 
        System.out.println("Geek's age: " + obj.getAge()); 
        System.out.println("Geek's roll: " + obj.getRoll()); 
          
        // Direct access of geekRoll is not possible due to encapsulation
        // System.out.println("Geek's roll: " + obj.geekName);
	}
}
