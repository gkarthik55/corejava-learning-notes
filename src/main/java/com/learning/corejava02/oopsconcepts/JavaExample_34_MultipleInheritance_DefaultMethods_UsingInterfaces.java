package com.learning.corejava02.oopsconcepts;

// A real-world example demonstrating multiple inheritance through default methods
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

public class JavaExample_34_MultipleInheritance_DefaultMethods_UsingInterfaces
{
    public static void main(String[] args)
    {
        AllInOneDevice device = new AllInOneDevice();
        device.show();
    }
}