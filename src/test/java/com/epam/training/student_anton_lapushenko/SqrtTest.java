package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SqrtTest extends BaseTest implements DoubleOneArg{

    @ParameterizedTest(name = "sqrt({0})")
    @CsvFileSource(resources = "/sqrt_double.csv")
    @DisplayName("Sqrt of double numbers")
    @Override
    public void doubleTest(double a) {
        double result = calculator.sqrt(a);
        double expected = Math.sqrt(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Sqrt of negative number")
    public void sqrtNegativeNumberTest() {
        assertThrows(NumberFormatException.class, () -> calculator.sqrt(-1));
    }
}
