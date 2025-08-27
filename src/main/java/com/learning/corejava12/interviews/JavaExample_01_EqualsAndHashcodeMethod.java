package com.learning.corejava12.interviews;

import java.util.HashSet;
import java.util.Set;

public class JavaExample_01_EqualsAndHashcodeMethod
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(10,"Karthik","IT");
		Employee e2 = new Employee(10,"Karthik","IT");
		Employee e3 = new Employee(12,"Sreekanth","Finance");
		
		Set<Employee> empSet= new HashSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);

		for(Employee emp: empSet)
		{
			System.out.println(emp.toString());
		}
	}
}
