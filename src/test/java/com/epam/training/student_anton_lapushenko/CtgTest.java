package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CtgTest extends BaseTest implements DoubleOneArg{

    @ParameterizedTest(name = "ctg({0})")
    @CsvFileSource(resources = "/ctg_double.csv")
    @DisplayName("Ctg of double numbers")
    @Override
    public void doubleTest(double a) {
        double result = calculator.ctg(a);
        double expected = 1.0/Math.tan(a);
        assertEquals(expected, result);
    }
}
