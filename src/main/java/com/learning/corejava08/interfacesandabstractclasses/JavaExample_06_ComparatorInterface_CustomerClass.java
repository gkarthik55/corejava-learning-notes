package com.learning.corejava08.interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer
{
    int customerId;
    String customerName;

    public Customer(int customerId, String customerName)
    {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    @Override
    public String toString()
    {
        return customerId + " - " + customerName;
    }
}

class SortByCustomerId implements Comparator<Customer>
{
    @Override
    public int compare(Customer c1, Customer c2)
    {
        return Integer.compare(c1.customerId, c2.customerId);
    }
}

class SortByCustomerName implements Comparator<Customer>
{
    @Override
    public int compare(Customer c1, Customer c2)
    {
        return c1.customerName.compareTo(c2.customerName);
    }

    private static final SortByCustomerName INSTANCE = new SortByCustomerName();

    public static SortByCustomerName getInstance()
    {
        return INSTANCE;
    }
}

public class JavaExample_06_ComparatorInterface_CustomerClass
{
    public static void main(String[] args)
    {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(25, "Karthik"));
        customers.add(new Customer(8, "Srikanth"));
        customers.add(new Customer(12, "Pavan"));

        System.out.println("Unsorted:");
        for (Customer c : customers)
        {
            System.out.println(c);
        }

        Collections.sort(customers, new SortByCustomerId());
        System.out.println("\nSorted by Customer ID:");
        for (Customer c : customers)
        {
            System.out.println(c);
        }

        Collections.sort(customers, SortByCustomerName.getInstance());
        System.out.println("\nSorted by Customer Name:");
        for (Customer c : customers)
        {
            System.out.println(c);
        }
    }
}