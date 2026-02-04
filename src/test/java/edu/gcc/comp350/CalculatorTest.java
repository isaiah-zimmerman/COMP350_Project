package edu.gcc.comp350;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(4, c.add(1, 3));
    }
}
