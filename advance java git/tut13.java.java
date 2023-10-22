// Create a package named "myapp"
package myapp;

// Thread class with priority
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + getName());
        System.out.println("Thread priority: " + getPriority());
    }
}

// Main class to demonstrate thread creation and priorities
public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        // Create two threads that continuously print messages
        Thread threadWelcome = new Thread(() -> {
            while (true) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadGoodMorning = new Thread(() -> {
            while (true) {
                System.out.println("Good morning");
            }
        });

        threadWelcome.start();
        threadGoodMorning.start();

        // Get and print thread states
        Thread.State state1 = t1.getState();
        Thread.State state2 = t2.getState();

        System.out.println("Thread-1 State: " + state1);
        System.out.println("Thread-2 State: " + state2);
    }
}
