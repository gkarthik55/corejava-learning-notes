package com.learning.corejava02.oopsconcepts;

//Interface defining the shipping contract
interface ShippingService
{
 void shipOrder(String orderId, String address);
}

//Standard shipping implementation
class StandardShipping implements ShippingService
{
 @Override
 public void shipOrder(String orderId, String address)
 {
     System.out.println("Standard Shipping for Order: " + orderId + " to " + address);
 }
}

class ExpressShipping implements ShippingService
{
    @Override
    public void shipOrder(String orderId, String address)
    {
        System.out.println("Express Shipping for Order: " + orderId + " to " + address);
    }
}

public class JavaExample_21_InterfaceExample
{
    public static void main(String[] args)
    {
    	ShippingService shipping1 = new StandardShipping();
        ShippingService shipping2 = new ExpressShipping();

        shipping1.shipOrder("ORD12345", "Bengaluru, Karnataka");
        shipping2.shipOrder("ORD12346", "Hyderabad, Telangana");
    }
}