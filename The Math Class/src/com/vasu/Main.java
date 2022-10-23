package com.vasu;

public class Main {

    public static void main(String[] args) {
    int distance = Math.abs(-67);//the absolute value method
    String str1 = "Hello World";
    double result1 = Math.pow(3, 3);//the power method
    double result2 = (int) Math.sqrt(47.4);//the square root method
    //random character in a string using the random method
    int index = (int) (Math.random() * str1.length());
    String randCharacter = str1.substring(index, index + 1);
        int result3 = (int) (Math.random() * 46) + 5;//random integer btw 5 and 50 inclusive
    System.out.println(distance);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(randCharacter);
    


    }
}
