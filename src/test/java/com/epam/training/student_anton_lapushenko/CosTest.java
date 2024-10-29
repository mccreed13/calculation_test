package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosTest extends BaseTest implements DoubleOneArg{

    @ParameterizedTest(name = "cos({0})")
    @CsvFileSource(resources = "/cos_double.csv")
    @DisplayName("Cos of double numbers")
    @Override
    public void doubleTest(double a) {
        double result = calculator.cos(a);
        double expected = Math.cos(a);
        assertEquals(expected, result);
    }
}
