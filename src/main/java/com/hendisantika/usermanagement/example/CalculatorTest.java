package com.hendisantika.usermanagement.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add_normal() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void add_limite_zero() {
        assertEquals(7, calculator.add(7, 0));
        assertEquals(7, calculator.add(0, 7));
    }

    @Test
    void add_negatifs() {
        assertEquals(-5, calculator.add(-2, -3));
        assertEquals(1, calculator.add(-2, 3));
    }

    @Test
    void divide_normal() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void divide_exception_par_zero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
