package org.example.Calculator;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String numbers)  {
        int sum = 0;
        if (numbers.isEmpty()) {
            return sum;
        }

        String[] nums = numbers.split(String.valueOf(','));
        ArrayList<Integer> numsArr = new ArrayList<>();

        for (String el : nums) {
            int temp = Integer.parseInt(el);
            numsArr.add(temp);
        }
        for (int el : numsArr) {
            sum += el;
        }
        return sum;
    }
}
