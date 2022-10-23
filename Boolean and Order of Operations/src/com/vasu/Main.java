package com.vasu;

public class Main {

    public static void main(String[] args) {
        boolean isFound = true;
        double x = 15.0;
        double y = 5.0;
        double z = 3.0;
        int a = 20, b = 10, c = 3;
        double result1 = x * y % z;
        System.out.println(result1);
        int result2 = a + b / c;//result is always truncated in integer division
        System.out.println(result2);
        System.out.println(isFound);
    }
}
