//Multithreading using the Thread class (cwh_70.java):

java
Copy code
package com.company;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class cwh_70 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

//Multithreading using the Runnable interface (cwh_71.java):

java
Copy code
package com.company;

class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}

public class cwh_71_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}