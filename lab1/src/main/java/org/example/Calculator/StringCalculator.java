package org.example.Calculator;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String numbers) throws IllegalArgumentException {
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
        ArrayList<Integer> negNumsArr = new ArrayList<>();
        for (String el : nums){
            int temp = Integer.parseInt(el);
            if (temp < 0){
                negNumsArr.add(temp);
            }

            numsArr.add(temp);
        }
        if (!negNumsArr.isEmpty()){
            String negs = negNumsArr.toString();
            throw new IllegalArgumentException("illegal negative numbers" + negs);
        }

        for (int el : numsArr) {
            sum += el;
        }
        return sum;
    }
}
