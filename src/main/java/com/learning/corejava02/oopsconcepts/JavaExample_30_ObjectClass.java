package com.learning.corejava02.oopsconcepts;

// Object class is present in java.lang package. 
// Every class in Java is directly or indirectly derived from the Object class.

// If a class does not extend any other class, then it is a direct child class of Object, and if it extends another 
// class, then it is indirectly derived. Therefore, Object class methods are available to all
// Java classes. Hence, Object class acts as a root of the inheritance hierarchy in any Java Program.

class Customer7 extends Object
{
    int customerId;

    Customer7(int customerId)
    {
        this.customerId = customerId;
    }

    @Override
    public String toString()
    {
        return "Customer7 with ID: " + this.customerId;
    }

    // Overriding hashCode()
    @Override
    public int hashCode()
    {
        return customerId;
    }
}

public class JavaExample_30_ObjectClass
{
    public static void main(String[] args)
    {
        Customer7 customer = new Customer7(1001);
        System.out.println("Object class 'toString' method: " + customer.toString());
    }
}