package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am the constructor of Parent2");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet(); // Abstract method with no implementation
    abstract public void greet2(); // Abstract method with no implementation
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }

    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

// Uncommenting the following class will result in an error since Child3 is also an abstract class.
/*
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
*/

public class CWH_53_Abstract {
    public static void main(String[] args) {
        Parent2 p = new Child2(); // Abstract class reference holding object of Child2

        p.greet(); // Calls overridden method in Child2
        p.greet2(); // Calls overridden method in Child2
        p.sayHello(); // Calls method from Parent2

        // Uncommenting the following line will result in an error since Parent2 is an abstract class.
        // Parent2 p2 = new Parent2(); // Abstract class can't be instantiated

        // Uncommenting the following line will result in an error since Child3 is an abstract class.
        // Child3 c3 = new Child3(); // Can't instantiate abstract class

        // Uncommenting the following line will result in an error since Child3 is an abstract class.
        // Parent2 vvva = new Child3(); // Can't instantiate abstract class
    }
}
