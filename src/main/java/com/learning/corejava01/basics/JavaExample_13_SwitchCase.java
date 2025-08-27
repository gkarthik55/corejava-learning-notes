package com.learning.corejava01.basics;

import java.util.Scanner;

// Java program to demonstrate switch case with multiple cases without break statements
public class JavaExample_13_SwitchCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the order status code between 1-7.");
		int statusCode = sc.nextInt();

		String orderStatus = null;
		String statusCategory = null;

		switch (statusCode)
		{
			case 1:
				orderStatus = "New";
				break;
			case 2:
				orderStatus = "Processing";
				break;
			case 3:
				orderStatus = "Packed";
				break;
			case 4:
				orderStatus = "Shipped";
				break;
			case 5:
				orderStatus = "Delivered";
				break;
			case 6:
				orderStatus = "Cancelled";
				break;
			case 7:
				orderStatus = "Returned";
				break;
			default:
				orderStatus = null;
				break;
		}

		// Java program to demonstrate switch case with multiple cases without break
		// statements
		switch (orderStatus)
		{
			case "New":
			case "Processing":
			case "Packed":
			case "Shipped":
				statusCategory = "In Progress";
				break;
				
			case "Delivered":
				statusCategory = "Completed";
				break;
				
			case "Cancelled":
			case "Returned":
				statusCategory = "Failed";
				break;
				
			default:
				statusCategory = null;
				break;
		}

		System.out.println("Order Status    : " + orderStatus);
		System.out.println("Status Category : " + statusCategory);

		sc.close();
	}
}