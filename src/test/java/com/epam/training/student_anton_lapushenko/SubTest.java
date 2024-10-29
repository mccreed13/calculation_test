package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest extends BaseTest implements DoubleTwoArgs, LongTwoArgs {
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvFileSource(resources = "/sub_long.csv")
    @DisplayName("Sub of long numbers")
    @Override
    public void longTest(long a, long b) {
        long result = calculator.sub(a, b);
        long expected = a - b;
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvFileSource(resources = "/sub_double.csv")
    @DisplayName("Sub of double numbers")
    @Override
    public void doubleTest(double a, double b) {
        double result = calculator.sub(a, b);
        double expected = a - b;
        assertEquals(expected, result);
    }
}
