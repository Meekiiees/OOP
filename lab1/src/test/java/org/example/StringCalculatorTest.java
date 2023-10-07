package org.example;

import org.example.Calculator.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    @Test
    void test() {
        StringCalculator sc = new StringCalculator();

        try {
            Assertions.assertEquals(0, sc.add(""));
            Assertions.assertEquals(1, sc.add("1"));
            Assertions.assertEquals(1, sc.add("1,"));
            Assertions.assertEquals(25, sc.add("1,24"));
            Assertions.assertThrows(Exception.class, () -> sc.add("1,2,3"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}