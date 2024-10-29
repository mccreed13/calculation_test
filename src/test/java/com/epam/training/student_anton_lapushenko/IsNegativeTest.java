package com.epam.training.student_anton_lapushenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsNegativeTest extends BaseTest implements LongOneArg {

    @ParameterizedTest(name = "IsNegative({0})")
    @CsvFileSource(resources = "/isNegative_long.csv")
    @DisplayName("Is negative long number")
    @Override
    public void longTest(long a) {
        boolean result = calculator.isNegative(a);
        boolean expected = a < 0;
        assertEquals(expected, result);
    }
}
