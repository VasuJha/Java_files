package com.vasu;

public class Main {

    public static void main(String[] args) {
    int a = 16;
    int br = 57;
	String str1 = "Hello World";//declaring and initialising a string object
    String str2 = new String("thank you");//declaring and initialising a string object using a constructor
         String result1 = str1 + str2;//Concatenation, can also use '+=' for the same
    String result2 = a + br + str1 + str2;//the + operator changes purpose based on precedence from left to right
    System.out.println(result1);
    System.out.println(result2);
    boolean areTheyEqual = str1.equals(str2);//the equals method, gives a boolean answer to whether the strings are equal-same case and same sequence
    System.out.println(areTheyEqual);
    int compare = str1.compareTo(str2);//the compareTo method, 0 is for exact same strings, +ve is when str1 is after the other and -ve is when str1 is before the other, lexicographically.
    System.out.println(compare);
    int lengthS1 = str2.length();//the length method, gives the length of a string----lastIndex + 1
    System.out.println(lengthS1);
    String subs = str1.substring(2, 7);//the substring method, removes a character or a group from the original string, either specify just the beginIndex or also include the endIndex - 1(the final index is not included)
    System.out.println(subs);
    int indSubs1 = result2.indexOf("o", 12);//the indexOf method, gives the index of the  first occurrence of the string, overrules the first occurrence if the 2nd parameter fromIndex is specified
    System.out.println(indSubs1);
    int indSubs2 = str1.indexOf(subs);//two ways of doing indexOf
    System.out.println(indSubs2);
    }
}
