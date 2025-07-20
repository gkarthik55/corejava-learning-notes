package com.learning.corejava02.oopsconcepts;

/*
 * Java program to show that if a static method is redefined by
 * a derived class, then it is not overriding, it is hiding.
 */

class Customer6
{
    // Static method in base class – this will be hidden, not overridden
    static void showPolicy()
    {
        System.out.println("Customer6 Policy: Basic terms apply.");
    }

    // Non-static method – this will be overridden
    void generateInvoice()
    {
        System.out.println("Generating invoice for regular customer.");
    }
}

class CorporateCustomer1 extends Customer6
{
    // Hides static method in Customer6
    static void showPolicy()
    {
        System.out.println("Corporate Policy: Bulk discount applied.");
    }

    // Overrides generateInvoice()
    @Override
    void generateInvoice()
    {
        System.out.println("Generating invoice for corporate customer.");
    }
}

public class JavaExample_29_MethodHiding
{
    public static void main(String[] args)
    {
    	CorporateCustomer1 obj = new CorporateCustomer1();

        // Static method call – method hiding, not overriding
        obj.showPolicy();  // Calls CorporateCustomer.showPolicy()

        // Instance method call – proper overriding
        obj.generateInvoice();  // Calls CorporateCustomer.generateInvoice()
    }
}