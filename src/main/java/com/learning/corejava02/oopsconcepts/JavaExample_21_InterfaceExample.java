package com.learning.corejava02.oopsconcepts;

// Interface representing a customer's billing behavior
interface Billable
{
    double calculateBill();
}

// Online customer with GST applied
class OnlineCustomer implements Billable
{
    private double purchaseAmount;
    private static final double GST_RATE = 0.18;

    public OnlineCustomer(double purchaseAmount)
    {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public double calculateBill()
    {
        return purchaseAmount + (purchaseAmount * GST_RATE);
    }
}

// Walk-in customer with no GST, but discount may apply
class WalkInCustomer implements Billable
{
    private double purchaseAmount;
    private static final double DISCOUNT = 50.0;

    public WalkInCustomer(double purchaseAmount)
    {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public double calculateBill()
    {
        return purchaseAmount - DISCOUNT;
    }
}

public class JavaExample_21_InterfaceExample
{
    public static void main(String[] args)
    {
        Billable customer1 = new OnlineCustomer(1000);
        System.out.println("Online Customer Final Bill: ₹" + customer1.calculateBill());

        Billable customer2 = new WalkInCustomer(1000);
        System.out.println("Walk-in Customer Final Bill: ₹" + customer2.calculateBill());
    }
}