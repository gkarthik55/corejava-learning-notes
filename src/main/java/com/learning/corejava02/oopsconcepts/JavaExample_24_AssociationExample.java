package com.learning.corejava02.oopsconcepts;

// A real-world example of Association:
// One Bank can be associated with many Customers.
// This is a "has-a" relationship (unidirectional association).

class Bank
{
    private String name;

    public Bank(String name)
    {
        this.name = name;
    }

    public String getBankName()
    {
        return name;
    }
}

class Customer2
{
    private String name;

    public Customer2(String name)
    {
        this.name = name;
    }

    public String getCustomerName()
    {
        return name;
    }
}

public class JavaExample_24_AssociationExample
{
    public static void main(String[] args)
    {
        Bank bank = new Bank("HDFC Bank");
        Customer2 customer = new Customer2("Karthik");

        // Association: A Customer is associated with a Bank
        System.out.println(customer.getCustomerName() + " holds an account in " + bank.getBankName());

        // Key Point:
        // Association represents a relationship between two separate classes 
        // which is established through their objects.
        // Here, the Bank and Customer are independent but are associated logically.
    }
}
