package org.example.Calculator;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String numbers)  {
        int sum = 0;
        if (numbers.isEmpty()) {
            return sum;
        }

//        String delimiter = ",\n";
//        ArrayList<Integer> numsArr = new ArrayList<>();
//        String temp = "";
//        int i = 0;
//        while (i < numbers.length()) {
//            while (i < numbers.length() && !delimiter.contains(String.valueOf(numbers.charAt(i)))){
//                temp += numbers.charAt(i);
//                i++;
//            }
//            if (temp.isEmpty()) throw new Exception("Incorrect using of delimiter");
//            numsArr.add(Integer.parseInt(temp));
//            temp = "";
//            i++;
//        }

        String newNumbers = numbers.replace("\n", ",");

        String[] nums = newNumbers.split(String.valueOf(','));
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
