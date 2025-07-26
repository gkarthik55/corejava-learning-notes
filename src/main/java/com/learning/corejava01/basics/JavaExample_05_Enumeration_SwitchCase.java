package com.learning.corejava01.basics;

import java.util.Scanner;

//Outside the Class.
enum Workday
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class EmployeeWorkdayMood
{
    // Prints a line about Workday using switch
    public void evaluateMood(Workday day)
    {
        switch (day)
        {
            case MONDAY:
                System.out.println("Employee Mood: Mondays are tough.");
                break;
            case FRIDAY:
                System.out.println("Employee Mood: Fridays are cheerful.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Employee Mood: Weekends are relaxing.");
                break;
            default:
                System.out.println("Employee Mood: Midweek is manageable.");
                break;
        }
    }
}

public class JavaExample_05_Enumeration_SwitchCase
{
    public static void main(String[] args)
    {
        System.out.println("Enter the day (e.g., Monday):");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        // Using the valueOf() method of Enum
        Workday day = Workday.valueOf(input.toUpperCase());
        
        EmployeeWorkdayMood mood = new EmployeeWorkdayMood();
        mood.evaluateMood(day);

        sc.close();
    }
}