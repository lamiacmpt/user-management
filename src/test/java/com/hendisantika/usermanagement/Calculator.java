package com.hendisantika.usermanagement;





public class Calculator {

    // Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Soustraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro non autorisée");
        }
        return a / b;
    }
}
