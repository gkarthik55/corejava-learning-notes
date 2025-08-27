package com.learning.corejava02.oopsconcepts;

//Abstract class defining the blueprint for all payments
abstract class Payment
{
	private double amount;
	private String transactionId;

	public Payment(double amount, String transactionId)
	{
		this.amount = amount;
		this.transactionId = transactionId;
	}

	// Abstract method - must be implemented by all concrete payment types
	public abstract void pay();

	// Common logic available to all subclasses
	public void printReceipt()
	{
		System.out.println("Receipt Generated:");
		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Amount Paid: ₹" + amount);
	}
}

//Concrete implementation for Credit Card payment
class CreditCardPayment extends Payment
{
	private String cardNumber;

	public CreditCardPayment(double amount, String transactionId, String cardNumber) {
		super(amount, transactionId);
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay() {
		System.out.println("Processing credit card payment using card: " + cardNumber);
		printReceipt();
	}
}

//Concrete implementation for UPI payment
class UpiPayment extends Payment {
	private String upiId;

	public UpiPayment(double amount, String transactionId, String upiId) {
		super(amount, transactionId);
		this.upiId = upiId;
	}

	@Override
	public void pay() {
		System.out.println("Processing UPI payment via: " + upiId);
		// Simulate payment logic here
		printReceipt();
	}
}

public class JavaExample_20_Abstraction
{
	public static void main(String[] args)
	{
		Payment payment1 = new CreditCardPayment(1500.00, "TXN12345", "4111-XXXX-XXXX-1234");
		Payment payment2 = new UpiPayment(899.50, "TXN12346", "kavya@upi");

		payment1.pay();
		System.out.println();
		payment2.pay();
	}
}
