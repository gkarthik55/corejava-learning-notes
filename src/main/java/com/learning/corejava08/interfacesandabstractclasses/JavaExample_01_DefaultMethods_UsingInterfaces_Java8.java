package com.learning.corejava08.interfacesandabstractclasses;

//A real-world example demonstrating multiple inheritance through default methods
interface Printer
{
	// Default method
	default void show()
	{
		System.out.println("I can Print documents");
	}
}

interface Scanner
{
	// Default method
	default void show()
	{
		System.out.println("I can Scan documents");
	}
}

class AllInOneDevice implements Printer, Scanner
{
	// Overriding the conflicting default method
	@Override
	public void show()
	{
		// Calling both interfaces explicitly using super
		Printer.super.show();
		Scanner.super.show();
	}
}

public class JavaExample_01_DefaultMethods_UsingInterfaces_Java8
{
	public static void main(String[] args)
	{
		AllInOneDevice device = new AllInOneDevice();
		device.show();
	}
}