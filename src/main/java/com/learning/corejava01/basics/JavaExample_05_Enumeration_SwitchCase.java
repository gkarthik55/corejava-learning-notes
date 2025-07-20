package com.learning.corejava01.basics;

import java.util.Scanner;

enum Workday
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class EmployeeWorkdayMood
{
    Workday day;

    public EmployeeWorkdayMood(Workday day)
    {
        this.day = day;
    }

    // Prints a line about Workday using switch
    public void evaluateMood()
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
        EmployeeWorkdayMood mood = new EmployeeWorkdayMood(Workday.valueOf(input.toUpperCase()));
        mood.evaluateMood();

        sc.close();
    }
}