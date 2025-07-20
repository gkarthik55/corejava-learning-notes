package com.learning.corejava14.multithreading;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("In Thead Method :"+ i);
		}
	}
}

public class JavaExample_01_MultiThreading_ExtendThread
{
	public static void main(String args[])
	{
		System.out.println("--------------------------------------------");
	    System.out.println("Begin of Main Thread");
	    System.out.println("--------------------------------------------");
	    MyThread t1 = new MyThread();
	    t1.start();
	    
	    try
	    {
	    	t1.join();
		} 
	    catch (InterruptedException e)
	    {
	    	System.out.println(e);
		}
	    
	    //See the difference between Join() and without Join() method.
	    
	    //Other methods used in the Thread
	    MyThread t2 = new MyThread();
	    t2.setName("My Thread 2");
	    
	    MyThread t3 = new MyThread();
	    t3.setName("My Thread 3");
	    
	    System.out.println("--------------------------------------------");
	    //Get the name of Thread
	    System.out.println(t2.getName());
	    System.out.println(t3.getName());
	    System.out.println("--------------------------------------------");
	    
	    //Get the current thread and its name.
	    System.out.println(Thread.currentThread().getName());
	    System.out.println("--------------------------------------------");
	    //Set the priority of Thread
	    t2.setPriority(Thread.MIN_PRIORITY);
	    t3.setPriority(Thread.MAX_PRIORITY);
	    
	    //Get the priority of Thread
	    System.out.println(t2.getPriority());
	    System.out.println(t3.getPriority());
	    System.out.println("--------------------------------------------");
	    System.out.println("End of Main Thread");
	    System.out.println("--------------------------------------------");
	}
}
