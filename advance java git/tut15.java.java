package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ArrayDeque Example
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println("First Element: " + ad1.getFirst());
        System.out.println("Last Element: " + ad1.getLast());

        // HashSet Example
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println("HashSet: " + myHashSet);
        myHashSet.remove(3);
        System.out.println("HashSet after removing 3: " + myHashSet);
        System.out.println("Is HashSet empty? " + myHashSet.isEmpty());

        // Date & Time Example
        System.out.println("Milliseconds since 1 Jan 1970: " + System.currentTimeMillis());
        Date d= new Date();
        System.out.println("Current Date and Time: " + d);

        Date d1= new Date(1621709639111L);
        System.out.println("Date from milliseconds: " + d1);

        Date d2= new Date(2021,12, 24);  
        System.out.println("Comparison result: " + d2.compareTo(d));

        System.out.println("Milliseconds since 1 Jan 1970: " + d.getTime());
        System.out.println("Current Year: " + (d.getYear() + 1900));
        System.out.println("Current Date: " + d.getDate());
    }
}
