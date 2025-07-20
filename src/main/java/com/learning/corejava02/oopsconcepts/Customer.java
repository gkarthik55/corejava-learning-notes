package com.learning.corejava02.oopsconcepts;

// Common Customer class to demonstrate Encapsulation and reuse in future programs

public class Customer implements Cloneable
{
	// private variables - these cannot be accessed directly outside this class
    private String name;
    private int id;
    private int age;

    // Getter for name
    public String getName()
    {
        return name;
    }

    // Setter for name
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter for id
    public int getId()
    {
        return id;
    }

    // Setter for id
    public void setId(int id)
    {
        this.id = id;
    }

    // Getter for age
    public int getAge()
    {
        return age;
    }

    // Setter for age
    public void setAge(int age)
    {
        this.age = age;
    }
    
	public Customer() 
	{
	}

	public Customer(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
    @Override
	protected Object clone() throws CloneNotSupportedException
    {
		return super.clone();
	}

	@Override
	public String toString()
    {
		return "Customer [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
}