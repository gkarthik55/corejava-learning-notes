package com.learning.corejava02.oopsconcepts;

// Demonstrates how Java resolves the Diamond Problem using default methods in interfaces
interface NotificationSender
{
    // Common default method
    default void send()
    {
        System.out.println("Sending Notification...");
    }
}

interface EmailSender extends NotificationSender
{
    @Override
    default void send()
    {
        System.out.println("Sending Email Notification...");
    }
}

interface SMSSender extends NotificationSender
{
    @Override
    default void send()
    {
        System.out.println("Sending SMS Notification...");
    }
}

// Implementation class that inherits from both EmailSender and SMSSender
class AlertService implements EmailSender, SMSSender
{
    // Must override 'send()' to resolve diamond problem
    @Override
    public void send()
    {
        // Choose which one to call, or combine both
        EmailSender.super.send();  // Resolve ambiguity explicitly
        SMSSender.super.send();
    }
}

public class JavaExample_35_DiamondProblemResolved_Interview
{
    public static void main(String[] args)
    {
        AlertService alert = new AlertService();
        alert.send();
    }
}
