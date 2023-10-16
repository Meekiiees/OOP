package org.example;

import org.example.Calculator.StringCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Enter numbers: ");
            Scanner scanner = new Scanner(System.in);
            String numbers = "//[**][***][*][=][==]\n1***1*1,1\n1==1=1";

            int res;

            StringCalculator sum = new StringCalculator();

            res = sum.add(numbers);
            System.out.println("Result is " + res);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}