package com.learning.corejava15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Read Millions of Records from Database using Java and JDBC
class JavaExample_04_JDBC_Interview
{
	public static void main(String args[])
	{
		System.out.println("Read Millions of Records from Database using Java and JDBC");
	
		Connection con = null;
		PreparedStatement pt = null;
		
		try
		{
			//Load and Register the driver.
	    	Class.forName("com.mysql.cj.jdbc.Driver");

	    	String query = "select * from person";
	    	
	    	//Url, UserName and Password to connect mysql
	    	String url = "jdbc:mysql://localhost:3306/mysql_kg";
	    	String userName = "root";
	    	String password = "system";
	    	
	    	//Establish the connection
	    	con = DriverManager.getConnection(url, userName, password);
	    	
	    	//Create the Prepared Statement
	    	pt = con.prepareStatement(query);

	    	//Insert Query.
	    	ResultSet rs = pt.executeQuery();
	    	rs.setFetchSize(5000);
	    	
	    	//CPU, Memory, 
	    	
	    	System.out.println(rs.getFetchSize());
	    	
    		System.out.println("------------------------------------------------------------------");
    		
	    	while(rs.next())
	    	{
	    		System.out.println("Person Id:"+rs.getInt(1));
	    		System.out.println("Person Name:"+rs.getString(2));
	    		System.out.println("Person Location:"+rs.getString(3));
	    		System.out.println("------------------------------------------------------------------");
	    	}
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
				pt.close();
				
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