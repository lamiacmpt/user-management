package com.hendisantika.usermanagement;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(-2, 1));
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, Calculator.subtract(5, 3));
        assertEquals(-3, Calculator.subtract(-2, 1));
        assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(-2, Calculator.multiply(-2, 1));
        assertEquals(0, Calculator.multiply(0, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(-2, Calculator.divide(-4, 2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}

