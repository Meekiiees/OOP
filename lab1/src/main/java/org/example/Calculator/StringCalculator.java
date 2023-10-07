package org.example.Calculator;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String numbers)  {
        int sum = 0;
        if (numbers.isEmpty()) {
            return sum;
        }

        String userDelim = "";
        if (numbers.startsWith("//")){
            userDelim = String.valueOf(numbers.charAt(2));
            numbers = numbers.substring(4);

            numbers = numbers.replace(userDelim, ",");
        }

        numbers = numbers.replace("\n", ",");

        String[] nums = numbers.split(String.valueOf(','));
        ArrayList<Integer> numsArr = new ArrayList<>();
        for (String el : nums){
            numsArr.add(Integer.parseInt(el));
        }

        for (int el : numsArr) {
            sum += el;
        }
        return sum;
    }
}
