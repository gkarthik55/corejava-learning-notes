package com.learning.corejava02.oopsconcepts;

// Encapsulation: Bundling fields and methods in a class to restrict direct access and achieve data hiding.
class Customer1
{
    private String name;
    private int age;
    private String city;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getCity()
    {
        return city;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
}

public class JavaExample_19_DataEncapsulation
{
    public static void main(String[] args)
    {
    	Customer1 customer = new Customer1();

        // Setting values using public methods
        customer.setName("Karthik");
        customer.setAge(32);
        customer.setCity("Bengaluru");

        // Accessing values via getters
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Age: " + customer.getAge());
        System.out.println("Customer City: " + customer.getCity());

        // Direct field access not allowed due to encapsulation
        // System.out.println(customer.name); // ❌ Compile-time error
    }
}