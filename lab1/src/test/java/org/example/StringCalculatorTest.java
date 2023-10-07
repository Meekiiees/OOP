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

            Assertions.assertEquals(25, sc.add("1,1,1,1,21"));

            Assertions.assertEquals(6, sc.add("1\n2,3"));

            Assertions.assertEquals(6, sc.add("//*1\n1,3*1"));

            Assertions.assertThrows(IllegalArgumentException.class, () -> sc.add("1,-3"));
            Assertions.assertThrows(IllegalArgumentException.class, () -> sc.add("//[*]1\n1,3*-1"));

            Assertions.assertEquals(1005, sc.add("//[*]1\n1,3*1000*2000"));

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
