package com.learning.corejava02.oopsconcepts;

class OuterClass
{ 
	   private static String CEO = "Larry Ellison"; 
	     
	   // Static nested class 
	   public static class StaticInnerClass
	   { 
	       // Only static members of Outer class is directly accessible in nested  
	       // static class  
	       public static void printMessage() 
	       { 
	         // Try making 'message' a non-static variable, there will be  
	         // compiler error   
	         System.out.println("Message from nested static class: " + CEO);  
	       } 
	       
	       public void displayMessage() 
	       { 
	         System.out.println("Message from nested static class and non-static method: " + CEO);  
	       } 
	    } 
	     
	    // non-static nested class - also called Inner class 
	    public class InnerClass
	    { 
	       // Both static and non-static members of Outer class are accessible in  
	       // this Inner class 
	       public void display()
	       { 
	          System.out.println("Message from non-static nested class: "+ CEO); 
	       } 
	    } 
}  

public class JavaExample_31_StaticClassExample 
{
	public static void main(String[] args) 
	{
		System.out.println("The Name of the CEO of the Company: ");
		OuterClass.StaticInnerClass.printMessage();
		
		// create instance of nested Static class
	    OuterClass.StaticInnerClass obj = new OuterClass.StaticInnerClass(); 
	         
	    // call non static method of nested static class 
	    obj.displayMessage();    
	   
	    // In order to create instance of Inner class we need an Outer class  
	    // instance. Let us create Outer class instance for creating  
	    // non-static nested class 
	    OuterClass outer = new OuterClass();         
	    OuterClass.InnerClass inner  = outer.new InnerClass(); 
	    
	    //Class name create maadakke Class name use maadbeku, Object create maadakke ne Object use maadbeku.
	    
	   // calling non-static method of Inner class 
	   inner.display(); 
	         
	  // we can also combine above steps in one step to create instance of  
	  // Inner class 
	  OuterClass.InnerClass innerObject = new OuterClass().new InnerClass(); 
	  //Edu enod thara
	         
	  // similarly we can now call Inner class method 
	  innerObject.display(); 
	}
}
