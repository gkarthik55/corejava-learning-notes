package com.learning.corejava14.multithreading;

class Printer1
{
	public void printDoc(String docName, int numOfPrints)
	{
		System.out.println("Trying to acquire the Printer Lock...");

		// Only this block is synchronized
		synchronized(this)
		{
			System.out.println("Acquired the Printer Lock.");
			
			for (int i = 1; i <= numOfPrints; i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Printing the document " + docName + " " + i + " time.");
			}

			System.out.println("Releasing the Printer Lock.");
		}
	}
}

class DocumentPrinter1 extends Thread
{
	String docName;
	Integer numOfPrints;
	Printer1 printObj;

	DocumentPrinter1(String docName, Integer numOfPrints, Printer1 printer)
	{
		this.docName = docName;
		this.numOfPrints = numOfPrints;
		this.printObj = printer;
	}

	public void run()
	{
		printObj.printDoc(docName, numOfPrints);
	}
}

public class JavaExample_6_MultiThreading_SynchronizedBlock
{
	public static void main(String[] args)
	{
		System.out.println("Begin of Main Thread");

		// Shared resource
		Printer1 printerObj = new Printer1();

		DocumentPrinter1 doc1 = new DocumentPrinter1("Karthik Doc", 5, printerObj);
		DocumentPrinter1 doc2 = new DocumentPrinter1("Pradeep Doc", 8, printerObj);

		doc1.start();

		try {
			doc1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		doc2.start();

		try {
			doc2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("End of Main Thread");
	}
}