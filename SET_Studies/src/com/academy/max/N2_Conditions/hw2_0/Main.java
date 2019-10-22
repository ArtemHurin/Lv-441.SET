package com.academy.max.N2_Conditions.hw2_0;

public class Main {

public static void main(String[] args) {

    int t = 5, s = 4;
    String str1 = (t >= ++s? "yes" : "no");

    System.out.println("Str1= " + str1);

    int a = 3, b = 2;
    String str2 = a-- == b ? "yes" : "no";

    System.out.println("Str2= " + str2);
}


}

