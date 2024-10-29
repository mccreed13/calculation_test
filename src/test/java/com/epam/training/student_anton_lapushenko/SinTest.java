package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinTest extends BaseTest implements DoubleOneArg{

    @ParameterizedTest(name = "sin({0})")
    @CsvFileSource(resources = "/sin_double.csv")
    @DisplayName("Sin of double numbers")
    @Override
    public void doubleTest(double a) {
        double result = calculator.sin(a);
        double expected = Math.sin(a);
        assertEquals(expected, result);
    }
}
