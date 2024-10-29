package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest extends BaseTest implements LongTwoArgs, DoubleTwoArgs {

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvFileSource(resources = "/sum_long.csv")
    @DisplayName("Sum of long numbers")
    @Override
    public void longTest(long a, long b) {
        long result = calculator.sum(a, b);
        long expected = a + b;
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvFileSource(resources = "/sum_double.csv")
    @DisplayName("Sum of double numbers")
    @Override
    public void doubleTest(double a, double b) {
        double result = calculator.sum(a, b);
        double expected = a + b;
        assertEquals(expected, result);
    }
}
