package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultTest extends BaseTest implements DoubleTwoArgs, LongTwoArgs{

    @ParameterizedTest(name = "{0} * {1}")
    @CsvFileSource(resources = "/mult_long.csv")
    @DisplayName("Multiplication of long numbers")
    @Override
    public void longTest(long a, long b) {
        long result = calculator.mult(a, b);
        long expected = a * b;
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "{0} * {1}")
    @CsvFileSource(resources = "/mult_double.csv")
    @DisplayName("Multiplication of double numbers")
    @Override
    public void doubleTest(double a, double b) {
        double result = calculator.mult(a, b);
        double expected = a * b;
        assertEquals(expected, result);
    }
}
