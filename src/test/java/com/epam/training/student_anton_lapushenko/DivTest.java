package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivTest extends BaseTest implements DoubleTwoArgs, LongTwoArgs {

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvFileSource(resources = "/div_long.csv")
    @DisplayName("Div long numbers")
    @Override
    public void longTest(long a, long b) {
        long result = calculator.div(a, b);
        long expected = a / b;
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvFileSource(resources = "/div_double.csv")
    @DisplayName("Div double numbers")
    @Override
    public void doubleTest(double a, double b) {
        double result = calculator.div(a, b);
        double expected = a / b;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Div long by zero")
    public void divLongByZeroTest() {
        assertThrows(NumberFormatException.class, () -> calculator.div(1, 0));
    }

    @Test
    @DisplayName("Div double by zero")
    public void divDoubleByZeroTest() {
        assertThrows(NumberFormatException.class, () -> calculator.div(1.0, 0.0));
    }
}
