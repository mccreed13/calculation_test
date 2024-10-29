package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowTest extends BaseTest implements DoubleTwoArgs {

    @ParameterizedTest(name = "{0} ^ {1}")
    @CsvFileSource(resources = "/pow_long.csv")
    @DisplayName("Pow long numbers")
    @Override
    public void doubleTest(double a, double b) {
        double result = calculator.pow(a, b);
        double expected = Math.pow(a, b);
        assertEquals(expected, result);
    }
}
