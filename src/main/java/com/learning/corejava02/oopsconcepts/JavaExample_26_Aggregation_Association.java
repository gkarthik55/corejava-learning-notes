package com.learning.corejava02.oopsconcepts;

import java.util.ArrayList;
import java.util.List;

// Reusable Customer class
class Customer3
{
    private String name;
    private int customerId;

    public Customer3(String name, int customerId)
    {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName()
    {
        return name;
    }

    public int getCustomerId()
    {
        return customerId;
    }
}

class Branch
{
    private String branchName;
    private List<Customer3> customers;

    public Branch(String branchName, List<Customer3> customers)
    {
        this.branchName = branchName;
        this.customers = customers;
    }

    public List<Customer3> getCustomers()
    {
        return customers;
    }

    public String getBranchName()
    {
        return branchName;
    }
}

class Bank1
{
    private String bankName;
    private List<Branch> branches;

    public Bank1(String bankName, List<Branch> branches)
    {
        this.bankName = bankName;
        this.branches = branches;
    }

    public int getTotalCustomers()
    {
        int total = 0;
        for (Branch branch : branches)
        {
            total += branch.getCustomers().size();
        }
        return total;
    }

    public String getBankName()
    {
        return bankName;
    }
}


public class JavaExample_26_Aggregation_Association
{
    public static void main(String[] args)
    {
        // Customers of JP Nagar Branch
    	Customer3 c1 = new Customer3("Ravi", 1001);
    	Customer3 c2 = new Customer3("Sneha", 1002);
        List<Customer3> jpNagarCustomers = new ArrayList<>();
        jpNagarCustomers.add(c1);
        jpNagarCustomers.add(c2);

        // Customers of Indiranagar Branch
        Customer3 c3 = new Customer3("Ajay", 2001);
        Customer3 c4 = new Customer3("Meera", 2002);
        List<Customer3> indiranagarCustomers = new ArrayList<>();
        indiranagarCustomers.add(c3);
        indiranagarCustomers.add(c4);

        Branch jpNagar = new Branch("JP Nagar", jpNagarCustomers);
        Branch indiranagar = new Branch("Indiranagar", indiranagarCustomers);

        List<Branch> branches = new ArrayList<>();
        branches.add(jpNagar);
        branches.add(indiranagar);

        Bank1 bank = new Bank1("State Bank of India", branches);

        System.out.println("Total customers in " + bank.getBankName() + ": " + bank.getTotalCustomers());

        // Interview-worthy one-liner to show Aggregation meaningfully
        System.out.println("JP Nagar Branch still exists even if Ravi closes his account – because it's aggregation.");
    }
}
