package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Calendar Class
        Calendar c = Calendar.getInstance();

        System.out.println("Calendar Type: " + c.getCalendarType());
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + c.get(Calendar.MONTH)); // Months are 0-based
        System.out.println("Day of the Week: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour of the Day: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + c.get(Calendar.MINUTE));
        System.out.println("Second: " + c.get(Calendar.SECOND));

        // Adding/rolling time
        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : " + c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : " + c.getTime());
        c.add(Calendar.MONTH, 2);
        System.out.println("After 2 months  : " + c.getTime());

        // Weeks in week year and Maximum for a field
        System.out.println("Weeks in Week Year: " + c.getWeeksInWeekYear());
        System.out.println("Maximum Weeks in Year: " + c.getMaximum(Calendar.WEEK_OF_YEAR));

        // GregorianCalendar Class
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("Is 2000 a leap year? " + gcal.isLeapYear(2000));
        System.out.println("Is 2021 a leap year? " + gcal.isLeapYear(2021));

        // Rolling date
        System.out.println("Date before rolling : " + gcal.getTime());
        gcal.roll(Calendar.MONTH, true);
        gcal.roll(Calendar.DATE, false);
        gcal.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : " + gcal.getTime());

        // HashCode
        System.out.println("Calendar HashCode: " + c.hashCode());

        // TimeZone
        System.out.println("Available Time Zones:");
        for (String id : TimeZone.getAvailableIDs()) {
            System.out.println(id);
        }
    }
}
