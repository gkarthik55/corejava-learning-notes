package com.learning.corejava15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class JavaExample_02_JDBCExample
{
	public static void main(String args[])
	{
		System.out.println("JDBC Example");
	
		Connection con = null;
		Statement st = null;
		
		try
		{
			//Load and Register the driver.
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	
	    	//Url, UserName and Password to connect mysql
	    	String url = "jdbc:mysql://localhost:3306/mysql_kg";
	    	String userName = "root";
	    	String password = "system";
	    	
	    	//Establish the connection
	    	con = DriverManager.getConnection(url, userName, password);
	    	
	    	//Create the Statement
	    	st = con.createStatement();
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter the Person Id");
	    	int pId = sc.nextInt();
	    	
	    	sc.nextLine();
	    	System.out.println("Enter the Person Name");
	    	String pName = sc.nextLine();
	    	
	    	System.out.println("Enter the Person Location");
	    	String pLocation = sc.nextLine();
	    	
	    	String query = "insert into person values("+pId+",'"+pName+"','"+pLocation+"')";
	    	
	    	//Insert Query.
	    	int rows = st.executeUpdate(query);
	    	
	    	System.out.println("No of Row/s affected :"+rows);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
	    	try 
	    	{
	    		//Close the Statement. 
				st.close();
				
		    	//Close the Connection.
		    	con.close();
			} 
	    	catch (SQLException e) 
	    	{
	    		System.out.println(e.getMessage());
			}
		}
	}
}