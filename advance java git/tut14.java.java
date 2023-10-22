package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList: " + arrayList);

        arrayList.add(1, 4); // Inserts 4 at index 1
        System.out.println("ArrayList after adding 4 at index 1: " + arrayList);

        arrayList.remove(2); // Removes element at index 2
        System.out.println("ArrayList after removing element at index 2: " + arrayList);

        System.out.println("Contains 3? " + arrayList.contains(3));
        System.out.println("Index of 2: " + arrayList.indexOf(2));

        // Merging two ArrayLists
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(11);
        arrayList2.add(12);
        arrayList2.add(13);
        arrayList.addAll(arrayList2);
        System.out.println("Merged ArrayList: " + arrayList);

        // LinkedList Example
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        System.out.println("LinkedList: " + linkedList);

        linkedList.add(0, 5); // Inserts 5 at index 0
        linkedList.addAll(0, arrayList2); // Adds elements from arrayList2 at index 0
        System.out.println("LinkedList after adding elements: " + linkedList);

        linkedList.addLast(676); // Adds element to the end
        linkedList.addFirst(788); // Adds element to the beginning
        System.out.println("LinkedList after adding elements: " + linkedList);

        System.out.println("Contains 27? " + linkedList.contains(27));
        System.out.println("Index of 6: " + linkedList.indexOf(6));
        System.out.println("Last Index of 6: " + linkedList.lastIndexOf(6));

        linkedList.clear();
        System.out.println("Cleared LinkedList: " + linkedList);

        linkedList.set(0, 566); // Throws an exception as the list is empty

        // Accessing elements of LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + ", ");
        }
    }
}
