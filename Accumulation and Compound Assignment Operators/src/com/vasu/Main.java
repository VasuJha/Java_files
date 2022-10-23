package com.vasu;

public class Main {

    public static void main(String[] args) {
	int score = 100;
    score++;//increments the score by 1, another is -- which decrements the variable, can change by 1
    score = score + 100;//an alternative way, can change the variable by multiple amounts the different but it would be trippy
    score /= 10;// a.k.a compound assignment operator, an alternative way,divides the score by 10, can change the variable by multiple amounts, others: +=, -=, *=, %=
    System.out.println(score);
    }
}
BMI