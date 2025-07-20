package com.learning.corejava08.interfacesandabstractclasses;

// Abstract class representing a secure document writer in a finance system
abstract class Write
{
    Write()
    {
        System.out.println("Initializing SecureDocumentWriter...");
    }

    public abstract void display();
}

// Concrete class simulating contract generation for a financial customer
class Pen extends Write
{
    @Override
    public void display()
    {
        System.out.println("Generating digital agreement for high-value transaction...");
    }
}

public class JavaExample_03_AbstractClassesExample
{
    public static void main(String[] args)
    {
        Pen obj = new Pen();
        obj.display();
    }
}