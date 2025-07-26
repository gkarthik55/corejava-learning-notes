package com.learning.corejava14.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class OrderProcessor implements Runnable
{
    private String orderId;

    public OrderProcessor(String orderId)
    {
        this.orderId = orderId;
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " (Start) Processing Order ID: " + orderId);

        processOrder(); // Simulate payment, packaging, etc.

        System.out.println(Thread.currentThread().getName() + " (End) Completed Order ID: " + orderId);
    }

    private void processOrder()
    {
        try {
            Thread.sleep(2000); // Simulate time-consuming order processing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class JavaExample_03_MultiThreading_ThreadPool
{
    public static void main(String[] args)
    {
        System.out.println("Warehouse Order Processing Started...");
        
        ExecutorService service = Executors.newFixedThreadPool(5); // 5 delivery agents

        for (int i = 101; i <= 110; i++)
        {
            Runnable task = new OrderProcessor("ORD" + i);
            service.execute(task);
        }

        service.shutdown();

        //System.out.println("All orders dispatched for processing.");
        //System.out.println("End of Main Thread");
    }
}