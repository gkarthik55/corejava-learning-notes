package com.learning.corejava05.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaExample_07_ConcurrentModificationExceptionInArrayList
{
    public static void main(String[] args) 
    {
        List<String> listOfPhones = new ArrayList<>(Arrays.asList(
            "iPhone 13", "iPhone 16", "Samsung Galaxy 23", "Samsung Galaxy 24", "One Plus Nord 5"
        ));

        System.out.println("Original list of phones: " + listOfPhones);

        //Wrong way: This will throw ConcurrentModificationException
        try
        {
            for (String phone : listOfPhones)
            {
                if (phone.startsWith("iPhone"))
                {
                    listOfPhones.remove(phone); // This line will cause the exception
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println("Exception occurred: " + ex);
        }

        // Correct way: Use Iterator's remove() method
        listOfPhones = new ArrayList<>(Arrays.asList(
        	"iPhone 13", "iPhone 16", "Samsung Galaxy 23", "Samsung Galaxy 24", "One Plus Nord 5"
        ));

        Iterator<String> it = listOfPhones.iterator();
        while (it.hasNext())
        {
            String phone = it.next();
            if (phone.contains("iPhone"))
            {
                it.remove(); // Correct way to remove during iteration
            }
        }

        System.out.println("List after safe removal: " + listOfPhones);
    }
}
