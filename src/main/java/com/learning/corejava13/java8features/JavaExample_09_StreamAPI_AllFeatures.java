package com.learning.corejava13.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaExample_09_StreamAPI_AllFeatures 
{
	public static void main(String[] args) 
	{
		List<CustomerOrder> orders = Arrays.asList(
	            new CustomerOrder("Karthik", "Laptop", 1, 75000),
	            new CustomerOrder("Kavya", "Phone", 2, 50000),
	            new CustomerOrder("Pradeep", "Laptop", 1, 80000),
	            new CustomerOrder("Sara", "Headphones", 3, 4500),
	            new CustomerOrder("Lakshmi", "Phone", 1, 25000)
	        );

	        // 1. Filter orders above ₹50,000
	        List<CustomerOrder> expensiveOrders = orders
	        		.stream()
	        		.filter(o -> o.getTotalPrice() > 50000)
	        		.collect(Collectors.toList());

	        System.out.println("1. Expensive Orders > ₹50,000:");
	        expensiveOrders.forEach(System.out::println);

	        // 2. Map to get just customer names
	        List<String> customerNames = orders
	        			.stream()
			            .map(c -> c.getCustomerName()) // Fetch Data
			            .distinct()
			            .collect(Collectors.toList());

	        System.out.println("\n2. Unique Customer Names:");
	        customerNames.forEach(System.out::println);

	        // 3. Count orders for 'Phone'
	        long phoneCount = orders
	        		.stream()
	        		.filter(o -> o.getProduct().equalsIgnoreCase("Phone"))
	        		.count();

	        System.out.println("\n3. Number of Phone Orders: " + phoneCount);

	        // 4. Find the most expensive order
	        Optional<CustomerOrder> maxOrder = orders
	        		.stream()
	        		.max(Comparator.comparingDouble(o -> o.getTotalPrice()));

	        System.out.println("\n4. Most Expensive Order:");
	        maxOrder.ifPresent(System.out::println);

	        // 5. Sort orders by total price
	        List<CustomerOrder> sortedOrders = orders
	        		.stream()
	        		.sorted(Comparator.comparingDouble(o -> o.getTotalPrice()))
	        		.collect(Collectors.toList());

	        System.out.println("\n5. Orders Sorted by Total Price:");
	        sortedOrders.forEach(System.out::println);

	        // 6. Any order with quantity > 2?
	        boolean hasBulkOrder = orders
	        		.stream()
	        		.anyMatch(o -> o.getQuantity() > 2);

	        System.out.println("\n7. Any Bulk Orders (Qty > 2)? " + hasBulkOrder);
	}
}
