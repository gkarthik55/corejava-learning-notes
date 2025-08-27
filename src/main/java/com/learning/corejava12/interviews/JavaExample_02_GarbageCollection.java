package com.learning.corejava12.interviews;

public class JavaExample_02_GarbageCollection
{
	public static void main(String[] args)
	{
		JavaExample_02_GarbageCollection obj1 = new JavaExample_02_GarbageCollection();
		JavaExample_02_GarbageCollection obj2 = new JavaExample_02_GarbageCollection();

		// Nullifying the reference variable
		obj1 = null;

		// requesting JVM for running Garbage Collector
		System.gc();

		// Nullifying the reference variable
		obj2 = null;

		// requesting JVM for running Garbage Collector
		Runtime.getRuntime().gc();
	}

	@Override
	// finalize method is called on object once before garbage collecting it
	protected void finalize()
	{
		System.out.println("Garbage collector called.");
		System.out.println("Object garbage collected : " + this);
	}
}