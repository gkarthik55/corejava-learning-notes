package com.learning.corejava02.oopsconcepts;

//A Java program to illustrate Dynamic Method Dispatch using Hierarchical Inheritance

class A 
{ 
    void show() 
    { 
        System.out.println("Inside A's show method"); 
    } 
} 
  
class B extends A 
{ 
    // overriding show() 
    void show() 
    { 
        System.out.println("Inside B's show method"); 
    } 
} 
  
class C extends A 
{ 
    // overriding show() 
    void show() 
    { 
        System.out.println("Inside C's show method"); 
    } 
} 

public class JavaExample_23_RunTimePolymorphism 
{
	public static void main(String[] args) 
	{
		// Method overriding is one of the ways in which Java supports Runtime Polymorphism.
		
		// Dynamic method dispatch is the mechanism by which a call to an overridden method is 
		// resolved at run time, rather than compile time.
		
		 // object of type A 
        A a = new A(); 
  
        // object of type B 
        B b = new B(); 
  
        // object of type C 
        C c = new C(); 
  
        // obtain a reference of type A 
        A ref; 
          
        // ref refers to an A object 
        ref = a; 
  
        // calling A's version of m1() 
        ref.show(); 
  
        // now ref refers to a B object 
        ref = b; 
  
        // calling B's version of m1() 
        ref.show(); 
  
        // now ref refers to a C object 
        ref = c; 
  
        // calling C's version of m1() 
        ref.show(); 
	}
}
