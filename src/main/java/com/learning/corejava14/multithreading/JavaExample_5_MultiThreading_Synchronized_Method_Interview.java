package com.learning.corejava14.multithreading;

class Printer
{
	//Using the synchronized method
	synchronized public void printDoc(String docName, int numOfPrints)
	{
		System.out.println("Acquiring the Printer Lock.");
		
		for(int i=1; i<= numOfPrints; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Printing the document "+ docName +" " +i+ " time.");	
		}
		
		System.out.println("Releasing the Printer Lock.");
	}
}

class DocumentPrinter extends Thread
{
	String docName;
	Integer numOfPrints;
	
	Printer printObj; // One Printer Object erathe..
	
	DocumentPrinter(String docName, Integer numOfPrints, Printer printer)
	{
		this.docName = docName;
		this.numOfPrints = numOfPrints;
		
		printObj = printer;
	}
	
	public void run()
	{
		printObj.printDoc(docName, numOfPrints);
	}
}


public class JavaExample_5_MultiThreading_Synchronized_Method_Interview
{
	public static void main(String args[])
	{
	    System.out.println("Begin of Main Thread");
	    
	    //Printer du onde object erbeku, adakke. Printer is the Resource.
	    
	    //We have only one single object of Printer class.
	    Printer printerObj = new Printer();
	    
	    //We have a scenario where we have multiple threads working on the same object. 
	    // i.e. a single printer is used by multiple people.
	    DocumentPrinter doc1 = new DocumentPrinter("Karthik Doc", 5, printerObj);
	    DocumentPrinter doc2 = new DocumentPrinter("Pradeep Doc", 8, printerObj);
	    
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
