package com.learning.corejava02.oopsconcepts;

// Abstract class representing a generic bank account
abstract class Account
{
    private String accountHolder;

    // Constructor of abstract class
    public Account(String accountHolder)
    {
        System.out.println("Account constructor called");
        this.accountHolder = accountHolder;
    }

    // Abstract method to calculate balance after interest
    public abstract double calculateAnnualInterest();

    public abstract String toString();

    // Concrete method
    public String getAccountHolder()
    {
        return accountHolder;
    }
}

// Concrete subclass representing a Savings Account
class SavingsAccount extends Account
{
    private double balance;
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate)
    {
        super(accountHolder);
        this.balance = balance;
        this.interestRate = interestRate;
        System.out.println("SavingsAccount constructor called");
    }

    @Override
    public double calculateAnnualInterest()
    {
        return balance * interestRate;
    }

    @Override
    public String toString()
    {
        return "SavingsAccount of " + getAccountHolder() + " with interest: " + calculateAnnualInterest();
    }
}

// Concrete subclass representing a Fixed Deposit Account
class FixedDepositAccount extends Account
{
    private double principal;
    private double rate;
    private int years;

    public FixedDepositAccount(String accountHolder, double principal, double rate, int years)
    {
        super(accountHolder);
        this.principal = principal;
        this.rate = rate;
        this.years = years;
        System.out.println("FixedDepositAccount constructor called");
    }

    @Override
    public double calculateAnnualInterest()
    {
        return principal * rate * years;
    }

    @Override
    public String toString()
    {
        return "FixedDepositAccount of " + getAccountHolder() + " with total interest: " + calculateAnnualInterest();
    }
}

public class JavaExample_20_Abstraction
{
    // Consider a real-life example of a man using an ATM machine.
    // The man knows how to withdraw money or check balance, 
    // but doesn't know the internal logic of how it communicates 
    // with the bank's server or processes the transaction.
    // This is abstraction — showing only essential details and hiding the complexity.

    // In Java, abstraction is achieved using interfaces and abstract classes.
    // 100% abstraction can be achieved using interfaces.

    public static void main(String[] args)
    {
        Account acc1 = new SavingsAccount("Karthik", 10000, 0.05);
        Account acc2 = new FixedDepositAccount("Akanksha", 20000, 0.06, 3);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}
