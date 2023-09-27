package com.testes.calculadora;

import com.testes.calculadora.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void shouldCalculateAddition() {
        int sum = calculator.add(7, 5);
        assertEquals(12, sum);
    }

    @Test
    void shouldCalculateDivision() {
        double result = calculator.divide(5.0, 2.0);
        assertEquals(2.5, result);
    }

    @Test
    void shouldCalculateSubtraction() {
        int difference = calculator.subtract(4, 2);
        assertEquals(2, difference);
    }
}
