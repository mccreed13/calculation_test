package com.epam.training.student_anton_lapushenko;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {
    protected static Calculator calculator;

    @BeforeAll
    public static void setup() {
        calculator = new Calculator();
    }
}
