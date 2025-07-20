package com.learning.corejava02.oopsconcepts;

class Customer4
{
    private int customerId;
    private String name;

    public Customer4(int customerId, String name)
    {
        this.customerId = customerId;
        this.name = name;
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

// Real-world class to demonstrate Method Overloading
class CustomerTransactionService
{
    // Overloaded method: Deposit into savings account
    public String processTransaction(Customer4 customer, double amount)
    {
        return "Deposited ₹" + amount + " to savings account of customer: " + customer.getName();
    }

    // Overloaded method: Deposit into specific account type
    public String processTransaction(Customer4 customer, double amount, String accountType)
    {
        return "Deposited ₹" + amount + " to " + accountType + " account of customer: " + customer.getName();
    }

    // Overloaded method: Transfer between accounts
    public String processTransaction(Customer4 fromCustomer, Customer4 toCustomer, double amount)
    {
        return "Transferred ₹" + amount + " from " + fromCustomer.getName() + " to " + toCustomer.getName();
    }
}

public class JavaExample_27_MethodOverloading
{
    public static void main(String[] args)
    {
        CustomerTransactionService transactionService = new CustomerTransactionService();

        Customer4 cust1 = new Customer4(101, "Ravi Kumar");
        Customer4 cust2 = new Customer4(102, "Anita Sharma");

        System.out.println(transactionService.processTransaction(cust1, 5000.0));
        System.out.println(transactionService.processTransaction(cust2, 12000.0, "current"));
        System.out.println(transactionService.processTransaction(cust1, cust2, 2500.0));
    }
}