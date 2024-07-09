package org.example;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class BasicFactorialToWarmUpTest {

    @Test
    void testFactorialWithPositiveNumbers() {
        assertEquals(120, BasicFactorialToWarmUp.factorial(5), "Factorial of 5 should be 120");
        assertEquals(720, BasicFactorialToWarmUp.factorial(6), "Factorial of 6 should be 720");
        assertEquals(2, BasicFactorialToWarmUp.factorial(2), "Factorial of 2 should be 2");
    }

    @Test
    void testFactorialWithOne() {
        assertEquals(1, BasicFactorialToWarmUp.factorial(1), "Factorial of 1 should be 1");
    }

    @Test
    void testFactorialWithZeroOrNegative() {
        assertThrows(InputMismatchException.class, () -> BasicFactorialToWarmUp.factorial(0), "Factorial of 0 should throw InputMismatchException");
        assertThrows(InputMismatchException.class, () -> BasicFactorialToWarmUp.factorial(-1), "Factorial of -1 should throw InputMismatchException");
    }
}