package com.learning.corejava04.inheritance;

//1. SINGLE INHERITANCE
class Payment
{
    public void pay(double amount)
    {
        System.out.println("Payment of ₹" + amount + " is being processed...");
    }
}

class UPIPayment extends Payment
{
    public void validateUPI(String upiId)
    {
        System.out.println("Validating UPI ID: " + upiId);
    }
}

// 2. MULTI-LEVEL INHERITANCE
class GooglePay extends UPIPayment
{
    public void cashback()
    {
        System.out.println("Cashback initiated via Google Pay.");
    }
}

// 4. HIERARCHICAL INHERITANCE
class CreditCardPayment extends Payment
{
    public void validateCreditLimit()
    {
        System.out.println("Validating credit limit...");
    }
}

// 4. HIERARCHICAL INHERITANCE
class DebitCardPayment extends Payment
{
    public void checkBalance()
    {
        System.out.println("Checking account balance...");
    }
}

//5. HYBRID INHERITANCE
class Paytm extends UPIPayment implements Rewardable
{
    public void rewardPoints()
    {
        System.out.println("Paytm Rewards applied.");
    }
}

interface Rewardable
{
    void rewardPoints();
}

interface LoyaltyProgram
{
    void addLoyaltyPoints();
}

//3. MULTIPLE INHERITANCE (via Interfaces)
class AmazonPay extends Payment implements Rewardable, LoyaltyProgram
{
    public void rewardPoints()
    {
        System.out.println("Reward points added via Amazon Pay.");
    }

    public void addLoyaltyPoints()
    {
        System.out.println("Loyalty points added to customer account.");
    }
}

public class JavaExample_02_Inheritance_Interview
{
	public static void main(String[] args)
	{
		// Single Inheritance
        UPIPayment upi = new UPIPayment();
        upi.pay(1000);
        upi.validateUPI("karthik@upi");

        // Multi-Level Inheritance
        GooglePay gpay = new GooglePay();
        gpay.pay(1500);
        gpay.validateUPI("kavya@okhdfcbank");
        gpay.cashback();

        // Multiple Inheritance via Interfaces
        AmazonPay amazonPay = new AmazonPay();
        amazonPay.pay(2000);
        amazonPay.rewardPoints();
        amazonPay.addLoyaltyPoints();

        // Hierarchical Inheritance
        CreditCardPayment credit = new CreditCardPayment();
        credit.pay(5000);
        credit.validateCreditLimit();

        DebitCardPayment debit = new DebitCardPayment();
        debit.pay(3000);
        debit.checkBalance();

        // Hybrid Inheritance
        Paytm paytm = new Paytm();
        paytm.pay(1200);
        paytm.validateUPI("paytm@upi");
        paytm.rewardPoints();
	}
}
