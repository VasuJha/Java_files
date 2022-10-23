package com.vasu;

public class Main {

    public static void main(String[] args) {
        double x = 15.0;
        double y = 5.0;
        double z = 3.0;
        int a = 20, b = 10, c = 3;
        double result1 = (double) a / c;//casting temporarily converts the integer 'a' to a double so that integer division doesn't occur
        System.out.println(result1);
        int result2 = (int) (result1 + 0.5);// the final answer in the parentheses is converted to an integer
        System.out.println(result2);//the estimated answer
        //compare if two double values are equal
        double e = 3.999;
        double f = 4.0;
        double tolerance = 0.00001;
        boolean closeEnough = Math.abs(e - f) <= tolerance;
        System.out.println(closeEnough);
    }
}
