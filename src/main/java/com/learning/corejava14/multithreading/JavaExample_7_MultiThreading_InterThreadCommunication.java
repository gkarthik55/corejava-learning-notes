package com.learning.corejava14.multithreading;

//Easy example to remember the Inter-Thead communication - wait and notify method for Interview.

class CustomerBankAccount
{
	String custName;
	Integer amount;

	CustomerBankAccount(String custName, Integer amount)
	{
		this.custName = custName;
		this.amount = amount;
	}

	synchronized void withdraw(int amount)
	{
		System.out.println(Thread.currentThread().getName() + " is withdrawing...");

		if (this.amount < amount)
		{
			System.out.println("Its less balance. Waiting for deposit.");

			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		this.amount -= amount;

		System.out.println("Now withdraw is completed.");
	}

	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit...");

		this.amount += amount;

		System.out.println("deposit completed... ");
		notify();
	}
}

public class JavaExample_7_MultiThreading_InterThreadCommunication
{
	public static void main(String args[])
	{
		System.out.println("Begin of Main Thread");

		// Same here also.. Customer Bank Account one object erbeku.. 
		final CustomerBankAccount cust1 = new CustomerBankAccount("Karthik", 10000); 

		// 2 Threads.. 1 Withdraw 1 Deposit
		Thread t1 = new Thread("Withdraw-Thread")
		{
			public void run()
			{
				cust1.withdraw(15000);
			}
		};
		
		t1.start();

		Thread t2 = new Thread("Deposit-Thread")
		{
			public void run()
			{
				cust1.deposit(10000);
			}
		};
		
		t2.start();

		System.out.println("End of Main Thread");
	}
}