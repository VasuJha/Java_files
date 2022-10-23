package com.vasu;

public class Main {

    public static void main(String[] args) {
	/*System.out.prntln("hello!!!")//compile-time/syntax error: wrong syntax with 'i' and semicolon missing
    int public = 46;//compile-time/syntax error: keyword used as an identifier
    int a = 1;
    int b = 0;
    int result = a / b;//, arithmetic exception, run-time error: divides by zero*/
    int min = Integer.MIN_VALUE;
    min--;
    System.out.println(min);//Arithmetic Overflow error: doesn't show an error but gives an unexpected output
    }
}
