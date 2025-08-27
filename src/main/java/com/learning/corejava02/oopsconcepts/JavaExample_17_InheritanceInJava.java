package com.learning.corejava02.oopsconcepts;

// Base class representing a generic Customer
class TheCustomer
{
    private String name;
    private String email;
    private String customerType;

    public TheCustomer(String name, String email, String customerType)
    {
        this.name = name;
        this.email = email;
        this.customerType = customerType;
    }

    public void updateEmail(String newEmail)
    {
        this.email = newEmail;
    }

    public String getCustomerDetails()
    {
        return "Name: " + name + "\nEmail: " + email + "\nCustomer Type: " + customerType;
    }
}

// Subclass representing a Regular Customer
class RegularCustomer extends TheCustomer
{
    private int loyaltyPoints;

    public RegularCustomer(String name, String email, int loyaltyPoints)
    {
        super(name, email, "Regular");
        this.loyaltyPoints = loyaltyPoints;
    }

    public void addLoyaltyPoints(int points)
    {
        this.loyaltyPoints += points;
    }

    @Override
    public String getCustomerDetails()
    {
        return super.getCustomerDetails() + "\nLoyalty Points: " + loyaltyPoints;
    }
}

// Subclass representing a Premium Customer
class PremiumCustomer extends TheCustomer
{
    private double discountRate;

    public PremiumCustomer(String name, String email, double discountRate)
    {
        super(name, email, "Premium");
        this.discountRate = discountRate;
    }

    public double getDiscountRate()
    {
        return discountRate;
    }

    @Override
    public String getCustomerDetails()
    {
        return super.getCustomerDetails() + "\nDiscount Rate: " + discountRate + "%";
    }
}

// Subclass representing a Corporate Customer
class CorporateCustomer extends TheCustomer
{
    private String companyName;

    public CorporateCustomer(String name, String email, String companyName)
    {
        super(name, email, "Corporate");
        this.companyName = companyName;
    }

    @Override
    public String getCustomerDetails()
    {
        return super.getCustomerDetails() + "\nCompany: " + companyName;
    }
}

public class JavaExample_17_InheritanceInJava
{
    public static void main(String[] args)
    {
    	TheCustomer c1 = new RegularCustomer("Arjun", "arjun@example.com", 120);
    	TheCustomer c2 = new PremiumCustomer("Meera", "meera@example.com", 15.0);
    	TheCustomer c3 = new CorporateCustomer("Kiran", "kiran@oracle.com", "Oracle Corp");

        System.out.println("=== Regular Customer ===");
        System.out.println(c1.getCustomerDetails());

        System.out.println("\n=== Premium Customer ===");
        System.out.println(c2.getCustomerDetails());

        System.out.println("\n=== Corporate Customer ===");
        System.out.println(c3.getCustomerDetails());
    }
}
