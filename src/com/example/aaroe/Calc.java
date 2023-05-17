package com.example.aaroe;

public class Calc {

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static double sqrt(int num1){
        return Math.sqrt(num1);
    }

    public static int exp(int num1, int num2){
        int total = 1;
        for (int i = 0; i < num2; i++) {
            total*=num1;
        }
        return total;
    }
}
