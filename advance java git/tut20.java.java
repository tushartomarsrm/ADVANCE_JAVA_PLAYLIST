package com.company;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input can't be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input can't be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    double subtract(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomCalculator c = new CustomCalculator();
        
        try {
            System.out.println("Addition: " + c.add(5, 7)); // Valid input, prints 12.0
        } catch (InvalidInputException | MaxInputException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Subtraction: " + c.subtract(10, 3)); // Valid input, prints 7.0
        } catch (MaxInputException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Multiplication: " + c.multiply(6, 1000)); // Valid input, prints 6000.0
        } catch (MaxInputException | MaxMultiplyInputException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Division: " + c.divide(10, 2)); // Valid input, prints 5.0
        } catch (CannotDivideByZeroException | MaxInputException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Invalid Input (Addition): " + c.add(8, 9)); // Throws InvalidInputException
        } catch (InvalidInputException | MaxInputException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Cannot Divide by Zero: " + c.divide(10, 0)); // Throws CannotDivideByZeroException
        } catch (CannotDivideByZeroException | MaxInputException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Max Input Exception: " + c.add(100001, 2)); // Throws MaxInputException
        } catch (InvalidInputException | MaxInputException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Max Multiplier Exception: " + c.multiply(8000, 100)); // Throws MaxMultiplyInputException
        } catch (MaxInputException | MaxMultiplyInputException e) {
            System.out.println(e);
        }
    }
}
