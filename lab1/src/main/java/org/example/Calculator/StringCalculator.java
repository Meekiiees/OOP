package org.example.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringCalculator {
    public int add(String numbers) throws IllegalArgumentException {
        int sum = 0;
        if (numbers.isEmpty()) {
            return sum;
        }

        String n;
        if (numbers.startsWith("//")) {
            n = numbers;
            int end = numbers.indexOf("]\n");
            String userDelims = numbers.substring(2, end);
            n = numbers.substring(end + 2);

            String[] delims = userDelims.split(String.valueOf("]"));

            Arrays.sort(delims, Comparator.comparing(String::length).reversed());

            for (String el : delims) {
                el = el.substring(1);
                n = n.replace(el, ",");
            }
            n = n.replace("\n", ",");

        }else {
            n = numbers.replace("\n", ",");
        }

        String[] nums = n.split(String.valueOf(','));
        ArrayList<Integer> numsArr = new ArrayList<>();
        ArrayList<Integer> negNumsArr = new ArrayList<>();
        for (String el : nums){
            int temp = Integer.parseInt(el);
            if (temp < 0){
                negNumsArr.add(temp);
            }

            if (temp <= 1000) {
                numsArr.add(temp);
            }
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
