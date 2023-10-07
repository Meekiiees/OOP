package org.example.Calculator;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String numbers) throws IllegalAccessException {
        int sum = 0;
        if (numbers.isEmpty()) {
            return sum;
        }

        String[] nums = numbers.split(String.valueOf(','));
        ArrayList<Integer> numsArr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 1) {
                throw new IllegalAccessException ("Invalid input");
            }
            int temp = Integer.parseInt(nums[i]);
            numsArr.add(temp);
        }
        for (int el : numsArr) {
            sum += el;
        }
        return sum;
    }
}
