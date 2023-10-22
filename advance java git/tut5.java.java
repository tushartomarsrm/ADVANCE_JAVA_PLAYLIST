class A extends Thread {
    public A(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(this.getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getState());
        }
    }
}

public class TutorialProgram {

    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        // Create an instance of class A
        A a = new A("harry");

        // Start the thread
        a.start();

        // Set priority of the thread
        a.setPriority(Thread.MIN_PRIORITY);

        // Problem 1: Multiplication table
        multiplication(7);

        // Problem 2: Print a pattern
        pattern1(9);

        // Problem 3: Sum of n natural numbers
        int c = sumRec(4);
        System.out.println("Sum of first 4 natural numbers: " + c);

        // Problem 4: Fibonacci series
        int result = fib(7);
        System.out.println("Fibonacci series result: " + result);
    }
}
