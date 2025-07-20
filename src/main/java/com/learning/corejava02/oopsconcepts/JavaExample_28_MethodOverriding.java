package com.learning.corejava02.oopsconcepts;

// Base class
class Customer5
{
    protected String name;

    public Customer5(String name)
    {
        this.name = name;
    }

    protected double getDiscount()
    {
        return 5.0; // Base discount
    }

    protected void getCustomerType()
    {
        System.out.println("Regular Customer");
    }
}

// Derived class
class PremiumCustomer1 extends Customer5
{
    public PremiumCustomer1(String name)
    {
        super(name);
    }

    @Override
    protected double getDiscount()
    {
        return 15.0; // Overridden discount
    }

    @Override
    protected void getCustomerType()
    {
        System.out.println("Premium Customer");
    }

    protected void getLoyaltyPoints()
    {
        System.out.println("Loyalty Points: 200");
    }
}

public class JavaExample_28_MethodOverriding
{
    public static void main(String[] args)
    {
        Customer5 customer = new PremiumCustomer1("Karthik");

        customer.getCustomerType();           // Calls overridden method
        System.out.println("Discount: " + customer.getDiscount() + "%");

        // customer.getLoyaltyPoints(); // Not accessible through base reference
    }
}