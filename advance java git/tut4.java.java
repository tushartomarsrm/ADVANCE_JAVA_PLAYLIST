public class TutorialConcepts {

    // Method Overloading
    static void foo() {}
    static void foo(int a) {}
    static void foo(int a, int b) {}
    static void foo(int a, int b, int c) {}
    
    // Method to demonstrate call by value
    static void change(int x) {
        x = 50;
    }
    
    // Method to demonstrate call by reference
    static void change2(int[] arr) {
        arr[0] = 98;
    }

    // Varargs method
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    // Recursion - Print 1 to n
    static void printOneToN(int n) {
        if (n > 0) {
            printOneToN(n - 1);
            System.out.println(n);
        }
    }

    // Recursion - Print n to 1
    static void printNToOne(int n) {
        if (n > 0) {
            System.out.println(n);
            printNToOne(n - 1);
        }
    }

    // Recursive factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Recursive Fibonacci
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Pattern 1 - Print a pyramid pattern
    static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Sum of n natural numbers
    static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        // Method Overloading
        foo();
        foo(1);
        foo(1, 2);
        foo(1, 2, 3);

        // Call by Value and Call by Reference
        int num = 10;
        change(num);
        System.out.println("Value after call by value: " + num);

        int[] arr = {1, 2, 3};
        change2(arr);
        System.out.println("Value after call by reference: " + arr[0]);

        // Varargs
        System.out.println("Sum: " + add(2));
        System.out.println("Sum: " + add(2, 3, 4));
        
        // Recursion
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci of 6: " + fib(6));
        
        // Print 1 to n and n to 1
        System.out.println("Print 1 to 5:");
        printOneToN(5);
        System.out.println("Print 5 to 1:");
        printNToOne(5);
        
        // Print pyramid pattern
        System.out.println("Print pyramid pattern:");
        printPyramid(5);
        
        // Sum of n natural numbers
        System.out.println("Sum of first 5 natural numbers: " + sumOfNaturalNumbers(5));
    }
}
