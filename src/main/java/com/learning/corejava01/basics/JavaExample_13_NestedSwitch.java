package com.learning.corejava01.basics;

import java.util.Scanner;

public class JavaExample_13_NestedSwitch
{
    public static void main(String[] args)
    {
        int customerType = 0;
        String region;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer type (1-Regular, 2-Premium):");
        // customerType = sc.nextInt(); <- It does not work here.
        customerType = Integer.parseInt(sc.nextLine());

        System.out.println("Enter service region:");
        region = sc.nextLine();

        // Scanner skips nextLine() after use of other next functions.
        // Fix that Issue

        // This issue occurs because, when nextInt() method of Scanner class 
        // is used to read the customerType, it returns the value 1 to the variable customerType, as expected.
        // But the cursor, after reading 1, remains just after it. 
        // Ex: 1_ // Cursor is here

        switch (customerType) {
            case 1:
                System.out.println("Eligible services: Basic Support, Email Support");
                break;
            case 2:
                switch (region) 
                { // nested switch
                    case "NORTH":
                    case "EAST":
                        System.out.println("Eligible services: Priority Support, Dedicated Manager");
                        break;
                    case "SOUTH":
                        System.out.println("Eligible services: 24/7 Support, On-site Visits");
                        break;
                    default:
                        System.out.println("Eligible services: Standard Premium Services");
                }
        }

        sc.close();
    }
}