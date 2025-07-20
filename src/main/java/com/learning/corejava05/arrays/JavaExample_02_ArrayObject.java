package com.learning.corejava05.arrays;

class Customer
{
    private int customerId;
    private String customerName;

    public Customer(int customerId, String customerName)
    {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    @Override
    public String toString()
    {
        return "Customer ID: " + customerId + " | Customer Name: " + customerName;
    }
}

public class JavaExample_02_ArrayObject
{
    public static void main(String[] args)
    {
    	Customer c1 = new Customer(101, "Karthik");
    	Customer c2 = new Customer(102, "Kavya");
    	Customer c3 = new Customer(103, "Sinchana");
    	Customer c4 = new Customer(104, "Pradeep");
    	Customer c5 = new Customer(105, "Lakshmi");
    	
    	Customer custArr[] = new Customer[]{c1, c2, c3, c4, c5};
    	
        System.out.println("Customer Details:");

        int len = custArr.length;
        for(int i=0; i<len; i++)
        {
        	System.out.println(custArr[i]);
        }
    }
}
