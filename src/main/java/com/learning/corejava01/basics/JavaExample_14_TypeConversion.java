package com.learning.corejava01.basics;

public class JavaExample_14_TypeConversion 
{
	public static void main(String[] args) 
	{
		// int, long, float, double 
		
		//Java program to illustrate implicit type conversion 
		int i = 100;
        
        //automatic type conversion 
        long l = i;
          
        //automatic type conversion 
        float f = l;
        
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f); 
        
        //Java program to illustrate explicit type conversion 
        double d1 = 100.04;
        
        //explicit type casting 
        long l1 = (long)d1;
          
        //explicit type casting
        int i1 = (int)l1;
        
        System.out.println("Double value :"+d1);
          
        //fractional part lost 
        System.out.println("Long value :"+l1);  
          
        //fractional part lost 
        System.out.println("Int value :"+i1);  
        
        //Java program to illustrate Conversion of int and double to byte 
        byte b2;
        int i2 = 257;
        double d2 = 323.142;
        
        System.out.println("Conversion of int to byte.");  
        //i%256 
        b2 = (byte) i2;  
        System.out.println("i2 = " + i2 + " b2 = " + b2); 
        
        System.out.println("\nConversion of double to byte."); 
        //b2%256
        b2 = (byte) d2;  
        System.out.println("d2 = " + d2 + " b2= " + b2); 
	}
}
