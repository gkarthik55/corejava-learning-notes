package com.learning.corejava02.oopsconcepts;

public class JavaExample_16_ClassesAndObject
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        // I have declared the 'Customer' class outside the file to show that the Class
        // can be in different file and same package.
        Customer customerObj = new Customer(10, "Karthik", 35);
        System.out.println("customerObj object: " + customerObj.toString());
        System.out.println("--------------------------------------");

        // Shallow copy - assigning reference, not cloning
        Customer clone1 = customerObj;
        clone1.setAge(40);
        System.out.println("clone1 object: " + clone1.toString());
        System.out.println(clone1.hashCode());
        System.out.println("--------------------------------------");
        System.out.println("customerObj object: " + customerObj.toString());
        System.out.println(customerObj.hashCode());
        System.out.println("--------------------------------------");

        // Deep copy - manually copying values
        Customer clone2 = new Customer();
        clone2.setName(customerObj.getName());
        clone2.setAge(customerObj.getAge());
        clone2.setAge(45);
        System.out.println("clone2 object: " + clone2.toString());
        System.out.println("--------------------------------------");
        System.out.println("customerObj object: " + customerObj.toString());
        System.out.println("--------------------------------------");

        // Clone copy - using clone() method
        Customer clone3 = (Customer) customerObj.clone();
        clone3.setAge(50);
        System.out.println("clone3 object: " + clone3.toString());
        System.out.println("--------------------------------------");
        System.out.println("customerObj object: " + customerObj.toString());
        System.out.println("--------------------------------------");
    }
}