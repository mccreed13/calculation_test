package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPositiveTest extends BaseTest implements LongOneArg{

    @ParameterizedTest(name = "IsPositive({0})")
    @CsvFileSource(resources = "/isPositive_long.csv")
    @DisplayName("Is negative long number")
    @Override
    public void longTest(long a) {
        boolean result = calculator.isPositive(a);
        boolean expected = a > 0;
        assertEquals(expected, result);
    }
}
