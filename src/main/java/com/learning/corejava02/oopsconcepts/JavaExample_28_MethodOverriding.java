package com.learning.corejava02.oopsconcepts;

class Notification
{
    protected String recipient;

    public Notification(String recipient)
    {
        this.recipient = recipient;
    }

    // Base version of the method
    public void sendNotification()
    {
        System.out.println("Sending a general notification to: " + recipient);
    }
}

class EmailNotification extends Notification
{
    public EmailNotification(String recipient)
    {
        super(recipient);
    }

    // Overridden method
    @Override
    public void sendNotification()
    {
        System.out.println("Sending EMAIL notification to " + recipient);
    }
}

class SMSNotification extends Notification
{
    public SMSNotification(String recipient)
    {
        super(recipient);
    }

    // Overridden method
    @Override
    public void sendNotification()
    {
        System.out.println("Sending SMS notification to " + recipient);
    }
}

public class JavaExample_28_MethodOverriding
{
    public static void main(String[] args)
    {
        Notification n1 = new Notification("GenericUser");
        Notification n2 = new EmailNotification("karthik@example.com");
        Notification n3 = new SMSNotification("9876543210");

        n1.sendNotification();  // Base version
        n2.sendNotification();  // Overridden version (Email)
        n3.sendNotification();  // Overridden version (SMS)
    }
}