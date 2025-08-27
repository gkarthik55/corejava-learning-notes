package com.learning.corejava13.java8features;

//A simple Java program to demonstrate multiple inheritance through default methods. 
interface Writer
{
	default void show()
	{
		System.out.println("I am a Writer");
	}
}

interface BoldWriter
{
	default void show()
	{
		System.out.println("I am a Bold Writer");
	}
}

class Pen implements Writer, BoldWriter
{
	// Overriding default show method
	@Override
	public void show()
	{
		// use super keyword to call the show method of Writer interface
		Writer.super.show();

		// use super keyword to call the show method of BoldWriter interface
		BoldWriter.super.show();
	}
}

// If we remove implementation of default method from Pen class we get compiler error. 
public class JavaExample_01_DefaultMethods_UsingInterfaces_Java8
{
	public static void main(String[] args)
	{
		Pen p = new Pen();
		p.show();
	}
}