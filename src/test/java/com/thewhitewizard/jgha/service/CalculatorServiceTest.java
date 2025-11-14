package com.thewhitewizard.jgha.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CalculatorService Tests")
class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    @DisplayName("Should add two positive numbers correctly")
    void testAddPositiveNumbers() {
        int result = calculatorService.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    @DisplayName("Should add negative numbers correctly")
    void testAddNegativeNumbers() {
        int result = calculatorService.add(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    @DisplayName("Should subtract two numbers correctly")
    void testSubtract() {
        int result = calculatorService.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Should multiply two numbers correctly")
    void testMultiply() {
        int result = calculatorService.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Should divide two numbers correctly")
    void testDivide() {
        double result = calculatorService.divide(10, 2);
        assertEquals(5.0, result);
    }

    @Test
    @DisplayName("Should throw exception when dividing by zero")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(10, 0);
        });
    }

    @Test
    @DisplayName("Should return true for even numbers")
    void testIsEvenWithEvenNumber() {
        assertTrue(calculatorService.isEven(4));
        assertTrue(calculatorService.isEven(0));
        assertTrue(calculatorService.isEven(-2));
    }

    @Test
    @DisplayName("Should return false for odd numbers")
    void testIsEvenWithOddNumber() {
        assertFalse(calculatorService.isEven(3));
        assertFalse(calculatorService.isEven(1));
        assertFalse(calculatorService.isEven(-1));
    }
}

