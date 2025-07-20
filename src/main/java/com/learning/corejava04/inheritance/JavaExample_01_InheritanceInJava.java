package com.learning.corejava04.inheritance;

// Interface for Multiple Inheritance
interface FullTimeEmployee
{
    default void workHours()
    {
        System.out.println("Works 9 hours per day.");
    }
}

interface RemoteWorker
{
    default void workLocation()
    {
        System.out.println("Works remotely from home.");
    }
}

// Base class (Single Inheritance)
class Person
{
    String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void showDetails()
    {
        System.out.println("Name: " + name);
    }
}

// Derived class (Single Inheritance from Person)
class Employee extends Person
{
    int employeeId;

    public Employee(String name, int employeeId)
    {
        super(name);
        this.employeeId = employeeId;
    }

    public void showEmployeeId()
    {
        System.out.println("Employee ID: " + employeeId);
    }
}

// Multilevel Inheritance (Manager → Employee → Person)
class Manager extends Employee
{
    String department;

    public Manager(String name, int employeeId, String department)
    {
        super(name, employeeId);
        this.department = department;
    }

    public void showDepartment()
    {
        System.out.println("Department: " + department);
    }
}

// Hierarchical Inheritance (Intern and Contractor → Employee)
class Intern extends Employee
{
    public Intern(String name, int employeeId)
    {
        super(name, employeeId);
    }
}

class Contractor extends Employee
{
    public Contractor(String name, int employeeId)
    {
        super(name, employeeId);
    }
}

// Hybrid Inheritance (SeniorManager extends Manager and implements interfaces)
class SeniorManager extends Manager implements FullTimeEmployee, RemoteWorker
{
    public SeniorManager(String name, int employeeId, String department)
    {
        super(name, employeeId, department);
    }

    public void display()
    {
        showDetails();
        showEmployeeId();
        showDepartment();
        workHours();        // From FullTimeEmployee interface
        workLocation();     // From RemoteWorker interface
    }
}

// Main class to test all
public class JavaExample_01_InheritanceInJava
{
    public static void main(String[] args)
    {
        System.out.println("=== Single / Multilevel / Hybrid Inheritance ===");
        SeniorManager sm = new SeniorManager("Karthik", 1001, "Engineering");
        sm.display();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Intern intern = new Intern("Akash", 2001);
        intern.showDetails();
        intern.showEmployeeId();

        Contractor contractor = new Contractor("Neha", 3001);
        contractor.showDetails();
        contractor.showEmployeeId();
    }
}