package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TgTest extends BaseTest implements DoubleOneArg{

    @ParameterizedTest(name = "tg({0}) = {1}")
    @CsvFileSource(resources = "/tg_double.csv")
    @DisplayName("Tg of double numbers")
    @Override
    public void doubleTest(double a) {
        double result = calculator.tg(a);
        double expected = Math.tan(a);
        assertEquals(expected, result);
    }
}
