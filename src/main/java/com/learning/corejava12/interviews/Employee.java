package com.learning.corejava12.interviews;

public class Employee
{
	private int empId;
	private String empName;
	private String dept;

	Employee(int eId, String eName, String dept)
	{
		this.empId = eId;
		this.empName = eName;
		this.dept = dept;
	}

	@Override
	public boolean equals(Object obj)
	{
		// If the object is compared with itself then return true
		if (obj == this)
		{
			return true;
		}

		/*
		 * Check if obj is an instance of Person or not "null instanceof [type]" also
		 * returns false
		 */
		if (!(obj instanceof Employee))
		{
			return false;
		}

		// typecast obj to Person so that we can compare data members
		Employee employee = (Employee) obj;

		// Compare the data members and return accordingly
		if (this.empId == employee.getEmpId()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return empId;
	}

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public String getDept()
	{
		return dept;
	}

	public void setDept(String dept)
	{
		this.dept = dept;
	}

	@Override
	public String toString()
	{
		return "Employee Id: " + empId + "\tEmployee Name: " + empName + "\tEmployee Dept: " + dept;
	}
}