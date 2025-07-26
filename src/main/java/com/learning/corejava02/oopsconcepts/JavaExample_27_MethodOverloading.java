package com.learning.corejava02.oopsconcepts;

class OrderService
{
    // Overloaded method 1: Place order using product ID and quantity
    public void placeOrder(String productId, int quantity)
    {
        System.out.println("Order placed for Product ID: " + productId + ", Quantity: " + quantity);
    }

    // Overloaded method 2: Place order with discount code
    public void placeOrder(String productId, int quantity, String discountCode)
    {
        System.out.println("Order placed for Product ID: " + productId + ", Quantity: " + quantity + ", Discount Code: " + discountCode);
    }

    // Overloaded method 3: Place order with different shipping address
    public void placeOrder(String productId, int quantity, String discountCode, String shippingAddress)
    {
        System.out.println("Order placed for Product ID: " + productId + ", Quantity: " + quantity +
                           ", Discount Code: " + discountCode + ", Shipping Address: " + shippingAddress);
    }
}

public class JavaExample_27_MethodOverloading
{
    public static void main(String[] args)
    {
    	 OrderService orderService = new OrderService();

         orderService.placeOrder("P1001", 2);
         orderService.placeOrder("P1002", 1, "SAVE10");
         orderService.placeOrder("P1003", 3, "NEW50", "No. 12, MG Road, Bengaluru");
    }
}