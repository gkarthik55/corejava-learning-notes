package com.learning.corejava01.basics;

// Enumeration is a user-defined type that represents a group of named constants.
// It's nothing but internally creating static final objects of it.

public class JavaExample_04_Enumeration
{
    // Enum declaration can be done outside the Class or inside a Class but not inside a Method.
    enum OrderStatus
    {
        NEW, PROCESSING, SHIPPED, DELIVERED; // Think of Amazon shopping website.
    }

    /* Internally above enum OrderStatus is converted to
    class OrderStatus {
         public static final OrderStatus NEW = new OrderStatus();
         public static final OrderStatus PROCESSING = new OrderStatus();
         public static final OrderStatus SHIPPED = new OrderStatus();
         public static final OrderStatus DELIVERED = new OrderStatus();
    }*/

    public static void main(String[] args)
    {
        OrderStatus status = OrderStatus.NEW;
        System.out.println("Current order status: " + status);

        if (status == OrderStatus.NEW)
        {
            System.out.println("Since the order is NEW, moving it to PROCESSING");
            status = OrderStatus.PROCESSING;
        }

        System.out.println("Updated order status: " + status);
    }
}