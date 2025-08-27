package com.learning.corejava15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JavaExample_01_JDBCExample
{
	public static void main(String args[])
	{
		System.out.println("JDBC Example");
	
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try
		{
			//Load and Register the driver.
	    	//Class.forName("com.mysql.cj.jdbc.Driver");
	    	
	    	//Url, UserName and Password to connect mysql
	    	String url = "jdbc:mysql://localhost:3306/mysql_kg";
	    	String userName = "root";
	    	String password = "oracle";
	    	
	    	//Establish the connection
	    	con = DriverManager.getConnection(url, userName, password);
	    	
	    	//Create the Statement
	    	st = con.createStatement();
	    	
	    	//Create the Result set to hold the Result.
	    	rs = st.executeQuery("select * from person");
	    	
	    	//Process the Result
	    	while(rs.next())
	    	{
		    	int personId = rs.getInt("id");
		    String personName = rs.getString("name");
		    String personLocation = rs.getString("location");
		       	
		    System.out.println("Person Id:"+ personId +" "+ "Person Name :"+ personName + " "+ "Person Location :"+ personLocation);
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
		    		//Close the ResultSet. 
		    		rs.close();
		    		
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