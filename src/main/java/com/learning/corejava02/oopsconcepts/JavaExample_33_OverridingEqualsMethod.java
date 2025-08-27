package com.learning.corejava02.oopsconcepts;

// Real-world entity with overridden equals and hashCode for interview demonstration
class Customer8
{
    private int customerId;
    private String name;
    private double annualSpending;

    public Customer8(int customerId, String name, double annualSpending)
    {
        this.customerId = customerId;
        this.name = name;
        this.annualSpending = annualSpending;
    }

    // Overriding equals() method to compare Customer objects meaningfully
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (!(obj instanceof Customer8))
        {
            return false;
        }

        Customer8 cust = (Customer8) obj;
        
        return this.customerId == cust.customerId &&
               this.name.equals(cust.name) &&
               Double.compare(this.annualSpending, cust.annualSpending) == 0;
    }

    // Overriding hashCode() whenever equals is overridden
    @Override
    public int hashCode()
    {
        int result = Integer.hashCode(customerId);
        result = 31 * result + name.hashCode();
        result = 31 * result + Double.hashCode(annualSpending);
        return result;
    }

    @Override
    public String toString()
    {
        return "Customer8[ID=" + customerId + ", Name=" + name + ", Spending=" + annualSpending + "]";
    }
}

public class JavaExample_33_OverridingEqualsMethod
{
    public static void main(String[] args)
    {
        Customer8 c1 = new Customer8(101, "John Doe", 15000.50);
        Customer8 c2 = new Customer8(101, "John Doe", 15000.50);

        if (c1.equals(c2))
        {
            System.out.println("Both Customer records are equal.");
            System.out.println(c1);
        }
        else
        {
            System.out.println("Customer records are not equal.");
        }

        System.out.println("HashCode of c1: " + c1.hashCode());
        System.out.println("HashCode of c2: " + c2.hashCode());
    }
}