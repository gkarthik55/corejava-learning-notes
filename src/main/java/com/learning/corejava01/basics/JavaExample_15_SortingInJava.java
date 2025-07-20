package com.learning.corejava01.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaExample_15_SortingInJava
{
    public static void main(String[] args)
    {
        // Java program to demonstrate working of Arrays.sort().
        // Its by default sorts in ascending order.
        int orderIds[] = {5602, 2521, 1304, 8765, 6670, 4623};

        System.out.println("Order IDs before sorting: " + Arrays.toString(orderIds));

        Arrays.sort(orderIds);
        System.out.println("Order IDs after sorting: " + Arrays.toString(orderIds));

        // Java program to demonstrate working of Collections.sort().
        // Create a list of customer names and sort it.
        List<String> customerNames = new ArrayList<>();
        customerNames.add("Rajesh");
        customerNames.add("Amit");
        customerNames.add("Neha");
        customerNames.add("Zoya");
        customerNames.add("Bhavesh");

        /* Collections.sort method is sorting the elements of ArrayList in ascending order. */
        Collections.sort(customerNames);
        
        // Let us print the sorted list 
        System.out.println("Customer names sorted ascending:\n" + customerNames);

        Collections.reverse(customerNames);
        // Let us print the reverse list 
        System.out.println("Customer names sorted descending:\n" + customerNames);

        // Java program to sort an array in descending order using Arrays.sort().
        // Note that we have Integer here instead of int[] as Collections.reverseOrder doesn't work for primitive types. 
        Integer invoiceNumbers[] = {130, 70, 600, 450, 210, 90, 20, 1000};

        // Sorts invoiceNumbers[] in descending order
        //Arrays.sort(invoiceNumbers);
        Arrays.sort(invoiceNumbers, Collections.reverseOrder());
        System.out.println("Invoices sorted in descending order: " + Arrays.toString(invoiceNumbers));

        // Java program to demonstrate working of Collections.sort() to descending order.
        // Create a list of product categories
        List<String> productCategories = new ArrayList<>();
        productCategories.add("Electronics");
        productCategories.add("Books");
        productCategories.add("Grocery");
        productCategories.add("Toys");
        productCategories.add("Clothing");

        /* Collections.sort method is sorting the elements of ArrayList in descending order. */
        Collections.sort(productCategories, Collections.reverseOrder());

        // Let us print the sorted list 
        System.out.println("Product categories sorted descending: " + productCategories);

        // Java program to sort a subarray using Arrays.sort(). Our arr contains 8 elements
        int[] partialOrderIds = {130, 70, 60, 450, 210, 90, 20, 1000};

        // Sort subarray from index 1 to 4, i.e., only sort subarray {70, 60, 450, 210} and
        // keep other elements as it is.
        Arrays.sort(partialOrderIds, 1, 5);

        System.out.println("Subarray sorted (index 1 to 4): " + Arrays.toString(partialOrderIds));
    }
}