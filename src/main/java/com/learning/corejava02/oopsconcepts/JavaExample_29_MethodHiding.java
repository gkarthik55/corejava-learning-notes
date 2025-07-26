package com.learning.corejava02.oopsconcepts;

class Report
{
    public static void generate()
    {
        System.out.println("Generating general report...");
    }
}

class SalesReport extends Report
{
    public static void generate()
    {
        System.out.println("Generating sales report...");
    }
}

public class JavaExample_29_MethodHiding
{
    public static void main(String[] args)
    {
    	Report report1 = new Report();
        Report report2 = new SalesReport(); // Note: Reference is of type Report
        SalesReport report3 = new SalesReport();

        report1.generate();  // General report
        report2.generate();  // General report - Method hiding in action 
        report3.generate();  // Sales report
    }
}